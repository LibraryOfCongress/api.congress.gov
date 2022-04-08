#!/usr/bin/env python3
"""
    CDG Examples

    Below are some examples of using the Bill endpoint.

    @copyright: 2022, Library of Congress
    @license: CC0 1.0
"""
import xml.etree.ElementTree as ET

# from lxml import etree as ET  # lxml is faster

from cdg_client import CDGClient


BILL_HR = "hr"
BILL_NUM = 21
BILL_PATH = "bill"
CONGRESS = 117
parse_xml = lambda data: ET.fromstring(data)  # bytes, more accurately


def print_items(items):
    """Print the items found."""
    for i, bill in enumerate(items):

        print(f"{i + 1:2}. {bill.tag}:")
        for field in bill:
            if field.text:
                print(f"   - {field.tag + ':':20} {field.text.strip()!r}")

    # print(root.xpath("count(.//bills/bill)"), 'bills') # lxml


def get_bill(client):
    """
    'http://api1.test.congress.gov/v3/bill'
    this API returns, list of latest bills
    """
    data, status_code = client.get(BILL_PATH)
    print("response data:", data[:70] + b"...", "status:", status_code)


def get_bill_congress(client):
    """
    'http://api1.test.congress.gov/v3/bill/117'
    this API returns, list of Congress bill that's picked

    Bill list by Congress
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}"
    data, _ = client.get(endpoint)
    root = parse_xml(data)

    print_items(root.findall(".//bills/bill"))


def get_bill_list_type(client):
    """
    'http://api1.test.congress.gov/v3/bill/117/hr'

    Bill list by Type
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}/{BILL_HR}/"
    client.get(endpoint)
    data, _ = client.get(endpoint)
    root = parse_xml(data)

    print_items(root.findall(".//bills/bill"))


def get_bill_detail(client):
    """
    'http://api1.test.congress.gov/v3/bill/117/hr/21'
    This API returns list of all Bill details
    Bill Details
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}/{BILL_HR}/{BILL_NUM}"
    client.get(endpoint)


def get_bill_action(client):
    """
    'http://api1.test.congress.gov/v3/bill/117/hr/21/actions'
    This API returns, Actions of the specified Bill
    Bill Action
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}/{BILL_HR}/{BILL_NUM}/actions"
    client.get(endpoint)


def get_bill_amendments(client):
    """
    'http://api1.test.congress.gov/v3/bill/117/hr/21/amendments'
    This API returns, Amendments of the specified Bill
    Bill Amendments
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}/{BILL_HR}/{BILL_NUM}/amendments"
    client.get(endpoint)


def get_bill_committee(client):
    """
    'http://api1.test.congress.gov/v3/bill/117/hr/21/committees'
    This API returns, Committees of the specified Bill
    Bill Committees
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}/{BILL_HR}/{BILL_NUM}/committees"
    client.get(endpoint)


def get_bill_cosponsors(client):
    """
    'http://api1.test.congress.gov/v3/bill/117/hr/21/cosponsors'
    This API returns, cosponsors of the specified Bill
    Bill Cosponsors
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}/{BILL_HR}/{BILL_NUM}/cosponsors"
    client.get(endpoint)


def get_bill_relatedbills(client):
    """
    'http://api1.test.congress.gov/v3/bill/117/hr/21/relatedbills'
    This API returns, relatedbills of the specified Bill
    Bill Relatedbills
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}/{BILL_HR}/{BILL_NUM}/relatedbills"
    client.get(endpoint)


def get_bill_subjects(client):
    """
    'http://api1.test.congress.gov/v3/bill/117/hr/21/subjects'
    This API returns, relatedbills of the specified Bill
    Bill subjects
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}/{BILL_HR}/{BILL_NUM}/subjects"
    client.get(endpoint)


def get_bill_summaries(client):
    """
    'http://api1.test.congress.gov/v3/bill/117/hr/21/summaries'
    This API returns, summaries of the specified Bill
    Bill subjects
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}/{BILL_HR}/{BILL_NUM}/summaries"
    client.get(endpoint)


def get_bill_text(client):
    """
    'http://api1.test.congress.gov/v3/bill/117/hr/21/text'
    This API returns, text of the specified Bill
    Bill subjects
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}/{BILL_HR}/{BILL_NUM}/text"
    client.get(endpoint)


def get_bill_titles(client):
    """
    'http://api1.test.congress.gov/v3/bill/117/hr/21/titles'
    This API returns, titles of the specified Bill
    Bill titles
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}/{BILL_HR}/{BILL_NUM}/titles"
    client.get(endpoint)


if __name__ == "__main__":
    """
    to run the file command :
        python bill.py <optional api version v3/v4>
        Example - python bill.py v3 or python bill.py
    """
    # This demostrates how to store your key in a config file that should be out of
    # the source code repo and in a secure location only readable by the user of
    # your application:
    from configparser import ConfigParser

    config = ConfigParser()
    config.read("../secrets.ini")
    auth_key = config.get("cdg_api", "api_auth_key")

    # if you want to view data in json format, you can change the output type here:
    client = CDGClient(auth_key, response_format="xml")

    print(f"Contacting Congres.gov, at {client.base_url} ...")
    try:

        # get_bill(client)
        # get_bill_congress(client)
        get_bill_list_type(client)
        # get_bill_detail(client)
        # get_bill_action(client)
        # get_bill_amendments(client)
        # get_bill_committee(client)
        # get_bill_cosponsors(client)
        # get_bill_relatedbills(client)
        # get_bill_subjects(client)
        # get_bill_summaries(client)
        # get_bill_text(client)
        # get_bill_titles(client)

    except OSError as err:
        print('Error:', err)

#!/usr/bin/env python3
"""
    CDG Examples

    Below are some examples of using the Bill endpoint with XML parsing.

    @copyright: 2022, Library of Congress
    @license: CC0 1.0
"""
import xml.etree.ElementTree as ET
# from lxml import etree as ET  # lxml is faster, but an extra download.

from cdg_client import CDGClient


BILL_HR = "hr"
BILL_NUM = 21
BILL_PATH = "bill"
CONGRESS = 117
parse_xml = lambda data: ET.fromstring(data)  # from bytes, more accurately


def print_items(items):
    """Print the items found."""
    for i, item in enumerate(items):

        print(f"{i + 1:2}. {item.tag}:")
        for field in item:
            if field.text:
                print(f"   - {field.tag + ':':20} {field.text.strip()!r}")

    # print(root.xpath("count(.//bills/bill)"), 'bills') # lxml implements count()


def get_bill(client):
    """
    'https://api.congress.gov/v3/bill'
    this API returns, list of latest bills
    """
    data, status_code = client.get(BILL_PATH)
    print("response data:", data[:70] + b"...", "status:", status_code)


def get_bill_congress(client):
    """
    'https://api.congress.gov/v3/bill/117'
    this API returns, list of Congress bill that's picked

    Bill list by Congress
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}"
    data, _ = client.get(endpoint)
    root = parse_xml(data)

    print_items(root.findall(".//bills/bill"))


def get_bill_list_type(client):
    """
    'https://api.congress.gov/v3/bill/117/hr'

    Bill list by Type
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}/{BILL_HR}/"
    data, _ = client.get(endpoint)
    root = parse_xml(data)

    print_items(root.findall(".//bills/bill"))


def get_bill_detail(client):
    """
    'https://api.congress.gov/v3/bill/117/hr/21'
    This API returns list of all Bill details
    Bill Details
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}/{BILL_HR}/{BILL_NUM}"
    data, _ = client.get(endpoint)
    root = parse_xml(data)

    print_items(root.findall(".//bill"))


def get_bill_action(client):
    """
    'https://api.congress.gov/v3/bill/117/hr/21/actions'
    This API returns, Actions of the specified Bill
    Bill Action
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}/{BILL_HR}/{BILL_NUM}/actions"
    data, _ = client.get(endpoint)
    root = parse_xml(data)

    print_items(root.findall(".//actions/item"))  # https://professionalsuperhero.com/


def get_bill_amendments(client):
    """
    'https://api.congress.gov/v3/bill/117/hr/21/amendments'
    This API returns, Amendments of the specified Bill
    Bill Amendments
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}/{BILL_HR}/{BILL_NUM}/amendments"
    client.get(endpoint)


def get_bill_committee(client):
    """
    'https://api.congress.gov/v3/bill/117/hr/21/committees'
    This API returns, Committees of the specified Bill
    Bill Committees
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}/{BILL_HR}/{BILL_NUM}/committees"
    client.get(endpoint)


def get_bill_cosponsors(client):
    """
    'https://api.congress.gov/v3/bill/117/hr/21/cosponsors'
    This API returns, cosponsors of the specified Bill
    Bill Cosponsors
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}/{BILL_HR}/{BILL_NUM}/cosponsors"
    client.get(endpoint)


def get_bill_relatedbills(client):
    """
    'https://api.congress.gov/v3/bill/117/hr/21/relatedbills'
    This API returns, relatedbills of the specified Bill
    Bill Relatedbills
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}/{BILL_HR}/{BILL_NUM}/relatedbills"
    client.get(endpoint)


def get_bill_subjects(client):
    """
    'https://api.congress.gov/v3/bill/117/hr/21/subjects'
    This API returns, relatedbills of the specified Bill
    Bill subjects
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}/{BILL_HR}/{BILL_NUM}/subjects"
    client.get(endpoint)


def get_bill_summaries(client):
    """
    'https://api.congress.gov/v3/bill/117/hr/21/summaries'
    This API returns, summaries of the specified Bill
    Bill subjects
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}/{BILL_HR}/{BILL_NUM}/summaries"
    client.get(endpoint)


def get_bill_text(client):
    """
    'https://api.congress.gov/v3/bill/117/hr/21/text'
    This API returns, text of the specified Bill
    Bill subjects
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}/{BILL_HR}/{BILL_NUM}/text"
    client.get(endpoint)


def get_bill_titles(client):
    """
    'https://api.congress.gov/v3/bill/117/hr/21/titles'
    This API returns, titles of the specified Bill
    Bill titles
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}/{BILL_HR}/{BILL_NUM}/titles"
    client.get(endpoint)

def get_bill_pagination(client):
    """
    'https://api.congress.gov/v3/bill/117?offset=50&limit=20'
    This API requests 20 items, and starts from the 51st item (skipping the first 50)
    for the bill of 117th Congress
    """
    endpoint = f"{BILL_PATH}/{CONGRESS}?offset=50&limit=20"
    client.get(endpoint)

if __name__ == "__main__":
    """
    to run the file command :
        python bill.py <optional api version v3/v4>
        Example - python bill.py v3 or python bill.py
    """
    # This section demostrates how to store your key in a config file that should be
    # out of the source code repo and in a secure location only readable by the user
    # of your application:
    from configparser import ConfigParser

    config = ConfigParser()
    config.read("../secrets.ini")
    x_api_key = config.get("cdg_api", "api_auth_key")

    # if you want to view data in json format, you can change the output type here:
    client = CDGClient(x_api_key, response_format="xml")

    print(f"Contacting Congres.gov, at {client.base_url} ...")
    pause = lambda: input('\nPress Enter to continue…')

    try:

        get_bill(client)
        pause()
        get_bill_congress(client)
        pause()
        get_bill_list_type(client)
        pause()
        get_bill_detail(client)
        pause()
        get_bill_action(client)
        pause()
        get_bill_amendments(client)
        pause()
        get_bill_committee(client)
        pause()
        get_bill_cosponsors(client)
        pause()
        get_bill_relatedbills(client)
        pause()
        get_bill_subjects(client)
        pause()
        get_bill_summaries(client)
        pause()
        get_bill_text(client)
        pause()
        get_bill_titles(client)
        pause()
        get_bill_pagination(client)

    except OSError as err:
        print('Error:', err)

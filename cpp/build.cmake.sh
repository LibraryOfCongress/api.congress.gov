#!/bin/bash

# check if ext/asio directory exists, if not clone it
if [ ! -d "ext/asio-1.30.2" ]; then
    echo "asio not found in ext/, cloning from GitHub..."
    mkdir -p ext
    pushd ext
    git -c advice.detachedHead=false clone --branch asio-1-30-2 --depth 1 https://github.com/chriskohlhoff/asio.git asio-1.30.2
    if [ $? -ne 0 ]; then
        echo "Failed to clone asio repository"
        exit 1
    fi
    popd
else
    echo "asio already exists in ext/"
fi

# build directory 
mkdir -p build
pushd build

cmake .. --fresh 
cmake --build . --config Debug --verbose

popd
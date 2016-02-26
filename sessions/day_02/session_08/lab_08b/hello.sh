#!/bin/sh

if [ "x" = "x$1" ]; then
    echo "input TOKEN!"
    exit 1
fi

curl -XGET -H "Authorization: bearer $1" http://localhost:8082/greeting

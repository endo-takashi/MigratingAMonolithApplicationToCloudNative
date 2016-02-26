#!/bin/bash
curl -XPOST -H "Content-Type: application/x-www-form-urlencoded" \
            -H "Authorization: Basic YWNtZTphY21lc2VjcmV0" \
             http://localhost:9999/uaa/oauth/token \
             -d "grant_type=password&username=mstine&password=secret"

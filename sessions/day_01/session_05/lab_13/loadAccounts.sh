#!/bin/sh
export ROUTE=http://localhost:8082
curl -i ${ROUTE}/account -X POST -d '{"address":"45 Test Dr.","passwd":"123","userid":"johndoe","email":"anon@springsource.com","creditcard":"999999999","fullname":"John Doe","openbalance":1200.50, "balance":1200.50, "logincount": 0, "logoutcount":0}' -H "Content-Type: application/json"
curl -i ${ROUTE}/account -X POST -d '{"address":"452 Test Dr.2","passwd":"123","userid":"johndoe2","email":"anon2@springsource.com","creditcard":"222222222","fullname":"John Doe2","openbalance":2200.50,"balance":1200.50, "logincount": 0, "logoutcount":0}' -H "Content-Type: application/json"

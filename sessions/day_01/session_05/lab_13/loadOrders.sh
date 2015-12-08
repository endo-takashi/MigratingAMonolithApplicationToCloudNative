#!/bin/sh
export ROUTE=http://localhost:8082
curl -i ${ROUTE}/portfolio/johndoe -X POST -d '{"orderId":1,"accountId":"johndoe","symbol":"EMC","orderFee":1,"completionDate":1329759342904,"orderType":"BUY","price":10,"quantity":10}' -H "Content-Type: application/json"



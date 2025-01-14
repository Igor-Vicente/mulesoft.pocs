%dw 2.0
output application/json
//this transformation is shared by the application, any changes here may affect other places
---
payload mapObject ({($$): $, time_stamp: now()})
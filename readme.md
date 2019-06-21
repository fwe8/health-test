# Minimal App, to show container restarts when becomming unhealthy

Deploy with **cf push**.

When deployed, the app will be healthy.

Endpoint "/" will show the health.
Endpoint "/health" will be used by cf. It will return status 200 "OK" if ok and status 400 is not ok.
Endpoint "/healthOn" will set healthy.
Endpoint "/healthOff" will set unhealthy.
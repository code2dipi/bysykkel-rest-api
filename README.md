# bysykkel-rest-api
- The purpose of this API is to consume Real-time-information of Bycycle information from https://oslobysykkel.no/apne-data/sanntid.
- The API will consume service from https://gbfs.urbansharing.com/oslobysykkel.no/station_information.json and https://gbfs.urbansharing.com/oslobysykkel.no/station_status.json

-Two endpoints has been created in this application: 
First one is http://localhost:8080/ny/stations, which is responsible to list out all the records from station_information.json.
Second is http://localhost:8080/ny/available, which is responsible to list out all the station status from https://gbfs.urbansharing.com/oslobysykkel.no/station_status.json 



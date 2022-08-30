# bysykkel-rest-api
- The purpose of this API is to consume Real-time-information of Bycycle information from https://oslobysykkel.no/apne-data/sanntid.
- The API will consume service from https://gbfs.urbansharing.com/oslobysykkel.no/station_information.json and https://gbfs.urbansharing.com/oslobysykkel.no/station_status.json

-Two endpoints has been created in this application: 
First one is http://localhost:8080/ny/stations, which is responsible to list out all the records from station_information.json.
Second is http://localhost:8080/ny/available, which is responsible to list out all the station status from https://gbfs.urbansharing.com/oslobysykkel.no/station_status.json 

# How to run this project:
- Clone or download the project from https://github.com/code2dipi/bysykkel-rest-api.git
 From root directory run:
 # mvn clean install 
When build completes  just run the project.
 
 Open chrome browser or Postman to to view the json records from both endpoints( http://localhost:8080/ny/stations ,http://localhost:8080/ny/available)
 
 The project was build in the following environment:
 -Windows 10
 -IntellijIDEA ultimate edition 2022
 -Spring boot framework version(2.7.3)
 -Java 11
 
 -For frondend APP check: https://github.com/code2dipi/frontend-bysykkel-info.git




# bysykkel-rest-api
- The purpose of this API is to consume Real-time-information of Bycycle information from https://oslobysykkel.no/apne-data/sanntid.
- The API will consume service from https://gbfs.urbansharing.com/oslobysykkel.no/station_information.json and https://gbfs.urbansharing.com/oslobysykkel.no/station_status.json

- Three endpoints has been created in this application: 
First one is http://localhost:8080/ny/stations, which is responsible to list out all the records from station_information.json.
Second is http://localhost:8080/ny/available, which is responsible to list out all the station status from https://gbfs.urbansharing.com/oslobysykkel.no/station_status.json 
The Third one is http://localhost:8080/ny/results , which  will integrate stations and available  endpoints and display results like:

  [
  {
  "name": "Blindern T-Bane",
  "numOfbikesAvailable": 0,
  "numOfDocksAvailable": 25
  },
  {
  "name": "Maritimt Museum",
  "numOfbikesAvailable": 0,
  "numOfDocksAvailable": 21
  },
  ...
]


# How to run this project:
- Clone or download the project from https://github.com/code2dipi/bysykkel-rest-api.git

 From root directory run:
 # mvn clean install 
When build completes  just run the project(BysykkelinfoApplication).
 
 Open the Chrome browser or Postman  to view the json records from all endpoints [http://localhost:8080/ny/stations ,http://localhost:8080/ny/available,http://localhost:8080/ny/results]
 
 The project was build in the following environment:
 - Windows 10
 - IntellijIDEA ultimate edition 2022
 - Spring boot framework version(2.7.3)
 - Java 11
 - Maven (build tools)
 -For frontend APP check: https://github.com/code2dipi/frontend-bysykkel-info/blob/master/README.md




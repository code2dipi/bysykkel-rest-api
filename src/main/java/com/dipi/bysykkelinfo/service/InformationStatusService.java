package com.dipi.bysykkelinfo.service;

import com.dipi.bysykkelinfo.controller.InformationStatusController;
import com.dipi.bysykkelinfo.customexception.ResourceNotFoundException;
import com.dipi.bysykkelinfo.payload.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class InformationStatusService {
    private final static Logger log = LoggerFactory.getLogger(InformationStatusController.class);
    @Autowired
    RestTemplate restTemplate;

    @Value("${station.url}")
    private String stationServiceURL;

    @Value("${available-station.url}")
    private String AvailableServiceUrl;

    public  InformationResponseModel getStationInformation() {
        InformationResponseModel response = restTemplate.getForObject(stationServiceURL, InformationResponseModel.class);
        List<InformationStation> stations = response.getData().getStations();

        for (InformationStation station : stations) {
            log.info(station.getName() + "\t" + station.getStationId());
        }
        if (response != null) {
            return response;
        }
        throw new ResourceNotFoundException("ressurser ble ikke funnet");
    }

    public StatusResponseModel getStationStatus(){
        StatusResponseModel response = restTemplate.getForObject(AvailableServiceUrl, StatusResponseModel.class);
        if(response!=null){
            for(StatusStation station:response.getData().getStations()){
                log.info("No. of Bikes available:\t" +station.getNumDocksAvailable() + "\t No.Of Docks"+ "\t" +station.getNumBikesAvailable());
            }
            return response;

        }
        throw new ResourceNotFoundException("ressurser ble ikke funnet");
    }

    /**
     * Extract required data from both list
     * @return
     */
     public List<InformationStatus> getResultData(){

         List<InformationStation> infoStations=getStationInformation().getData().getStations();
         List<StatusStation> statusStations=getStationStatus().getData().getStations();

         ArrayList<InformationStatus> al=new ArrayList<>();

         for(int i=0;i<infoStations.size();i++){
             String name=infoStations.get(i).getName();
             if(i< statusStations.size()){
                 Integer bikes=statusStations.get(i).getNumBikesAvailable();
                 Integer ducks=statusStations.get(i).getNumDocksAvailable();
                 InformationStatus is=new InformationStatus(name,bikes,ducks);
                 al.add(is);
             }
         }
         return al;
     }

}

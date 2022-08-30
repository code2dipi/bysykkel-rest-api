package com.dipi.bysykkelinfo.service;

import com.dipi.bysykkelinfo.controller.InformationStatusController;
import com.dipi.bysykkelinfo.customException.ResourceNotFoundException;
import com.dipi.bysykkelinfo.payload.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

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



}

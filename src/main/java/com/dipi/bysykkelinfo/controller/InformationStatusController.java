package com.dipi.bysykkelinfo.controller;

import com.dipi.bysykkelinfo.payload.StatusResponseModel;
import com.dipi.bysykkelinfo.payload.InformationResponseModel;
import com.dipi.bysykkelinfo.service.InformationStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("ny")
public class InformationStatusController {
    @Autowired
    private final InformationStatusService informationStatusService;

    public InformationStatusController(InformationStatusService informationStatusService) {
        this.informationStatusService = informationStatusService;
    }


    @GetMapping("/stations")
    public InformationResponseModel getStations() {
      return informationStatusService.getStationInformation();
    }

    @GetMapping("/available")
    public StatusResponseModel getAvailable() {
       return informationStatusService.getStationStatus();
    }

}

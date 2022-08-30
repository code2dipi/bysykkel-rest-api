package com.dipi.bysykkelinfo.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StatusData implements Serializable {

    @JsonProperty("stations")
    private List<StatusStation> stations=new ArrayList<>();

    public List<StatusStation> getStations() {
        return stations;
    }

}

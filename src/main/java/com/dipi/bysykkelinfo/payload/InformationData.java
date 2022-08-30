package com.dipi.bysykkelinfo.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InformationData implements Serializable {

 @JsonProperty("stations")
 private List<InformationStation> stations=new ArrayList<>();

    public List<InformationStation> getStations() {
        return stations;
    }

    public void setStations(List<InformationStation> stations) {
        this.stations = stations;
    }

    @Override
    public String toString() {
        return "Data{" +
                "stations=" + stations +
                '}';
    }
}

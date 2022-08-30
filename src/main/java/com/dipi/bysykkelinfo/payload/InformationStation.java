package com.dipi.bysykkelinfo.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InformationStation implements Serializable {

    public InformationStation(String stationId, String name) {
        this.stationId = stationId;
        this.name = name;
    }

    @JsonProperty("station_id")
    private  String stationId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("address")
    private String address;

    @JsonProperty("lat")
    private Double lat;

    @JsonProperty("lon")
    private Double lon;

    @JsonProperty("capacity")
    private Long capacity;

    public InformationStation() {

    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationId=" + stationId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", capacity=" + capacity +
                '}';
    }
}

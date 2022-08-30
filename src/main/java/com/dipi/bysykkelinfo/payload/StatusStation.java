package com.dipi.bysykkelinfo.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StatusStation  implements Serializable {

    public StatusStation(String stationId, Integer numDocksAvailable,Integer numBikesAvailable) {
        super();
        this.stationId = stationId;
        this.numDocksAvailable = numDocksAvailable;
        this.numBikesAvailable = numBikesAvailable;

    }
    @JsonProperty("is_installed")
    private  Boolean isInstalled;

    @JsonProperty("is_renting")
    private  Boolean isRenting;

    @JsonProperty("num_bikes_available")
    private  Integer numBikesAvailable;

    @JsonProperty("num_docks_available")
    private  Integer numDocksAvailable;

    @JsonProperty("last_reported")
    private  Long lastReported;

    @JsonProperty("is_returning")
    private  Boolean isReturning;

    @JsonProperty("station_id")
    private  String stationId;

    public StatusStation() {

    }


    public Boolean getInstalled() {
        return isInstalled;
    }

    public Boolean getRenting() {
        return isRenting;
    }

    public Integer getNumBikesAvailable() {
        return numBikesAvailable;
    }

    public Integer getNumDocksAvailable() {
        return numDocksAvailable;
    }

    public Long getLastReported() {
        return lastReported;
    }

    public Boolean getReturning() {
        return isReturning;
    }

    public String getStationId() {
        return stationId;
    }

    @Override
    public String toString() {
        return "StatusStation{" +
                "isInstalled=" + isInstalled +
                ", isRenting=" + isRenting +
                ", numBikesAvailable=" + numBikesAvailable +
                ", numDocksAvailable=" + numDocksAvailable +
                ", lastReported=" + lastReported +
                ", isReturning=" + isReturning +
                ", stationId='" + stationId + '\'' +
                '}';
    }
}

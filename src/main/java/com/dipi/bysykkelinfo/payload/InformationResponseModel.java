package com.dipi.bysykkelinfo.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


@JsonIgnoreProperties(ignoreUnknown = true)
public class InformationResponseModel implements Serializable {
    @JsonProperty("last_updated")
    private Long lastUpdated;

    @JsonProperty("data")
    private InformationData data;

    public Long getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public InformationData getData() {
        return data;
    }

    public void setData(InformationData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "StationResponseModel{" +
                "lastUpdated=" + lastUpdated +
                ", data=" + data +
                '}';
    }
}

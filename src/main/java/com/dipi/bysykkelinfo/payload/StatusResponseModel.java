package com.dipi.bysykkelinfo.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StatusResponseModel  implements Serializable {

    @JsonProperty("last_updated")
    private Long lastUpdated;

    @JsonProperty("data")
    private StatusData data;

    public Long getLastUpdated() {
        return lastUpdated;
    }

    public StatusData getData() {
        return data;
    }

}

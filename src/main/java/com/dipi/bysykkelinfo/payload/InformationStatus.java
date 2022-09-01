package com.dipi.bysykkelinfo.payload;

import java.util.List;

public class InformationStatus{
    private String name;
    private Integer numOfbikesAvailable;
    private Integer numOfDocksAvailable;
    private String staionId;
    private String address;

    public InformationStatus(String stationId,String name,String address, Integer numOfbikesAvailable, Integer numOfDocksAvailable) {
        this.name = name;
        this.numOfbikesAvailable = numOfbikesAvailable;
        this.numOfDocksAvailable = numOfDocksAvailable;
        this.staionId=stationId;
        this.address=address;
    }
    public InformationStatus(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumOfbikesAvailable() {
        return numOfbikesAvailable;
    }

    public void setNumOfbikesAvailable(Integer numOfbikesAvailable) {
        this.numOfbikesAvailable = numOfbikesAvailable;
    }

    public Integer getNumOfDocksAvailable() {
        return numOfDocksAvailable;
    }

    public void setNumOfDocksAvailable(Integer numOfDocksAvailable) {
        this.numOfDocksAvailable = numOfDocksAvailable;
    }

    public String getStaionId() {
        return staionId;
    }

    public void setStaionId(String staionId) {
        this.staionId = staionId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "InformationStatus{" +
                "name='" + name + '\'' +
                ", numOfbikesAvailable=" + numOfbikesAvailable +
                ", numOfDocksAvailable=" + numOfDocksAvailable +
                ", staionId='" + staionId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

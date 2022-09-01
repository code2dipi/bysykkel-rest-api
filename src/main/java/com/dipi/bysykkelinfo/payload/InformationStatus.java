package com.dipi.bysykkelinfo.payload;

import java.util.List;

public class InformationStatus{
    private String name;
    private Integer numOfbikesAvailable;
    private Integer numOfDocksAvailable;

    public InformationStatus(String name, Integer numOfbikesAvailable, Integer numOfDocksAvailable) {
        this.name = name;
        this.numOfbikesAvailable = numOfbikesAvailable;
        this.numOfDocksAvailable = numOfDocksAvailable;
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

    @Override
    public String toString() {
        return "InformationStatus{" +
                "name='" + name + '\'' +
                ", numOfbikesAvailable=" + numOfbikesAvailable +
                ", numOfDocksAvailable=" + numOfDocksAvailable +
                '}';
    }
}

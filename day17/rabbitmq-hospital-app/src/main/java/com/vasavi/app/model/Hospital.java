package com.vasavi.app.model;

public class Hospital {
    private String name;
    private String hospitalId;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "Hospital [Name=" + name + ", Hospital Id=" + hospitalId + ",Address=" +address+"]";
    }

}

package com.laptrinhjavaweb.dto;

public class ScanDTO {
    private Double latitude;
    private Double longitude;
    private Double psc;
    private Double uarfcn;

    public ScanDTO(){}
    public ScanDTO(Double latitude, Double longitude, Double psc, Double uarfcn){
        this.latitude =latitude;
        this.longitude = longitude;
        this.psc = psc;
        this.uarfcn = uarfcn;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getPsc() {
        return psc;
    }

    public void setPsc(Double psc) {
        this.psc = psc;
    }

    public Double getUarfcn() {
        return uarfcn;
    }

    public void setUarfcn(Double uarfcn) {
        this.uarfcn = uarfcn;
    }
}

package com.laptrinhjavaweb.dto;

public class ScanDTO {
    private double latitude;
    private double longitude;
    private double psc;
    private double uarfcn;
    private double anlge;

    public Double getAnlge() {
        return anlge;
    }

    public void setAnlge(Double anlge) {
        this.anlge = anlge;
    }

    public ScanDTO(){}
    public ScanDTO(double latitude, double longitude, double psc, double uarfcn){
        this.latitude =latitude;
        this.longitude = longitude;
        this.psc = psc;
        this.uarfcn = uarfcn;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getPsc() {
        return psc;
    }

    public void setPsc(double psc) {
        this.psc = psc;
    }

    public double getUarfcn() {
        return uarfcn;
    }

    public void setUarfcn(double uarfcn) {
        this.uarfcn = uarfcn;
    }

    public void setAnlge(double anlge) {
        this.anlge = anlge;
    }
}

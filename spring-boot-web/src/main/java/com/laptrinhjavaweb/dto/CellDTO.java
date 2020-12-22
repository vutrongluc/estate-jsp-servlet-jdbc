package com.laptrinhjavaweb.dto;

import java.util.ArrayList;
import java.util.List;

public class CellDTO {
    private String nodename;
    private String cellname;
    private double pscrambcode;
    private double uarfcndownlink;
    private double lon;
    private double lat;
    private double azimuth;
    public List<ScanDTO> DiemList = new ArrayList<>();
    public int demdiem;
    public boolean swap ;

    public double angleTB;
    public CellDTO(){}

    public CellDTO(String nodename, String cellname, double pscrambcode, double uarfcndownlink, double lon, double lat, double azimuth  ){
        this.nodename=nodename;
        this.cellname=cellname;
        this.pscrambcode=pscrambcode;
        this.uarfcndownlink=uarfcndownlink;
        this.lon=lon;
        this.lat=lat;
        this.azimuth=azimuth;
        this.swap = false;
        this.demdiem = 0;
        this.angleTB = 0;
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename;
    }

    public String getCellname() {
        return cellname;
    }

    public void setCellname(String cellname) {
        this.cellname = cellname;
    }

    public double getPscrambcode() {
        return pscrambcode;
    }

    public void setPscrambcode(double pscrambcode) {
        this.pscrambcode = pscrambcode;
    }

    public double getUarfcndownlink() {
        return uarfcndownlink;
    }

    public void setUarfcndownlink(double uarfcndownlink) {
        this.uarfcndownlink = uarfcndownlink;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(double azimuth) {
        this.azimuth = azimuth;
    }

    public List<ScanDTO> getDiemList() {
        return DiemList;
    }

    public void setDiemList(List<ScanDTO> diemList) {
        DiemList = diemList;
    }

    public int getDemdiem() {
        return demdiem;
    }

    public void setDemdiem(int demdiem) {
        this.demdiem = demdiem;
    }

    public boolean isSwap() {
        return swap;
    }

    public void setSwap(boolean swap) {
        this.swap = swap;
    }

    public double getAngleTB() {
        return angleTB;
    }

    public void setAngleTB(double angleTB) {
        this.angleTB = angleTB;
    }
}

package com.laptrinhjavaweb.dto;

import java.util.ArrayList;
import java.util.List;

public class CellDTO {
    private String nodename;
    private String cellname;
    private Double pscrambcode;
    private Double uarfcndownlink;
    private Double lon;
    private Double lat;
    private Double azimuth;
    public List<ScanDTO> DiemList = new ArrayList<>();
    public Integer demdiem;
    public boolean swap ;

    public double angleTB;
    public CellDTO(){}

    public CellDTO(String nodename, String cellname, Double pscrambcode, Double uarfcndownlink, Double lon, Double lat, Double azimuth  ){
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

    public Integer getDemdiem() {
        return demdiem;
    }

    public void setDemdiem(Integer demdiem) {
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

    public List<ScanDTO> getDiemList() {
        return DiemList;
    }

    public void setDiemList(List<ScanDTO> diemList) {
        DiemList = diemList;
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

    public Double getPscrambcode() {
        return pscrambcode;
    }

    public void setPscrambcode(Double pscrambcode) {
        this.pscrambcode = pscrambcode;
    }

    public Double getUarfcndownlink() {
        return uarfcndownlink;
    }

    public void setUarfcndownlink(Double uarfcndownlink) {
        this.uarfcndownlink = uarfcndownlink;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(Double azimuth) {
        this.azimuth = azimuth;
    }
}

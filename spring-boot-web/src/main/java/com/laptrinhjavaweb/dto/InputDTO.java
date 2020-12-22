package com.laptrinhjavaweb.dto;

public class InputDTO {
    private double d;
    private double bw;
    private double diempv;
    private String codelando;
    private String tp;

    public String getCodelando() {
        return codelando;
    }

    public void setCodelando(String codelando) {
        this.codelando = codelando;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getBw() {
        return bw;
    }

    public void setBw(double bw) {
        this.bw = bw;
    }

    public double getDiempv() {
        return diempv;
    }

    public void setDiempv(double diempv) {
        this.diempv = diempv;
    }
}

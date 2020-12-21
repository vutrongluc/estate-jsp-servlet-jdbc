package com.laptrinhjavaweb.dto;

public class RentareaDTO extends AbstractDTO{
    private Integer value;
    private Integer buildingid;

    private Integer[] mangId;

    public Integer[] getMangId() {
        return mangId;
    }

    public void setMangId(Integer[] mangId) {
        this.mangId = mangId;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }
}

package com.laptrinhjavaweb.dto;

public class AssignmentDTO {
    private Integer buildingid;
    private Integer[] idstaff;

    public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }

    public Integer[] getIdstaff() {
        return idstaff;
    }

    public void setIdstaff(Integer[] idstaff) {
        this.idstaff = idstaff;
    }
}

package com.laptrinhjavaweb.dto;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public class AssignmentBuildingDTO {
    private Integer buildingid;
    private Integer userid;

    public  AssignmentBuildingDTO(Integer buildingid, Integer userid)
    {
        this.buildingid = buildingid;
        this.userid = userid;
    }
    public  AssignmentBuildingDTO(){}


    public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}

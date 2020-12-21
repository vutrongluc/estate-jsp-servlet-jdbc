package com.laptrinhjavaweb.entity;

import javax.persistence.*;

@Entity
@Table(name = "rentarea")
public class RentareaEntity extends BaseEntity{

    @Column(nullable = false)
    private Integer value;

   /* @Column(nullable = false)
    private Integer buildingid;*/

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "buildingid", nullable = false)
    private BuildingEntity buildingEntity;

   /* public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }*/

    public BuildingEntity getBuildingEntity() {
        return buildingEntity;
    }

    public void setBuildingEntity(BuildingEntity buildingEntity) {
        this.buildingEntity = buildingEntity;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }


}

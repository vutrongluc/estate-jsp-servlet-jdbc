package com.laptrinhjavaweb.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "building")
public class BuildingEntity extends BaseEntity {



    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private String street;

    @Column(nullable = true)
    private String ward;

    @Column(nullable = true)
    private String district;

    @Column(nullable = true)
    private String structure;


    @Column(nullable = true)
    private Integer numberofbasement;

    @Column(nullable = true)
    private Integer floorarea;

    @Column(nullable = true)
    private String direction;

    @Column(nullable = true)
    private String level;

    @Column(nullable = true)
    private Integer rentprice;

    @Column(nullable = true)
    private String rentpricedescription;

    @Column(nullable = true)
    private String servicefee;

    @Column(nullable = true)
    private String carfee;

    @Column(nullable = true)
    private String motofee;

    @Column(nullable = true)
    private String overtimefee;

    @Column(nullable = true)
    private String waterfee;

    @Column(nullable = true)
    private String electricityfee;

    @Column(nullable = true)
    private String deposit;

    @Column(nullable = true)
    private String payment;

    @Column(nullable = true)
    private String renttime;

    @Column(nullable = true)
    private String decorationtime;

    @Column(nullable = true)
    private String brokeragetee;

    @Column( nullable = true)
    private String type;


    @Column(nullable = true)
    private String linkofbuilding;

    @Column(nullable = true)
    private String map;

    @Column(nullable = true)
    private String avatar;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "assignmentbuilding",
            joinColumns = @JoinColumn(name = "buildingid", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "userid", nullable = false))
    private List<UserEntity> userEntities = new ArrayList<>();


    @OneToMany(mappedBy = "buildingEntity", fetch = FetchType.LAZY)
    private List<RentareaEntity> rentareas;

    public List<RentareaEntity> getRentareas() {
        return rentareas;
    }

    public void setRentareas(List<RentareaEntity> rentareas) {
        this.rentareas = rentareas;
    }

    public String getDistrict() {
        return district;
    }

    public List<UserEntity> getUserEntities() {
        return userEntities;
    }

    public void setUserEntities(List<UserEntity> userEntities) {
        this.userEntities = userEntities;
    }



    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public Integer getNumberofbasement() {
        return numberofbasement;
    }

    public void setNumberofbasement(Integer numberofbasement) {
        this.numberofbasement = numberofbasement;
    }

    public Integer getFloorarea() {
        return floorarea;
    }

    public void setFloorarea(Integer floorarea) {
        this.floorarea = floorarea;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getRentprice() {
        return rentprice;
    }

    public void setRentprice(Integer rentprice) {
        this.rentprice = rentprice;
    }

    public String getRentpricedescription() {
        return rentpricedescription;
    }

    public void setRentpricedescription(String rentpricedescription) {
        this.rentpricedescription = rentpricedescription;
    }

    public String getServicefee() {
        return servicefee;
    }

    public void setServicefee(String servicefee) {
        this.servicefee = servicefee;
    }

    public String getCarfee() {
        return carfee;
    }

    public void setCarfee(String carfee) {
        this.carfee = carfee;
    }

    public String getMotofee() {
        return motofee;
    }

    public void setMotofee(String motofee) {
        this.motofee = motofee;
    }

    public String getOvertimefee() {
        return overtimefee;
    }

    public void setOvertimefee(String overtimefee) {
        this.overtimefee = overtimefee;
    }

    public String getWaterfee() {
        return waterfee;
    }

    public void setWaterfee(String waterfee) {
        this.waterfee = waterfee;
    }

    public String getElectricityfee() {
        return electricityfee;
    }

    public void setElectricityfee(String electricityfee) {
        this.electricityfee = electricityfee;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getRenttime() {
        return renttime;
    }

    public void setRenttime(String renttime) {
        this.renttime = renttime;
    }

    public String getDecorationtime() {
        return decorationtime;
    }

    public void setDecorationtime(String decorationtime) {
        this.decorationtime = decorationtime;
    }

    public String getBrokeragetee() {
        return brokeragetee;
    }

    public void setBrokeragetee(String brokeragetee) {
        this.brokeragetee = brokeragetee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLinkofbuilding() {
        return linkofbuilding;
    }

    public void setLinkofbuilding(String linkofbuilding) {
        this.linkofbuilding = linkofbuilding;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}

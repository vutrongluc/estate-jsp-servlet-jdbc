package com.laptrinhjavaweb.dto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class BuildingDTO extends AbstractDTO {
    private String avatar;
    private String brokeragetee;
    private String carfee;
    private String decorationtime;
    private String deposit;
    private String direction;
    private String district;
    private String electricityfee;
    private Integer floorarea;
    private String level;
    private String linkofbuilding;
    private String map;
    private String motofee;
    private String name;
    private Integer numberofbasement;
    private String overtimefee;
    private String payment;
    private Integer rentprice;
    private String rentpricedescription;
    private String renttime;
    private String servicefee;
    private String street;
    private String structure;
    private String type;
    private String ward;
    private String waterfee;
    private String status;
    private Integer rentareafrom;
    private Integer rentareato;
    private Integer cost_from;
    private Integer cost_to;
    private Integer idstaff;
    private List<BuildingDTO> buildingDTOList;
    private Integer[] buildingid;
    private List<Integer> staffidlist = new ArrayList<Integer>();

    public List<Integer> getStaffidlist() {
        return staffidlist;
    }

    public void setStaffidlist(List<Integer> staffidlist) {
        this.staffidlist = staffidlist;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer[] getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer[] buildingid) {
        this.buildingid = buildingid;
    }

    public Integer getRentareafrom() {
        return rentareafrom;
    }

    public void setRentareafrom(Integer rentareafrom) {
        this.rentareafrom = rentareafrom;
    }

    public Integer getRentareato() {
        return rentareato;
    }

    public void setRentareato(Integer rentareato) {
        this.rentareato = rentareato;
    }

    public Integer getCost_from() {
        return cost_from;
    }

    public void setCost_from(Integer cost_from) {
        this.cost_from = cost_from;
    }

    public Integer getCost_to() {
        return cost_to;
    }

    public void setCost_to(Integer cost_to) {
        this.cost_to = cost_to;
    }

    public Integer getIdstaff() {
        return idstaff;
    }

    public void setIdstaff(Integer idstaff) {
        this.idstaff = idstaff;
    }



    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getBrokeragetee() {
        return brokeragetee;
    }

    public void setBrokeragetee(String brokeragetee) {
        this.brokeragetee = brokeragetee;
    }

    public String getCarfee() {
        return carfee;
    }

    public void setCarfee(String carfee) {
        this.carfee = carfee;
    }

    public String getDecorationtime() {
        return decorationtime;
    }

    public void setDecorationtime(String decorationtime) {
        this.decorationtime = decorationtime;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getElectricityfee() {
        return electricityfee;
    }

    public void setElectricityfee(String electricityfee) {
        this.electricityfee = electricityfee;
    }

    public Integer getFloorarea() {
        return floorarea;
    }

    public void setFloorarea(Integer floorarea) {
        this.floorarea = floorarea;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
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

    public String getMotofee() {
        return motofee;
    }

    public void setMotofee(String motofee) {
        this.motofee = motofee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberofbasement() {
        return numberofbasement;
    }

    public void setNumberofbasement(Integer numberofbasement) {
        this.numberofbasement = numberofbasement;
    }

    public String getOvertimefee() {
        return overtimefee;
    }

    public void setOvertimefee(String overtimefee) {
        this.overtimefee = overtimefee;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
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

    public String getRenttime() {
        return renttime;
    }

    public void setRenttime(String renttime) {
        this.renttime = renttime;
    }

    public String getServicefee() {
        return servicefee;
    }

    public void setServicefee(String servicefee) {
        this.servicefee = servicefee;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getWaterfee() {
        return waterfee;
    }

    public void setWaterfee(String waterfee) {
        this.waterfee = waterfee;
    }

    public List<BuildingDTO> getBuildingDTOList() {
        return buildingDTOList;
    }

    public void setBuildingDTOList(List<BuildingDTO> buildingDTOList) {
        this.buildingDTOList = buildingDTOList;
    }
}

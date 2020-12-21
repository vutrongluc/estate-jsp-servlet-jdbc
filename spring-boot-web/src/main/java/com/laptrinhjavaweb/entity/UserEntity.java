package com.laptrinhjavaweb.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {

    private static final long serialVersionUID = -4988455421375043688L;

    @Column(nullable = false)
    private String userName;

    @Column( nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Integer status;

    @Column(nullable = true)
    private String phone;

    @Column(nullable = true)
    private String email;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "role_id", nullable = false))
    private List<RoleEntity> roles = new ArrayList<>();




    @ManyToMany(mappedBy = "userEntities", fetch = FetchType.LAZY)
    private List<BuildingEntity> buildingEntities = new ArrayList<>();

    @OneToMany(mappedBy = "userEntity", fetch = FetchType.LAZY)
    private List<TransactionEntity> transactionEntities;

    @ManyToMany(mappedBy = "userEntities", fetch = FetchType.LAZY)
    private List<CustormerEntity> custormerEntities = new ArrayList<>();

    public List<CustormerEntity> getCustormerEntities() {
        return custormerEntities;
    }

    public void setCustormerEntities(List<CustormerEntity> custormerEntities) {
        this.custormerEntities = custormerEntities;
    }

    public List<BuildingEntity> getBuildingEntities() {
        return buildingEntities;
    }

    public void setBuildingEntities(List<BuildingEntity> buildingEntities) {
        this.buildingEntities = buildingEntities;
    }

    public List<TransactionEntity> getTransactionEntities() {
        return transactionEntities;
    }

    public void setTransactionEntities(List<TransactionEntity> transactionEntities) {
        this.transactionEntities = transactionEntities;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<RoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleEntity> roles) {
        this.roles = roles;
    }
}

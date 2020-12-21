package com.laptrinhjavaweb.entity;

import javax.persistence.*;

@Entity
@Table(name = "transaction")
public class TransactionEntity extends BaseEntity {

    @Column(nullable = true)
    private String code;

    @Column(nullable = true)
    private String note;

    @Column(nullable = true)
    private String transactiontype;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerid", nullable = false)
    private CustormerEntity custormerEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "staffid", nullable = false)
    private UserEntity userEntity;

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public CustormerEntity getCustormerEntity() {
        return custormerEntity;
    }

    public void setCustormerEntity(CustormerEntity custormerEntity) {
        this.custormerEntity = custormerEntity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

package com.laptrinhjavaweb.entity;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -863164858986274318L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "createddate")
    @CreatedDate
    private Date createddate;

    @Column(name = "createdby")
    @CreatedBy
    private String createdby;

    @Column(name = "modifieddate")
    @LastModifiedDate
    private Date modifieddate;

    @Column(name = "modifiedby")
    @LastModifiedBy
    private String modifiedby;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public String getCreateddy() {
        return createdby;
    }

    public void setCreateddy(String createddy) {
        this.createdby = createddy;
    }

    public Date getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    public String getModifieddy() {
        return modifiedby;
    }

    public void setModifieddy(String modifieddy) {
        this.modifiedby = modifieddy;
    }
}

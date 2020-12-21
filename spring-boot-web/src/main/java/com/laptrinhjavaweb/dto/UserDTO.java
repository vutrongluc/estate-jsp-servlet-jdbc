package com.laptrinhjavaweb.dto;

import java.util.ArrayList;
import java.util.List;

public class UserDTO extends AbstractDTO {

    private String userName;
    private String fullName;
    private String password;
    private String phone;
    private String email;
    private Integer status;
    private Long[] listRole = new Long[2];
    private List<RoleDTO> roles = new ArrayList<>();

    public Long[] getListRole() {
        return listRole;
    }

    public void setListRole(Long[] listRole) {
        this.listRole = listRole;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<RoleDTO> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleDTO> roles) {
        this.roles = roles;
    }
}

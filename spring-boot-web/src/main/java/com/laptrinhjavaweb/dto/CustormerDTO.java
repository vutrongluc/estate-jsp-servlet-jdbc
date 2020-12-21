package com.laptrinhjavaweb.dto;

public class CustormerDTO extends AbstractDTO {
    private String email;
    private String fullname;
    private String phone;
    private Integer[] listid;

    public Integer[] getListid() {
        return listid;
    }

    public void setListid(Integer[] listid) {
        this.listid = listid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

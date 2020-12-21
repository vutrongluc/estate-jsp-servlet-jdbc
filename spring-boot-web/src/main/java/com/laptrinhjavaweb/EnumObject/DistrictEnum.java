package com.laptrinhjavaweb.EnumObject;

public enum DistrictEnum {
    Q1("QUAN_1","Quận 1"),
    Q2("QUAN_2","Quận 2"),
    Q3("QUAN_3", "Quận 3");


    private String codeQuan;
    private String nameQuan;

    private DistrictEnum( String codeQuan, String nameQuan){

        this.codeQuan = codeQuan;
        this.nameQuan = nameQuan;
    }


    public String getCodeQuan() {
        return codeQuan;
    }

    public void setCodeQuan(String codeQuan) {
        this.codeQuan = codeQuan;
    }

    public String getNameQuan() {
        return nameQuan;
    }

    public void setNameQuan(String nameQuan) {
        this.nameQuan = nameQuan;
    }
}

package com.laptrinhjavaweb.EnumObject;

public enum BuildingTypeEnum {
    tang_tret("TANG_TRET", "Tầng Trệt"),
    nguyen_can("NGUYEN_CAN", "Nguyên căn"),
    noi_that("NOI_THAT", "Nội Thất"),
    anh_yeu_em( "ANH_YEU_EM", "anh yêu em");


    private String codeBuildingType;
    private String nameBuildingType;

    private BuildingTypeEnum(String codeBuildingType, String nameBuildingType) {

        this.codeBuildingType = codeBuildingType;
        this.nameBuildingType = nameBuildingType;
    }



    public String getCodeBuildingType() {
        return codeBuildingType;
    }

    public void setCodeBuildingType(String codeBuildingType) {
        this.codeBuildingType = codeBuildingType;
    }

    public String getNameBuildingType() {
        return nameBuildingType;
    }

    public void setNameBuildingType(String nameBuildingType) {
        this.nameBuildingType = nameBuildingType;
    }
}

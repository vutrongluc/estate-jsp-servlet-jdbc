package com.laptrinhjavaweb.constant;

import java.util.HashMap;
import java.util.Map;

public  final  class BuildingTypeConstant {


    private Map<String, String> map = new HashMap<String, String>();

    public Map<String, String> getMap() {
        return map;
    }

    public static final BuildingTypeConstant loadBuildingTypeConstant() {
        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("tang_tret", "Tầng Trệt");
        map2.put("nguyen_can", "Nguyên căn");
        map2.put("noi_that", "Nội Thất");
        BuildingTypeConstant result = new BuildingTypeConstant();
        result.map = map2;
        return result;
    }


}

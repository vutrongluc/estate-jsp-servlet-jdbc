package com.laptrinhjavaweb.constant;

import java.util.HashMap;
import java.util.Map;

public final class DistrictConstant {


    private Map<String, String> map = new HashMap<String, String>();

    public Map<String, String> getMap() {
        return map;
    }

    public static final DistrictConstant loadDistrictConstant() {
        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("Q1", "Quận 1");
        map2.put("Q2", "Quận 2");
        map2.put("Q3", "Quận 3");
        DistrictConstant result = new DistrictConstant();
        result.map = map2;
        return result;
    }


}

package com.laptrinhjavaweb.constant;

import java.util.HashMap;
import java.util.Map;

public final class TransactionTypeConstant {

    private Map<String, String> map = new HashMap<String, String>();

    public Map<String, String> getMap() {
        return map;
    }

    public static final TransactionTypeConstant loadTran()

{
    Map<String, String> map2 = new HashMap<String, String>();
    map2.put("tu_van", "Tư Vấn");
    map2.put("xem_nha", "Xem Nhà");
    map2.put("ky_ket", "Ký Kết");
    TransactionTypeConstant result = new TransactionTypeConstant();
    result.map = map2;
    return result;
}


}

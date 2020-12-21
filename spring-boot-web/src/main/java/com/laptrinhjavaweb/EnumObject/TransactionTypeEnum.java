package com.laptrinhjavaweb.EnumObject;

public enum TransactionTypeEnum {

    tu_van("tu_van", "Tư Vấn"),
    xem_nha("xem_nha", "Xem Nhà"),
    ky_ket("ky_ket", "Ký Kết");



    private String codeTransaction;
    private String nameTransaction;

    private TransactionTypeEnum( String codeTransaction, String nameTransaction) {
        this.codeTransaction = codeTransaction;
        this.nameTransaction = nameTransaction;

    }

    public String getCodeTransaction() {
        return codeTransaction;
    }

    public void setCodeTransaction(String codeTransaction) {
        this.codeTransaction = codeTransaction;
    }

    public String getNameTransaction() {
        return nameTransaction;
    }

    public void setNameTransaction(String nameTransaction) {
        this.nameTransaction = nameTransaction;
    }
}

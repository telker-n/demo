package com.banker.demo.pojo;

public enum TransactionStatus {
    INPROCESS("In_Process"), COMPLETED("Completed");

    private String status;
    TransactionStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }
}

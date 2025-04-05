package com.banker.demo.pojo;

final public class Account {
    private final String accNum;
    private final String type;
    private final int balance;

    Account(Builder accountBuilder){
        this.accNum = accountBuilder.accNum;
        this.type = accountBuilder.type;
        this.balance = accountBuilder.balance;
    }
/*    public String getAccNum() {
        return accNum;
    }

    public String getType() {
        return type;
    }

    public String getBalance() {
        return balance;
    }*/

    public static class Builder{
        private  String accNum;
        private  String type;
        private  int balance;

        public static Builder getInstance(){
            return new Builder();
        }
        private Builder(){}

        public Builder setAccountNum(String accNum){
            this.accNum = accNum;
            return this;
        }
        public Builder setType(String type){
            this.type = type;
            return this;
        }
        public Builder setAccountNum(int balance){
            this.balance = balance;
            return this;
        }
        public Account build(){
            return new Account(this);
        }
    }
}

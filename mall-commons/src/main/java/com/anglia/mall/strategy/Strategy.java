package com.anglia.mall.strategy;

public enum Strategy {

    METHOD1("1",""),
    METHOD2("2","");
    private String index;
    private String serviceName;

    Strategy(String index,String serviceName){
        this.index = index;
        this.serviceName = serviceName;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Strategy getStrategy(String index){
        for(Strategy strategy : values()){
            if(strategy.index.equals(index)){
                return strategy;
            }
        }
        return null;
    }
}

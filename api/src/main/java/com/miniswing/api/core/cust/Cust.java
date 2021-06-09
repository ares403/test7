package com.miniswing.api.core.cust;

public class Cust {
    private final String custnum;
    private final String custnm;
    private final String acntnum;

    public Cust(){
        custnum=null;
        custnm=null;
        acntnum=null;
    }

    public Cust(String custnum, String custnm, String acntnum){
        this.custnum = custnum;
        this.custnm = custnm;
        this.acntnum = acntnum;
    }

    public String getCustnum(){
        return custnum;
    }

    public String getCustnm(){
        return custnm;
    }

    public String getAcntnum(){
        return acntnum;
    }
}

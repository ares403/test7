package com.miniswing.api.core.svc;

public class Svc {
    private final Long svcmgmtnum;
    private final String feeprodid;
    private final String custnum;

    public Svc(){
        svcmgmtnum=0L;
        feeprodid=null;
        custnum=null;
    }

    public Svc(Long svcmgmtnum, String feeprodid, String custnum){
        this.svcmgmtnum = svcmgmtnum;
        this.feeprodid = feeprodid;
        this.custnum = custnum;
    }

    public Long getSvcmgmtnum(){
        return svcmgmtnum;
    }

    public String getFeeprodid(){
        return feeprodid;
    }

    public String getCustnum(){
        return custnum;
    }
}

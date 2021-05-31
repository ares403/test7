package api.core.prod;

public class Prod {
    private final String prodid;
    private final String prodnm;
    private final String coclcd;

    public Prod(){
        prodid=null;
        prodnm=null;
        coclcd=null;
    }

    public Prod(String prodid, String prodnm, String coclcd){
        this.prodid = prodid;
        this.prodnm = prodnm;
        this.coclcd = coclcd;
    }

    public String getProdid(){
        return prodid;
    }

    public String getProdnm(){
        return prodnm;
    }

    public String getCoclcd(){
        return coclcd;
    }
}

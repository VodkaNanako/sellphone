package com.qst.bean;

public class Seller {
    private int seller_id;
    private String seller_pn;
    private String seller_pd;

    public Seller(int seller_id, String seller_pn, String seller_pd) {
        this.seller_id = seller_id;
        this.seller_pn = seller_pn;
        this.seller_pd = seller_pd;
    }
    public Seller(){}

    public int getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(int seller_id) {
        this.seller_id = seller_id;
    }

    public String getSeller_pn() {
        return seller_pn;
    }

    public void setSeller_pn(String seller_pn) {
        this.seller_pn = seller_pn;
    }

    public String getSeller_pd() {
        return seller_pd;
    }

    public void setSeller_pd(String seller_pd) {
        this.seller_pd = seller_pd;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "seller_id=" + seller_id +
                ", seller_pn='" + seller_pn + '\'' +
                ", seller_pd='" + seller_pd + '\'' +
                '}';
    }
}

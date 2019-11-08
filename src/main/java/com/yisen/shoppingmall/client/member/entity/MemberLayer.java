package com.yisen.shoppingmall.client.member.entity;

public class MemberLayer {
    private int id;
    private String layer;
    private String minCredit;
    private String creditScale;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLayer() {
        return layer;
    }

    public void setLayer(String layer) {
        this.layer = layer;
    }

    public String getMinCredit() {
        return minCredit;
    }

    public void setMinCredit(String minCredit) {
        this.minCredit = minCredit;
    }

    public String getCreditScale() {
        return creditScale;
    }

    public void setCreditScale(String creditScale) {
        this.creditScale = creditScale;
    }
}

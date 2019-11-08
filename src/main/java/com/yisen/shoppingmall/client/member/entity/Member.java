package com.yisen.shoppingmall.client.member.entity;

public class Member {
    private int id;
    private String email;
    private String nick;
    private String password;
    private String credit;
    private int layerid;
    private String rDatetime;
    private MemberLayer layer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public int getLayerid() {
        return layerid;
    }

    public void setLayerid(int layerid) {
        this.layerid = layerid;
    }

    public String getrDatetime() {
        return rDatetime;
    }

    public void setrDatetime(String rDatetime) {
        this.rDatetime = rDatetime;
    }

    public MemberLayer getLayer() {
        return layer;
    }

    public void setLayer(MemberLayer layer) {
        this.layer = layer;
    }
}

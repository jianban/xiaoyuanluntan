package com.example.XiaoYuanLunTan.Demo;

import java.util.Date;

//注销
public class ZhuXiao {
    private Integer id;//注销ｉｄ号码
    private String wechat;//注销论坛号
    private String linTanName;//注销论坛名字
    private String name;//注销学生名字
    private Integer jieShu;//注销届数
    private Integer iphone;//注销电话号码
    private Date time;//时间

    public ZhuXiao() {
    }

    public ZhuXiao(Integer id, String wechat, String linTanName, String name, Integer jieShu, Integer iphone, Date time) {
        this.id = id;
        this.wechat = wechat;
        this.linTanName = linTanName;
        this.name = name;
        this.jieShu = jieShu;
        this.iphone = iphone;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getLinTanName() {
        return linTanName;
    }

    public void setLinTanName(String linTanName) {
        this.linTanName = linTanName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getJieShu() {
        return jieShu;
    }

    public void setJieShu(Integer jieShu) {
        this.jieShu = jieShu;
    }

    public Integer getIphone() {
        return iphone;
    }

    public void setIphone(Integer iphone) {
        this.iphone = iphone;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "ZhuXiao{" +
                "id=" + id +
                ", wechat='" + wechat + '\'' +
                ", linTanName='" + linTanName + '\'' +
                ", name='" + name + '\'' +
                ", jieShu=" + jieShu +
                ", iphone=" + iphone +
                ", time=" + time +
                '}';
    }
}

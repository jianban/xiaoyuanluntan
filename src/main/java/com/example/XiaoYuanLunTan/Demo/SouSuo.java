package com.example.XiaoYuanLunTan.Demo;
//搜索
public class SouSuo {
    private String wechat;//论坛号
    private String password;//密码
    private String lunTanName;//论坛名字
    private String name;//学生姓名
    private Integer jieShu;//届数
    private Integer iphone;//电话号码

    public SouSuo() {
    }

    public SouSuo(String wechat, String password, String lunTanName, String name, Integer jieShu, Integer iphone) {
        this.wechat = wechat;
        this.password = password;
        this.lunTanName = lunTanName;
        this.name = name;
        this.jieShu = jieShu;
        this.iphone = iphone;
    }


    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLunTanName() {
        return lunTanName;
    }

    public void setLunTanName(String lunTanName) {
        this.lunTanName = lunTanName;
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

    @Override
    public String toString() {
        return "SouSuo{" +
                "wechat='" + wechat + '\'' +
                ", password='" + password + '\'' +
                ", lunTanName='" + lunTanName + '\'' +
                ", name='" + name + '\'' +
                ", jieShu=" + jieShu +
                ", iphone=" + iphone +
                '}';
    }
}

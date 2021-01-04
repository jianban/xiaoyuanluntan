package com.example.XiaoYuanLunTan.Demo;

import java.util.Date;

//修改
public class Modify {
    private Integer id;
    private String name;//修改名字
    private String email;//修改邮箱
    private String oldPassword;//旧密码
    private String newPassword;//新密码
    private String confirmPassword;//再次输入密码
    private Date shiJian;//时间

    public Modify() {
    }

    public Modify(Integer id, String name, String email, String oldPassword, String newPassword, String confirmPassword, Date shiJian) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
        this.confirmPassword = confirmPassword;
        this.shiJian = shiJian;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Date getShiJian() {
        return shiJian;
    }

    public void setShiJian(Date shiJian) {
        this.shiJian = shiJian;
    }

    @Override
    public String toString() {
        return "Modify{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", oldPassword='" + oldPassword + '\'' +
                ", newPassword='" + newPassword + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", shiJian=" + shiJian +
                '}';
    }
}

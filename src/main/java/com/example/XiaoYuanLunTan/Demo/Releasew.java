package com.example.XiaoYuanLunTan.Demo;

import java.sql.Date;

//发帖
public class Releasew {
    private Integer id;//帖子ｉｄ
    private  String title;//标题
    private String content;//内容
    private Date releaseTime;//发布时间
    private Integer userId;//用户ｉｄ
    private Integer releaseVolume;//阅读量

    public Releasew() {
    }

    public Releasew(Integer id, String title, String content, Date releaseTime, Integer userId, Integer releaseVolume) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.releaseTime = releaseTime;
        this.userId = userId;
        this.releaseVolume = releaseVolume;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getReleaseVolume() {
        return releaseVolume;
    }

    public void setReleaseVolume(Integer releaseVolume) {
        this.releaseVolume = releaseVolume;
    }

    @Override
    public String toString() {
        return "Releasew{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", releaseTime=" + releaseTime +
                ", userId=" + userId +
                ", releaseVolume=" + releaseVolume +
                '}';
    }
}

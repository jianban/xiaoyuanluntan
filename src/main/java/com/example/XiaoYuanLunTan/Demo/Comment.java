package com.example.XiaoYuanLunTan.Demo;

import java.util.Date;

//评论表
public class Comment {
    private Integer commentId;//评论ｉｄ
    private Integer id;//帖子ｉｄ
    private Integer userId;//用户ｉｄ
    private String replyContent;//回复内容
    private Date replyTime;//回复时间

    public Comment() {
    }

    public Comment(Integer commentId, Integer id, Integer userId, String replyContent, Date replyTime) {
        this.commentId = commentId;
        this.id = id;
        this.userId = userId;
        this.replyContent = replyContent;
        this.replyTime = replyTime;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", id=" + id +
                ", userId=" + userId +
                ", replyContent='" + replyContent + '\'' +
                ", replyTime=" + replyTime +
                '}';
    }
}

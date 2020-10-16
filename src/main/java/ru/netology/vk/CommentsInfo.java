package ru.netology.vk;
public class CommentsInfo {
    private int id;
    private int postId;
    private int userId;
    private String userAvatar;
    private String comment;
    private String commentPublicationTime;
    private boolean commentParent;
    private boolean commentChild;
    private int commentTreadId;
    private int commentsCount;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommentPublicationTime() {
        return commentPublicationTime;
    }

    public void setCommentPublicationTime(String commentPublicationTime) {
        this.commentPublicationTime = commentPublicationTime;
    }

    public boolean isCommentParent() {
        return commentParent;
    }

    public void setCommentParent(boolean commentParent) {
        this.commentParent = commentParent;
    }

    public boolean isCommentChild() {
        return commentChild;
    }

    public void setCommentChild(boolean commentChild) {
        this.commentChild = commentChild;
    }

    public int getCommentTreadId() {
        return commentTreadId;
    }

    public void setCommentTreadId(int commentTreadId) {
        this.commentTreadId = commentTreadId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }
}

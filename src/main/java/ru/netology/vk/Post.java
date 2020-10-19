package ru.netology.vk;

public class Post {
    private int id; //id поста
    private int userId; // аналогично from_id
    private int ownerId; // добавлено в vk // id пользователя, на чьей стене опубликована запись
    private int createdBy; // добавлено в vk // для сообществ, id администратора, который опубликовал, возвращается не позже 24 часов
    private String userAvatar;
    private String header;
    private String publicationTime; // аталог date
    private String text; // переименовано как в vk
    private int replyOwnerId; // добавлено c vk; идентификатор владельца записи, в ответ на которую была оставлена текущая.
    private int replyPostId; // добавлено c vk; идентификатор записи, в ответ на которую была оставлена текущая.
    private boolean friendsOnly; // добавлено c vk; у них int
    private int copyright; // добавлено c vk;
    private int postType; // добавлено c vk;
    private String postUrl; //нет такого поля в vk, вероятно они это реализуют на фронте
    private boolean interesting; // флаг для того чтобы отображать в выборке "Сначала интересные"
    private String imageUrl; // в vk вынесено в массив прикрепляемых файлов разных типов attachments
    private int countView; // в vk отдельный объект
    private int countShare; // в vk отдельный объект
    private LikesPost likesPost;
    private CommentsInfo commentsInfo; // аналог объекта comments

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(String publicationTime) {
        this.publicationTime = publicationTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
    }

    public boolean isInteresting() {
        return interesting;
    }

    public void setInteresting(boolean interesting) {
        this.interesting = interesting;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getCountView() {
        return countView;
    }

    public void setCountView(int countView) {
        this.countView = countView;
    }

    public int getCountShare() {
        return countShare;
    }

    public void setCountShare(int countShare) {
        this.countShare = countShare;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreated_by(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public int getCopyright() {
        return copyright;
    }

    public void setCopyright(int copyright) {
        this.copyright = copyright;
    }

    public int getPostType() {
        return postType;
    }

    public void setPostType(int postType) {
        this.postType = postType;
    }
}
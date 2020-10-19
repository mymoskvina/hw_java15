package ru.netology.vk;

public class Post {
    private int id; //id поста
    private int userId; // аналогично from_id
    private int ownerId; // добавлено в vk // id пользователя, на чьей стене опубликована запись
    private int created_by; // добавлено в vk // для сообществ, id администратора, который опубликовал, возвращается не позже 24 часов
    private String userAvatar;
    private String header;
    private String publicationTime; // аталог date
    private String text; // переименовано как в vk
    private int reply_owner_id; // добавлено c vk; идентификатор владельца записи, в ответ на которую была оставлена текущая.
    private int reply_post_id; // добавлено c vk; идентификатор записи, в ответ на которую была оставлена текущая.
    private boolean friends_only; // добавлено c vk; у них int
    private int copyright; // добавлено c vk;
    private int post_type; // добавлено c vk;
    private String postUrl; //нет такого поля в vk, вероятно они это реализуют на фронте
    private boolean interesting; // флаг для того чтобы отображать в выборке "Сначала интересные"
    private String imageUrl; // в vk вынесено в массив прикрепляемых файлов разных типов attachments
    private int countView; // в vk отдельный объект
    private int countShare; // в vk отдельный объект
    private String countLike; // в vk вынесено в отдельный объект
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

    public String getCountLike() {
        return countLike;
    }

    public void setCountLike(String countLike) {
        this.countLike = countLike;
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

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public int getReply_owner_id() {
        return reply_owner_id;
    }

    public void setReply_owner_id(int reply_owner_id) {
        this.reply_owner_id = reply_owner_id;
    }

    public int getReply_post_id() {
        return reply_post_id;
    }

    public void setReply_post_id(int reply_post_id) {
        this.reply_post_id = reply_post_id;
    }

    public boolean isFriends_only() {
        return friends_only;
    }

    public void setFriends_only(boolean friends_only) {
        this.friends_only = friends_only;
    }

    public int getCopyright() {
        return copyright;
    }

    public void setCopyright(int copyright) {
        this.copyright = copyright;
    }

    public int getPost_type() {
        return post_type;
    }

    public void setPost_type(int post_type) {
        this.post_type = post_type;
    }
}

package cn.wildfirechat.model;

import java.io.Serializable;

public class ProtoUnreadCount implements Serializable {
    private int unread;
    private int unreadMention;
    private int unreadMentionAll;

    public int getUnread() {
        return unread;
    }

    public void setUnread(int unread) {
        this.unread = unread;
    }

    public int getUnreadMention() {
        return unreadMention;
    }

    public void setUnreadMention(int unreadMention) {
        this.unreadMention = unreadMention;
    }

    public int getUnreadMentionAll() {
        return unreadMentionAll;
    }

    public void setUnreadMentionAll(int unreadMentionAll) {
        this.unreadMentionAll = unreadMentionAll;
    }
}

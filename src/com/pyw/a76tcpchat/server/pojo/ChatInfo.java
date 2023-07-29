package com.pyw.a76tcpchat.server.pojo;

import java.time.LocalDateTime;

public class ChatInfo {

    private String name;
    private String content;
    private String ip;
    private LocalDateTime datetime;

    public ChatInfo() {
    }

    public ChatInfo(String name, String content, String ip, LocalDateTime datetime) {
        this.name = name;
        this.content = content;
        this.ip = ip;
        this.datetime = datetime;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取
     * @return datetime
     */
    public LocalDateTime getDatetime() {
        return datetime;
    }

    /**
     * 设置
     * @param datetime
     */
    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public String toString() {
        return "ChatInfo{name = " + name + ", content = " + content + ", ip = " + ip + ", datetime = " + datetime + "}";
    }
}

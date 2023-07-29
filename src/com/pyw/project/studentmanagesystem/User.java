package com.pyw.project.studentmanagesystem;

public class User {
    private String id;

    private String username;

    private String password;

    private String phone;

    private String idNum;


    public User() {
    }

    public User(String id, String username, String password, String phone, String idNum) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.idNum = idNum;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取
     * @return idNum
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * 设置
     * @param idNum
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String toString() {
        return "User{id = " + id + ", username = " + username + ", password = " + password + ", phone = " + phone + ", idNum = " + idNum + "}";
    }
}

package com.study.NGM301.sgjang11.service;

public class MemberVO {

    private int user_no;
    private String user_id;
    private String user_pass;

    public MemberVO() {
    }

    public MemberVO(int user_no, String user_id, String user_pass) {
        this.user_no = user_no;
        this.user_id = user_id;
        this.user_pass = user_pass;
    }

    public int getUser_no() {
        return user_no;
    }

    public void setUser_no(int user_no) {
        this.user_no = user_no;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    @Override
    public String toString() {
        return "MemberVO{" +
                "user_no=" + user_no +
                ", user_id='" + user_id + '\'' +
                ", user_pass='" + user_pass + '\'' +
                '}';
    }
}

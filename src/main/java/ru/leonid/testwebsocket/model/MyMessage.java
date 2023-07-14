package ru.leonid.testwebsocket.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class MyMessage {
    private long id;
    private String msg;

    private String user;

    public MyMessage(long id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "MyMessage{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", user='" + user + '\'' +
                '}';
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}

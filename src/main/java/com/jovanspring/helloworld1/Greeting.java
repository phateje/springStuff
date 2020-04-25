package com.jovanspring.helloworld1;

public class Greeting {
    private final long id;
    private final String msg;

    public Greeting(Long id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    public long getId() {
        return id;
    }

    public String getMsg() {
        return msg;
    }
}

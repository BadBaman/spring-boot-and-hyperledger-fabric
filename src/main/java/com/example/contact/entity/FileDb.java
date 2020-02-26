package com.example.contact.entity;

import java.io.Serializable;

/**
 * (FileDb)实体类
 *
 * @author makejava
 * @since 2020-02-25 23:32:03
 */
public class FileDb implements Serializable {
    private static final long serialVersionUID = -29787153983566878L;
    
    private Integer num;
    
    private String id;
    
    private String filename;
    
    private Integer filesize;
    
    private Object uptime;


    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Integer getFilesize() {
        return filesize;
    }

    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    public Object getUptime() {
        return uptime;
    }

    public void setUptime(Object uptime) {
        this.uptime = uptime;
    }

}
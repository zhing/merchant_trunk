package com.gornix.model.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
/*
  refer: http://blog.lifw.org/post/24921108
 */
public class UserInfo implements Serializable {

    @JsonProperty
    private Long id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

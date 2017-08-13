package com.gornix.model.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;


/*
  refer: http://blog.lifw.org/post/24921108
 */
public class UserInfo {

    @JsonProperty
    private Long id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String age;

    private UserInfo(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
    }

    public static class Builder {
        private Long id;
        private String name;
        private String age;

        public Builder(){}

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAge(String age) {
            this.age = age;
            return this;
        }

        public UserInfo build() {
            return new UserInfo(this);
        }
    }
}

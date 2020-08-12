package com.ming.community.dto;

import lombok.Data;

/**
 * @description:Github用户属性
 * @author: Ming
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}

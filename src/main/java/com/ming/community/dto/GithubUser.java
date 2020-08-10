package com.ming.community.dto;

import lombok.Data;

/**
 * @description:
 * @author: Ming
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}

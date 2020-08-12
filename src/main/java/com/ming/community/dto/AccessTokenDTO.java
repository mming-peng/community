package com.ming.community.dto;

import lombok.Data;

/**
 * @description:Github授权需要的属性
 * @author: Ming
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}

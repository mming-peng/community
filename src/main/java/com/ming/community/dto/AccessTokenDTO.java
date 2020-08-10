package com.ming.community.dto;

import lombok.Data;

/**
 * @description:
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

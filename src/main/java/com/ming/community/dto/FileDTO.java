package com.ming.community.dto;

import lombok.Data;

/**
 * @description:错误页面控制
 * @author: Ming
 */
@Data
public class FileDTO {
    private int success;
    private String message;
    private String url;
}

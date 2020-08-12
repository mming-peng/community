package com.ming.community.dto;

import lombok.Data;

/**
 * @description:评论传输的属性
 * @author: Ming
 */
@Data
public class CommentCreateDTO {
    private Long parentId;
    private String content;
    private Integer type;
}

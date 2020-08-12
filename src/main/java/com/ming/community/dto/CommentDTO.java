package com.ming.community.dto;

import com.ming.community.model.User;
import lombok.Data;

/**
 * @description:记录评论属性
 * @author: Ming
 */
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private Integer commentCount;
    private String content;
    private User user;
}

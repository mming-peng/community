package com.ming.community.dto;

import com.ming.community.model.User;
import lombok.Data;

/**
 * @description:问题属性
 * @author: Ming
 */
@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Long creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}

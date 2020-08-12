package com.ming.community.dto;

import lombok.Data;

/**
 * @description:问题传输属性
 * @author: Ming
 */
@Data
public class QuestionQueryDTO {
    private String search;
    private String sort;
    private Long time;
    private String tag;
    private Integer page;
    private Integer size;
}

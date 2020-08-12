package com.ming.community.dto;

import lombok.Data;

import java.util.List;

/**
 * @description:标签种类及其内容
 * @author: Ming
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}

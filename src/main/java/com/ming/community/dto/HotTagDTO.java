package com.ming.community.dto;

import lombok.Data;

/**
 * @description:重写compareTo方法，用于比较标签的优先集
 * @author: Ming
 */
@Data
public class HotTagDTO implements Comparable {
    private String name;
    private Integer priority;

    @Override
    public int compareTo(Object o) {
        return this.getPriority() - ((com.ming.community.dto.HotTagDTO) o).getPriority();
    }
}

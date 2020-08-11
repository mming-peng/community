package com.ming.community.dto;

import lombok.Data;

/**
 * @description:
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

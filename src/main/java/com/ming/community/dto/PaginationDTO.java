package com.ming.community.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:每一页的属性
 * @author: Ming
 */
@Data
public class PaginationDTO<T> {
    /**
     * 这一页的问题数
     */
    private List<T> data;
    /**
     * 前一页标签是否显示
     */
    private boolean showPrevious;
    /**
     * 第一页标签是否显示
     */
    private boolean showFirstPage;
    /**
     * 下一页标签是否显示
     */
    private boolean showNext;
    /**
     * 最后一页标签是否显示
     */
    private boolean showEndPage;
    /**
     * 当前页码
     */
    private Integer page;
    /**
     * 要显示的页码列表
     */
    private List<Integer> pages = new ArrayList<>();
    /**
     * 总页数
     */
    private Integer totalPage;

    public void setPagination(Integer totalPage, Integer page) {
        this.totalPage = totalPage;
        this.page = page;
        /**
         * 根据当前页获得要显示的页码
         */
        pages.add(page);
        for (int i = 1; i <= 3; i++) {
            if (page - i > 0) {
                pages.add(0, page - i);
            }

            if (page + i <= totalPage) {
                pages.add(page + i);
            }
        }

        // 是否展示上一页
        if (page == 1) {
            showPrevious = false;
        } else {
            showPrevious = true;
        }

        // 是否展示下一页
        if (page == totalPage) {
            showNext = false;
        } else {
            showNext = true;
        }

        // 是否展示第一页
        if (pages.contains(1)) {
            showFirstPage = false;
        } else {
            showFirstPage = true;
        }

        // 是否展示最后一页
        if (pages.contains(totalPage)) {
            showEndPage = false;
        } else {
            showEndPage = true;
        }
    }
}

package com.example.annotationdemo.param;

import lombok.Data;

/**
 * @author ABC
 */
@Data
public class PageParam {
    private Integer beginLine;
    private Integer pageSize = 3;
    private Integer currentPage = 0;
    public int getBeginLine() {
        return pageSize * currentPage;
    }
}

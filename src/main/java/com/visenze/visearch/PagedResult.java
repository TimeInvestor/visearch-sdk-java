package com.visenze.visearch;

import java.util.List;

public class PagedResult<T> {

    protected Integer page;

    protected Integer limit;

    protected Integer total;

    protected List<T> result;

    public PagedResult(Integer page, Integer limit, Integer total, List<T> result) {
        this.page = page;
        this.limit = limit;
        this.total = total;
        this.result = result;
    }

    public Integer getPage() {
        return page;
    }

    public Integer getLimit() {
        return limit;
    }

    public Integer getTotal() {
        return total;
    }

    public List<T> getResult() {
        return result;
    }

}

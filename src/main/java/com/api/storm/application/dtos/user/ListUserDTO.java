package com.api.storm.application.dtos.user;

public class ListUserDTO {

    private int page;

    private boolean paginate;

    private int limit;

    public ListUserDTO(int page, boolean paginate, int limit) {
        this.page = page;
        this.paginate = paginate;
        this.limit = limit;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public boolean isPaginate() {
        return paginate;
    }

    public void setPaginate(boolean paginate) {
        this.paginate = paginate;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}

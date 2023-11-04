package com.api.storm.application.validation.user;

import com.api.storm.utils.message.user.UserMessage;
import javax.validation.constraints.*;

public class ListUserValidationObject {

    @NotBlank(message = UserMessage.REQUIRED)
    @Positive(message = UserMessage.ONLY_INTEGER)
    private int page;

    @NotBlank(message = UserMessage.REQUIRED)
    @AssertFalse
    @AssertTrue
    @Future(message = UserMessage.ONLY_BOOLEAN)
    private boolean paginate;

    @NotBlank(message = UserMessage.REQUIRED)
    @Positive(message = UserMessage.ONLY_INTEGER)
    private int limit;

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

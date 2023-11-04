package com.api.storm.application.validation.address;

import com.api.storm.utils.message.address.AddressMessage;
import javax.validation.constraints.*;

public class ListAddressValidationObject {

    @NotBlank(message = AddressMessage.REQUIRED)
    @Positive(message = AddressMessage.ONLY_INTEGER)
    private int page;

    @NotBlank(message = AddressMessage.REQUIRED)
    @AssertFalse
    @AssertTrue
    @Future(message = AddressMessage.ONLY_BOOLEAN)
    private boolean paginate;

    @NotBlank(message = AddressMessage.REQUIRED)
    @Positive(message = AddressMessage.ONLY_INTEGER)
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

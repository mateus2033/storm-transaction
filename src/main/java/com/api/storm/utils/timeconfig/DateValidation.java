package com.api.storm.utils.timeconfig;

import java.util.Date;

public class DateValidation {

    public Boolean execute(Date dataBirth)
    {
        int year = 1700;
        long customTimeMillis = calculateMillisFromEpoch(year);

        Date today = new Date();
        Date minDate = new Date(customTimeMillis);

        return !dataBirth.after(today) && !dataBirth.before(minDate);
    }

    private static long calculateMillisFromEpoch(int year)
    {
        return (year - 1970) * 31556908800L;
    }
}

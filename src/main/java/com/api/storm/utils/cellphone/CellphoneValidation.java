package com.api.storm.utils.cellphone;

public class CellphoneValidation {

    public boolean execute(String cellphone) {

        cellphone = cellphone.replaceAll("\\D","");

        if (!(cellphone.length() >= 10 && cellphone.length() <= 11))
        {
            return false;
        }

        if (cellphone.length() == 11 && Integer.parseInt(cellphone.substring(2, 3)) != 9)
        {
            return false;
        }

        java.util.regex.Pattern p = java.util.regex.Pattern.compile(cellphone.charAt(0)+"{"+cellphone.length()+"}");
        java.util.regex.Matcher m = p.matcher(cellphone);

        if(m.find())
        {
            return false;
        }

        Integer[] codeDDD = {
                11, 12, 13, 14, 15, 16, 17, 18, 19,
                21, 22, 24, 27, 28, 31, 32, 33, 34,
                35, 37, 38, 41, 42, 43, 44, 45, 46,
                47, 48, 49, 51, 53, 54, 55, 61, 62,
                64, 63, 65, 66, 67, 68, 69, 71, 73,
                74, 75, 77, 79, 81, 82, 83, 84, 85,
                86, 87, 88, 89, 91, 92, 93, 94, 95,
                96, 97, 98, 99};

        if (!java.util.Arrays.asList(codeDDD).contains(Integer.parseInt(cellphone.substring(0, 2))))
        {
            return false;
        }

        Integer[] prefix = {2, 3, 4, 5, 7};

        if (cellphone.length() == 10 && !java.util.Arrays.asList(prefix).contains(Integer.parseInt(cellphone.substring(2, 3))))
        {
            return false;
        }

        return true;
    }
}

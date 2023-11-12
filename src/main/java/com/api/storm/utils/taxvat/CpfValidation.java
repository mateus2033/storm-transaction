package com.api.storm.utils.taxvat;

public class CpfValidation {

    public boolean execute(String cpf) {

        cpf = cpf.replaceAll("\\D", "");
        int[] digitArray = new int[11];
        for (int i = 0; i < 11; i++) {
            digitArray[i] = Integer.parseInt(cpf.substring(i, i + 1));
        }

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < 9; i++) {
            sum1 += digitArray[i] * (10 - i);
            sum2 += digitArray[i] * (11 - i);
        }

        int digit1 = (sum1 % 11 < 2) ? 0 : (11 - sum1 % 11);
        sum2 += digit1 * 2;
        int digit2 = (sum2 % 11 < 2) ? 0 : (11 - sum2 % 11);

        String calculatedDigits = String.valueOf(digit1) + String.valueOf(digit2);
        String verificationDigits = cpf.substring(9);

        return calculatedDigits.equals(verificationDigits);
    }

}

package com.lamda;

import com.lamda.interfaces.BankInterestCalculate;

public class Main{
    public static void main(String[] args) {
        BankInterestCalculate total = (amount , loanPercentage)-> amount/loanPercentage;
        System.out.println(total.LoanAmount(12000f, 6f));
    }
}
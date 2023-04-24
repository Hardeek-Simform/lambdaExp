package com.lamda.interfaces;

@FunctionalInterface
public interface BankInterestCalculate {
    float LoanAmount(float amount, float loanPercentage);
}

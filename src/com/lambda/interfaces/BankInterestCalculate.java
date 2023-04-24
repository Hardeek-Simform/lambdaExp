package com.lambda.interfaces;

@FunctionalInterface
public interface BankInterestCalculate {
    float LoanAmount(float amount, float loanPercentage);
}

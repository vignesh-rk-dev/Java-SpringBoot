package com.vignesh;

public class Salary {
    private double basicpay;
    private double allowances;
    private double deductions;
    private double netpay;

    public void setBasicpay(double basicpay) {
        this.basicpay = basicpay;
        calculateNetpay();
    }

    public void setAllowances(double allowances) {
        this.allowances = allowances;
        calculateNetpay();
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
        calculateNetpay();
    }

    private void calculateNetpay() {
        netpay = basicpay + allowances - deductions;
    }

    @Override
    public String toString() {
        return "\nBasic Pay: " + basicpay +
               "\nAllowances: " + allowances +
               "\nDeductions: " + deductions +
               "\nNet Pay: " + netpay;
    }
}

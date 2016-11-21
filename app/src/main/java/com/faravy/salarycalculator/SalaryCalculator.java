package com.faravy.salarycalculator;

/**
 * Created by Faravy on 15-Jun-16.
 */
public class SalaryCalculator {
    private double basicSalary;
    private double houseRent;
    private double medicalAmount;

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getHouseRent() {
        return houseRent;
    }

    public void setHouseRent(double houseRent) {
        this.houseRent = houseRent;
    }

    public double getMedicalAmount() {
        return medicalAmount;
    }

    public void setMedicalAmount(double medicalAmount) {
        this.medicalAmount = medicalAmount;
    }

    public double calculateTotalSalary(){

        double totalSalary=getBasicSalary()+(getBasicSalary()*getHouseRent())/100+
                (getBasicSalary()*getMedicalAmount())/100;

        return totalSalary;

    }
}

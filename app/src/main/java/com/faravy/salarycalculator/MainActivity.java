package com.faravy.salarycalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText basicSalaryEt;
    EditText medicalAmountEt;
    EditText houseRentEt;
    TextView totalSalaryTv;
    SalaryCalculator salaryCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        basicSalaryEt = (EditText) findViewById(R.id.basicSalary);
        medicalAmountEt = (EditText) findViewById(R.id.medicalAmount);
        houseRentEt = (EditText) findViewById(R.id.houseRent);
        totalSalaryTv = (TextView) findViewById(R.id.totalSalary);
        salaryCalculator=new SalaryCalculator();
    }

    public void calculate(View view) {

        double basicSalary=Double.parseDouble(basicSalaryEt.getText().toString());
        double houseRent=Double.parseDouble(houseRentEt.getText().toString());
        double medicalAmount=Double.parseDouble(medicalAmountEt.getText().toString());

        salaryCalculator.setBasicSalary(basicSalary);
        salaryCalculator.setHouseRent(houseRent);
        salaryCalculator.setMedicalAmount(medicalAmount);
        double totalSalary=salaryCalculator.calculateTotalSalary();
        totalSalaryTv.setText(String.valueOf(totalSalary));

    }
}

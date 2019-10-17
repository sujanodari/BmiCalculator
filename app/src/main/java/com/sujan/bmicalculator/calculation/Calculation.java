package com.sujan.bmicalculator.calculation;

import android.widget.Toast;

import com.sujan.bmicalculator.MainActivity;

public class Calculation {
   private double weight, height, bmi;
  private String result;


    public Calculation(double weight, double height) {
        this.weight = weight;
        this.height = height;

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public double calculateBmi(){
        return weight/(height*height);
     }
     public String bmiResult(){
        if(this.bmi <=16){
            result = "Severe Thinness";
        }
        if(16< this.bmi && this.bmi <=17){
            result =  "Moderate Thinness";
         }
         if(17< this.bmi && this.bmi <=18.5){
             result = "Mild Thinness";
         }
         if(18.5< this.bmi && this.bmi <=20){
             result = "Normal";
         }
         if(20< this.bmi && this.bmi <=25){
             result =  "Overweight ";
         }
        if(this.bmi >=30){
            result = "Obese Class";
        }
        return result;
     }
}

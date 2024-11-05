package com.pluralsight.exercises.generics;

import java.text.DecimalFormat;
import java.util.List;

public class PrintNumberArray<T extends Number>{
    private List<T> NumberArray;

    public PrintNumberArray(List<T> numberArray) {
        NumberArray = numberArray;
    }

    public void printNumberList(){
        System.out.println(NumberArray);
    }
    public void printAverage(){
        double total = 0;
        for (T t : NumberArray) {
            double num = Double.parseDouble(String.valueOf(t));
            total += num;
        }
        DecimalFormat df = new DecimalFormat("#.##"); // or #0.00
        String formattedNumber = df.format(total/NumberArray.size());
        System.out.println("average: " + formattedNumber);
    }


    public List<T> getNumberArray() {
        return NumberArray;
    }

    public void setNumberArray(List<T> numberArray) {
        NumberArray = numberArray;
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            Scanner did = new Scanner(System.in);

            int result=Formula.getFormula(3);
            System.out.println(result);
        }
        catch (FormulaException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
        Scanner num = new Scanner(System.in);
        float x = num.nextFloat();
        float y = num.nextFloat();
        float z = num.nextFloat();

    }
}
class Formula {
    float x;
    float y;
    float z;

    public Formula(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void displayFormula() {
        double l = Math.sqrt(x * x + y * y + z * z);
        System.out.println(l);
    }
    public static int getFormula(int num) throws FormulaException {
        int result = 1;
        if (num < 1) throw new FormulaException (" Number less than 1 ", num);
        for (int p = 1; p <= num; p++) {
            result *= p;
        }
        return result;
    }
}
class FormulaException extends Exception {
    private int number;

    public int getNumber() {
        return number;
    }

    public FormulaException(String message, int num) {
        super(message);
        number = num;
    }
}
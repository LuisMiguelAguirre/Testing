package com.example.admin.testing;

/**
 * Created by Admin on 10/3/2017.
 */

public class Calculation {

    public int getVal1() {
        return val1;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public int getVal2() {
        return val2;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }

    int val1;
    int val2;

    Addition addition;

    public Calculation(Addition addition) {
        this.addition = addition;
        this.val1 = 5;
        this.val2 = 4;
    }

    public int addition(){
        return addition.add(val1, val2) + 10;
    }


    public int susbtraction(){
        return val1 - val2;
    }

    public float division(){
        return val1/val2;
    }

    public void clear(){
        val1=5;
        val2=4;
    }

}

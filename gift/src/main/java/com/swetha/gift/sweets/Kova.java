package com.swetha.gift.sweets;


public class Kova extends Sweet{
    public Kova() {
        setSweetness(0);
        setWeight(0);
    }
    public Kova(double weight,double sweetness) {
        setSweetness(sweetness);
        setWeight(weight);
    }
}
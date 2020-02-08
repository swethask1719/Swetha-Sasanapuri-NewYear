
package com.swetha.gift.sweets;


public class Cashew extends Sweet{
    public Cashew() {
        setSweetness(0);
        setWeight(0);
    }
    public Cashew(double weight,double sweetness) {
        setSweetness(sweetness);
        setWeight(weight);
    }
}
package com.swetha.gift.sweets;

/**
 * @author harsha
 *
 */
public class Rasgulla extends Sweet{
    public Rasgulla() {
        setSweetness(0);
        setWeight(0);
    }
    public Rasgulla(double weight,double sweetness) {
        setSweetness(sweetness);
        setWeight(weight);
    }
}
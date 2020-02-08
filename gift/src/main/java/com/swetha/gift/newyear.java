package com.swetha.gift;
import com.swetha.gift.sweets.SweetGen;
import java.util.ArrayList;
import java.util.Comparator;

import com.swetha.gift.sweets.*;
public class newyear {
    private SweetGen sweetgen;
    private ArrayList<Sweet> newList;
    private static SugarLevelComparator sugarcomp=new SugarLevelComparator();
    private static WeightComparator weightComparator=new WeightComparator();
    public SugarLevelComparator getSugarLevelComparator()
    {
        return sugarcomp;
    }

    public static WeightComparator getWeightComparator() {
        return weightComparator;
    }
    public newyear()
    {
        sweetgen=new SweetGen();
        newList=new ArrayList<Sweet>();
    }
    public ArrayList<Sweet> generate(int x)
    {
        for(int i=0;i<x;i++)
        {
            System.out.printf("\n Showing sugar and its weight : ");
            newList.add(sweetgen.next());
        }
        return newList;
    }
    private static class SugarLevelComparator implements Comparator<Sweet>
    {
        public int compare(Sweet sweetsOne, Sweet sweetsTwo)
        {
            return (sweetsOne.getSweetness() < sweetsTwo.getSweetness()? -1 : (sweetsOne.getSweetness()==sweetsTwo.getSweetness()? 0:1));
        }
    }
    private static class WeightComparator implements Comparator<Sweet>
    {
        public int compare(Sweet sweetsOne, Sweet sweetsTwo)
        {
            return (sweetsOne.getWeight() < sweetsTwo.getWeight()? -1 : (sweetsOne.getWeight()==sweetsTwo.getWeight()? 0:1));
        }
    }
}

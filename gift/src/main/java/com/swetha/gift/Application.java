package com.swetha.gift;
import com.swetha.gift.sweets.*;
import java.util.ArrayList;
public class Application<Sweet> {
    private GC gc;
    ArrayList<Sweet> sweets;
    public Application()
    {
        gc=new GC();
    }
    private void process()
    {
        int n= (int) (Math.random()*10);
        gc.generateGift(n);
    }
    public void start()
    {
        process();
    }
}

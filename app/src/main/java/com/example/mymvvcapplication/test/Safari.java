package com.example.mymvvcapplication.test;

import android.util.Log;

public class Safari extends Vehicle  {

    public int i;
    public String k;
    public  String GetPrice(){

        return "in Safari Class";

    }

    public Safari(int a, int b)
    {
        Log.i("SAFARi", "int,int constrcto");
    }
    public Safari(int a, float b)
    {
        Log.i("SAFARi", "int,float constrcto");
    }


}

package com.driver;

import java.sql.Struct;

public class Main {
public static void Main (String[] args){
    Product p=new Product();
    int ans=p.product(3,2);
    int ans2=p.product(4,6,9);
    double ans3=p.product(4.566,7.889);

}
public static class Product{
    public int product(int x, int y) {
        return x+y;
    }

    public int product(int x, int y, int z) {
        return x+y*z;
    }

    public double product(double x, double y) {
        return x+y;
    }

}
}
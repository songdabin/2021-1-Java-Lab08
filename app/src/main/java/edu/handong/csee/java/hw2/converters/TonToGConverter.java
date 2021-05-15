package edu.handong.csee.java.hw2.converters;

/**
* TONToGConverter is a class that convert Ton to G. It implements Convertive interface
*/
public class TONToGConverter implements Convertible {

    private double ton;   
    private double g;
    
    /**
    *   method that update ton value
    */
    public void setFromValue(double fromValue) {
        ton = fromValue;
    }

    /**
    *   method that convert ton to g
    */
    public void convert() {
        g = ton * 1000000;
    }

    /**
    *   method that returns g value
    */
    public double getConvertedValue() {
        return g;
    }
}
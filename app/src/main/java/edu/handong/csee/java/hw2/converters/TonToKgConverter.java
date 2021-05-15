package edu.handong.csee.java.hw2.converters;
/**
*   TONToKGConverter is a class that convert Ton to Kg. It implements Convertive interface
*/
public class TONToKGConverter implements Convertible {

    private double ton;   
    private double kg;
    /**
    *  method that updates ton value 
    */
    public void setFromValue(double fromValue) {
        ton = fromValue;
    }

    /**
    *   method that converts ton to kg
    */
    public void convert() {
        kg = ton * 1000;
    }

    /**
    *   method that returns kg value
    */
    public double getConvertedValue() {
        return kg;
    }
}
package edu.handong.csee.java.hw2.converters;

/* fourth commit! */

/**
*   MILEToKMConverter is a class that converts Miles to Kilometers. It implements Convertive interface
*/
public class MILEToKMConverter implements Convertible {

    private double km;   
    private double mile;

    /**
    *   method that updates mile value 
    */
    public void setFromValue(double fromValue) {
        mile = fromValue;
    }

    /**
    *   method that convert mile to kilometer
    */
    public void convert() {
        km = mile * 1.6;
    }
    
    /**
    *   method that return kilometer value   
    */
    public double getConvertedValue() {
        return km;
    }
}
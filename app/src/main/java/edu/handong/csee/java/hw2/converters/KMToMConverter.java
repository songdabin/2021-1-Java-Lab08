package edu.handong.csee.java.hw2.converters;

/* third commit! */

/**
* KMToMConverter is the class that converts Kilometers to meters. It implements Convertive interface
*/
public class KMToMConverter implements Convertible{
    private double m;
    private double km;
    /**
    *  method that update kilometer information from the input
    */
    public void setFromValue(double fromValue) {
        km = fromValue;
    }   
    /**
    * method that convert kilometer to meter
    */
    public void convert() {
        m = km * 1000;
    }
    /**
    *   method that return meter value 
    */
    public double getConvertedValue() {
        return m;
    }
}
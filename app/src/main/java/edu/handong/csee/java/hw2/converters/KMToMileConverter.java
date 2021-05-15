package edu.handong.csee.java.hw2.converters;

/**
* KMToMILEConverter is a class that converts Kilometers to Miles. It implements Convertive interface
*/
public class KMToMILEConverter implements Convertible {

    private double km;   
    private double mile;
    /**
    *   method that update kilometer
    */
    public void setFromValue(double fromValue) {
        km = fromValue;
    }
    /**
    *   method that convert kilometer value to mile value
    */
    public void convert() {
        mile = km / 1.6;
    }
    /**
    *   method that return mile value
    */
    public double getConvertedValue() {
        return mile;
    }
}
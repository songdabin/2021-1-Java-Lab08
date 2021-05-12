package edu.handong.csee.java.hw2.converters;

/**
* interface Convertible contains three method declaration
*/
public interface Convertible {
    /**
    * setFromValue method declaration that have double type parameter 
    */
    public void setFromValue(double fromValue);
    /**
    * getConvertedValue method that returns double type 
    */
    public double getConvertedValue();
    /**
    * convert method 
    */
    public void convert();

}
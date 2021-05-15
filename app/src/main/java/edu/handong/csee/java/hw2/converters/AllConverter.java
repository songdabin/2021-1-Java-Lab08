package edu.handong.csee.java.hw2.converters;

/**
* This is the AllConverter class that converts KM to M and MILE  , TON to G and KG at the same time.
 */
public class AllConverter {

    private double value;
    private String original;

    /**
    * set double type value with fromValue and then return AllConverter class 
    * 
    * 
     */
    public AllConverter setFromValue(double fromValue) {
        value = fromValue;
        return this;
    }

    /**
    * set String type (ex. KM , MILE etc) with  originalMeasure and then return AllConverter class
    * 
    *  
     */
    public AllConverter setOriginalMeasure(String originalMeasure) {
        original = originalMeasure;
        return this;
    }


    /**
    * Print method after converting input measurement(String type) to  specific measurement
     */
    public void convertAndPrintOut() {
        if(original.equals("KM")) {
            KMToMConverter kmToM = new KMToMConverter();
            kmToM.setFromValue(value);
            kmToM.convert();
            kmToM.getConvertedValue();
            System.out.println(value +" " + original + " to " + kmToM.getConvertedValue() + " M");

            KMToMILEConverter kmToMile = new KMToMILEConverter();
            kmToMile.setFromValue(value);
            kmToMile.convert();
            kmToMile.getConvertedValue();
            System.out.println(value +" " + original + " to " + kmToMile.getConvertedValue() + " MILE");
        }
        else if(original.equals("TON")) {
            TONToKGConverter tonToKg = new TONToKGConverter();
            tonToKg.setFromValue(value);
            tonToKg.convert();
            tonToKg.getConvertedValue();
            System.out.println(value +" " +original + " to " + tonToKg.getConvertedValue() + " KG");

            TONToGConverter tonToG = new TONToGConverter();
            tonToG.setFromValue(value);
            tonToG.convert();
            tonToG.getConvertedValue();
            System.out.println(value +" " + original + " to " + tonToG.getConvertedValue() + " G");
        }
        else 
            System.out.println("AllConverter cannot support the measure!"); 
    } 
}
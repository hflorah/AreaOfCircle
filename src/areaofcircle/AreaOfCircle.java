/*
 * Bennie
 * AreaOfCircle.java
 * This program calculates the area of a Circle
 * February 27,2018
 */
package areaofcircle;

/**
 * 
 * @author huangsiwen
 */
public class AreaOfCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radius,pi,Area;
        radius=15.0;
        pi=3.14;
        Area=pi*radius*radius;
        
        System.out.println("the area of the circle is "+Area+" cm^2");
    }
    
}

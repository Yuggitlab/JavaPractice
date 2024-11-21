package org.example;

import Abstraction.Area;
import Abstraction.FindArea;

public class Main  {
    public static void main(String[] args) {

        Area area = new FindArea();
        Integer value1 = area.findAreaofRectangle();
        Integer value2 = area.areaOfTrangle(1,2,4);
        System.out.println("Area of rectangle is " + value1);
        System.out.println("Area of Trangle is " + value2);
    }
}
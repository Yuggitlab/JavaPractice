package Abstraction;

public class FindArea extends Area{

    public Integer side1 = 7;
    public Integer side2 = 4;
    public Integer side3 = 4;
    Integer rectangleSide1;
    Integer rectangleSide2;

    public Integer findAreaofRectangle(){
        if (side1 == side2 && side1 == side3){
             rectangleSide1 = side1;
             rectangleSide2 = side1;
        } else if (side1 == side2 && side1!= side3) {
             rectangleSide1 = side1;
            rectangleSide2 = side3;
        } else if (side1 !=side2 && side1 == side3)  {
             rectangleSide1 = side1;
             rectangleSide2 = side2;
        } else if (side1 != side2 && side1 != side3) {
            System.out.println("Not a triangle");
            if (side2 == side3){
                rectangleSide1 = side1;
                rectangleSide2 = side2;
            }

        }
        Integer area = rectangleSide1*rectangleSide2;
        return area;
    }
    public Integer areaOfTrangle(Integer a, Integer b, Integer c){

        Integer area = a + b + c;
        area = area/2;
        return  area;

    }
}

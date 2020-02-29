package org.triangleassignment;

public class Triangle {

    private int side1;
    private int side2;
    private int side3;

    Triangle(int side1, int side2, int side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
//the function that determines the type of this triangle
    public String determine() {

        if (side1 == side2 && side1 == side3) {
            return "Type of the triangle is the equilateral one.";
        }
        else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Type of the triangle is the isosceles one.";
        }
        else if (side1 * side1 + side2 * side2 == side3 * side3 || side2 * side2 + side3 * side3 == side1 * side1 || side1 * side1 + side3 * side3 == side2 * side2) {
            return "Type of the triangle is the right one.";
        }
        else{
            return "Type of the triangle is the standard one.";
        }
    }

}
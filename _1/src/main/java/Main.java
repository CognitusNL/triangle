import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int side1;
        int side2;
        int side3;

        System.out.println("Type the first side of the triangle:" );
        Scanner in1 = new Scanner(System.in);
        side1 = in1.nextInt();

        System.out.println("Type the second side of the triangle:" );
        Scanner in2 = new Scanner(System.in);
        side2 = in2.nextInt();

        System.out.println("Type the third side of the triangle:" );
        Scanner in3 = new Scanner(System.in);
        side3 = in3.nextInt();
        while(((side1 + side2) <= side3)) {
            System.out.println("By the rules of geometry any sum of two sides must be bigger than the third side, so the third side must be smaller, that two first ones. Please enter the valid value:");
            side3 = in3.nextInt();
        }
        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println(triangle.determine());

    }
}

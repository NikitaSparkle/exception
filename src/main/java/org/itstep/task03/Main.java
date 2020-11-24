package org.itstep.task03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int side1= scan.nextInt();
        int side2= scan.nextInt();
        int side3= scan.nextInt();
        try{
            Triangle triangle = new Triangle(side1,side2,side3);
            System.out.println("Triangle created\n");
        }catch (CreateTriangleException ctEx){
            System.err.println("This Triangle cannot exist");
        }
    }
}

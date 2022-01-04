package Assingment3;

import java.security.InvalidParameterException;

import java.util.Scanner;

public class NoWayHome {
    public static void no()throws InvalidParameterException {

        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
         sum =a+b;
        System.out.println("Sum is "+sum);
        throw new InvalidParameterException("sum is negative");

    }

    public static void main(String[] args) {

        try{
            no();

        }
        catch (InvalidParameterException e){
            System.out.println("Negative Number");

        }

    }


}

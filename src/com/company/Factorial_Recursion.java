//Find the factorial of a positive integer number.
// 8!=8*7*6*....*1
//n!=n*(n-1)*(n-2)*.....*1
//n!=n*((n-1)!)
//f(n)=n*f(n-1)

package com.company;
import java.util.Scanner;

class Factorial{
    int factorial(int num){
        if(num<0){
            return -1;
        }
        if(num==0){
            return 1;
        }
        return num*factorial(num-1);
    }
}

public class Factorial_Recursion {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        Factorial factorial= new Factorial();
        System.out.println("Enter the number for which you want to find the factorial: ");
        int n= sc.nextInt();
        System.out.println("The factorial is: "+factorial.factorial(n));
    }
}

// Assignment: Find the fibonacci number.

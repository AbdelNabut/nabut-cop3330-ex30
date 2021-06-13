/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Abdel Nabut
 */


package ex30;

public class App 
{
    public static void main( String[] args )
    {
        for(int i = 1; i <= 12; i++) {
            System.out.printf("%5d ", i);
            for(int j = i + i; j <= 12 * i; j += i) {
                System.out.printf("%5d ", j);
            }
            System.out.print("\n");
        }
    }
}

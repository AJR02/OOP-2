package Challenges;

import java.util.Scanner;

class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=scanner.nextInt();

        if(number%2==0)
        {
            System.out.println(number + " is even.");
        }
        else
        {
            System.out.println(number + " is odd.");
        }
        scanner.close();
    }
}
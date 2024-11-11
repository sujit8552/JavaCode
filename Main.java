package sujit;

import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("please enter your roll no: ");
        Scanner sc = new Scanner(System.in);
        int roll_no = sc.nextInt();
        System.out.println("Your roll number is: " + roll_no);
    }
}
package sujit;

public class ReverseNumber {
    public static void main(String[] args) {
        // Reverse the number 37589
        // Output => 98573

        int num = 37589;
        int output = 0;
        while (num > 0)
        {
            int rem = num % 10;
            output = output * 10 + rem;
            num = num / 10;
        }
        System.out.println(output);
    }
}

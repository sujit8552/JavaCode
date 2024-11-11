package sujit;

public class CountNum {
    public static void main(String[] args) {
        // Count digit 5 in number 85535857
        int num = 85535857;
        int count = 0;
        while (num > 0)
        {
            int rem = num % 10;
            if (rem == 5)
            {
                count++;
            }
            num = num /10;
        }
        System.out.println(count);
    }
}

package logical;

import java.util.Arrays;

public class ArrayGreatestNumberIn {

    public static void main (String args[])
    {
        int[] numbers = {78 , 18 , 19 , 3, 20 , 13 , 18};

        int greatest = numbers[0];

        for ( int num : numbers)
        {
            if (num>greatest)
            {
                greatest = num;
            }
        }

        System.out.println("Greatest number is " + greatest);
        System.out.println("Printing array" + Arrays.toString(numbers));
    }
}


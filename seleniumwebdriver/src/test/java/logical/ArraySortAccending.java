package logical;

import java.util.Arrays;

public class ArraySortAccending {

    public static void main(String args[]) {

        int[] numbers = {10, 20, 50, 30, 80, 40, 20};

        for (int i = 0; i < numbers.length-1; i++)
        {
            for (int j = i+1 ; j<numbers.length ; j++)

            {
//                if(numbers[i]> numbers[j])
//                {
//                    int temp = numbers[i];
//                    numbers[i]= numbers[j];
//                    numbers[j]= temp;
//
//                }
                if(numbers[i]< numbers[j])
                {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;


                }
            }
        }
        System.out.println("Sorted array is  " + Arrays.toString(numbers));

    }
}

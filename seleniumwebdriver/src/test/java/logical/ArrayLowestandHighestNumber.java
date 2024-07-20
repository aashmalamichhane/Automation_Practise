package logical;

public class ArrayLowestandHighestNumber {

    public  static  void main (String args[])
    {

        int[] numbers = {1 ,10 , 20 , 23, 22, 23 , 90, 2, 3 ,1};
        int lowest = numbers[0];
        int greatest = numbers[0];

        for( int num : numbers)
        {
            if ( num < lowest)
            {
                lowest= num;
            }

            else if (num > greatest) {
                greatest = num;

            }
        }
        System.out.println("Lowest is : " + lowest);
        System.out.println("Greatest is : " + greatest);

    }



}


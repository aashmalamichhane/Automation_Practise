package logical;

public class ArraySecondHighestin {
    public static void main(String args[])
    {
        int[] numbers = {78, 10 , 20 , 16, 25 , 30 , 5 , 30};

        int greatest = numbers[0];
        int secondHIghest = 0;

        for ( int num : numbers)
        {
            if (num> greatest)
            {
                secondHIghest= greatest;
                greatest = num;

            }
            else if (num > secondHIghest  && num != greatest) {

                secondHIghest = num;

           }
        }

        System.out.println("HIghest: "+ greatest);
        System.out.println("Second Highest: "  + secondHIghest);


    }
}

package logical;

public class ConcatString {
    public static void main (String arggs[])
    {
        String st1 = "ABC";
        String st2 = "DEF";
        String st3 = "GHI";

        String s1 = st1.concat(st2).concat(st3);
//        String s2 = s1.concat(st3);
        System.out.println(s1);



    }
}

package String;

import java.util.function.Function;

public class CountNumber {
    public static void main(String[] args) {
        //Start time
        long begin = System.currentTimeMillis();
        System.out.println("Start Time: "+begin+" milli seconds");
        //Starting the watch
        countNumber(517834566);
        //End time
        long end = System.currentTimeMillis();

        long time = end-begin;
        System.out.println("End Time: "+end+" milli seconds");
        System.out.println("Elapsed Time: "+time +" milli seconds");
    }
    public static void countNumber(int a){
//        int a = 517834566;
        int countNumber = 0;
        while (a%10!=0){
            a = a/10;
            countNumber++;
        }
        System.out.println("Number of digits in number : "+countNumber);
    }

    public static void countNumberUsingLambda() {
        Function<Integer, Integer> countDigits = num -> {
            return String.valueOf(Math.abs(num)).length();
        };
    }
}

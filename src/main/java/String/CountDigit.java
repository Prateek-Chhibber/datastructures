package String;

public class CountDigit {

    public static void main(String[] args) {
        countDigitInNumber(123124, 1);
        int c = countDigitOccurrences(234521342, 2);
        System.out.println("count is : "+c);
    }

    public static void countDigitInNumber(int number, int digit){
        int originalNumber = number;
        int count = 0;
        int temp = 0;
        while (number%10 !=0){
            if (number%10 == digit){
                count++;
            }
            number = number/10;
        }
        System.out.println("The digit : "+digit+" has "+count+" : occurences in number :"+originalNumber);
    }

    public static int countDigitOccurrences(int number, int digit) {
        int count = 0;
        String numberStr = String.valueOf(Math.abs(number)); // Handle negative numbers
        String nbr = Integer.toString(number);
        for (char c : numberStr.toCharArray()) {
            if (c == Character.forDigit(digit, 10)) {
                count++;
            }
        }

        return count;
    }
}
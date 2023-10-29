package ArrayQuestions;

public class ReverseString {

    public static void main(String[] args) {
        String original = "India will win";
        String reverse = "";
//        char ch[] = original.toCharArray();
//        for(int i=ch.length-1;i>=0;i--){
//            reverse += ch[i];
//        }
//        System.out.println(reverse);
        String[] words = original.split("\\s");
        for(String w:words){
            StringBuilder sb = new StringBuilder(w);
        }
    }
}

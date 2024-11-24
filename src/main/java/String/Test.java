package String;

import java.util.StringTokenizer;

public class Test {

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Mango, Apple, Banana, Strawberry", "");
        while (st.hasMoreElements()){
            System.out.println(st.nextElement());
        }
    }
}

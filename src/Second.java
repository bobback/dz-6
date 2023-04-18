import java.util.ArrayList;
import java.util.Arrays;

public class Second {
    public static void main(String[] args) {

        String myString = "Alexx9800";
        ArrayList<Character> uniqueChars = new ArrayList<>();
        for(char c : myString.toCharArray()) {
            if(!uniqueChars.contains(c)) {
                uniqueChars.add(c);
            }
        }
        for(char c : uniqueChars) {
            System.out.println(c);
        }
    }
}

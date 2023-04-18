import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intsArray = new int[]{8, 2, 3, 4, 5, 6, 7};
        int sum = 0;

        for (int j : intsArray) {
            if (j % 2 == 0) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}

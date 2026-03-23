import java.util.Arrays;

public class Sortstrings {
    public static void main(String[] args) {
        String[] arr = {"Banana", "Apple", "Mango", "Cherry"};
        Arrays.sort(arr);
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
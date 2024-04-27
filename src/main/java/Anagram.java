import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(sort("Anagram"));
    }

    public static boolean isAnagram(String first, String second) {
        if(first.length() != second.length()){
            return false;
        }
        first = first.toLowerCase();
        second = second.toLowerCase();
        sort(first);
        sort(second);
        return sort(first).equals(sort(second));
    }

    public static String sort(String word) {
        char[] arr = word.toCharArray();
        for (int i =  0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        word = String.valueOf(arr);
        return word;
    }


}

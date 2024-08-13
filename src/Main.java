import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static String countSort(String arr){
        String[] str = new String[arr.length()];
        String[] alphabet = {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        };
        int[] counts = new int[26];

        for (int i = 0; i < arr.length(); i++){
            String temp = arr.substring(i, i + 1);
            str[i] = temp;
        }

        for (int i = 0; i < str.length; i++){
            for (int j = 0; j < alphabet.length; j++){
                if (str[i].equalsIgnoreCase(alphabet[j])){
                    counts[j] += 1;
                    break;
                }
            }
        }

        String result = "";
        for (int i = 0; i < 26; i++){
            while (counts[i] > 0){
                result += alphabet[i];
                counts[i]--;
            }
        }


    return result;
    }

}











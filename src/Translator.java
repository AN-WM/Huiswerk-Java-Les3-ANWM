import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translator {
    Map<Integer, String> numbersAndWords = new HashMap<>();


    public Translator(int[] numbers, String[] words) {
        for (int i = 0; i < numbers.length; i++) {
            numbersAndWords.put(numbers[i], words[i]);
        }
    }

    public String translate (int number) {
        return numbersAndWords.get(number);
    }

}

import java.util.ArrayList;
import java.util.List;

/**
 * Words
 */
public class Words {

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (x == words[i].charAt(j)) {
                    l1.add(i);
                    break;
                }
            }

        }
        return l1;

    }

    public static void main(String[] args) {
        String[] wordlist = { "hello", "world", "java", "python", "c++" };
        Words wd = new Words();
        System.out.println(wd.findWordsContaining(wordlist, 'o'));// prints [0 1 3]

    }
}
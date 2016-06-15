import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class Anagram {
    private String compareString;
    private String original;

    public Anagram(String word){
        original = word.toLowerCase();
        compareString = sortedByChar(word);
    }

    private String sortedByChar(String word){
        char[] sortable = word.toLowerCase().toCharArray();
        Arrays.sort(sortable);
        return new String(sortable);
    }

    public List<String> match(List<String> wordList){
        List<String> matched = new ArrayList<String>();
        for (String word : wordList){
            String wordLowercase = word.toLowerCase();
            String sortedWord = sortedByChar(word);
            if (sortedWord.equals(compareString) && !(wordLowercase.equals(original))){
                matched.add(word);
            }
        }
        return matched;
    }
}

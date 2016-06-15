import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public Map<String, Integer> phrase(String sentence){
        Map<String, Integer> wordCounts = new HashMap<>();

        for(String word : sentence.split("\\W+")){
            word = word.toLowerCase();
            System.out.println(word);
            Integer storedVal = wordCounts.get(word);
            if (storedVal == null) {
                wordCounts.put(word, 1);
            } else {
                wordCounts.put(word, ++storedVal);
            }
        }

        return wordCounts;
    }
}

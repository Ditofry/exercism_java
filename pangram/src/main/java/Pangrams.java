import java.util.HashSet;

/**
 * Created by brandon on 6/14/16.
 */
public class Pangrams {

    private static HashSet<Character> buildLetterHash(){
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        HashSet<Character> newHash = new HashSet<>();
        for (char letter : alphabet){
            newHash.add(letter);
        }
        return newHash;
    }

    public static boolean isPangram(String sentence){
        HashSet<Character> compareHash = buildLetterHash();
        sentence = sentence.toLowerCase();
        for (int i = 0; i < sentence.length(); i++){
            compareHash.remove(sentence.charAt(i));
            if (compareHash.isEmpty()){
                return true;
            }
        }

        return false;
    }
}

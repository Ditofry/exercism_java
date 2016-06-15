import java.util.HashMap;
import java.util.Map;

public class DNA {
    private Map<Character, Integer> nucleotides = new HashMap<>();
    public DNA(String sequence){
        // Defaults
        nucleotides.put('A', 0);
        nucleotides.put('C', 0);
        nucleotides.put('G', 0);
        nucleotides.put('T', 0);
        // User input
        for (int i = 0; i < sequence.length(); i++) {
            char currentChar = sequence.charAt(i);
            Integer storedVal = nucleotides.get(currentChar);

            if (storedVal != null) {
                nucleotides.put(currentChar, ++storedVal);
            }
        }
    }

    public Map<Character, Integer> nucleotideCounts(){
        return nucleotides;
    }

    public int count(char key){
        Integer keySearch = nucleotides.get(key);
        if (keySearch == null){
            throw new IllegalArgumentException("if it ain't ACGT, then it ain't a nucleotide.");
        } else {
            return keySearch;
        }
    }

}

package Lab3;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class HugeText {
    public String Text;
    public int nrOfSentences;
    public int nrOfWords;
    public int nrOfLetters;
    public int nrOfConsonas;
    public int nrOfvowels;
    public ArrayList<String> words;

    public HugeText()
    {
        Text = "Certain but she but shyness why cottage. Gay the put instrument sir entreaties affronting. Pretended exquisite see cordially the you. Weeks quiet do vexed or whose. Motionless if no to affronting imprudence no precaution. My indulged as disposal strongly attended. Parlors men express had private village man. Discovery moonlight recommend all one not. Indulged to answered prospect it bachelor is he bringing shutters. Pronounce forfeited mr direction oh he dashwoods ye unwilling.";
        nrOfSentences = 0;
        nrOfWords = 1;
        nrOfLetters = 0;
    }

    public void Top5Words()
    {
        words = new ArrayList<String>();
        String word = "";
        for(int i = 0; i < Text.length(); i++){
            char letter = Text.charAt(i);
            if((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')) {
                word += letter;
            }
            else
            {
                if(word != ""){
                    words.add(word);
                    word = "";
                }
            }
        }
        Map<String, Integer> wordFrequencies = GetWordFrequencies(words);
        Map<String, Integer> sortedWordFrequencies = sortByValue(wordFrequencies);
        PrintTop5Words(sortedWordFrequencies);
    }

    private <K, V>void PrintTop5Words(Map<K, V> sortedMap){
        int nrOfWords = sortedMap.size();
        int index = 0;
        for (Map.Entry<K, V> entry : sortedMap.entrySet()) {
            index++;
            if(index + 4 >= nrOfWords){
                System.out.println("Key : " + entry.getKey()
                        + " Value : " + entry.getValue());
            }
        }
    }

    private Map<String, Integer> GetWordFrequencies(ArrayList<String> words){
        Map<String, Integer> wordFrequencies = new LinkedHashMap<String, Integer>();
        if (words != null) {
            for (String word : words) {
                if (word != null) {
                    word = word.trim();
                    if (!wordFrequencies.containsKey(word)) {
                        wordFrequencies.put(word, 0);
                    }
                    int count = wordFrequencies.get(word);
                    wordFrequencies.put(word, ++count);
                }
            }
        }
        return wordFrequencies;
    }

    public int GetNrOfSentences()
    {
        for (int i = 0; i < Text.length(); i++){
            if(Text.charAt(i)== '.'){
                nrOfSentences++;
            }
        }
        return nrOfSentences;
    }

    public int GetNrOfWord()
    {
        for (int i = 0; i < Text.length(); i++){
            if(Text.charAt(i)== ' '){
                nrOfWords++;
            }
        }
        return nrOfWords;
    }

    public int GetNrOfLetters()
    {
        GetNrOfVowelsAndConsonas();
        nrOfLetters = nrOfConsonas + nrOfvowels;
        return  nrOfLetters;
    }

    public int GetNrOfVowels()
    {
        GetNrOfVowelsAndConsonas();
        return nrOfvowels;
    }

    public int GetNrOfConsonas()
    {
        GetNrOfVowelsAndConsonas();
        return nrOfConsonas;
    }

    private void GetNrOfVowelsAndConsonas()
    {
        String vowels = "AaEeIiOoUuYy";
        nrOfConsonas = 0;
        nrOfvowels = 0;
        for (int i = 0; i < Text.length(); i++){
            if((Text.charAt(i)>= 'a' && Text.charAt(i) <= 'z') || (Text.charAt(i) >= 'A' && Text.charAt(i) <= 'Z')){
                if(vowels.contains(String.valueOf(Text.charAt(i))))
                    nrOfvowels++;
                else nrOfConsonas++;
            }
        }
    }

    private  Map<String, Integer> sortByValue(Map<String, Integer> unsortMap) {

        // 1. Convert Map to List of Map
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());

        // 2. Sort list with Collections.sort(), provide a custom Comparator
        //    Try switch the o1 o2 position for a different order
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }


        return sortedMap;
    }

}

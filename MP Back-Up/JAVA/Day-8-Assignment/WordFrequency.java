import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args){
        String text="Hello world! This is a sample text with some words. Hello world again:";
        String[] words = text.split("\\s+");
        Map<String, Integer> wordFrequencyMap =new HashMap<>();
        for(String word : words){
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }
        
        for(Map.Entry<String, Integer> entry: wordFrequencyMap.entrySet()){
            System.out.println(entry.getKey()+ " : " + entry.getValue());

        }
            
        }
    
    }
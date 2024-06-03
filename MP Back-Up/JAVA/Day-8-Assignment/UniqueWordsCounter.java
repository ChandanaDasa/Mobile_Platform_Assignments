import java.util.HashSet;
import java.util.Set;

public class UniqueWordsCounter {
    public static void main(String[] args){
        String text = "Hello world! This is a sample text with some words. Hello world again!";
        String[] words = text.split("\\s+");
        Set<String> uniqueWords=new HashSet<>();
        for(String word: words){
            uniqueWords.add(word);
        }
        System.out.println("Number of unique words:"+uniqueWords.size());
        }
    
}

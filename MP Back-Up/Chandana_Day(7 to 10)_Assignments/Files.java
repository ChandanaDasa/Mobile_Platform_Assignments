import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Files {
    public static void main(String args[]){
        String inputFilePath="input.txt";
        String outputFilePath="Output.txt";
        Map<String, Integer> wordFreqMap = new HashMap<>();
        try{
            FileReader fileReader = new FileReader(inputFilePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line=bufferedReader.readLine()) != null){
                String[] words = line.split("\\s+");
                for(String word: words){
                    word=word.replaceAll("[^a-zA-Z]" ,"").toLowerCase();
                    if(!word.isEmpty()){
                        wordFreqMap.put(word, wordFreqMap.getOrDefault(word, 0)+1);
                    }
                } 
            }
            bufferedReader.close();
        FileWriter fileWriter=new FileWriter(outputFilePath);
            for(Map.Entry<String, Integer> entry : wordFreqMap.entrySet())
            {
            fileWriter.write(entry.getKey()+ " : " +entry.getValue()+ "\n");
        }
        fileWriter.close();
        System.out.println("Word frequencies have been written to " + outputFilePath);
    }
    catch(IOException e){
        System.out.println("Error reading or writing file:" + e.getMessage());
        e.printStackTrace();
    }
        }
    }
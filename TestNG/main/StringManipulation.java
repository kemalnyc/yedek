import java.util.Arrays;
import java.util.Locale;

public class StringManipulation {

    public String convertFirstletterToUppercase(String testWords) {
        String[] words = testWords.split(" ");
        String sentence="";
        for(String eachWord:words){
            String firstLetter = eachWord.charAt(0)+"";
            String restletters = eachWord.substring(1);
            sentence += firstLetter.toUpperCase()+restletters + " ";
        }
        return sentence.trim();
    }

    public String abbreviation(String testName){
        String[] name = testName.split(" ");
        String abb="";

        for(String eachName:name){
            String letter1= eachName.charAt(0)+"";
            abb+=letter1;
        }
        return abb.trim();
    }
}


package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interview {
    public static void main(String [] args){
        String munt = "Muntaha";
        String rev= "";
        List<String> list = new ArrayList<>();
        list.add("q");
        list.remove("q");
        System.out.println(list.toString());

        for (int i= munt.length()-1; i>=0; i--){
            rev+= munt.charAt(i);
        }

        System.out.println(rev);
    }



}

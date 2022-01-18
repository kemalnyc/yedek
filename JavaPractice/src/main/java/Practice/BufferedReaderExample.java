package Practice;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderExample {
    public static void main(String[]args) throws Exception{

        FileReader fr = new FileReader("C:\\Users\\AB Proje\\Desktop\\kem.txt");
        BufferedReader br = new BufferedReader(fr);

int i;
while((i=br.read())!=-1){
    System.out.print((char)i);
}
    }
}

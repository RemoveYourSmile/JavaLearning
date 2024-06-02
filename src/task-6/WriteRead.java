import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//Task-6_2

public class WriteRead {

    public static void main(String[] args) throws IOException {
        WriteRead a = new WriteRead();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String line = in.nextLine();
        a.writeFile(line);
        a.readFile();
    }


    public void writeFile(String line) throws IOException{
        FileOutputStream out = new FileOutputStream("tms.txt");
        out.write(line.getBytes());
        out.close();
    }


    public void readFile() throws IOException{
        FileInputStream inp = new FileInputStream("tms.txt");
        int i;
        while ((i=inp.read()) != -1){
            if (i == 32) i = 95;
            System.out.print((char) i);
        }
        inp.close();
    }
}

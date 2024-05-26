import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку 1:");
        String str1 = in.nextLine();
        System.out.println("Введите строку 2:");
        String str2 = in.nextLine();
        System.out.println("Введите строку 3:");
        String str3 = in.nextLine();
        String[] arr = {str1, str2, str3};
        Main test = new Main();
        test.linesShortLong(arr);
        test.lessAverageLength(arr);
        test.noDuplicate(arr);
        System.out.println("Введите строку: ");
        String str4 = in.nextLine();
        test.newLine(str4);
    }


    //Task 3_1
    public void linesShortLong(String[] arr){
        int min = arr[0].length(), max = arr[0].length();
        String strMin = arr[0], strMax = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (min > arr[i].length()){
                min = arr[i].length();
                strMin = arr[i];
            }
            if (max < arr[i].length()){
                max = arr[i].length();
                strMax = arr[i];
            }
        }
        System.out.println("Min: " + strMin + ", length: " + min
        + "\n" + "Max: " + strMax + ", length: " + max);
    }


    //Task 3_2
    public void lessAverageLength(String[] arr){
        double avg = (double) (arr[0].length() + arr[1].length() + arr[2].length()) / 3;
        System.out.println("Average length: " + avg);
        if (avg == arr[0].length()){
            System.out.println("Words not found");
        } else {
            for (String i : arr){
                if (i.length() < avg){
                    System.out.println("Line less than average: " + i + ", length: " + i.length());
                }
            }
        }
    }


    //Task 3_3
    public void noDuplicate(String[] arr){
        Set<Character> ch = new HashSet<>();
        int lengthWord, flag = 0;
        for (String i : arr){
            String[] words = i.split(" ");
            for (String j : words){
                if (flag == 1) break;
                lengthWord = j.length();
                for (int k = 0; k < lengthWord; k++){
                    ch.add(j.charAt(k));
                }
                if (ch.size() == lengthWord){
                    System.out.println("Word: " + j);
                    flag = 1;
                    break;
                } else ch.clear();
            }
        }
    }


    //Task 3_4
    public void newLine(String str){
        StringBuilder newStr = new StringBuilder();
        char[] arr = str.toCharArray();
        for (char i : arr){
            if (i == ' '){
                newStr.append(i);
            } else {
                newStr.append(i);
                newStr.append(i);
            }
        }
        System.out.println(newStr);
    }
}
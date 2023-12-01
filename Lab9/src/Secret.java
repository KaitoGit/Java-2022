import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Secret {

    public static void main(String[] args) throws FileNotFoundException {
        int count = 0;
        int first =0;
        StringBuilder builder = new StringBuilder();
        File file = new File("secret.txt");
        Scanner scanner = new Scanner(file);
        String text = scanner.nextLine();
        scanner.close();
        String[] tokens = text.split(" ");

        for (String s : tokens) {
            if (count  == 0) {
                builder.append(s.toUpperCase().charAt(0));
                count++;
            }
            else if (count  != 0 && count % 5 ==0 ) {
                builder.append(s.toLowerCase().charAt(0));
                count++;
            }
            else {
                count++;
            }



        }
        System.out.println(builder.toString());
    }

}
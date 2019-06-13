import java.util.Scanner;
import java.io.*;

public class markingTest {

    public static void main (String args []) {
        File f = new File ("quiz responses.csv");

        try {
            Scanner input = new Scanner (f);
            String scrape = input.nextLine();
            //answer key array fixed:
            String [] ans = input.nextLine().split(",");
            int score = 0;
            while (input.hasNext ()) {
                score = 0;
                String str = input.nextLine ();
                String [] current = str.split (",");
                for (int i = 1; i < ans.length; i++) {
                    if (current [i].equals (ans [i])) score ++; 
                }
                System.out.print (current [0] + ": ");
                System.out.println (score + "/8");
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace ();
        }
    }

}
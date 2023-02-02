import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    int n=s.length();
    String ap=s.substring(n-2);
    if(ap.equals("AM")){
        int h=Integer.parseInt(s.substring(0,2));
        if(h<12){
            return s.substring(0,n-2);
        }
        else{
            h=h-12;
            String h1=Integer.toString(h);
            if(h<10){
                h1+="0";
            }
            return h1+s.substring(2,n-2);
        }
        
    }
    else{
         int h=Integer.parseInt(s.substring(0,2));
        if(h>=12){
            return s.substring(0,n-2);
        }
        else{
            h=h+12;
            String h1=Integer.toString(h);
           
            return h1+s.substring(2,n-2);
        }
    }
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

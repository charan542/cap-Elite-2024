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
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    // Write your code here
    int[] a=new int[26];
    s=s.toLowerCase();
    for(int i=0;i<26;i++){
        a[i]=0;
    }
    for(int i=0;i<s.length();i++){
        int k=(int)s.charAt(i)-97;
       
        if(k>=0&&k<=25){
          a[k]++;  
        }
        
    }
    for(int i=0;i<26;i++){
        if(a[i]==0){
            System.out.println(a[i]+"  "+i);
            return "not pangram";
        }
    }
    return "pangram";

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

//PARTIALLY SOLVED
//http://www.usaco.org/index.php?page=viewproblem2&cpid=526
//CENSORING

import java.io.*;

public class USACO1502P1 {
    static BufferedReader br;
    public static void main(String []args) throws IOException{
        //br = new BufferedReader(new InputStreamReader(System.in));
        br = new BufferedReader(new FileReader("censor.in"));
        PrintWriter pw = new PrintWriter("censor.out");

        String word = br.readLine();
        String rem = br.readLine();
        String emp = new String();

        while(word.contains(rem)){
            word = word.replace(rem, emp);
        }

        System.out.println(word);
        pw.println(word);

        pw.close();
    }
}

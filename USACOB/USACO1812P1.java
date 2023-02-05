//SOLVED
//http://www.usaco.org/index.php?page=viewproblem2&cpid=855
//MIXING MILK

import java.io.*;
import java.util.StringTokenizer;

public class USACO1812P1{
    static StringTokenizer st;
    static BufferedReader br;


    public static void main(String[]args)throws IOException{
        // br = new BufferedReader(new InputStreamReader(System.in));
        br = new BufferedReader(new FileReader("mixmilk.in"));
        PrintWriter pw = new PrintWriter("mixmilk.out");

        int [] c = new int[3];
        int [] amt = new int[3];

        for(int i = 0; i < 3; i++){
            c[i] = readInt();
            amt[i] = readInt();
        }

        for(int i = 0; i < 100; i++){
            int b1 = i%3;
            int b2 = (i%3 == 2)? 0 : (i%3)+1;

            if((c[b2] - amt[b2]) > amt[b1]){
                amt[b2] += amt[b1];
                amt[b1] = 0;
            }else{
                int diff = c[b2] - amt[b2];
                amt[b2] += diff;
                amt[b1] -= diff;
            }
            
        }

        pw.println(amt[0]);
        pw.println(amt[1]);
        pw.println(amt[2]);
        pw.close();
    }

    static String next() throws IOException{
        while(st == null || !st.hasMoreTokens()){
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static int readInt() throws IOException{
        return Integer.parseInt(next());
    }
}
//SOLVED
//http://www.usaco.org/index.php?page=viewproblem2&cpid=567
//FENCE PAINTING

import java.io.*;
import java.util.StringTokenizer;

public class USACO1512P1 {
    static StringTokenizer st;
    static BufferedReader br;
    public static void main(String[]args) throws IOException{
        br = new BufferedReader(new FileReader("paint.in"));
        PrintWriter pw = new PrintWriter("paint.out");
        int a = readInt();
        int b = readInt();
        int c = readInt();
        int d = readInt();

        int total = (b-a) + (d-c);

        int right = Math.min(b, d);
        int left = Math.max(a, c);

        total -= (right-left > 0) ? (right-left) : 0;

        pw.print(total);

        pw.close();
    }

    static String next() throws IOException{
        while(st == null || !st.hasMoreTokens()){
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static int readInt() throws IOException{return Integer.parseInt(next());}

}

//SOLVED
//http://www.usaco.org/index.php?page=viewproblem2&cpid=735
//THE LOST COW

import java.util.StringTokenizer;
import java.io.*;

public class USACO17OCP1 {
    static StringTokenizer st;
    static BufferedReader br;
    public static void main(String[]args) throws IOException{
        //br = new BufferedReader(new InputStreamReader(System.in));
        br = new BufferedReader(new FileReader("lostcow.in"));
        PrintWriter pw = new PrintWriter("lostcow.out");
        int x = readInt();
        int y = readInt();
        int moves = 0;

        for(int i = 0; i < 1000; i++){
            int diff = (int) Math.pow(2, i);
            moves += diff;

            if(i % 2 == 1)
                diff *= -1;

            // System.out.println("D: " + diff);
            // System.out.println("x: " + x);
            // System.out.println("y: " + y);
            // System.out.println("M: " + moves);

            if(x < y && (x+diff) >= y){
                moves -= (x+diff)-y;
                break;
            }
            if(x > y && (x+diff) <= y){
                moves += (x+diff)-y;
                break;
            }

            moves += Math.abs(diff);
        }

        //System.out.println(moves);
        pw.println(moves);
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

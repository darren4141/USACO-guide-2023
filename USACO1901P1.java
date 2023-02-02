//SOLVED

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class USACO1901P1 {
    static StringTokenizer st;
    static BufferedReader br;
    
    public static void main(String[]args)throws IOException{
        //br = new BufferedReader(new InputStreamReader(System.in));
        br = new BufferedReader(new FileReader("shell.in"));
        PrintWriter pw = new PrintWriter("shell.out");
        HashMap<Integer, Integer> cups = new HashMap<Integer, Integer>();

        int [] c = new int[3];
        cups.put(1, 1);
        cups.put(2, 2);
        cups.put(3, 3);


        int n = readInt();

        for(int i = 0; i < n; i++){
            int a = readInt();
            int b = readInt();
            int g = readInt();

            int temp = cups.get(a);
            cups.put(a, cups.get(b));
            cups.put(b, temp);

            // System.out.println(cups.get(1));
            // System.out.println(cups.get(2));
            // System.out.println(cups.get(3));
            // System.out.println(cups.get(g));

            c[cups.get(g)-1]++;
        }

        // System.out.println(c1);
        // System.out.println(c2);
        // System.out.println(c3);

        pw.println(Math.max(c[0], Math.max(c[1], c[2])));

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

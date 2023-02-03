//SOLVED
//http://www.usaco.org/index.php?page=viewproblem2&cpid=568
//SPEEDING TICKET

import java.io.*;
import java.util.StringTokenizer;

public class USACO1512P2 {
    static StringTokenizer st;
    static BufferedReader br;
    public static void main(String[]args) throws IOException{
        //br = new BufferedReader(new InputStreamReader(System.in));
        br = new BufferedReader(new FileReader("speeding.in"));
        PrintWriter pw = new PrintWriter("speeding.out");
        int n = readInt();
        int m = readInt();
        int [] dist = new int[n];
        int [] lim = new int[n];
        int [] drive = new int[m];
        int [] speed = new int[m];

        for(int i = 0; i < n; i++){
            dist[i] = readInt();
            lim[i] = readInt();
        }

        for(int i = 0; i < m; i++){
            drive[i] = readInt();
            speed[i] = readInt();
        }

        int o = 0;
        int s1 = 0;
        int s2 = 0;

        for(int i = 0; i < 100; i++){
            // System.out.println("MILES: " + i);
            // System.out.println(s1);
            // System.out.println(s2);
            dist[s1]--;
            drive[s2]--;


            int over = speed[s2]-lim[s1];
            o = Math.max(over, o);

            if(dist[s1] == 0){
                s1++;
            }
            if(drive[s2] == 0){
                s2++;
            }
        }
        // System.out.println(o);
        pw.println(o);
        pw.close();
    }

    static String next() throws IOException{
        while(st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static int readInt() throws IOException{
        return Integer.parseInt(next());
    }

}

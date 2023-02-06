//SOLVED
//https://codeforces.com/gym/102951/problem/A
//A. MAXIMUM DISTANCE

import java.io.*;
import java.util.StringTokenizer;

class CF102951A{
    static StringTokenizer st;
    static BufferedReader br;
    public static void main(String[]args)throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        int n = readInt();

        int[]x = new int [n];
        int[]y = new int [n];

        for(int i = 0; i < n; i++)
            x[i] = readInt();

        for(int i = 0; i < n; i++)
            y[i] = readInt();

        int dist = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int distance = (int)Math.pow(x[j] - x[i], 2) + (int)Math.pow(y[j] - y[i], 2);

                dist = Math.max(dist, distance);
            }
        }

        System.out.println(dist);
    }

    static String next() throws IOException{
        while(st == null || !st.hasMoreTokens()){
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }
    
    static int readInt() throws IOException{return Integer.parseInt(next());}

}
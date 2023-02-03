//SOLVED
//http://www.usaco.org/index.php?page=viewproblem2&cpid=665
//THE COW SIGNAL

import java.io.*;
import java.util.StringTokenizer;

public class USACO1612P3 {
    static StringTokenizer st;
    static BufferedReader br;
    public static void main(String[]args) throws IOException{
        //br = new BufferedReader(new InputStreamReader(System.in));
        br = new BufferedReader(new FileReader("cowsignal.in"));        
        PrintWriter pw = new PrintWriter("cowsignal.out");

        int m = readInt();
        int n = readInt();
        int k = readInt();

        char [][] ch = new char[m][n];
        for(int i = 0; i < m; i++){
            String temp = br.readLine();
            for(int j = 0; j < n; j++){
                ch[i][j] = temp.charAt(j);
            }
        }

        for(int a = 0; a < m; a++){
            for(int b = 0; b < k; b++){
                for(int c = 0; c < n; c++){
                    for(int d = 0; d < k; d++){
                        pw.print(ch[a][c]);
                    }
                }
                pw.println();
            }
        }

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

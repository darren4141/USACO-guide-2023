//SOLVED
//http://www.usaco.org/index.php?page=viewproblem2&cpid=664
//BLOCK GAME

import java.io.*;
import java.util.StringTokenizer;

public class USACO1612P2 {
    static StringTokenizer st;
    static BufferedReader br;
    public static void main(String[]args) throws IOException{
        //br = new BufferedReader(new InputStreamReader(System.in));
        br = new BufferedReader(new FileReader("blocks.in"));
        PrintWriter pw = new PrintWriter("blocks.out");
        int n = readInt();
        int [] letter = new int[26];


        for(int i = 0; i < n; i++){
            String a = next();
            String b = next();
            int [] lettera = new int[26];
            int [] letterb = new int[26];

            for(int j = 0; j < a.length(); j++){
                lettera[(int)a.charAt(j)-97]++;
            }
            for(int j = 0; j < b.length(); j++){
                letterb[(int)b.charAt(j)-97]++;
            }

            for(int j = 0; j < letter.length; j++){
                letter[j] += Math.max(lettera[j], letterb[j]);
            }
        }

        for(int i : letter){
            pw.println(i);
        }

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

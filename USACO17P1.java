import java.util.StringTokenizer;
import java.io.*;

public class USACO17P1 {
    static StringTokenizer st;
    static BufferedReader br;
    public static void main(String[]args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter pw = new PrintWriter("lostcow.out");
        int x = readInt();
        int y = readInt();
        int moves = 0;
        int i = 0;

        while(true){
            
        }
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

import java.util.HashMap;
import java.util.StringTokenizer;
import java.io.*;

public class USACO1912P1 {
    static StringTokenizer st;
    static BufferedReader br;
    public static void main (String[]args) throws IOException{
        br = new BufferedReader(new FileReader("gymnastics.in"));
        PrintWriter pw = new PrintWriter("gymnastics.out");

        int k = readInt();
        int n = readInt();

        int [][]cows = new int[k][n];
        HashMap<Integer, Integer> order = new HashMap<Integer, Integer>();

        for(int j = 0; j < n; j++){
            cows[0][j] = readInt();
            order.put(cows[0][j], j);
        }

        for(int i = 1; i < k; i++){
            for(int j = 0; j < n; j++){
                cows[i][j] = readInt();
            }
        }

        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                boolean consistent = true;
                for(int r = 1; r < k; r++){
                    if(order.get(cows[r][i]) >= order.get(cows[r][j])){
                        consistent = false;
                    }
                }

                if(consistent){
                    count++;
                    //System.out.println(cows[0][i] + " " + cows[0][j]);
                }
            }
        }

        pw.println(count);
        pw.close();
        
    }

    static String next() throws IOException{
        while(st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static int readInt() throws IOException{return Integer.parseInt(next());}
}

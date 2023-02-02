import java.io.*;
import java.util.StringTokenizer;

public class USACO2001P1{
    static StringTokenizer st;
    static BufferedReader br;
    public static void main(String[]args) throws IOException{
        br = new BufferedReader(new FileReader("word.in"));
        PrintWriter pw = new PrintWriter("word.out");
        
        int num = readInt();
        int max = readInt();

        String sentence = br.readLine();
        String [] words = new String[num];
        words = sentence.split(" ");

        int lim = 0;
        boolean newline = true;
        for(int i = 0; i < words.length; i++){
            lim+= words[i].length();

            if(lim <= max){
                if(!newline){
                    pw.print(" ");
                }
                pw.print(words[i]);

                newline = false;

            }else if(lim > max){

                pw.print("\n"+words[i]);
                lim = words[i].length();
                newline = false;

            }
        }

        pw.close();
        br.close();
    }

    static String next() throws IOException{
        while (st == null || !st.hasMoreTokens()){
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static int readInt() throws IOException{
        return Integer.parseInt(next());
    }
}
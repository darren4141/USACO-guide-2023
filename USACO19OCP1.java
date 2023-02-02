//SOLVED
import java.util.StringTokenizer;
import java.io.*;

public class USACO19OCP1 {
    static StringTokenizer st;
    static BufferedReader br;
//B (2,3) L (5, 8)
    public static void main(String[]args) throws IOException{
        br = new BufferedReader(new FileReader("buckets.in"));
        PrintWriter pw = new PrintWriter("buckets.out");

        int bX=0, bY=0, lX=0, lY=0, rX = 0, rY = 0;

        for(int i = 0; i < 10; i++){
            String line = br.readLine();
            for(int j = 0; j < 10; j++){
                char a = line.charAt(j);
                if(a == 'B'){
                    bX = j;
                    bY = i;
                }
                if(a == 'L'){
                    lX = j;
                    lY = i;
                }
                if(a == 'R'){
                    rX = j;
                    rY = i;
                }
            }
        }

        int dist = (Math.abs(lY-bY)-1) + (Math.abs(lX-bX)-1);
        dist++;

        if(bX == lX && bX == rX){
            if(bY < rY && rY < lY){
                dist+=2;
            }else if(bY > rY && rY  > lY){
                dist+=2;
            }
        }else if(bY == lY && bY == rY){
            if(bX < rX && rX < lX){
                dist+=2;
            }else if(bX > rX && rX  > lX){
                dist+=2;
            }
        }
        pw.println(dist);

        pw.close();
        br.close();
    }

    // static String next() throws IOException{
    //     while(st == null || !st.hasMoreTokens()){
    //         st = new StringTokenizer(br.readLine().trim());
    //     }

    //     return st.nextToken();
    // }

}

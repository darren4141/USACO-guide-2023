//SOLVED
//http://www.usaco.org/index.php?page=viewproblem2&cpid=807
//TELEPORTATION

import java.io.*;
import java.util.StringTokenizer;

public class USACO1802P1{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter pw = new PrintWriter("teleport.out");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int dist = Math.abs(b-a);

        if(Math.abs(a-x) + Math.abs(b-y) < dist){
            dist = Math.abs(a-x) + Math.abs(b-y);
        }

        if(Math.abs(a-y) + Math.abs(b-x) < dist){
            dist = Math.abs(a-y) + Math.abs(b-x);
        }

        System.out.println(dist);
        // pw.println(dist);
        // pw.close();
        // br.close();
    }

}
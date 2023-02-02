import java.io.*;
import java.util.StringTokenizer;

public class USACO18P1{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("teleport.in"));
        PrintWriter pw = new PrintWriter("teleport.out");
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

        pw.println(dist);
        pw.close();
        br.close();
    }

}
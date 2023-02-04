//SOLVED
//http://www.usaco.org/index.php?page=viewproblem2&cpid=759
//BLOCKED BILLBOARD

import java.io.*;
import java.util.StringTokenizer;

public class USACO1712P1 {
    static StringTokenizer st;
    static BufferedReader br;
    public static void main(String[]args) throws IOException{
        br = new BufferedReader(new FileReader("billboard.in"));
        PrintWriter pw = new PrintWriter("billboard.out");

        int[]b1 = new int[4];
        int[]b2 = new int[4];
        int[]t = new int [4];


        for(int i = 0; i < 4; i++){
            b1[i] = readInt() + 1000;
        }

        for(int i = 0; i < 4; i++){
            b2[i] = readInt() + 1000;
        }

        for(int i = 0; i < 4; i++){
            t[i] = readInt() + 1000;
        }

        int highestX = Math.max(b1[2], Math.max(b2[2], t[2]));
        int highestY = Math.max(b1[3], Math.max(b2[3], t[3]));

        boolean[][]grid = new boolean[highestX+1][highestY+1];

        for(int x = b1[0]; x < b1[2]; x++){
            for(int y = b1[1]; y < b1[3]; y++){
                grid[x][y] = true;
            }
        }

        for(int x = b2[0]; x < b2[2]; x++){
            for(int y = b2[1]; y < b2[3]; y++){
                grid[x][y] = true;
            }
        }

        // int count = 0;
        // for(int x = 0; x < highestX; x++){
        //     for(int y = 0; y < highestY; y++){
        //         count += grid[x][y] ? 1 : 0;
        //     }
        // }  

        // pw.println(count);

        for(int x = t[0]; x < t[2]; x++){
            for(int y = t[1]; y < t[3]; y++){
                grid[x][y] = false;
            }
        }

        int count = 0;
        for(int x = 0; x < highestX; x++){
            for(int y = 0; y < highestY; y++){
                count += grid[x][y] ? 1 : 0;
            }
        }

        pw.println(count);
        pw.close();
    }

    static String next() throws IOException{
        while(st == null || !st.hasMoreTokens()){
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static int readInt() throws IOException{return Integer.parseInt(next());}
}

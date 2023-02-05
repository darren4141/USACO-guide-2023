//PARTIALLY SOLVED
//https://codeforces.com/contest/1216/problem/C
//WHITE SHEET

import java.io.*;
import java.util.StringTokenizer;

public class CF1216C{
    static StringTokenizer st;
    static BufferedReader br;

    public static void main(String[]args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        int x1, y1, x2, y2;

        Rect see = new Rect();
        Rect cover1 = new Rect();
        Rect cover2 = new Rect();

        x1 = readInt();
        y1 = readInt();
        x2 = readInt();
        y2 = readInt();

        see.x1 = x1;
        see.y1 = y1;
        see.x2 = x2;
        see.y2 = y2;

        x1 = readInt();
        y1 = readInt();
        x2 = readInt();
        y2 = readInt();

        cover1.x1 = x1;
        cover1.y1 = y1;
        cover1.x2 = x2;
        cover1.y2 = y2;

        x1 = readInt();
        y1 = readInt();
        x2 = readInt();
        y2 = readInt();

        cover2.x1 = x1;
        cover2.y1 = y1;
        cover2.x2 = x2;
        cover2.y2 = y2;

        int area = see.area();

        int coverSize1 = cover(cover1.x1, cover1.y1, cover1.x2, cover1.y2, see.x1, see.y1, see.x2, see.y2);
        int coverSize2 = cover(cover2.x1, cover2.y1, cover2.x2, cover2.y2, see.x1, see.y1, see.x2, see.y2);

        boolean covered = false;

        if(coverSize1 == area)
            covered = true;
        else if(coverSize2 == area)
            covered = true;
        else if(coverSize1 + coverSize2 == area && areFlush(cover1.x1, cover1.y1, cover1.x2, cover1.y2, cover2.x1, cover2.y1, cover2.x2, cover2.y2)){
            covered = true;
        }

        System.out.println((covered) ? "NO" : "YES");

    }

    static boolean areFlush(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2){
        if(ax1 == bx2 || bx1 == ax2 || ay1 == by2 || by1 == ay2){
            return true;
        }else{
            return false;
        }
    }

    static int cover(int cx1, int cy1, int cx2, int cy2, int sx1, int sy1, int sx2, int sy2){
        return (Math.min(cx2, sx2) - Math.max(cx1, sx1))*(Math.min(cy2, sy2) - Math.max(cy1, sy1));
    }

    static String next() throws IOException{
        while(st == null || !st.hasMoreTokens()){
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static int readInt() throws IOException{return Integer.parseInt(next());}


    
}

class Rect{
    int x1, y1, x2, y2;

    int length(){
        return (x2-x1);
    }

    int width(){
        return (y2-y1);
    }

    int area(){
        return (y2-y1) * (x2-x1);
    }
}
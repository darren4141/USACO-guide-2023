import java.io.*;
import java.util.StringTokenizer;

public class USACO1801P1{
    static StringTokenizer st;
    static BufferedReader br;

    public static void main(String[]args) throws IOException{
        br = new BufferedReader(new FileReader("billboard.in"));
        PrintWriter pw = new PrintWriter("billboard.out");
        int x1, y1, x2, y2;

        Rect see = new Rect();
        Rect cover = new Rect();

        x1 = readInt() + 1000;
        y1 = readInt() + 1000;
        x2 = readInt() + 1000;
        y2 = readInt() + 1000;

        see.x1 = x1;
        see.y1 = y1;
        see.x2 = x2;
        see.y2 = y2;

        x1 = readInt() + 1000;
        y1 = readInt() + 1000;
        x2 = readInt() + 1000;
        y2 = readInt() + 1000;

        cover.x1 = x1;
        cover.y1 = y1;
        cover.x2 = x2;
        cover.y2 = y2;

        int area = see.area();

        int coverSize = cover(cover.x1, cover.y1, cover.x2, cover.y2, see.x1, see.y1, see.x2, see.y2, area);

        pw.println(area - coverSize);
        pw.close();

    }

    static int cover(int cx1, int cy1, int cx2, int cy2, int sx1, int sy1, int sx2, int sy2, int area){
        boolean horicover = cx1 < sx1 && sx2 < cx2;
        boolean verticover = cy1 < sy1 && sy2 < cy2;

        if(horicover && verticover){
            return area;
        }else if(horicover){
            return (sx2-sx1)*(Math.min(cy2, sy2) - Math.max(cy1, sy1));
        }else if(verticover){
            return (sy2-sy1)*(Math.min(cx2, sx2) - Math.max(cx1, sx1));
        }else{
            return 0;
        }

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
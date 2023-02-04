//UNSOLVED
//http://www.usaco.org/index.php?page=viewproblem2&cpid=1061
//STUCK IN A RUT

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class USACO2012P3{
    static StringTokenizer st;
    static BufferedReader br;
    public static void main(String[]args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        int n = readInt();

        ArrayList<Integer> north[] = new ArrayList[2];
        ArrayList<Integer> east[] = new ArrayList[2];
        north[0] = new ArrayList<>();
        north[1] = new ArrayList<>();
        east[0] = new ArrayList<>();
        east[1] = new ArrayList<>();

        boolean [] order = new boolean[n];// false --> north, true --> east
        String [] out = new String[n];// false --> north, true --> east

        for(int i = 0; i < n; i++){
            String dir = next();

            if(dir.equals("N")){
                order[i] = false;
                north[0].add(readInt());
                north[1].add(readInt());
            }
            
            if(dir.equals("E")){
                order[i] = true;
                east[0].add(readInt());
                east[1].add(readInt());
            }

        }

        //for(int i = 0; i < )

        //CHECK EACH EAST COW
        //NOTE DOWN ALL 
        // NORTH COWS THAT ARE BELOW IT
        // EAST COWS ADJECENT TO IT

        for(int i = 0; i < east[0].size(); i++){
            //distance
            // north x - east x
            // east2 x - east x
            
            int closest = 99999;

            System.out.println("EAST " + i);
            System.out.println("X: " + east[0].get(i));
            System.out.println("Y: " + east[1].get(i));

            for(int j = 0; j < north[0].size(); j++){
                System.out.println("NORTH " + j);
                System.out.println("X: " + north[0].get(j));
                System.out.println("Y: " + north[1].get(j));
                int dY = (north[1].get(j) - east[1].get(i));
                int dX = (north[0].get(j) - east[0].get(i));

                if(dY > 0 && dX > 0){//if north Y < east Y && east X > east X
                    //if ey-ny > nx-ex
                    System.out.println("dY: " + dY);
                    System.out.println("dX: " + dX);
                    if(dY < dX){
                        System.out.println("AAA");
                        if (closest > dX){
                            closest = dX;
                            System.out.println("BBB" + dX);
                        }
                    }
                }
            }

            int it = i;
            while(!order[it]){
                it++;
            }
            if(closest == 99999){
                out[it] = "Infinity";
            }else{
                out[it] = Integer.toString(closest);
            }

        }

        for(String s : out){
            System.out.println(s);
        }

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
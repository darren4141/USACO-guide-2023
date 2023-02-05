//SOLVED
//http://www.usaco.org/index.php?page=viewproblem2&cpid=761
//MILK MEASUREMENT

import java.io.*;
import java.util.StringTokenizer;
public class USACO1712P3 {
    static StringTokenizer st;
    static BufferedReader br;

    public static void main(String[]args) throws IOException{
        //br = new BufferedReader(new InputStreamReader(System.in));
        br = new BufferedReader(new FileReader("measurement.in"));
        PrintWriter pw = new PrintWriter("measurement.out");
        int [] milk = {7, 7, 7};

        int n = readInt();
        int [] days = new int[n];
        int [] cow = new int[n];
        int [] diff = new int[n];

        for(int i = 0; i < n; i++){
            days[i] = readInt();
            String tempcow = next();
            if(tempcow.charAt(0) == 'B'){
                cow[i] = 0;
            }else if(tempcow.charAt(0) == 'E'){
                cow[i] = 1;
            }else if(tempcow.charAt(0) == 'M'){
                cow[i] = 2;
            }
            diff[i] = readInt();
        }

        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i = 0; i < days.length-1; i++){
                if(days[i+1] < days[i]){
                    int temp = days[i+1];
                    days[i+1] = days[i];
                    days[i] = temp;
    
                    temp = cow[i+1];
                    cow[i+1] = cow[i];
                    cow[i] = temp;
    
                    temp = diff[i+1];
                    diff[i+1] = diff[i];
                    diff[i] = temp;
                    sorted = false;
                }
            }

        }

        // for(int i = 0; i < n; i++){
        //     System.out.println(days[i] + " " + cow[i] + " " + diff[i]);
        // }

        int highest;
        int count = 0;

        for(int i = 0; i < n; i++){
            highest = Math.max(milk[0], Math.max(milk[1], milk[2]));

            boolean [] on = new boolean[3];
            boolean [] nw = new boolean[3];
            for(int j = 0; j < 3; j++){
                if(milk[j] == highest)
                    on[j] = true;
                else
                    on[j] = false;
            }

            // System.out.println("iteration " + i);
            // System.out.println("highest: " + highest);
            // System.out.println("B: " + milk[0]);
            // System.out.println("E: " + milk[1]);
            // System.out.println("M: " + milk[2]);
            // System.out.println("B before " + on[0]);
            // System.out.println("E before " + on[1]);
            // System.out.println("M before " + on[2]);

            milk[cow[i]]+=diff[i];

            int newHighest = Math.max(milk[0], Math.max(milk[1], milk[2]));

            for(int j = 0; j < 3; j++){
                if(milk[j] == newHighest)
                    nw[j] = true;
                else
                    nw[j] = false;
            }

            if(on[0] != nw[0] || on[1] != nw[1] || on[2] != nw[2]){
                count++;
                System.out.println("INCREMENT");
            }

            // System.out.println("new highest: " + newHighest);
            // System.out.println("B: " + milk[0]);
            // System.out.println("E: " + milk[1]);
            // System.out.println("M: " + milk[2]);
            // System.out.println("B after " + nw[0]);
            // System.out.println("E after " + nw[1]);
            // System.out.println("M after " + nw[2]);

        }

        // System.out.println(count);
        pw.println(count);
        pw.close();

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

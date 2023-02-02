//SOLVED
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

import java.io.*;


public class USACO2012P1 {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[]args) throws IOException{
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for(int i = 0; i < 7; i++){
            nums.add(readInt());
        }

        Collections.sort(nums);

        int third = nums.get(6) - nums.get(0) - nums.get(1);

        System.out.println(nums.get(0) + " " + nums.get(1) + " " + third);

    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }
}

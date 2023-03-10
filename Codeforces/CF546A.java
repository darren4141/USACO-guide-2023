//SOLVED
//https://codeforces.com/problemset/problem/546/A
//A. SOLDIER AND BANANAS

import java.util.Scanner;

public class CF546A {
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);

        int k = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        
        int t = 0;

        for(int i = 1; i <= w; i++){
            t += k*i;
        }

        System.out.println(((t-n) < 0)? 0 : t-n);
        sc.close();
    }
}

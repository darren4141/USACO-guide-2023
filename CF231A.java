//SOLVED
import java.util.Scanner;

public class CF231A {
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        int total = 0;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < 3; j++){
                int a = Integer.parseInt(sc.next());
                if(a == 1){
                    count++;
                }
            }
            if(count > 1){
                total++;
            } 
        }

        System.out.println(total);
        sc.close();
    }
}

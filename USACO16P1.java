import java.io.*;

public class USACO16P1{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("promote.in"));
        PrintWriter pw = new PrintWriter("promote.out");

        int[] nums = new int[8];
        for(int i = 0; i < 8; i++){
            nums[i] = br.read();
        }

        int bs = 0;
        int sg = 0;
        int gp = 0;

        while(nums[7] > nums[6]){
            nums[7]--;
            nums[5]++;
            gp++;
        }

        while(nums[5] > nums[4]){
            nums[5]--;
            nums[3]++;
            sg++;
        }

        while(nums[3] > nums[2]){
            nums[3]--;
            nums[1]++;
            bs++;
        }

        pw.println(bs);
        pw.println(sg);
        pw.println(gp);

        pw.close();
        br.close();
    }

}
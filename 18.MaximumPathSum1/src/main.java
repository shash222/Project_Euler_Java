import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
public class main{
    public static void main(String[] args){
        File filepath=new File("../numbers.txt");
        int num1=0;
        int num2=0;
        int row=0;
        int col=0;
        int[][] nums=new int[15][15];
        try{
            Scanner in=new Scanner(filepath);
            while(in.hasNextLine()){
                while(in.hasNextInt()){
                    while(col<=row){
                        nums[row][col]=in.nextInt();
                        col++;
                    }
                    row++;
                    col=0;
                }
            }
        }
        catch(Exception e){
            
        }
        for (row=14;row>0;row--){
            for (col=0;col<14;col++){
                num1=(nums[row][col]+nums[row-1][col]);
                num2=(nums[row][col+1]+nums[row-1][col]);
                if (num1>num2){
                    nums[row-1][col]=num1;
                }
                else{
                    nums[row-1][col]=num2;
                }
            }
        }
        System.out.println(nums[0][0]);
    }
}
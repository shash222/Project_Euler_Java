import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
public class main{
    public static void main(String[] args){
        File filepath=new File("../numbers.txt");
        int total=0;
        int num1;//first number
        int num2;//second number
        int sum1;//sum of first two numbers
        int sum2;//sum of second two numbers
        int lines=0;//number of lines counter
        int x;
        int arrRow=0;
        ArrayList<ArrayList<Integer>> num=new ArrayList<ArrayList<Integer>>();
        try{
            Scanner in=new Scanner(filepath);
            while (in.hasNextLine()){
                while (in.hasNextInt()){
                    num.add(arrRow,in.nextInt());
                }
                num.add(new ArrayList<Integer>());
                arrRow++;
            }
        }
        catch(Exception e){
            
        }
        System.out.println(num);
    }
}
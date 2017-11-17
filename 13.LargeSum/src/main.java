import java.math.BigInteger;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class main{
    public static void main(String[] args){
        File filepath=new File("../numbers.txt");
        ArrayList<BigInteger> strsum=new ArrayList<BigInteger>();//stores all lines in file so that they can be easily accessed and added later
        BigInteger sum;//sum of 100 numbers
        String num;//sum of 100 numbers as string
        int value;//value of digit (dynamic)
        int i;//for loop counter
        int count=0;//number of inputs in ArrayList counter
        int digit;//digit counter of total
        try{
            Scanner in=new Scanner(filepath);
            while (in.hasNextLine()){
                strsum.add(in.nextBigInteger());
                count++;
            }
            in.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Error");
        }
        sum=strsum.get(0);
        for (i=1;i<count;i++){
            sum=sum.add(strsum.get(i));
        }
        num=sum.toString();
        for (digit=0;digit<10;digit++){
            value=Character.getNumericValue(num.charAt(digit));
            System.out.print(value);
        }
        System.out.println();
    }
}
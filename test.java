import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
public class test{   
    public static String primeNumbersString="";

    public static boolean prime(int number){
        int x;
        for (x=2;x<number;x++){
            if (number%x==0){
                return false;
            }
        }
        return true;
    }
    
    public static String answer(int n) {
        String chosenNumberString=Integer.toString(n);
        int chosenLength=chosenNumberString.length();
        int idStart=primeNumbersString.indexOf(chosenNumberString)+(chosenLength);
        System.out.println("IDStart: "+idStart+"\nBreak Position: "+primeNumbersString.indexOf(chosenNumberString)+"\nLength: "+chosenLength);
        for (int x=0;x<10;x++){
            System.out.print(primeNumbersString.charAt(primeNumbersString.indexOf(chosenNumberString)));
        }
        String stringSplit=primeNumbersString.substring(idStart,idStart+5);
        return stringSplit;
    }
    
    public static void main(String[] args){
        try{
        File file=new File("Output.txt");
        PrintWriter output=new PrintWriter(file);
        Scanner input=new Scanner(System.in);
        int pickedNumber;
        int number=2;
        for (number=2;number<=1050;number++){
            if (prime(number)){
                primeNumbersString=primeNumbersString+number;
                System.out.println(number);
            }
        }
        pickedNumber=input.nextInt();
        System.out.println(answer(pickedNumber));
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
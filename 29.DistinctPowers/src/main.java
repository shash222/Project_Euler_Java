import java.util.ArrayList;
import java.util.Collections;
public class main{
    public static void main(String[] args){
        ArrayList<Double> numbers=new ArrayList<Double>();
        double a;//base
        double b;//exponent
        double outcome;
        int total=1;//set it equal to one because program adds whenever two numbers aren't the same, exludes first item
        double num1=0;
        double num2=0;
        for (a=2;a<=100;a++){
            for (b=2;b<=100;b++){
                outcome=Math.pow(a,b);
                numbers.add(outcome);
            }
        }
        Collections.sort(numbers);
        for (int x=numbers.size()-2;x>=0;x--){
            num1=numbers.get(x);
            num2=numbers.get(x+1);
            if (num1!=num2){
                total++;
            }
        }
        System.out.println(total);
    }
}
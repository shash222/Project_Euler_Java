import java.util.ArrayList;
public class main{
    public static boolean amicable(int x, int y){
        int num;
        int total=0;
        for (num=1;num<x;num++){
            if (x%num==0){
                total+=num;
            }
        }
        if (total==y){
            return true;
        }
        return false;
    }

    public static int factors(int x){
        int total=0;
        int y;
        for (y=1;y<x;y++){
            if (x%y==0){
                total+=y;
            }
        }
        return total;
    }

    public static void main(String[] args){
        int number;
        int facsum;//sum of factors
        int total=0;
        boolean amic=false;
        for (number=4;number<10000;number++){
            facsum=factors(number);
            if (facsum!=number){
                amic=amicable(facsum,number);
            }
            if (amic==true){
                total+=(facsum);
            }
        }
        System.out.println(total);
    }
}
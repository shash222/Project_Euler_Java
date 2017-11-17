import java.util.ArrayList;
public class main{
    public static boolean isPrime(int num){
        int div;
        int fal=0;
        for (div=2;div<num;div++){
            if (num%div==0){
                fal++;
            }
        }
        if (fal!=0){
            return false;
        }
        return true;
    }
@SuppressWarnings("unchecked")
    public static void main(String[] args){
        int num;
        int slot;
        int slots=0;
        int power=0;
        int total=1;
        ArrayList<Double> numbers=new ArrayList<Double>();
        for (num=2;num<=20;num++){
            if (isPrime(num)==true){
                do{
                    power++;
                }while(Math.pow(num,power+1)<20);
                numbers.add(Math.pow(num,power));
                power=0;
                slots++;
            }
        }
        for(slot=0;slot<slots;slot++){
            total*=numbers.get(slot);
        }
        System.out.println(total);
    }
}
import java.math.BigInteger;
public class main{
    public static boolean isPrime(int quad){
        int x;
        int count=0;
        for (x=2;x<quad;x++){
            if (quad%x==0){
                count++;
            }
            if (count!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int a;
        int b;
        int x;
        int quad;
        int primes;
        int count=0;
        int greatest=0;
        int greatesta=1;
        int greatestb=1;
        int answer;
        boolean prime;
        for (a=-999;a<999;a++){
            System.out.println(a);
            System.out.println(greatesta);
            System.out.println(greatestb);
            System.out.println(count);
            System.out.println();
            for (b=-999;b<999;b++){
                count=0;
                x=0;
                do{
                    quad=x*x;
                    quad+=(a*x);
                    quad+=b;
                    prime=isPrime(quad);
                    if (prime==true){
                        count++;
                        x++;
                    }
                    if (count>greatest){
                        greatest=count;
                        greatesta=a;
                        greatestb=b;
                    }
                }while(prime==true);
            }
        }
        answer=(greatesta*greatestb);
        System.out.println(answer);
        System.out.println(greatesta);
        System.out.println(greatestb);
    }
}
public class main{
    public static boolean isPrime(long x){
        for (long y=2; y<x; y++){
            if (x%y==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Find out the largest prime factor of 600851475143");
        long num=600851475143L;
        long largest=0;
        double number=Math.sqrt(num);
        long y;
        long prime;
        for (y=3;y<number; y+=2){
            if (num%y==0){
                if (isPrime(y)==true){
                    if (largest<y){
                        largest=y;
                    }
                }
            }
        }
        System.out.println(largest);
    }
}
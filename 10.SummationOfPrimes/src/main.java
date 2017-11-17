public class main{
    public static boolean isPrime(int x){
        for (int y=3; y<x; y+=2){
            if (x%y==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int x;
        int c=0;
        long count=0;
        boolean prime;
        for (x=3;x<2000000;x+=2){
            if (isPrime(x)){
                count=count+x;
                System.out.println(x);
            }
            if (x>1000000&&isPrime(x)){
                c++;
            }
        }
        System.out.println(count+2);
    }
}
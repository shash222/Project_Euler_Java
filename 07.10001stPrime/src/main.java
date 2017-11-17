public class main{
    public static boolean isPrime(int x){
        for (int y=2; y<x; y++){
            if (x%y==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int x;
        int y;
        int count=1;
        int prime=0;
        for(x=3;x<200000;x++){
            if (isPrime(x)==true&&count<10001){
                prime=x;
                count++;
            }
        }
        System.out.println(prime);
    }
}
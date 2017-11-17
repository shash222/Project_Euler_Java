public class main{
    public static void main(String[] args) {
        long x;
        long y=0;
        long z;
        long a=0;
        long b;
        for (x=1;x<=100;x++){
            y+=x*x;
        }
        for (z=1;z<=100;z++){
            a+=z;
        }
        b=a*a;
        System.out.println("Answer: "+(b-y));
    }
}
public class main{
    public static void main(String[] args){
        int f=1;//first number
        int s=2;//second number
        int fin=0;//final answer
        int x;
        for (x=3; x<4000000; x=f+s){
            f=s;
            s=x;
            if (x%2==0){
                fin+=x;
            }
        }
        System.out.println("Sum of all even numbers: "+(fin+2));
    }
}
import java.math.BigInteger;
public class main{
    public static void main(String[] args){
        BigInteger n1=BigInteger.valueOf(1);
        BigInteger n2=BigInteger.valueOf(1);
        BigInteger sum;
        BigInteger count=BigInteger.valueOf(2);
        String num="";
        while (num.length()!=1000){
            sum=n1.add(n2);
            n1=n2;
            n2=sum;
            num=n2.toString();
            System.out.println(num);
            count=count.add(BigInteger.valueOf(1));
        }
        System.out.println(count);
    }
}
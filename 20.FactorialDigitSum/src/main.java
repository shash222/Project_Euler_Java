import java.math.BigInteger;
public class main{
    public static void main(String[] args){
        int x;
        int length;
        int prodlength;
        int sum=0;
        char value;
        int valnum;
        BigInteger prod=BigInteger.valueOf(1);
        String product;
        for (x=100;x>1;x--){
            prod=prod.multiply(BigInteger.valueOf(x));
        }
        product=String.valueOf(prod);
        prodlength=product.length();
        for (x=0;x<prodlength;x++){
            value=product.charAt(x);
            sum+=Character.getNumericValue(value);
        }
        System.out.println(sum);
    }
}
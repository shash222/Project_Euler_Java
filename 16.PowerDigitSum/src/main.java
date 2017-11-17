import java.math.BigDecimal;
public class main{
    public static void main(String[] args){
        int x;
        int total=0;
        BigDecimal number=new BigDecimal(Math.pow(2,1000));
        String num=number.toString();
        for (x=0;x<num.length();x++){
            total+=Character.getNumericValue(num.charAt(x));
        }
        System.out.println(total);
    }
}
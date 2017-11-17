import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.math.BigDecimal;
public class main{
    public static int recip(String dec){
        int x;
        int y=0;
        int place=0;
        int length=dec.length();
        for (x=0;x<length;x++){
            
        }
        return y;
    }
    public static void main(String[] args){
        int reciplength=0;
        int max=0;
        int largest;
        int y=0;
        BigDecimal one=BigDecimal.valueOf(1);
        BigDecimal quotient;
        BigDecimal x=BigDecimal.valueOf(2);
        String num;
        String dec;
        List<String> numb=new ArrayList<String>();
        do{
            quotient=one.divide(x);
            num=quotient.toString();
            num=num.substring(2,num.length());
            reciplength=recip(num);
            if (reciplength>max){
                max=reciplength;
                largest=y;
            }
            x=x.add(BigDecimal.valueOf(1));
            y++;
        }while(y<1000);
        System.out.println(x);
    }
}
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.math.BigInteger;
public class main{
    public static BigInteger ans(List<Integer> abund,BigInteger total){
        int x;
        int y;
        int size;
        int val;
        int sum;
        Object amount;
        size=abund.size();
        BigInteger spotval;
        BigInteger answer;
        BigInteger totsub=BigInteger.valueOf(0);
        Set<Integer> abunsum=new LinkedHashSet<Integer>();
        for (x=0;x<size;x++){
//            System.out.println(x);
            for (y=0;y<size;y++){
                sum=(abund.get(x)+abund.get(y));
                if (sum<28124){
                    abunsum.add(sum);
                }
            }
        }
        Iterator itr=abunsum.iterator();
        while(itr.hasNext()){
            amount=itr.next();
            val=(int) amount;
            spotval=BigInteger.valueOf(val);
            totsub=totsub.add(spotval);
        }
        answer=total.subtract(totsub);
        return answer;
    }
    
    public static boolean abun(long y){
        long x;
        long facsum=0;
        for(x=1;x<y;x++){
            if (y%x==0){
                facsum+=x;
            }
        }
        if (facsum>y){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args){
        int x;//for loop counter
        long y;//another for loop counter
        BigInteger total=BigInteger.valueOf(0);//total of all numbers from 0-28123
        BigInteger fin;//final answer
        BigInteger spotval;
        boolean abundant;
        List<Integer> abund=new ArrayList<Integer>();
        for (x=0;x<28124;x++){
            abundant=abun(x);
            if (abundant==true){
                abund.add(x);
            }
            spotval=BigInteger.valueOf(x);
            total=total.add(spotval);
        }
        fin=ans(abund,total);
        System.out.println("Final: "+fin);
    }
}
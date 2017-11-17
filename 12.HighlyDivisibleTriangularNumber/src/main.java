public class main{
    public static int divisors(int x){
        int div=0;//counts number of divisors
        int y;//controls loop to find divisors
        int z=0;//number of divisors up to the square root of number
        for (y=1;y<=Math.sqrt(x);y++){
            if (x%y==0){
                z++;
            }
        }
        div=z*2;
        return div;
    }
    public static void main(String[] args) {
        int tv=0;//triangle value
        int dc=0;//number of divisor
        int tn=0;//amount of triang;es
        int y=1;//adds values to figure out triangle number
        while(dc<500){
            tv+=y;
            y++;
            tn++;
            dc=divisors(tv);
        }
        System.out.println(tv);
    }
}
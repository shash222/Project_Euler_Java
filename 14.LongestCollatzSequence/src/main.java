public class main{
    public static void main(String[] args){
        long n;
        long n1=0;
        long count=0;
        long max=0;
        long largeN=0;
        for(n=14;n<1000000;n++){
            n1=n;
            while (n1!=1){
                if (n1%2==0){
                    n1=n1/2;
                    count++;
                }
                else{
                    n1=((3*n1)+1);
                    count++;
                }
            }
            if (max<count){
                max=count;
                largeN=n;
            }
            count=0;
        }
        System.out.println(largeN);
    }
}
public class main{
    public static void main(String[] args){
        int a;
        int b;
        int c;
        int product=0;
        for (a=1;a<500;a++){
            for (b=1;b<500;b++){
                for(c=1;c<500;c++){
                    if (Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)){
                        if (a+b+c==1000){
                            product=(a*b*c);
                        }
                        else{
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(product);
    }
}
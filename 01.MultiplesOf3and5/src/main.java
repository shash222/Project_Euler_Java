public class main{
    public static void main(String[] args){
        int total=0;
        int y=0;
        for(int t=3; t<1000; t+=3){
            total+=t;
        }
        for (int f=5; f<1000; f+=5){
            total+=f;
        }
        for (int x=15; x<1000; x+=15){
            total-=x;
        }
        System.out.println("Final total: "+total);
    }
}
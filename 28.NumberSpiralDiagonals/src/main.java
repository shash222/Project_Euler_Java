public class main{
    public static int movePos=1;
    public static int moveNeg=1;
    public static int[][] numbers=new int[1001][1001];
    public static int newx=500;
    public static int newy=500;
    public static int number=1;
    public static int total=0;
    public static int max=1001*1001;

    public static void Right(){
        int x=0;
        for (x=newx;x<(500+movePos);x++){
            if (number>max){
                break;
            }
            numbers[newy][x]=number;
            number++;
        }
        newx=x;
    }

    public static void Down(){
        int y=0;
        for (y=newy;y<(500+movePos);y++){
            if (number>max){
                break;
            }
            numbers[y][newx]=number;
            number++;
        }
        newy=y;
        movePos++;
    }

    public static void Left(){
        int x=0;
        for (x=newx;x>(500-moveNeg);x--){
            if (number>=max){
                break;
            }
            numbers[newy][x]=number;
            number++;
        }
        newx=x;
    }

    public static void Up(){
        int y=0;
        for (y=newy;y>(500-moveNeg);y--){
            if (number>max){
                break;
            }
            numbers[y][newx]=number;
            number++;
        }
        newy=y;
        moveNeg++;
    }

    public static void main(String[] args){
        do{
            Right();
            Down();
            Left();
            Up();
        }while(number<max);
        for (int a=0;a<1001;a++){
            for (int b=0;b<1001;b++){
                if (a==b){
                    total+=numbers[a][b];
                }
            }
        }
        for (int a=0;a<=1000;a++){
            for (int b=1000;b>=0;b--){
                if((a+b)==1000){
                    total+=numbers[a][b];
                }
            }
        }
        System.out.println(total-1);//double counts "1" in the center
    }
}
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
@SuppressWarnings("unchecked")
public class main{
    public static int row(int[][] data){//if i change back to arraylist, change int to arraylist
        int product=1;//product of any four numbers in sequence across
        int max=0;//max product going across
        int item;//sets value of data
        int y=0;//counts position of data (1-4)
        int rownum;//number row
        int num;
        int column;//number column
        int count=0;
        for(rownum=0;rownum<20;rownum++){
            for(column=0;column<16;column++){
                do{
                    item=column+y;
                    num=data[rownum][item];
                    count++;
                    product*=num;
                    if (product>max){
                        max=product;
                    }
                    y++;
                }while(y<4);
                product=1;
                y=0;
            }
        }
        return max;
    }

    public static int col(int[][] data){//if i change back to arraylist, change int to arraylist
        int product=1;//product of any four numbers in sequence across
        int max=0;//max product going across
        int item;//sets value of data
        int y=0;//counts position of data (1-4)
        int rownum;//number row
        int num;
        int column;//number column
        int count=0;
        for(column=0;column<20;column++){
            for(rownum=0;rownum<16;rownum++){
                do{
                    item=rownum+y;
                    num=data[rownum][item];
                    count++;
                    product*=num;
                    if (product>max){
                        max=product;
                    }
                    y++;
                }while(y<4);
                product=1;
                y=0;
            }
        }
        return max;
    }
    
    public static int diagonal1(int[][] data){//top left to bottom right
        int product=1;//product of any four numbers in sequence across
        int max=0;//max product going across
        int item1;//sets value of data
        int item2;//sets value of data
        int y=0;//counts position of data (1-4)
        int rownum;//number row
        int num;
        int column;//number column
        int count=0;
        for(rownum=0;rownum<16;rownum++){
            for(column=0;column<16;column++){
                do{
                    item1=column+y;
                    item2=rownum+y;
                    num=data[item2][item1];
                    count++;
                    product*=num;
                    if (product>max){
                        max=product;
                    }
                    y++;
                }while(y<4);
                product=1;
                y=0;
            }
        }
        return max;
    }
    
    public static int diagonal2(int[][] data){//top left to bottom right
        int product=1;//product of any four numbers in sequence across
        int max=0;//max product going across
        int item1;//sets value of data
        int item2;//sets value of data
        int y=0;//counts position of data (1-4)
        int rownum;//number row
        int num;
        int column;//number column
        int count=0;
        for(rownum=19;rownum>4;rownum--){
            for(column=0;column<16;column++){
                do{
                    item1=column+y;
                    item2=rownum-y;
                    num=data[item2][item1];
                    count++;
                    product*=num;
                    if (product>max){
                        max=product;
                    }
                    y++;
                }while(y<4);
                product=1;
                y=0;
            }
        }
        return max;
    }

    public static void main(String[] args){
        File path=new File("../numbers.txt");
        int column;//represents number column 
        int max;//max product of any four numbers in order
        int max1;
        int max2;
        int max3;
        int product=1;//max product of each individual way (across, down, diagonal)
        int line;//each individual number
        int row;
        int[][] data=new int[20][20];
        try{
            Scanner in=new Scanner(path);
            while (in.hasNextLine()){
                for(row=0;row<20;row++){
                    for(column=0;column<20;column++){//goes across a row
                        line=in.nextInt();
                        data[row][column]=line;
                    }
                }
            }
        }
        catch(Exception ex){
            System.out.println("Hello World");
        }
        max=row(data);
        if (col(data)>max){
            max=col(data);
        }
        if (diagonal1(data)>max){
            max=diagonal1(data);
        }
        if (diagonal2(data)>max){
            max=diagonal2(data);
        }
        System.out.println(max);
    }
}
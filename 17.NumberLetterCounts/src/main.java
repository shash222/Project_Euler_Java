import java.util.ArrayList;
public class main{
    public static int chars(int x){
        String[] ones={"","one","two","three","four","five","six","seven","eight","nine"};
        String[] teens={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] tens={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String number;//number written out
        String num;//x as length to see how many digits it has
        int count=0;//counts numbers with two zeroes
        int characters=0;//total amount of characters in number spelled out
        int length;//number of digits in number
        int a;//for loop counter to count zeroes
        int y=0;//counts digits
        int z=0;//zeroes in number to account for and
        num=Integer.toString(x);//converts number to string to see how many digits it can have
        length=num.length();//amount of digits in number
        if (length==1){//one digit numbers
            number=ones[Character.getNumericValue(num.charAt(y))];
            characters+=number.length();
        }
        else if (length==2&&Character.getNumericValue(num.charAt(0))==1){//two digit numbers that start with 1
            number=teens[Character.getNumericValue(num.charAt(1))];
            characters+=number.length();
        }
        else if(length==3&&Character.getNumericValue(num.charAt(1))==1){
            number=teens[Character.getNumericValue(num.charAt(2))];
            characters+=number.length();
        }
        while(y<length){//counts individual digits
            if (length==2&&Character.getNumericValue(num.charAt(0))!=1){//two digit numbers that don't start with one
                if (y==0){
                    number=tens[Character.getNumericValue(num.charAt(y))];
                    characters+=number.length();
                }
                else{
                    number=ones[Character.getNumericValue(num.charAt(y))];
                    characters+=number.length();
                }
            }
            else if (length==3){
                if (y==0){//first number
                    number=ones[Character.getNumericValue(num.charAt(y))];
                    characters+=number.length();
                    characters+=10;//accounts for hundred and 'and'
                }
                if (Character.getNumericValue(num.charAt(1))!=1){//for teens
                    if (y==1){
                        number=tens[Character.getNumericValue(num.charAt(y))];
                        characters+=number.length();
                    }
                    else if(y==2){
                        number=ones[Character.getNumericValue(num.charAt(y))];
                        characters+=number.length();
                    }
                }
            }
            y++;
        }
        if (length==3){
            if (Character.getNumericValue(num.charAt(1))==0&&Character.getNumericValue(num.charAt(2))==0){
                characters-=3;//subtracts 3 because 100,200,300, etc. don't have 'and'
            }
        }
        else if (length==4){
            characters+=11;//accounts for one and thousand
        }
        return characters;
    }
    public static void main(String[] args){
        int numcount;//current number
        int number;//characters in one number
        int total=0;//final answer total
        for (numcount=1;numcount<=1000;numcount++){
            System.out.println(numcount+": "+chars(numcount));
            total+=(chars(numcount));
        }
        System.out.println(chars(115));
        System.out.println(total);
    }
}
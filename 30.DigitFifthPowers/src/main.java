public class main{
    public static void main(String[] args){
        String numberString;
        int number;
        char numChar;
        double digitSum=0;
        int digitNumber;
        int finalAnswer=0;
        double upperLimit=0;
        double nineToExponent;
        for (int x=1;x<10;x++){
            nineToExponent=Math.pow(9,5)*x;
            if (nineToExponent>upperLimit){
                upperLimit=nineToExponent;
            }
        }
        System.out.println("Upper Limit: "+upperLimit);
        for (number=2;number<upperLimit;number++){
            numberString=Integer.toString(number);
            for (int digit=0;digit<numberString.length();digit++){
                numChar=numberString.charAt(digit);
                digitNumber=Character.getNumericValue(numChar);
                digitSum+=Math.pow(digitNumber,5);
            }
            if (digitSum==number){
                finalAnswer+=number;
            }
            digitSum=0;
        }
        System.out.println(finalAnswer);
    }
}
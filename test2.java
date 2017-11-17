public class test2{
    public static void main(String[] args){
        String a="1";
        char b='1';
        int x=Integer.parseInt(a);
        int y=Integer.valueOf(a);
        int z=Character.getNumericValue(b);
        double answer=Math.pow(z*5,2);
        System.out.println(answer);
    }
}
public class main{
    public static boolean palindrome(String pal, int length){
        int i;//counter for charAt starting at 1
        int x=length;//counter for charAt starting at length of product
        int count=0;//counter to check if product actually is palnidrome
        for (i=0;i<length;i++){
            if (pal.charAt(i)==pal.charAt(x)){
                count++;
                x--;
            }
        }
        if (count==length){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int x;//number one
        int y;//number two
        int z;//product of both numbers
        int largest=0;//largest number
        int length;//length of product
        String product;//product of both numbers as string
        boolean check;//variable to determine whether product is palindrome
        for (x=100;x<=999;x++){
            for (y=100;y<=999;y++){
                z=x*y;
                product=String.valueOf(z);
                length=product.length()-1;
                check=palindrome(product,length);
                if (check==true&&z>largest){
                    largest=z;
                }
            }
        }
        System.out.println(largest);
    }
}
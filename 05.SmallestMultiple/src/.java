public class main{
    public static void main(String[] args){
        int multiple=2520;
        int smallest = 2520; 
        boolean done = false;     
        
        while (done==false){
            for (int i = 11; i <= 20; i++){
                if ( smallest % i > 0 ){
                    smallest += multiple; 
                    break;
                }
                if ( i == 20 ){
                    done = true;
                }
            }
        }
        System.out.println("The smallest multiple divisible by 1-20 is "+smallest);
    }
}
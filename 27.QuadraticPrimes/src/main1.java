import java.math.BigInteger;
public class main1{
public static void main(String[] args){
int answer = -1;
int numberOfPrimes = 0;
int answerA = 0;
int answerB = 0;
 
for(int a = -999; a < 1000; a++) {
   for(int b = -999; b < 1000; b++) {
      boolean consecutive = true;
      int n = 0;
      while(consecutive) {
         int value = (n*n) + a*n + b;
         if(BigInteger.valueOf(value).isProbablePrime(5)) {
            n++;
         } else {
            if(n > numberOfPrimes) {
               numberOfPrimes = n;
               answerA = a;
               answerB = b;
            }
            consecutive = !consecutive;
         }
      }
   }
}
 
answer = answerA*answerB;
 
System.out.println("Answer: "+answer+" (a = "+answerA+", b = "+answerB+", primes = "+numberOfPrimes);
}}
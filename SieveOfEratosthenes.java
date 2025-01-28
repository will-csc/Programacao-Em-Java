import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a range in order to get the prime numbers: ");
        int range = in.nextInt();
        
        int[] prime_num = PrimeRange(range);
        System.out.println("Your prime numbers in the given range is: ");
        for(int i = 0; i < prime_num.length; i++){
            if (prime_num[i] > 0){
                System.out.printf("%d,",prime_num[i]);
            }
        }
    }
    public static int[] PrimeRange(int range){
        boolean[] isPrime = new boolean[range];
        
        // Preenche o array com true
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        
        //Looping para numeros primos
        for(int i = 2; i < range; i++){
            for(int j = i + 1; j < range; j++){
                if(j % i == 0){
                    isPrime[j] = false;
                }
            }
        }
        
        int cont = 0;
        int primes[] = new int[range];
        //Looping retorno
        for(int i = 2; i < range; i++){
            if(isPrime[i] == true){
                primes[cont] = i;
                cont++;
            }
        }
        
        return primes;
    }
}
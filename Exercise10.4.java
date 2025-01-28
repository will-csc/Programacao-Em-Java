import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range for factorial table: ");
        int qtd = in.nextInt();
        
        Factorialtable(qtd);
    }

    public static void Factorialtable(int qtd){
        System.out.println("\nNumber\tFactorial");
        for(int i = 1; i <= qtd; i++){
            System.out.printf("%d\t%s\n", i, Factorial(i).toString()); // Corrigido para exibir BigInteger corretamente
        }
    }

    public static BigInteger Factorial(int n){
        if (n == 1){
            return BigInteger.ONE; // Corrigido para usar BigInteger.ONE
        }
        return BigInteger.valueOf(n).multiply(Factorial(n - 1)); // Usando .multiply() corretamente
    }
}

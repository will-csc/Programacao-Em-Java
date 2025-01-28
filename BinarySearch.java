import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a value (between 0 and 100) for the search in the array: ");
        int search = in.nextInt();
        
        int[] a = randomArray();
        Arrays.sort(a);  // Ordenando o array antes da busca binária
        int result = BinarySearch(search, a);
        
        if (result != -1) {
            System.out.printf("The index of value %d is: %d%n", search, result);
        } else {
            System.out.printf("Value %d not found in the array.%n", search);
        }
        
        in.close();
    }

    public static int BinarySearch(int search, int[] a) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int index = low + (high - low) / 2;  // Cálculo correto do meio
            int guess = a[index];

            if (guess == search) {
                return index;  // Valor encontrado
            } 
            if (guess > search) {
                high = index - 1;  // Busca na metade esquerda
            } else {
                low = index + 1;  // Busca na metade direita
            }
        }
        return -1;  // Valor não encontrado
    }

    public static int[] randomArray() {
        Random random = new Random();
        int[] a = new int[100000000];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(1000000);  // Números entre 0 e 99
        }
        return a;
    }
}

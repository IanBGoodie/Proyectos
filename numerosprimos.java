public class NumerosPrimos {

   
    public static int esPrimo(int numero) {
       
        if (numero < 2) {
            return 0;
        }
        
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return 0;
            }
        }
        return 1; 
    }

    public static void main(String[] args) {
        System.out.println("Numeros primos del 1 al 100:");
        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i) == 1) {
                System.out.print(i + " "); 
            }
        }
    }
}
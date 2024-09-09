import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		    Scanner si = new Scanner(System.in); 
        System.out.println("Escribe aqui");
        String cadena = si.nextLine();
        String[] parts = cadena.split(" ");
     
        for (int k = 0; k < parts.length; k++) {
           
            parts[k] = parts[k].substring(0, 1).toUpperCase() + parts[k].substring(1);
        }
   
        String resultado = String.join(" ", parts);
        
        System.out.println(resultado);
	}
}
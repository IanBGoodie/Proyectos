public class CapitalizarPalabras {
    public static void main(String[] args) {
       
        String cadena = "hola a todos chicuelos pasensela bien";
        
       
        String cadenaCapitalizada = "";

       
        char[] caracteres = cadena.toCharArray();
        
        
        if (caracteres[0] >= 'a' && caracteres[0] <= 'z') {
            caracteres[0] = (char)(caracteres[0] - 'a' + 'A');
        }
        
       
        for (int i = 1; i < caracteres.length; i++) {
            
            if (caracteres[i] == ' ' && i + 1 < caracteres.length) {
                if (caracteres[i + 1] >= 'a' && caracteres[i + 1] <= 'z') {
                   
                    caracteres[i + 1] = (char)(caracteres[i + 1] - 'a' + 'A');
                }
            }
        }
        
       
        for (char c : caracteres) {
            cadenaCapitalizada += c;
        }
        
        
        System.out.println("Cadena capitalizada: " + cadenaCapitalizada);
    }
}
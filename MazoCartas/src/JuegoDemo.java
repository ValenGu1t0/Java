
// Clase Main, donde va el código fuente
public class JuegoDemo {

    // Método public static de la clase
    public static void main(String[] args) {

        // Constructor de la clase Mazo -> se instancia con new
        Mazo m = new Mazo();

        Carta c1 = m.getCarta();

        System.out.println(c1.getNumero() + " " + c1.getPalo());
    }
}
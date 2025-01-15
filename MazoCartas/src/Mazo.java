
    public class Mazo {

        // Mazo es un array de cartas - cartas es el elem. minimo
        private Carta [] cartas;

        public Mazo() {

        cartas = new Carta[48];

        int indice = 0;

            // For each en Java
            for (Palo p : Palo.values()) {          // Por cada palo de enum

                for (Numero n : Numero.values()) {       // Por cada numero de enum

                    cartas[indice++] = new Carta(p, n);

                }
            }
        }

        public Carta getCarta() {

            // El siguiente (int) es un cast. Nos ayuda a descartar la parte decimal del double
            int azar = (int) (Math.random() * 48);

            // Vamos a generar un numero random
            return cartas[azar];
        }
    }

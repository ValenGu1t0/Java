
    public class Carta {

        // Propiedades de una Carta - Palo y Numero
        // En vez de hacer un String, creamos una clase personalizada "Palo"
        private Palo palo;
        private Numero numero;

        public Carta(Palo palo, Numero numero) {

            this.palo = palo;
            this.numero = numero;
        }

        public Palo getPalo() {

            return palo;
        }

        public Numero getNumero() {

            return numero;
        }
    }

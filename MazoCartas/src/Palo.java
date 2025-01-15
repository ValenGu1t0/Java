
    //  Cada valor de un enum es una constante pública, estática y final.

    public enum Palo {

        ESPADA, BASTO, COPA, ORO

    }

    // En Mazo se puede instanciar de forma new Carta(Palo.ESPADA, Numero.DOS)

    /* Las enum son recorribles (for each Palo)

    for (int i=0; i < Palo.values().length; i++) {


     }

     */
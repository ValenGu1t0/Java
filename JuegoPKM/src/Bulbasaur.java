
// Clase Bulbasaur, es un Pokemon de tipo Planta
public class Bulbasaur extends Pokemon implements Planta {

    public Bulbasaur() {
    }








    // Los 3 ataques por defecto de todos los pkm:
    @Override
    protected void ataquePlacaje() {
        System.out.println("Placaje");
    }

    @Override
    protected void ataqueAraniazo() {
        System.out.println("Arañazo");
    }

    @Override
    protected void ataqueMordisco() {
        System.out.println("Mordisco");
    }


    // Ataques de los pkm de tipo PLANTA
    @Override
    public void ataqueParalizar() {
        System.out.println("Paralizar");
    }

    @Override
    public void ataqueDrenaje() {
        System.out.println("Drenar");
    }
}

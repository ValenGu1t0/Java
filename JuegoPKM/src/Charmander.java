
public class Charmander extends Pokemon implements Fuego {

    public Charmander() {
    }


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

    @Override
    public void ataqueLanzallamas() {
        System.out.println("Llamas");
    }

    @Override
    public void ataqueAscuas() {
        System.out.println("Ascuas");
    }
}


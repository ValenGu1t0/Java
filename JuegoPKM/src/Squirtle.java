

public class Squirtle extends Pokemon implements Agua {


    public Squirtle() {
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
    public void ataqueHidrobomba() {
        System.out.println("Hidrobomba");
    }

    @Override
    public void ataqueBurbuja() {
        System.out.println("Burbuja");
    }
}


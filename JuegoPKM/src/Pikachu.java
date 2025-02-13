
public class Pikachu extends Pokemon implements Electrico {


    public Pikachu() {
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
    public void ataqueImpactrueno() {
        System.out.println("Impactrueno");
    }

    @Override
    public void ataquePunioTrueno() {
        System.out.println("Puño Trueno");
    }
}

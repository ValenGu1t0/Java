

public class Main {

    public static void main(String[] args) {

        // Instanciamos pkm
        Bulbasaur babasar = new Bulbasaur();
        Squirtle squirol = new Squirtle();
        Charmander charmin = new Charmander();
        Pikachu pikachiu = new Pikachu();

        // Pelean los pkm
        squirol.ataqueBurbuja();
        charmin.ataquePlacaje();
        pikachiu.ataqueImpactrueno();
        babasar.ataqueMordisco();
    }
}

// Usamos abstract para atributos y ataques en comun
public abstract class Pokemon {

    // TODOS los pkm comparten estos atributos:
    protected int numeroPokedex;
    protected String nombre;
    protected Double peso;
    protected String sexo;
    protected int temporada;

    // Ademas, estos "ataques" o metodos (al menos comparten 3):
    protected abstract void ataquePlacaje();

    protected abstract void ataqueAraniazo();

    protected abstract void ataqueMordisco();

}

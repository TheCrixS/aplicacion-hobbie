package datos;

public class Anime {
    private String nombre;
    private String tipo;
    private int temporadas;

    public Anime(){
    }

    public String getNombre() {
        return nombre;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "nombre: "+nombre+" - tipo: "+tipo+" - temporadas: "+temporadas;
    }
}

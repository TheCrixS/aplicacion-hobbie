package datos;

public class Anime {
    public String nombre;
    public String tipo;
    public String temporadas;

    public Anime(){
    }

    public String getNombre() {
        return nombre;
    }

    public String getTemporadas() {
        return temporadas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTemporadas(String temporadas) {
        this.temporadas = temporadas;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "nombre: "+nombre+"\ntipo: "+tipo+"\ntemporadas: "+temporadas;
    }
}

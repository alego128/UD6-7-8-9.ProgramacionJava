
package ejercicio8_2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventoMusical {
    private String nombre;
    private LocalDate fecha;
    private BigDecimal recaudacion;
    private GeneroMusical genero;
    private List<Artista> artistas;

    public EventoMusical(String nombre, LocalDate fecha, BigDecimal recaudacion, GeneroMusical genero) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
        this.genero = genero;
        this.artistas = new ArrayList<>();
    }

    public void agregarArtista(Artista artista) {
        artistas.add(artista);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(BigDecimal recaudacion) {
        this.recaudacion = recaudacion;
    }

    public GeneroMusical getGenero() {
        return genero;
    }

    public void setGenero(GeneroMusical genero) {
        this.genero = genero;
    }

    public List<Artista> getArtistas() {
        return artistas;
    }

    @Override
    public String toString() {
        return "EventoMusical{" +
                "nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", recaudacion=" + recaudacion +
                ", genero=" + genero +
                ", artistas=" + artistas +
                '}';
    }
}

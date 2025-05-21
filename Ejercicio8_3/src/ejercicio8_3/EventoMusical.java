
package ejercicio8_3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventoMusical {
    private static int siguienteId = 10;
    private int id;  
    private String nombre;
    private LocalDate fecha;
    private BigDecimal recaudacion;
    private GeneroMusical genero;
    private List<Artista> artistas;
    private transient int control; 

    public EventoMusical(String nombre, LocalDate fecha, BigDecimal recaudacion, GeneroMusical genero) {
        this.id = siguienteId;
        siguienteId += 10; 
        this.nombre = nombre;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
        this.genero = genero;
        this.artistas = new ArrayList<>();
        this.control = 0; 
    }

    public void agregarArtista(Artista artista) {
        artistas.add(artista);
    }

    public int getId() {
        return id;
    }

    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
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
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", recaudacion=" + recaudacion +
                ", genero=" + genero +
                ", artistas=" + artistas +
                ", control=" + control +
                '}';
    }
}

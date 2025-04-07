package model;

// Clase que representa un disco de musica
public class Disco {
    private Artista artista;
    private String titulo;
    private int ventasTotales;

    public Disco(Artista artista, String titulo) {
        this.artista = artista;
        this.titulo = titulo;
        this.ventasTotales = 0;
    }

    public Artista getArtista() {
        return artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getVentasTotales() {
        return ventasTotales;
    }

    // Registra una venta de este disco
    public void registrarVenta(int cantidad) {
        this.ventasTotales += cantidad;
        artista.agregarVentas(cantidad);

        // Si es el disco mas vendido del artista, lo actualiza
        if (ventasTotales > artista.getVentasTotales() - cantidad) {
            artista.setDiscoMasVendido(this.titulo);
        }
    }

    // Imprime los detalles del disco
    public void mostrarDetalles() {
        System.out.println("Disco: " + titulo + " | Artista: " + artista.getNombre() + " | Ventas: " + ventasTotales);
    }
}

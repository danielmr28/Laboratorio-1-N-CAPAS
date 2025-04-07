package model;

// Clase que representa un artista
public class Artista {
    private int id;
    private String nombre;
    private String discoMasVendido;
    private int ventasTotales;

    public Artista(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.discoMasVendido = "";
        this.ventasTotales = 0;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDiscoMasVendido() {
        return discoMasVendido;
    }

    public int getVentasTotales() {
        return ventasTotales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDiscoMasVendido(String discoMasVendido) {
        this.discoMasVendido = discoMasVendido;
    }

    public void setVentasTotales(int ventasTotales) {
        this.ventasTotales = ventasTotales;
    }

    // Suma ventas al total actual
    public void agregarVentas(int cantidad) {
        this.ventasTotales += cantidad;
    }

    @Override
    public String toString() {
        return "Artista ID: " + id +
               ", Nombre: " + nombre +
               ", Disco mas vendido: " + (discoMasVendido.isEmpty() ? "N/A" : discoMasVendido) +
               ", Ventas totales: " + ventasTotales;
    }
}

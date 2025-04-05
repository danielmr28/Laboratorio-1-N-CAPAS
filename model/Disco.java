package model;

public class Disco {
    private Artista artista;
    private String titulo;
    private int ventasTotales;

    public Disco(Artista artista, String titulo) {
        this.artista = artista;
        this.titulo = titulo;
        this.ventasTotales = 0;
    }

    public Artista getArtista(){return artista;}
    public String getTitulo(){return titulo;}
    public int getVentasTotales(){return ventasTotales;}

    public void registrarVentas(int cantidad){
        this.ventasTotales += cantidad;
        artista.agregarVentas(cantidad);
    }

    if (ventasTotales > artista.getVentasTotales()) {
            artista.setDiscoMasVendido(this.titulo);
        }

    public void mostrarDetalles() {
        System.out.println("Disco: " + titulo +" Artista: " + artista.getNombre() + " | Ventas: " + ventasTotales);
    }
}

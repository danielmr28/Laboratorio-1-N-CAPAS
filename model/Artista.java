package model;

public class Artista {
    private int id;
    private String nombre;
    private String discoMasVendido;
    private int ventasTotales;

    public Artista(int Id, String nombre){
        this.id =id;
        this.nombre = nombre;
        this.discoMasVendido = "";
        this.ventasTotales = 0;
    }

    public int getId() {return id;}
    public String getNombre(){return nombre;}
    public String getdiscoMasVendivo(){return discoMasVendido;}
    public int getventasTotales(){return ventasTotales;}

    public void setNombre(String nombre){this.nombre = nombre;}
    public void setDiscoMasVendido(String discoMasVendido){this.discoMasVendido = discoMasVendido;}
    public void setVentasTotales(int ventasTotales){this.ventasTotales = ventasTotales;}

    public void agregarVentas(int cantidad){
        this.ventasTotales += cantidad;
    }

    @Override
    public String toString(){
        return "Artista ID" + id + ", Nombre" + nombre +  ", Disco más vendido" + discoMasVendido + ", Ventas totales" + ventasTotales;
    }
}

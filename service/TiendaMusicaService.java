package service;

import model.Artista;
import model.Disco;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// Clase que representa la logica del sistema (servicio)
public class TiendaMusicaService {
    private List<Artista> artistas;
    private List<Disco> discos;

    public TiendaMusicaService() {
        this.artistas = new ArrayList<>();
        this.discos = new ArrayList<>();
    }

    public void agregarArtista(Artista artista) {
        artistas.add(artista);
    }

    public void agregarDisco(Disco disco) {
        discos.add(disco);
    }

    // Registra una venta si el disco existe
    public void registrarVenta(String tituloDisco, int cantidad) {
        Optional<Disco> discoOpt = discos.stream()
                .filter(d -> d.getTitulo().equalsIgnoreCase(tituloDisco))
                .findFirst();

        if (discoOpt.isPresent()) {
            discoOpt.get().registrarVenta(cantidad);
            System.out.println("Venta registrada correctamente.");
        } else {
            System.out.println("Disco no encontrado.");
        }
    }

    // Muestra el artista con mas ventas totales
    public void mostrarArtistaConMasVentas() {
        artistas.stream()
                .max((a1, a2) -> Integer.compare(a1.getVentasTotales(), a2.getVentasTotales()))
                .ifPresentOrElse(
                        artista -> System.out.println("Artista con mas ventas:\n" + artista),
                        () -> System.out.println("No hay artistas registrados.")
                );
    }

    // Muestra el disco mas vendido
    public void mostrarDiscoMasVendido() {
        discos.stream()
                .max((d1, d2) -> Integer.compare(d1.getVentasTotales(), d2.getVentasTotales()))
                .ifPresentOrElse(
                        disco -> {
                            System.out.println("Disco mas vendido:");
                            disco.mostrarDetalles();
                        },
                        () -> System.out.println("No hay discos registrados.")
                );
    }

    // Muestra todos los discos con ventas superiores a cierto numero
    public void mostrarDiscosConVentasMayoresA(int limite) {
        List<Disco> filtrados = discos.stream()
                .filter(d -> d.getVentasTotales() > limite)
                .collect(Collectors.toList());

        if (filtrados.isEmpty()) {
            System.out.println("No hay discos con mas de " + limite + " ventas.");
        } else {
            System.out.println("Discos con mas de " + limite + " ventas:");
            filtrados.forEach(Disco::mostrarDetalles);
        }
    }

    public List<Artista> getArtistas() {
        return artistas;
    }

    public List<Disco> getDiscos() {
        return discos;
    }
}

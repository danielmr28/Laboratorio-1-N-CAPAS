package main;

import model.Artista;
import model.Disco;
import service.TiendaMusicaService;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final TiendaMusicaService tienda = new TiendaMusicaService();

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opcion: ");

            // Menu principal
            switch (opcion) {
                case 1 -> registrarArtista();
                case 2 -> registrarDisco();
                case 3 -> registrarVenta();
                case 4 -> tienda.mostrarDiscoMasVendido();
                case 5 -> tienda.mostrarArtistaConMasVentas();
                case 6 -> mostrarDiscosConVentasMayoresA();
                case 7 -> mostrarArtistas();
                case 8 -> mostrarDiscos();
                case 0 -> System.out.println("Gracias por usar el sistema de la tienda de musica.");
                default -> System.out.println("Opcion invalida. Intente nuevamente.");
            }

        } while (opcion != 0);
        scanner.close();
    }

    // Metodo para mostrar el menu principal
    private static void mostrarMenu() {
        System.out.println("""
            \n========== MENU TIENDA DE MUSICA ==========
            1. Registrar artista
            2. Registrar disco
            3. Registrar venta
            4. Mostrar disco mas vendido
            5. Mostrar artista con mas ventas
            6. Mostrar discos con mas de X ventas
            7. Mostrar todos los artistas
            8. Mostrar todos los discos
            0. Salir
        """);
    }
    

    private static void registrarArtista() {
        int id = leerEntero("Ingrese el ID del artista: ");
        String nombre = leerTexto("Ingrese el nombre del artista: ");
        tienda.agregarArtista(new Artista(id, nombre));
        System.out.println("Artista registrado correctamente.");
    }

    private static void registrarDisco() {
        String nombreArtista = leerTexto("Ingrese el nombre del artista: ");
        Artista artista = buscarArtistaPorNombre(nombreArtista);
        if (artista == null) {
            System.out.println("Artista no encontrado.");
            return;
        }
        String titulo = leerTexto("Ingrese el titulo del disco: ");
        tienda.agregarDisco(new Disco(artista, titulo));
        System.out.println("Disco registrado correctamente.");
    }

    private static void registrarVenta() {
        String titulo = leerTexto("Ingrese el titulo del disco: ");
        int cantidad = leerEntero("Ingrese la cantidad de ventas: ");
        tienda.registrarVenta(titulo, cantidad);
    }

    private static void mostrarDiscosConVentasMayoresA() {
        int min = leerEntero("Ingrese el minimo de ventas para filtrar: ");
        tienda.mostrarDiscosConVentasMayoresA(min);
    }

    private static void mostrarArtistas() {
        System.out.println("\n--- Lista de Artistas ---");
        tienda.getArtistas().forEach(System.out::println);
    }

    private static void mostrarDiscos() {
        System.out.println("\n--- Lista de Discos ---");
        tienda.getDiscos().forEach(Disco::mostrarDetalles);
    }

    // Busca un artista por nombre (ignora mayusculas/minusculas)
    private static Artista buscarArtistaPorNombre(String nombre) {
        return tienda.getArtistas().stream()
                .filter(a -> a.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }

    private static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    private static int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
            }
        }
    }
}

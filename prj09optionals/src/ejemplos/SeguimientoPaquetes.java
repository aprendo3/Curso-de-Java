package ejemplos;

import java.time.LocalDate;
import java.util.Optional;

public class SeguimientoPaquetes {
    private String codigoPaquete;
    private String ubicacionActual;
    private LocalDate fechaEntrega;

    public SeguimientoPaquetes(String codigoPaquete, String ubicacionActual, LocalDate fechaEntrega) {
        this.codigoPaquete = codigoPaquete;
        this.ubicacionActual = ubicacionActual;
        this.fechaEntrega = fechaEntrega;
    }

    public String getCodigoPaquete() {
        return codigoPaquete;
    }

    public String getUbicacionActual() {
        return ubicacionActual;
    }

    public Optional<LocalDate> getFechaEntrega() {
        return Optional.ofNullable(fechaEntrega);
    }

    public static void main(String[] args) {
        SeguimientoPaquetes paquete1 = new SeguimientoPaquetes("1234", "Bodega Central", null);
        SeguimientoPaquetes paquete2 = new SeguimientoPaquetes("5678", "Sucursal Sur", LocalDate.now());

        System.out.println("Paquete 1:");
        System.out.println("Código: " + paquete1.getCodigoPaquete());
        System.out.println("Ubicación actual: " + paquete1.getUbicacionActual());
        paquete1.getFechaEntrega().ifPresentOrElse(
                fecha -> System.out.println("Fecha de entrega: " + fecha),
                () -> System.out.println("Fecha de entrega: pendiente")
        );

        System.out.println("\nPaquete 2:");
        System.out.println("Código: " + paquete2.getCodigoPaquete());
        System.out.println("Ubicación actual: " + paquete2.getUbicacionActual());
        paquete2.getFechaEntrega().ifPresentOrElse(
                fecha -> System.out.println("Fecha de entrega: " + fecha),
                () -> System.out.println("Fecha de entrega: pendiente")
        );
    }
}

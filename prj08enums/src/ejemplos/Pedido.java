package ejemplos;

enum EstadoPedido {
    PENDIENTE,
    ENVIADO,
    ENTREGADO,
    CANCELADO
}

public class Pedido {
    private EstadoPedido estado;

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setEstado(EstadoPedido.PENDIENTE);
        System.out.println("Estado actual del pedido: " + pedido.getEstado());
        pedido.setEstado(EstadoPedido.ENVIADO);
        System.out.println("Nuevo estado del pedido: " + pedido.getEstado());
    }
}
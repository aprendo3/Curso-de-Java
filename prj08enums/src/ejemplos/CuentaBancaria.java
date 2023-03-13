package ejemplos;

enum TipoCuenta {
    AHORROS, CORRIENTE, PLAZO_FIJO;
}

class CuentaBancaria {
    private int numeroCuenta;
    private TipoCuenta tipoCuenta;
    private double saldo;

    public CuentaBancaria(int numeroCuenta, TipoCuenta tipoCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public boolean retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(123, TipoCuenta.AHORROS, 5000);
        CuentaBancaria cuenta2 = new CuentaBancaria(456, TipoCuenta.CORRIENTE, 10000);
        CuentaBancaria cuenta3 = new CuentaBancaria(789, TipoCuenta.PLAZO_FIJO, 20000);

        cuenta1.depositar(1000);
        cuenta2.retirar(5000);

        System.out.println("El saldo de la cuenta " + cuenta1.getNumeroCuenta() + " es de " + cuenta1.getSaldo());
        System.out.println("El saldo de la cuenta " + cuenta2.getNumeroCuenta() + " es de " + cuenta2.getSaldo());
        System.out.println("El saldo de la cuenta " + cuenta3.getNumeroCuenta() + " es de " + cuenta3.getSaldo());
    }
}

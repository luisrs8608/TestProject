public abstract class Cuenta {
    protected Double saldo;
    protected Cliente cliente;

    public Cuenta(Double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositarEfectivo(Double monto){
        this.saldo += monto;
    }

    public abstract Boolean extraerEfectivo(Double efectivo);
}

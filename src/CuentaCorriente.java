public class CuentaCorriente extends Cuenta{
    private Double montoAutorizado;

    public CuentaCorriente(Double saldo, Cliente cliente, Double montoAutorizado) {
        super(saldo, cliente);
        this.montoAutorizado = montoAutorizado;
    }

    public Double getMontoAutorizado() {
        return montoAutorizado;
    }

    public void setMontoAutorizado(Double montoAutorizado) {
        this.montoAutorizado = montoAutorizado;
    }

    @Override
    public Boolean extraerEfectivo(Double efectivo){
        Boolean puede = true;
        if((this.saldo + this.montoAutorizado) >= efectivo){
            this.saldo -= efectivo;
        }
        else {
            puede = false;
        }
        return puede;
    }

}

public class CajaAhorro extends Cuenta{
    private Double tasaInteres;

    public CajaAhorro(Double saldo, Cliente cliente, Double tasaInteres) {
        super(saldo, cliente);
        this.tasaInteres = tasaInteres;
    }

    public void setTasaInteres(Double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public Double cobrarInteres(){
        return saldo * tasaInteres;
    }

    @Override
    public Boolean extraerEfectivo(Double efectivo){
        Boolean puede = true;
        if(this.saldo >= efectivo){
            this.saldo -= efectivo;
        }
        else {
            puede = false;
        }
        return puede;
    }
}

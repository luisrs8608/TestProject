public class Cliente {
    private int numero;
    private String apellido;
    private int dni;
    private int cuit;

    public Cliente() {
        this.numero = 0;
        this.apellido = "";
        this.dni = 0;
        this.cuit = 0;
    }

    public Cliente(int numero, String apellido, int dni, int cuit) {
        this.numero = numero;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }

    //    Metodos


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }
}

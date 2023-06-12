public class Platinum extends TarjetaCredito {
    public String tipodetarjeta;
    public Platinum (String tipodetarjeta){
        this.tipodetarjeta = tipodetarjeta;

    }

    public String getTipodetarjeta() {
        return tipodetarjeta;
    }

    public void setTipodetarjeta(String tipodetarjeta) {
        this.tipodetarjeta = tipodetarjeta;
    }
}

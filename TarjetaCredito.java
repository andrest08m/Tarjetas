import java.time.LocalDate;

public class TarjetaCredito {

    private String emisor;
    private String visa;
    private String MasterCard;
    private String AmericanExpress;

    private long cupo;
    private String numerodeTarjeta;
    private Integer  cvv;
    private LocalDate fechaVencimiento;

    public TarjetaCredito() {}

    public TarjetaCredito(String emisor, long cupo, String numerodeTarjeta, Integer cvv, LocalDate fechaVencimiento) {
        this.emisor = emisor;


        this.cupo = cupo;

        this.cvv = cvv;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getVisa() {
        return visa;
    }

    public void setVisa(String visa) {
        this.visa = visa;
    }

    public String getMasterCard() {
        return MasterCard;
    }

    public void setMasterCard(String masterCard) {
        MasterCard = masterCard;
    }

    public String getAmericanExpress() {
        return AmericanExpress;
    }

    public void setAmericanExpress(String americanExpress) {
        AmericanExpress = americanExpress;
    }

    public long getCupo() {
        return cupo;
    }

    public void setCupo(long cupo) {
        this.cupo = cupo;
    }

    public String getNumerodeTarjeta() {
        return numerodeTarjeta;
    }

    public void setNumerodeTarjeta(String numerodeTarjeta) {
        this.numerodeTarjeta = numerodeTarjeta;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String imprimir(){
        return " el emisor es: "+emisor+ " el cupo es de: "+cupo+" el numero de la tarjeta de credito es de: "+numerodeTarjeta+" el cvv es: "+cvv+" la fecha de vencimiento es: "+fechaVencimiento;
    }



}

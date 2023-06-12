import java.time.LocalDate;
public class Maintarjeta {
    public static void main(String[] args) {

Clasica clasica1 = new Clasica("Clasica");
Dorada dorada1 = new Dorada("Dorada");
Platinum platinum1 = new Platinum("platinum");
Black black1 = new Black("black");

TarjetaCredito tarjeta1 = new TarjetaCredito("visa",2312432,"122334",9878,LocalDate.of(2025, 9, 11));
TarjetaCredito tarjeta2 = new TarjetaCredito("mastercard",43423423,"421233",2312,LocalDate.of(2012, 9, 21));
TarjetaCredito tarjeta3 = new TarjetaCredito("bancolombia",2433423,"34322",1234,LocalDate.of(2019, 5, 31));
TarjetaCredito tarjeta4 = new TarjetaCredito("american expres",2345254,"32545245",3234,LocalDate.of(2034, 3, 11));

        System.out.println(clasica1.getTipodetarjeta() + tarjeta1.imprimir() + "\n--------------------------------");
        System.out.println(dorada1.getTipodetarjeta() + tarjeta2.imprimir() + "\n--------------------------------");
        System.out.println(platinum1.getTipodetarjeta() + tarjeta3.imprimir() + "\n--------------------------------");
        System.out.println(black1.getTipodetarjeta() + tarjeta4.imprimir() + "\n--------------------------------");
    }
}

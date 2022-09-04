public class Main {
    public static void main(String[] args) {
        Fecha miCumple = new Fecha(2002,10,11);
        Fecha fecha2 = new Fecha(1997,10,11);
        boolean resultado = miCumple.esMenor(fecha2);
        System.out.println(resultado);
    }
}
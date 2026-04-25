public class PatoDeGoma extends Pato implements Cuaqueable, Volable {
    @Override
    public void mostrar() {
        System.out.println("Soy un Pato de Goma amarillo.");
    }

    @Override
    public void cuaquear() {
        System.out.println("(Chirrido)");
    }

    @Override
    public void volar() {
        System.out.println("No puedo volar, soy de goma"); 
    }
}
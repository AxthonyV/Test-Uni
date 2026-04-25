public class PatoCabezaRoja extends Pato implements Volable, Cuaqueable {
    @Override
    public void mostrar() {
        System.out.println("Soy un Pato Cabeza Roja");
    }
    @Override
    public void volar() {
        System.out.println("Puedo volar, ya que soy un pato real");
    }
    @Override
    public void cuaquear() {
        System.out.println("Cuac cuac");
    }
}
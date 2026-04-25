public class PatoReal extends Pato implements Volable, Cuaqueable {
    @Override
    public void mostrar() {
        System.out.println("Soy un Pato Real");
    }

    @Override
    public void volar() {
        System.out.println("Vuelo muy alto");
    }

    @Override
    public void cuaquear() {
        System.out.println("Cuac cuac");
    }
}
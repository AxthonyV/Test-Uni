public class PatoSenuelo extends Pato implements Volable, Cuaqueable {
    @Override
    public void mostrar() {
        System.out.println("Yo soy Pato señuelo");
    }

    @Override
    public void cuaquear() {
        System.out.println("<<Silencio>>");
    }

    @Override
    public void volar() {
        System.out.println("INCAPAZ DE VOLAR");
    }
}
public class SimUPato {
    public static void main(String[] args) {
        
        PatoReal patoReal = new PatoReal();
        PatoSenuelo patoSenuelo = new PatoSenuelo();
        PatoCabezaRoja patoCabezaRoja = new PatoCabezaRoja();
        PatoDeGoma patoDeGoma = new PatoDeGoma();

        System.out.println("Salida del Pato Real");
        patoReal.mostrar();
        patoReal.volar();
        patoReal.cuaquear();
        patoReal.nadar(); 

        System.out.println("\nSalida del Pato de Goma");
        patoDeGoma.mostrar();
        patoDeGoma.volar(); 
        patoDeGoma.cuaquear();

        System.out.println("\nSalida del Pato Señuelo");
        patoSenuelo.mostrar();
        patoSenuelo.nadar();

        System.out.println("\nSalida del Pato Cabeza Roja");
        patoCabezaRoja.mostrar();
        patoCabezaRoja.volar();
        patoCabezaRoja.cuaquear();
    }
}
public class SimUPato {
    public static void main(String[] args) {
        
        PatoReal patoReal = new PatoReal();
        PatoDeGoma patoDeGoma = new PatoDeGoma();
        PatoSenuelo patoSenuelo = new PatoSenuelo();
        PatoCabezaRoja patoCabezaRoja = new PatoCabezaRoja();

        patoReal.mostrar();
        patoReal.cuaquear();
        patoReal.volar();
        patoReal.nadar();
        System.out.println(); 

        patoDeGoma.mostrar();
        patoDeGoma.cuaquear();
        patoDeGoma.volar();
        patoDeGoma.nadar();
        System.out.println();

        patoSenuelo.mostrar();
        patoSenuelo.cuaquear();
        patoSenuelo.volar();
        patoSenuelo.nadar();
        System.out.println();

        patoCabezaRoja.mostrar();
        patoCabezaRoja.cuaquear();
        patoCabezaRoja.volar();
        patoCabezaRoja.nadar();
    }
}
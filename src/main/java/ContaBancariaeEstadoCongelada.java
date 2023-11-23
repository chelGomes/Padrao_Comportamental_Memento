public class ContaBancariaeEstadoCongelada implements ContaBancariaEstado{
    private ContaBancariaeEstadoCongelada() {};
    private static ContaBancariaeEstadoCongelada instance = new ContaBancariaeEstadoCongelada();
    public static ContaBancariaeEstadoCongelada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Congelada";
    }
}

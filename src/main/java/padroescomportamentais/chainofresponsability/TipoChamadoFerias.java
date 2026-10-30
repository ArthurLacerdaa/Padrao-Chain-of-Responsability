package padroescomportamentais.chainofresponsability;

public class TipoChamadoFerias implements TipoChamado {

    private static TipoChamadoFerias tipoChamadoFerias = new TipoChamadoFerias();

    private TipoChamadoFerias() {};

    public static TipoChamadoFerias getTipoChamadoFerias() {
        return tipoChamadoFerias;
    }
}

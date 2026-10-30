package padroescomportamentais.chainofresponsability;

public class TipoChamadoInfraestrutura implements TipoChamado {

    private static TipoChamadoInfraestrutura tipoChamadoInfraestrutura = new TipoChamadoInfraestrutura();

    private TipoChamadoInfraestrutura() {};

    public static TipoChamadoInfraestrutura getTipoChamadoInfraestrutura() {
        return tipoChamadoInfraestrutura;
    }
}

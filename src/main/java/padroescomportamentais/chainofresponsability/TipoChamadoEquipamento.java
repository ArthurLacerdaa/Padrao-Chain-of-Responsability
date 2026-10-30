package padroescomportamentais.chainofresponsability;

public class TipoChamadoEquipamento implements TipoChamado {

    private static TipoChamadoEquipamento tipoChamadoEquipamento = new TipoChamadoEquipamento();

    private TipoChamadoEquipamento() {};

    public static TipoChamadoEquipamento getTipoChamadoEquipamento() {
        return tipoChamadoEquipamento;
    }
}

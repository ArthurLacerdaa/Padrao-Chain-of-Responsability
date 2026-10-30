package padroescomportamentais.chainofresponsability;

public class FuncionarioTecnico extends Funcionario {

    public FuncionarioTecnico(Funcionario superior) {
        listaChamados.add(TipoChamadoSoftware.getTipoChamadoSoftware());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Tecnico";
    }
}

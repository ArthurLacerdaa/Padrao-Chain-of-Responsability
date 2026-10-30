package padroescomportamentais.chainofresponsability;

public class FuncionarioSupervisor extends Funcionario {

    public FuncionarioSupervisor(Funcionario superior) {
        listaChamados.add(TipoChamadoEquipamento.getTipoChamadoEquipamento());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Supervisor";
    }

}

package padroescomportamentais.chainofresponsability;

public class FuncionarioAtendente extends Funcionario {

    public FuncionarioAtendente(Funcionario superior) {
        listaChamados.add(TipoChamadoSenha.getTipoChamadoSenha());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Atendente";
    }

}

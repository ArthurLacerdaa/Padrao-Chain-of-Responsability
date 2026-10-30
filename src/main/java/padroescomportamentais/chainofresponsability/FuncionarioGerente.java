package padroescomportamentais.chainofresponsability;

public class FuncionarioGerente extends Funcionario {

    public FuncionarioGerente(Funcionario superior) {
        listaChamados.add(TipoChamadoInfraestrutura.getTipoChamadoInfraestrutura());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }

}

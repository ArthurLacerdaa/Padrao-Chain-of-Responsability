package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList listaChamados = new ArrayList();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String atenderChamado(Chamado chamado) {
        if (listaChamados.contains(chamado.getTipoChamado())) {
            return getDescricaoCargo();
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.atenderChamado(chamado);
            }
            else
            {
                return "Sem atendimento";
            }
        }
    }
}

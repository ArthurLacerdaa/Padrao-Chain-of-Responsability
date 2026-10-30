package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChamadoTest {

    FuncionarioGerente gerente;
    FuncionarioSupervisor supervisor;
    FuncionarioTecnico tecnico;
    FuncionarioAtendente atendente;

    @BeforeEach
    void setUp() {
        gerente = new FuncionarioGerente(null);
        supervisor = new FuncionarioSupervisor(gerente);
        tecnico = new FuncionarioTecnico(supervisor);
        atendente = new FuncionarioAtendente(tecnico);
    }

    @Test
    void deveRetornarAtendenteParaAtendimentoSenha() {
        assertEquals("Atendente", atendente.atenderChamado(new Chamado(TipoChamadoSenha.getTipoChamadoSenha())));
    }

    @Test
    void deveRetornarTecnicoParaAtendimentoSoftware() {
        assertEquals("Tecnico", atendente.atenderChamado(new Chamado(TipoChamadoSoftware.getTipoChamadoSoftware())));
    }

    @Test
    void deveRetornarSupervisorParaAtendimentoEquipamento() {
        assertEquals("Supervisor", atendente.atenderChamado(new Chamado(TipoChamadoEquipamento.getTipoChamadoEquipamento())));
    }

    @Test
    void deveRetornarGerenteParaAtendimentoInfraestrutura() {
        assertEquals("Gerente", atendente.atenderChamado(new Chamado(TipoChamadoInfraestrutura.getTipoChamadoInfraestrutura())));
    }

    @Test
    void deveRetornarSemAtendimentoParaAtendimentoFerias() {
        assertEquals("Sem atendimento", atendente.atenderChamado(new Chamado(TipoChamadoFerias.getTipoChamadoFerias())));
    }

}

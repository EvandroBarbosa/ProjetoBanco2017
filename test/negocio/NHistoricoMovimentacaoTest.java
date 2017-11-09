package negocio;

import entidade.EContaCorrente;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import persistencia.PHistoricoMovimentacao;

/**
 *
 * @author aluno
 */
public class NHistoricoMovimentacaoTest {
    
    public NHistoricoMovimentacaoTest() {
    }

    /**
     * Test of registrar method, of class NHistoricoMovimentacao.
     */
    @Test
    public void testRegistrar() {
        System.out.println("Teste registrar a movimentação de uma conta corrente");
        EContaCorrente conta = new EContaCorrente();
        
        PHistoricoMovimentacao persistencia = Mockito.mock(PHistoricoMovimentacao.class);
        NHistoricoMovimentacao instance = new NHistoricoMovimentacao(persistencia);
        
        when(persistencia.registrarHistorico(conta)).thenReturn(true);
        
        boolean expResult = true;
        boolean result = instance.registrar(conta);
        assertEquals(expResult, result);
      
    }
    
}

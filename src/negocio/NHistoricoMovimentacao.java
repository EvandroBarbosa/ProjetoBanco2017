package negocio;

import entidade.EContaCorrente;
import persistencia.PHistoricoMovimentacao;

/**
 *
 * @author Evandro
 */
public class NHistoricoMovimentacao {
    
    PHistoricoMovimentacao persistencia;

    //Construtor
    public NHistoricoMovimentacao(PHistoricoMovimentacao persistencia) {
        this.persistencia = persistencia;
    }    
    
    public boolean registrar(EContaCorrente conta){
        return persistencia.registrarHistorico(conta);
    }
    
}

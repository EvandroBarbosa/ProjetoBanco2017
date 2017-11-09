package negocio;

import entidade.EContaCorrente;

/**
 *
 * @author aluno
 */
public class NContaCorrente {
    
    EContaCorrente ec = new EContaCorrente();
    
    public Double depositar(Double valor){
         ec.setSaldoAtual(ec.getSaldoAtual()+valor);  
         return ec.getSaldoAtual();
    }
}

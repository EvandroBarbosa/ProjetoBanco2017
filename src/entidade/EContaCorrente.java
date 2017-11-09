package entidade;

/**
 *
 * @author aluno
 */
public class EContaCorrente {
    private Double saldoAtual = 0.0;

    public EContaCorrente() {
    }
    
    public EContaCorrente(Double saldoAtual){
        this.saldoAtual = saldoAtual;
    }
    public Double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(Double saldoAtual) {
    if(saldoAtual == null)
        throw new IllegalArgumentException("Não é era permitido isso");
        
        this.saldoAtual = saldoAtual;
    }
    
    
    
}

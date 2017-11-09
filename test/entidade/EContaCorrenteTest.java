package entidade;

import negocio.NContaCorrente;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class EContaCorrenteTest {
    
    public EContaCorrenteTest() {
    }

    /**
     * Test of getSaldoAtual method, of class EContaCorrente.
     */
    @Test
    public void casoDeTeste01() {
        System.out.println("Teste01 - Criar uma conta com o saldo igual a 0 ");
        EContaCorrente instance = new EContaCorrente();
        Double expResult = new Double(0);        
        Double result = instance.getSaldoAtual();
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of getSaldoAtual method, of class EContaCorrente.
     */
    @Test(expected = IllegalArgumentException.class)
    public void casoDeTeste02() {
        System.out.println("Teste02 - Criar uma conta com o saldo igual a nulo ");
        EContaCorrente instance = new EContaCorrente();
        instance.setSaldoAtual(null);
        
        fail("Era esperado uma exceção. Teste falhou");
    }
    
    @Test
    public void casoDeTeste03() {
        System.out.println("Teste03 - Criar uma conta com o saldo igual a 10 ");
        EContaCorrente instance = new EContaCorrente(10.0);
        Double expResult = 10.0;        
        Double result = instance.getSaldoAtual();
        assertEquals(expResult, result);        
    }
    
    @Test
    public void casoDeTeste04() {
        System.out.println("Teste04 - Criar uma conta com o saldo igual a 15 ");
        EContaCorrente instance = new EContaCorrente(15.0);
        Double expResult = 15.0;        
        Double result = instance.getSaldoAtual();
        assertEquals(expResult, result);        
    }
    
    @Test
    public void casoDeTeste05() {
        System.out.println("Teste05 - O Operador deverá solicitar o depósito do valor 30 "
                            + "numa conta criada anteriormente com o saldo inicial de 10");
        NContaCorrente instance = new NContaCorrente();
        Double result = instance.depositar(30.0);
        Double expResult = 40.0;        
        assertEquals(expResult, result);        
    }
    
    @Test
    public void casoDeTeste06() {
        System.out.println("Teste05 - O Operador deverá solicitar o depósito do valor 10 "
                            + "numa conta criada anteriormente com o saldo inicial de 0");
        NContaCorrente instance = new NContaCorrente();
        Double result = instance.depositar(10.0);
        Double expResult = 10.0;        
        assertEquals(expResult, result);        
    }
}

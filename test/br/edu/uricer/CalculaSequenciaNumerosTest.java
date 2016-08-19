package br.edu.uricer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class CalculaSequenciaNumerosTest {
    
    int[] valores = {6, 9, 15, -2, 92, 11};
    
    @Test
    public void TestaNumeroMinimo(){
        CalculaSequenciaNumeros calcular = new CalculaSequenciaNumeros(valores);
        
        assertEquals(-2, calcular.valorMinimo());
    }
    
}

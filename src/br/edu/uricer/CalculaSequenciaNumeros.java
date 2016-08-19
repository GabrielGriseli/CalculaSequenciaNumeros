package br.edu.uricer;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 *
 * @author aluno
 */
public class CalculaSequenciaNumeros {
    
    private List<Integer> lista = new ArrayList<Integer>();

    public CalculaSequenciaNumeros(int[] valores) {
        for (int i: valores)
            lista.add(i);
    }
    
    public int valorMinimo(){
        return Collections.min(lista);
    }
    
    public int valorMaximo(){
        return Collections.max(lista);
    }
    
    public int numeroDeElementos(){
        return lista.size();
    }
    
    public double valorMedio(){
        
        int soma = 0;
        for (int i : lista)
            soma += i;
        
        return soma / (double)numeroDeElementos();
    }
}

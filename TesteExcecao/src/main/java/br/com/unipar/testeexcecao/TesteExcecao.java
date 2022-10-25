package br.com.unipar.testeexcecao;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author andersonbosing
 */
public class TesteExcecao {

    public static void main(String[] args) {
        
        try {
            Calculadora calc  = new Calculadora();
            calc.setNum1(10.0);
            calc.setNum2(0.0);
            
            calc.divisao();
        } catch (ErroDivisao ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}

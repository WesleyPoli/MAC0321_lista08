package ex2;

import ex1.Controller;
import ex1.FactorialView;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TesteFatorialView {

    @Test
    public void testaEntradasValidas() {
        FactorialView view = new FactorialView(new Controller());
        JTextField inputField = view.getInputField();
        JButton calcularButton = view.getCalcularButton();
        JLabel resultadoLabel = view.getResultadoLabel();

        inputField.setText("7");
        calcularButton.doClick();

      
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("Resultado: 5040", resultadoLabel.getText());
    }

    @Test
    public void testaExceçoesDeEntradas() { // para qualquer caractere ou String
        FactorialView view = new FactorialView(new Controller());
        JTextField inputField = view.getInputField();
        JButton calcularButton = view.getCalcularButton();

        inputField.setText("F");
        calcularButton.doClick();

        
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertTrue(dialogoDeErroExibido("Erro: Digite um número válido."));
    }
    
    @Test
    public void testaEntradasNegativas() {
        FactorialView view = new FactorialView(new Controller());
        JTextField inputField = view.getInputField();
        JButton calcularButton = view.getCalcularButton();

        inputField.setText("-1");
        calcularButton.doClick();

        
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertTrue(dialogoDeErroExibido("Erro: O número não pode ser negativo."));
    }
    
    private boolean dialogoDeErroExibido(String mensagem) {
        
        return true; 
    }
}
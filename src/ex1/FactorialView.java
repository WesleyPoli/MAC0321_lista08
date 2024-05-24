package ex1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialView extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField inputField;
    private JButton calcularButton;
    private JLabel resultadoLabel;
    private Controller controller;

    public FactorialView(Controller controller) {
        this.controller = controller;
        initUI();
    }
    public JButton getCalcularButton() {
    	return calcularButton;
    }
    
    public JLabel getResultadoLabel() {
    	return resultadoLabel;
    }
    
    public JTextField getInputField() {
    	return inputField;
    }
    
    private void initUI() {
        setTitle("Calculadora de Fatorial");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel inputLabel = new JLabel("Digite um número:");
        inputLabel.setBounds(20, 20, 150, 25);
        add(inputLabel);

        inputField = new JTextField();
        inputField.setBounds(150, 20, 100, 25);
        add(inputField);

        calcularButton = new JButton("Calcular");
        calcularButton.setBounds(20, 60, 230, 25);
        add(calcularButton);

        resultadoLabel = new JLabel("Resultado: ");
        resultadoLabel.setBounds(20, 100, 230, 25);
        add(resultadoLabel);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularFatorial();
            }
        });
    }

    private void calcularFatorial() {
        try {
            int numero = Integer.parseInt(inputField.getText());
            int resultado = controller.calculaFatorial(numero);
            resultadoLabel.setText("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um número válido.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro inesperado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Controller controller = new Controller();
                FactorialView view = new FactorialView(controller);
                view.setVisible(true);
            }
        });
    }
}
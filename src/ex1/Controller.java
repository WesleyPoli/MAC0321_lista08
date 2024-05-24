package ex1;

public class Controller {
    public int calculaFatorial(int numero) throws IllegalArgumentException {
    	if (numero < 0) {
            throw new IllegalArgumentException("O número não deve ser negativo.");
        }
        if (numero == 0) {
            return 1;
        } else {
            return numero * calculaFatorial(numero - 1);
        }
    }
}

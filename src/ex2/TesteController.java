package ex2;

import ex1.Controller;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import  org.junit.jupiter.api.Test;


public class TesteController {
	Controller controller = new Controller();
	
	@Test
	public void TestaCalculaFatorial() {
		assertThrows(IllegalArgumentException.class, () -> {controller.calculaFatorial(-2);});
		assertEquals(1, controller.calculaFatorial(0));
		assertEquals(5040, controller.calculaFatorial(7));
		
		
	}
}

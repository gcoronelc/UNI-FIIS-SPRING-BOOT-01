package pe.edu.uni.calculadora.service;

import org.springframework.stereotype.Service;

@Service
public class MateService {

	public int sumar(int numero1, int numero2) {
		return (numero1 + numero2);
	}

	public int restar(int numero1, int numero2) {
		return (numero1 - numero2);
	}

	public int multiplicar(int numero1, int numero2) {
		return (numero1 * numero2);
	}

	public int dividir(int numero1, int numero2) {
		return (numero1 / numero2);
	}
}

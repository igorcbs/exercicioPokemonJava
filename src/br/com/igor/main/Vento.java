package br.com.igor.main;

import java.util.Random;
/**
 * A classe Vento administra o tipo de Pokemon 
 * @author igor
 *
 */
public class Vento extends Pokemons{
	
	/**
	 * Construtor que recebe nome, tipo, nivel e experiencia do pokemon pela caixa de texto
	 * @param nome
	 * @param tipo
	 * @param nivel
	 * @param exp
	 */
	public Vento(String nome, int tipo, int nivel) {
		super(nome, tipo, nivel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean chanceDeCapturar() {
		// TODO Auto-generated method stub
		double aux = 0.0;
		for(int i = 0; i < 3; i++) {
			aux = random(0.0, 100.0);
			
		}
		if(aux >= 20.0) {
			return true;
		}else {
			return false;
		}
		
	}
	/**
	 * O método random randomiza um numero recenbendo dois numero como parametro
	 * @param min
	 * @param max
	 * @return o numero escolhido no metodo randomico
	 */
	public static double random(double min, double max) {
		Random random = new Random();
		
		double aux = max - min;
		double scaled = random.nextDouble() * aux;
		double shifted = scaled + min;
		double finalValue = Math.round(shifted * 100.0) / 100.00;
		
		return finalValue;		
		
	}
	
}

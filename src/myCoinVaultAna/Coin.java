package myCoinVaultAna;

import java.util.Objects;

//the abstract class is used as a base for others, that is, the others will inherit from this one below
public abstract class Coin {

	protected double value;
	protected String type; 
	
	
	protected Coin(double value, String type) {
		this.value = value;
		this.type = type;
	}
		
		public double getValue() {
			return value;
		}
		public void setValor(double value) {
			this.value = value;
			
			
		}
		//retornar valor da moeda convertida
		abstract double converter();
		//para poder testar ao depurar
		public void info() {
			System.out.println("-------------");
			System.out.println("Coin: " + type);
			System.out.println("Value: " + getValue());
			System.out.println("-------------");
		}
		public static void coinMenu () {
			
			
		}
}

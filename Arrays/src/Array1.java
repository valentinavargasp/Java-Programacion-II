
public class Array1 {

	int [] numeros = new int[5]; 
	
	// [0,1,2,3,4] bidimensional
	
	public void imprimir() {
		for(int i = 0; i < numeros.length; i++) {
			 System.out.println(i+ "--" + numeros[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Array1 c = new Array1();
		c.imprimir();
		c.numeros[4]=100;
		c.imprimir();

	}

}

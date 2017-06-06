package berlot.certificacion.arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arrays.arraysMulti();
		
	}

	public static void arraysMulti(){
		
		//Mientras se incluya cuerpo o argumentos con objetos dentro del array no se puede declarar el tamaño
		String[][] array= new String[][]{{"a","b"},{"",""}};
		
		//Como no se agregó ningún objeto dentro de la misma linea de creación del array entonces se debe declarar el tamaño.
		int[] i= new int[3];
			  i[0]= 1;
			  i[1]= 2;
			  i[2]= 3;
			  
			 System.out.println("Array simple: "+i[2]);
		
			 
		/*Array multidimensional donde se declaran la cantidad de elementos de C/U. Atención se están sobre_escribiendo uno
		 *uno arriba del otro, seguramente G.C se lleva el valor anterior por automáticamente se convierte en null.
		 */	 
		int[] i2[]= new int[2][2];
			 
			 i2[0][0]= 1;
			 i2[0][0]= 2;
			 i2[0][0]= 3;
			 i2[0][0]= 5;
			 i2[0][1]=6;
			 
			 System.out.println("Array multidimensional: "+i2[0][0]+ ", "+ i2[0][1]);
		
			 
		/*Si sólo se declara en la misma linea, luego es obligatorio el uso de 'new'.
		 *  
		 */
		String[] array2;
			 
			 array2= new String[]{};
			 
			 
		/* Acá se declaró e inicializó en la misma linea, nótese que no se declara el
		 * tamaño del mismo. Array simple.	 
		 */
		int array3[]={1,2,3};
			 
		/* Array multidimensional con 'objetos' null, los mismos son válidos, los objetos multidimensionales
		 * se toman por posiciones por ejemplo: array[1][0], se espera imprimir al segundo elemento y su primera
		 * pisición, n o es lo mismo el declarar el tamaño que llamar al elemento, cuando se declara el tamaño se
		 * lo declara como el número entero sin restarle uno, sin embargo cuando llamamos a un elemento del array
		 * debemos '-1' ya que empieza a contar desde '0'.
		 * 
		 */
		int[] threeArray[]= new int[][]{{1,2},{3,4},null,{5,6},null};
			 
			 
			 		System.out.println(threeArray[0][1]+" "+threeArray[1][0]+" "+threeArray[3][0]);
			 		System.out.print(threeArray.length);
			 
			
	}
	
}

//Sergio Yo yo no   5 6 56 56 5 
public class HMJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo IDE :)");

		// Enteros
		byte edad = 127;
		short year = -32768;
		int id_user = 1001;
		long id_twitter = 12345678923456789L;

		// Punto Flotante
		float diametro = 34.25F;
		double precio = 12345.2345678923456723456234;

		// Texto
		char genero = 'M';

		// Logico
		boolean isVisible = true;
		boolean funciona = false;

		int variable = 2;
		int _variable = 3;
		int $variable = 4;
		int variable1 = 5;

		// Constantes
		int VALOR = 0;
		int VALOR_MAXIMO = 1;

		// Lower Camel Case
		int minValor = 4;

		byte b = 6;
		short s = b;

		b = (byte) s;

		int i = 1;
		double d = 2.8;
		i = (int) d;

		int codigo = 97;
		char codigoASCII = (char) codigo;

		short numero = 300;
		byte numeroByte = (byte) numero;

		// Arrays
		// Declaración de array

		int[] arregloInt = new int[2];
		double arregloDouble[];

		int[][] array2D = new int[2][3];// caben 6 cupcakes
		int[][][] array3D = new int[3][3][2]; // caben 18 cokies
		// int[][][][] array4D = new int[1][2][3][4];

		char[][] days = { { 'M', 'T', 'W' }, { 'M', 'T', 'W' } };

		char[][][] letters = { { { 'a', 'b' }, { 'a', 'b' }, { 'a', 'b' } },
				{ { 'a', 'b' }, { 'a', 'b' }, { 'a', 'b' } } };

		char[] names = new char[4];
		names[0] = 'h';
		names[1] = 'o';
		names[2] = 'l';
		names[3] = 'a';
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);

		char[][][][] monkey = new char[2][3][2][2];
		monkey[1][0][0][1] = 'm';
		// System.out.println(monkey[1][0][0][1]);

		// Operadores Aritméticos
		int a = 1;
		int aa = a + a;
		// System.out.println("el valor de aa: " + aa);

		double x = 2.56;
		int y = 9;
		float w = (float) x + y;
		// System.out.println(w);

		// System.out.println(w*2);

		double k = 4 / 0.00002;
		// System.out.println(k);

		// System.out.println(7%2);

		double f = 2;
		int g = 3;
		// f = f + g;
		// f += g;
		// f -= g;
		// f -*= g;
		// f /= g;
		f %= g;
		// System.out.println(f);

		int l = 3;

		// ++l;
		// l++;
		// System.out.println(l);

		// ++l
		// 1. Incrementar el valor l+1
		// 2. Asignar el valor a l
		// System.out.println(++l);

		// l++
		// 1. Asignar el valor a l l=l
		// 2. Incrementar el valor l+1
		// System.out.println(l++);
		// System.out.println(l);//4

		// Operadores equidad

		int q = 8;
		int p = 5;
		System.out.println(q == p);
		System.out.println(q != p);

		// Operadores relacionales
		System.out.println("q > p ->" + (q > p));
		System.out.println("q < p ->" + (q < p));

		System.out.println("q >= p ->" + (q >= p));
		System.out.println("q <= p ->" + (q <= p));

		// Operadores lógicos
		boolean n = false;
		boolean m = true;

		System.out.println("n && m -> " + (n && m));
		System.out.println("n || m -> " + (n || m));
		System.out.println("!n -> " + (!n));
		System.out.println("!m -> " + (!m));

	}
}

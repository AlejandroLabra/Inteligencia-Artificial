package perceptron;

public class perceptron {

	public static void main(String[] args) {

		// Ejemplo de perceptron multicapa.

		// x1 = Entrada, x2= Entrada 2, t=Salida

		// x1 x2 t
		// -1 -1 --> -1
		// -1 1 --> 1
		// 1 -1 --> 1
		// 1 1 --> -1

		// Variables de entrada.
		double x1;
		double x2;

		// Variables de salida.
		double y1;
		double y2;
		double y3;

		// Pesos sinápticos.
		double w1 = 2.30; // Peso1
		double w2 = -1.93;
		double o1 = 1.75; // Umbral1

		double w21 = 0.95; // Peso2
		double w22 = 1.42;
		double o2 = 1.68; // Umbral2

		double w31 = -0.62; // Peso3
		double w32 = 0.86;
		double o3 = -0.34; // Umbral3

		x1 = -1;
		x2 = -1;

		y1 = Math.tanh((x1 * w1) + (x2 * w2) + (1 * o1));
		y2 = Math.tanh((x1 * w21) + (x2 * w22) + (1 * o2));
		y3 = Math.tanh((y1 * w31) + (y2 * w32) + (1 * o3)); // Salida
		System.out.println("Salida 1: " + y3);

		x1 = -1;
		x2 = 1;

		y1 = Math.tanh((x1 * w1) + (x2 * w2) + (1 * o1));
		y2 = Math.tanh((x1 * w21) + (x2 * w22) + (1 * o2));
		y3 = Math.tanh((y1 * w31) + (y2 * w32) + (1 * o3)); // Salida
		System.out.println("Salida 2: " + y3);

		x1 = 1;
		x2 = -1;

		y1 = Math.tanh((x1 * w1) + (x2 * w2) + (1 * o1));
		y2 = Math.tanh((x1 * w21) + (x2 * w22) + (1 * o2));
		y3 = Math.tanh((y1 * w31) + (y2 * w32) + (1 * o3)); // Salida
		System.out.println("Salida 3: " + y3);

		x1 = 1;
		x2 = 1;

		y1 = Math.tanh((x1 * w1) + (x2 * w2) + (1 * o1));
		y2 = Math.tanh((x1 * w21) + (x2 * w22) + (1 * o2));
		y3 = Math.tanh((y1 * w31) + (y2 * w32) + (1 * o3)); // Salida
		System.out.println("Salida 4: " + y3);

	}
}
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("=== Calculadora en funcionamiento ===");

        // Probar operaciones básicas
        calc.sumar(10, 5);
        calc.restar(20, 7);
        calc.multiplicar(4, 3);
        calc.dividir(24, 6);

        // Probar operaciones avanzadas
        calc.porcentaje(30, 150);
        calc.raizCuadrada(25);

        System.out.println("=== Programa terminado ===");
    }
}
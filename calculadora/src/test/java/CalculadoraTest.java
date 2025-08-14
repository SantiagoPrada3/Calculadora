import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    // Variable para almacenar la instancia de Calculadora
    Calculadora calc;

    // Este método se ejecuta ANTES de cada prueba (@Test)
    @BeforeEach
    void setup() {
        System.out.println("Iniciando prueba...");
        // Creamos una nueva instancia de la calculadora antes de cada prueba
        calc = new Calculadora();
    }

    // Este método se ejecuta DESPUÉS de cada prueba (@Test)
    @AfterEach
    void cleanup() {
        System.out.println("Prueba finalizada!");
    }

    // Prueba unitaria para el método sumar
    @Test
    void testSumar() {
        System.out.println("Ejecutando testSumar...");
        int resultado = calc.sumar(3, 4);
        System.out.println("Resultado: " + resultado);
        assertEquals(7, resultado, "La suma debe ser 7");
    }

    // Prueba unitaria para el método dividir
    @Test
    void testDividir() {
        System.out.println("Ejecutando testDividir...");
        int resultado = calc.dividir(12, 4);
        System.out.println("Resultado: " + resultado);
        assertEquals(3, resultado, "La división debe ser 3");
    }

    // Prueba para división por cero
    @Test
    void testDividirPorCero() {
        System.out.println("Ejecutando testDividirPorCero...");
        System.out.println("Probando división por cero - se espera ArithmeticException");
        assertThrows(ArithmeticException.class, () -> {
            calc.dividir(10, 0);
        }, "División por cero debe lanzar ArithmeticException");
    }

    // Pruebas para el método restar
    @Test
    void testRestar() {
        System.out.println("Ejecutando testRestar...");
        System.out.println("Probando resta normal: 10 - 3");
        int resultado = calc.restar(10, 3);
        System.out.println("Esperado: 7, Obtenido: " + resultado);
        assertEquals(7, resultado, "La resta debe ser 7");
    }

    @Test
    void testRestarNumerosNegativos() {
        System.out.println("Ejecutando testRestarNumerosNegativos...");
        System.out.println("Probando resta con números negativos: -5 - (-3)");
        int resultado = calc.restar(-5, -3);
        System.out.println("Esperado: -2, Obtenido: " + resultado);
        assertEquals(-2, resultado, "La resta de negativos debe ser -2");
    }

    // Pruebas para el método multiplicar
    @Test
    void testMultiplicar() {
        System.out.println("Ejecutando testMultiplicar...");
        System.out.println("Probando multiplicación normal: 4 * 5");
        int resultado = calc.multiplicar(4, 5);
        System.out.println("Esperado: 20, Obtenido: " + resultado);
        assertEquals(20, resultado, "La multiplicación debe ser 20");
    }

    @Test
    void testMultiplicarPorCero() {
        System.out.println("Ejecutando testMultiplicarPorCero...");
        System.out.println("Probando multiplicación por cero: 7 * 0");
        int resultado = calc.multiplicar(7, 0);
        System.out.println("Esperado: 0, Obtenido: " + resultado);
        assertEquals(0, resultado, "Multiplicar por cero debe ser 0");
    }

    @Test
    void testMultiplicarNegativos() {
        System.out.println("Ejecutando testMultiplicarNegativos...");
        System.out.println("Probando multiplicación de negativos: -3 * -4");
        int resultado = calc.multiplicar(-3, -4);
        System.out.println("Esperado: 12, Obtenido: " + resultado);
        assertEquals(12, resultado, "Multiplicar negativos debe ser 12");
    }

    // Pruebas para el método porcentaje
    @Test
    void testPorcentaje() {
        System.out.println("Ejecutando testPorcentaje...");
        System.out.println("Probando porcentaje normal: 25 de 100");
        double resultado = calc.porcentaje(25, 100);
        System.out.println("Esperado: 25.0, Obtenido: " + resultado);
        assertEquals(25.0, resultado, 0.001, "El porcentaje debe ser 25");
    }

    @Test
    void testPorcentajeTotalCero() {
        System.out.println("Ejecutando testPorcentajeTotalCero...");
        System.out.println("Probando porcentaje con total = 0 - se espera ArithmeticException");
        assertThrows(ArithmeticException.class, () -> {
            calc.porcentaje(50, 0);
        }, "Porcentaje con total 0 debe lanzar ArithmeticException");
    }

    // Pruebas para el método raizCuadrada (Extra Challenge)
    @Test
    void testRaizCuadrada() {
        System.out.println("Ejecutando testRaizCuadrada...");
        System.out.println("Probando raíz cuadrada normal: √16");
        double resultado = calc.raizCuadrada(16.0);
        System.out.println("Esperado: 4.0, Obtenido: " + resultado);
        assertEquals(4.0, resultado, 0.001, "La raíz cuadrada de 16 debe ser 4");
    }

    @Test
    void testRaizCuadradaNumeroNegativo() {
        System.out.println("Ejecutando testRaizCuadradaNumeroNegativo...");
        System.out.println("Probando raíz cuadrada de número negativo - se espera IllegalArgumentException");
        assertThrows(IllegalArgumentException.class, () -> {
            calc.raizCuadrada(-4.0);
        }, "Raíz cuadrada de número negativo debe lanzar IllegalArgumentException");
    }

}

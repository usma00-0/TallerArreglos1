package umanizales.edu.co.controller;

import umanizales.edu.co.model.Estudiante;
import umanizales.edu.co.service.EncuestaService;
import java.util.Scanner;

public class EncuestaController {
    private EncuestaService encuestaService;
    private Scanner scanner;

    public EncuestaController() {
        this.encuestaService = new EncuestaService();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("SISTEMA DE ENCUESTA ESTUDIANTIL");
        System.out.println("==============================\n");

        System.out.print("Ingrese la cantidad de estudiantes a encuestar (máximo 50): ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        if (cantidad <= 0 || cantidad > 50) {
            System.out.println("Cantidad inválida. Debe ser un número entre 1 y 50.");
            return;
        }

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nEstudiante #" + (i + 1));
            System.out.print("Cédula: ");
            String cedula = scanner.nextLine();

            System.out.print("Sexo (1 - Masculino, 2 - Femenino): ");
            int sexo = scanner.nextInt();
            while (sexo != 1 && sexo != 2) {
                System.out.print("Opción inválida. Ingrese 1 para Masculino o 2 para Femenino: ");
                sexo = scanner.nextInt();
            }

            System.out.print("¿Trabaja? (1 - Sí, 2 - No): ");
            int trabaja = scanner.nextInt();
            while (trabaja != 1 && trabaja != 2) {
                System.out.print("Opción inválida. Ingrese 1 para Sí o 2 para No: ");
                trabaja = scanner.nextInt();
            }

            int sueldo = 0;
            if (trabaja == 1) {
                System.out.print("Sueldo: ");
                sueldo = scanner.nextInt();
                while (sueldo <= 0) {
                    System.out.print("El sueldo debe ser mayor a 0. Ingrese nuevamente: ");
                    sueldo = scanner.nextInt();
                }
            }
            scanner.nextLine(); // Limpiar buffer

            Estudiante estudiante = new Estudiante(cedula, sexo, trabaja, sueldo);
            encuestaService.agregarEstudiante(estudiante);
        }

        mostrarResultados();
    }

    private void mostrarResultados() {
        System.out.println("\n=== RESULTADOS DE LA ENCUESTA ===");
        
        System.out.printf("\nPorcentaje de hombres en la universidad: %.2f%%", 
            encuestaService.calcularPorcentajeHombres());
        
        System.out.printf("\nPorcentaje de mujeres en la universidad: %.2f%%", 
            encuestaService.calcularPorcentajeMujeres());
        
        double[] estadisticasHombres = encuestaService.calcularEstadisticasHombresTrabajan();
        System.out.printf("\n\nHombres que trabajan: %.2f%%", estadisticasHombres[0]);
        System.out.printf("\nSueldo promedio de hombres que trabajan: $%,.2f", estadisticasHombres[1]);
        
        double[] estadisticasMujeres = encuestaService.calcularEstadisticasMujeresTrabajan();
        System.out.printf("\n\nMujeres que trabajan: %.2f%%", estadisticasMujeres[0]);
        System.out.printf("\nSueldo promedio de mujeres que trabajan: $%,.2f\n", estadisticasMujeres[1]);
    }
}

package umanizales.edu.co.service;

import umanizales.edu.co.model.Estudiante;

public class EncuestaService {
    private Estudiante[] estudiantes;
    private int cantidadEstudiantes;
    private static final int MAX_ESTUDIANTES = 50;

    public EncuestaService() {
        this.estudiantes = new Estudiante[MAX_ESTUDIANTES];
        this.cantidadEstudiantes = 0;
    }

    public boolean agregarEstudiante(Estudiante estudiante) {
        if (cantidadEstudiantes < MAX_ESTUDIANTES) {
            estudiantes[cantidadEstudiantes] = estudiante;
            cantidadEstudiantes++;
            return true;
        }
        return false;
    }

    public double calcularPorcentajeHombres() {
        if (cantidadEstudiantes == 0) return 0;
        int contador = 0;
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].getSexo() == 1) {
                contador++;
            }
        }
        return (contador * 100.0) / cantidadEstudiantes;
    }

    public double calcularPorcentajeMujeres() {
        if (cantidadEstudiantes == 0) return 0;
        int contador = 0;
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].getSexo() == 2) {
                contador++;
            }
        }
        return (contador * 100.0) / cantidadEstudiantes;
    }

    public double[] calcularEstadisticasHombresTrabajan() {
        int totalHombres = 0;
        int hombresQueTrabajan = 0;
        int sumaSueldos = 0;
        
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].getSexo() == 1) {
                totalHombres++;
                if (estudiantes[i].getTrabaja() == 1) {
                    hombresQueTrabajan++;
                    sumaSueldos += estudiantes[i].getSueldo();
                }
            }
        }
        
        double porcentaje = totalHombres > 0 ? (hombresQueTrabajan * 100.0) / totalHombres : 0;
        double promedio = hombresQueTrabajan > 0 ? (double) sumaSueldos / hombresQueTrabajan : 0;
        
        return new double[]{porcentaje, promedio};
    }

    public double[] calcularEstadisticasMujeresTrabajan() {
        int totalMujeres = 0;
        int mujeresQueTrabajan = 0;
        int sumaSueldos = 0;
        
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].getSexo() == 2) {
                totalMujeres++;
                if (estudiantes[i].getTrabaja() == 1) {
                    mujeresQueTrabajan++;
                    sumaSueldos += estudiantes[i].getSueldo();
                }
            }
        }
        
        double porcentaje = totalMujeres > 0 ? (mujeresQueTrabajan * 100.0) / totalMujeres : 0;
        double promedio = mujeresQueTrabajan > 0 ? (double) sumaSueldos / mujeresQueTrabajan : 0;
        
        return new double[]{porcentaje, promedio};
    }
}

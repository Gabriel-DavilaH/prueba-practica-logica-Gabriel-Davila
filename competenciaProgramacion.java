import java.util.Scanner;

public class competenciaProgramacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double reto1, reto2, reto3;
        int errores, tiempo;
        String desafioExtra, descalificado;
        double puntajeBase, penalizacion, bonificacion, puntajeFinal;
        String nivel, observacion;
        System.out.print("Puntaje reto 1: ");
        reto1 = sc.nextDouble();

        System.out.print("Puntaje reto 2: ");
        reto2 = sc.nextDouble();

        System.out.print("Puntaje reto 3: ");
        reto3 = sc.nextDouble();
        System.out.print("Numero de errores: ");
        errores = sc.nextInt();

        System.out.print("Tiempo total en minutos: ");
        tiempo = sc.nextInt();

        System.out.print("Resolvio el desafio extra (Si/No): ");
        desafioExtra = sc.next();

        System.out.print("Descalificado por copia (Si/No): ");
        descalificado = sc.next();
         puntajeBase = reto1 + reto2 + reto3;

        penalizacion = errores * 4;

        bonificacion = 0;

        if (desafioExtra.equalsIgnoreCase("Si")) {
            bonificacion = bonificacion + 15;
        }

        if (tiempo < 30) {
            bonificacion = bonificacion + 10;
        }

        puntajeFinal = puntajeBase - penalizacion + bonificacion;

        if (puntajeFinal < 0) {
            puntajeFinal = 0;
        }

     if (descalificado.equalsIgnoreCase("Si")) {
            nivel = "Descalificado";
        } else if (puntajeFinal <= 29) {
            nivel = "Principiante";
        } else if (puntajeFinal <= 49) {
            nivel = "Basico";
        } else if (puntajeFinal <= 69) {
            nivel = "Intermedio";
        } else if (puntajeFinal <= 89) {
            nivel = "Avanzado";
        } else {
            nivel = "Experto";
        }

        observacion = "Sin observaciones";

        if (errores > 5 && puntajeFinal >= 70) {
            observacion = "Resultado inconsistente: revisar calidad de resolución";
        }
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Puntaje base: " + puntajeBase);
        System.out.println("Penalizacion: " + penalizacion);
        System.out.println("Bonificacion: " + bonificacion);
        System.out.println("Puntaje final: " + puntajeFinal);
        System.out.println("Nivel: " + nivel);
        System.out.println("Observacion: " + observacion);
        sc.close();
    }
}

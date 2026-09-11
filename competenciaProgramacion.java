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

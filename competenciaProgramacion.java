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

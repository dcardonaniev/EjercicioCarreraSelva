package me.davidlake;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Categoria circuitoChico = new Categoria(
                1,
                "Circuito chico",
                "2 km por selva y arroyos"
        ), circuitoMedio = new Categoria(
                2,
                "Circuito medio",
                "5 km por selva, arroyos y barro"
        ), circuitoAvanzado = new Categoria(
                3,
                "Circuito avanzado",
                "10 km por selva, arroyos, barro y escalada en piedra"
        );

        Participante primerParticipante = new Participante(
                10001,
                "David",
                "Cardona",
                21,
                300000000,
                300000000,
                "O+"
        ), segundoParticipante = new Participante(
                10002,
                "Daniel",
                "Uribe",
                16,
                300000000,
                300000000,
                "O-"
        ), tercerParticipante = new Participante(
                10003,
                "Tomas",
                "Loaiza",
                19,
                300000000,
                300000000,
                "O+"
        ), cuartoParticipante = new Participante(
                10004,
                "Batman",
                "Perez",
                21,
                300000000,
                300000000,
                "AB+"
        );

        Inscripcion inscripcionPrimerParticipante = new Inscripcion(
                1,
                circuitoChico,
                primerParticipante,
                calcularTarifa(1, primerParticipante.getEdad())
        ), inscripcionSegundoParticipante = new Inscripcion(
                2,
                circuitoMedio,
                segundoParticipante,
                calcularTarifa(2, segundoParticipante.getEdad())
        ), inscripcionTercerParticipante = new Inscripcion(
                3,
                circuitoAvanzado,
                tercerParticipante,
                calcularTarifa(3, tercerParticipante.getEdad())
        ), inscripcionCuartoParticipante = new Inscripcion(
                4,
                circuitoAvanzado,
                cuartoParticipante,
                calcularTarifa(3, cuartoParticipante.getEdad())
        );

        System.out.println("\n================ TAREA B ================");
        System.out.printf("Tarifa del primer participante: %d", inscripcionPrimerParticipante.tarifa());
        System.out.println();

        System.out.println("\n================ TAREA D ================");
        System.out.println("Inscritos primera categoría (Circuito chico):");
        for (int i = 0; i < circuitoChico.getParticipantesInscritos().size(); i++) {
            System.out.printf("%d: %s\n", i + 1, circuitoChico.getParticipantesInscritos().get(i).participante().toString());
        }

        System.out.println("\nInscritos segunda categoría (Circuito medio):");
        for (int i = 0; i < circuitoMedio.getParticipantesInscritos().size(); i++) {
            System.out.printf("%d: %s\n", i + 1, circuitoMedio.getParticipantesInscritos().get(i).participante().toString());
        }

        System.out.println("\nInscritos tercera categoría (Circuito avanzado):");
        for (int i = 0; i < circuitoAvanzado.getParticipantesInscritos().size(); i++) {
            System.out.printf("%d: %s\n", i + 1, circuitoAvanzado.getParticipantesInscritos().get(i).participante().toString());
        }

        System.out.println("\n================ TAREA E ================");
        inscripcionTercerParticipante.eliminarInscripcion();
        for (int i = 0; i < circuitoAvanzado.getParticipantesInscritos().size(); i++) {
            System.out.printf("%d: %s\n", i + 1, circuitoAvanzado.getParticipantesInscritos().get(i).participante().toString());
        }

        System.out.println("\n================ TAREA F ================");
        int recaudoChico = circuitoChico.calcularTotalRecaudo(),
                recaudoMedio = circuitoMedio.calcularTotalRecaudo(),
                recaudoAvanzado = circuitoAvanzado.calcularTotalRecaudo();
        System.out.printf("Recaudo primera categoría (Circuito chico): %d\n", recaudoChico);
        System.out.printf("Recaudo segunda categoría (Circuito medio): %d\n", recaudoMedio);
        System.out.printf("Recaudo tercera categoría (Circuito avanzado): %d\n", recaudoAvanzado);
        System.out.printf("Total recaudado en todas las categorías: %d\n", (recaudoChico + recaudoMedio + recaudoAvanzado));
    }

    private static int calcularTarifa(int idCategoria, int edad) {
        boolean mayorDeEdad = edad >= 18;

        switch (idCategoria) {
            case 1 -> {
                return mayorDeEdad ? 1500 : 1300;
            }
            case 2 -> {
                return mayorDeEdad ? 2300 : 2000;
            }
            case 3 -> {
                return mayorDeEdad ? 2800 : 0;
            }
            default -> {
                return 0;
            }
        }
    }
}

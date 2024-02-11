package me.davidlake;

import java.util.ArrayList;

public class Categoria {
    private final int id;
    private final String nombre;
    private final String descripcion;
    private final ArrayList<Inscripcion> participantesInscritos;

    public Categoria(
            int id,
            String nombre,
            String descripcion
    ) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        participantesInscritos = new ArrayList<>();
    }

    public int getId() { return this.id; }
    public String getNombre() { return this.nombre; }
    public String getDescripcion() { return this.descripcion; }

    public ArrayList<Inscripcion> getParticipantesInscritos() { return participantesInscritos; }

    public void inscribirParticipante(Inscripcion inscripcion) {
        if (this.getId() == 3 && inscripcion.participante().getEdad() < 18) {
            System.out.printf("Inscripción (#%d) no válida debido a la edad del participante.\n", inscripcion.participante().getNumParticipante());
            return;
        }

        System.out.printf("Inscripción (#%d) realizada correctamente.\n", inscripcion.participante().getNumParticipante());
        this.participantesInscritos.add(inscripcion);
    }

    public void desinscribirParticipante(Inscripcion inscripcion) {
        if(!this.participantesInscritos.remove(inscripcion)) {
            System.out.printf("La inscripción (#%d) no existe en el registro de la categoría.\n", inscripcion.participante().getNumParticipante());
            return;
        }

        System.out.printf("Inscripción (#%d) removida correctamente.\n", inscripcion.participante().getNumParticipante());
    }

    public int calcularTotalRecaudo() {
        int total = 0;

        for (Inscripcion participantesInscrito : participantesInscritos) {
            total += participantesInscrito.tarifa();
        }

        return total;
    }
}
package me.davidlake;

public record Inscripcion(int numeroInscripcion, Categoria categoria, Participante participante, int tarifa) {
    public Inscripcion(
            int numeroInscripcion,
            Categoria categoria,
            Participante participante,
            int tarifa
    ) {
        this.numeroInscripcion = numeroInscripcion;
        this.categoria = categoria;
        this.participante = participante;
        this.tarifa = tarifa;

        this.participante.setNumParticipante(numeroInscripcion);
        this.categoria.inscribirParticipante(this);
    }

    public void eliminarInscripcion() {
        this.categoria.desinscribirParticipante(this);
    }
}

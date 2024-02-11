package me.davidlake;

public class Participante {
    private int numParticipante;
    private final int identificacion;
    private final String nombre;
    private final String apellido;
    private final int edad;
    private final long celular;
    private final long numeroEmergencia;
    private final String grupoSanguineo;

    public Participante(
            int identificacion,
            String nombre,
            String apellido,
            int edad,
            long celular,
            long numeroEmergencia,
            String grupoSanguineo
    ) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.celular = celular;
        this.numeroEmergencia = numeroEmergencia;
        this.grupoSanguineo = grupoSanguineo;
    }

    public int getNumParticipante() { return this.numParticipante; }
    public int getIdentificacion() { return this.identificacion; }
    public String getNombre() { return this.nombre; }
    public String getApellido() { return this.apellido; }
    public int getEdad() { return this.edad; }
    public long getCelular() { return this.celular; }
    public long getNumeroEmergencia() { return this.numeroEmergencia; }
    public String getGrupoSanguineo() { return this.grupoSanguineo; }

    public void setNumParticipante(int numParticipante) { this.numParticipante = numParticipante; }

    @Override
    public String toString() {
        return "Participante{" +
                "numParticipante=" + numParticipante +
                ", identificacion=" + identificacion +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", celular=" + celular +
                ", numeroEmergencia=" + numeroEmergencia +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                '}';
    }
}

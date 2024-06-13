package cl.praxis.model;

public class Partida {
  private String fechaPartida;
  private Equipo equipoLocal;
  private Equipo equipoVisita;
  private int puntosEquipoLocal;
  private int puntosEquipoVisita;

  public Partida() {
  }

  public Partida(String fechaPartida, Equipo equipoLocal, Equipo equipoVisita, int puntosEquipoLocal, int puntosEquipoVisita) {
    this.fechaPartida = fechaPartida;
    this.equipoLocal = equipoLocal;
    this.equipoVisita = equipoVisita;
    this.puntosEquipoLocal = puntosEquipoLocal;
    this.puntosEquipoVisita = puntosEquipoVisita;
  }

  public String getFechaPartida() {
    return fechaPartida;
  }

  public void setFechaPartida(String fechaPartida) {
    this.fechaPartida = fechaPartida;
  }

  public Equipo getEquipoLocal() {
    return equipoLocal;
  }

  public void setEquipoLocal(Equipo equipoLocal) {
    this.equipoLocal = equipoLocal;
  }

  public Equipo getEquipoVisita() {
    return equipoVisita;
  }

  public void setEquipoVisita(Equipo equipoVisita) {
    this.equipoVisita = equipoVisita;
  }

  public int getPuntosEquipoLocal() {
    return puntosEquipoLocal;
  }

  public void setPuntosEquipoLocal(int puntosEquipoLocal) {
    this.puntosEquipoLocal = puntosEquipoLocal;
  }

  public int getPuntosEquipoVisita() {
    return puntosEquipoVisita;
  }

  public void setPuntosEquipoVisita(int puntosEquipoVisita) {
    this.puntosEquipoVisita = puntosEquipoVisita;
  }

  @Override
  public String toString() {
    return "Partida :" +
            "fecha ='" + fechaPartida + '\'' +
            ", Local=" + equipoLocal +
            " : " + puntosEquipoLocal +
            ", Visita=" + equipoVisita +
            " : " + puntosEquipoVisita +
            '}';
  }
}

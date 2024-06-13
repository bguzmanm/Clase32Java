package cl.praxis.model;

import java.util.List;

public class Equipo {
  private String nombre;
  private List<Jugador> jugadores;

  private int puntos;

  public Equipo() {
  }

  public Equipo(String nombre) {
    this.nombre = nombre;
  }

  public Equipo(String nombre, List<Jugador> jugadores, int puntos) {
    this.nombre = nombre;
    this.jugadores = jugadores;
    this.puntos = puntos;
  }

  public void agregarJugador(Jugador jugador){
    this.jugadores.add(jugador);
  }

  public int getPuntos() {
    return puntos;
  }

  public void setPuntos(int puntos) {
    this.puntos = puntos;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public List<Jugador> getJugadores() {
    return jugadores;
  }

  public void setJugadores(List<Jugador> jugadores) {
    this.jugadores = jugadores;
  }
}

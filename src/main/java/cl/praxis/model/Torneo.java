package cl.praxis.model;

import java.util.HashMap;
import java.util.List;

public class Torneo {

  private HashMap<String, Equipo> equipos;
  private List<Partida> resultados;

  public Torneo() {
  }

  public Torneo(HashMap<String, Equipo> equipos, List<Partida> resultados) {
    this.equipos = equipos;
    this.resultados = resultados;
  }

  public void agregarEquipo(String nombre){
    equipos.put(nombre, new Equipo(nombre));
  }

  public void agregarJugador(String nombreEquipo, Jugador jugador){
    equipos.get(nombreEquipo).agregarJugador(jugador);
  }

  public void registrarResultado(String fecha,
                                 String local,
                                 String visita,
                                 int puntosLocal,
                                 int puntosVisita){

    resultados.add(
            new Partida(fecha,
                    equipos.get(local),
                    equipos.get(visita),
                    puntosLocal, puntosVisita));

  }

  public void mostrarRanking(){

  }

  public HashMap<String, Equipo> getEquipos() {
    return equipos;
  }

  public List<Partida> getResultados() {
    return resultados;
  }
}

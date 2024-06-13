package cl.praxis;

import cl.praxis.model.Equipo;
import cl.praxis.model.Jugador;
import cl.praxis.model.Partida;
import cl.praxis.model.Torneo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@DisplayName("Test clase Torneo")
public class TorneoTest {

  private static Logger logger = Logger.getLogger("cl.praxis.Torneo");

  private static Torneo t;
  private static Equipo e1;
  private static Equipo e2;
  private static HashMap<String, Equipo> equipos;
  private static Partida p;
  private static List<Partida> partidas;
  private static Jugador j;
  private static List<Jugador> jugadores;

  @BeforeAll
  public static void init(){

    equipos = new HashMap<>();
    partidas = new ArrayList<>();

    jugadores = new ArrayList<>();

    e1 = new Equipo("beta", jugadores, 10);
    e2 = new Equipo("epsilon", jugadores, 10);

    equipos.put("beta", e1);
    equipos.put("epsilon", e2);
    p = new Partida("2024-06-12", e1, e2, 3, 0);
    partidas.add(p);

    t = new Torneo(equipos, partidas);

    j = new Jugador("jugador", "alias");
  }

  @Test
  public void testConstructorConArgumentos(){
    HashMap<String, Equipo> equipos = new HashMap<>();

    equipos.put("alfa", new Equipo("alfa"));

    List<Partida> partidas = new ArrayList<>();
    partidas.add(new Partida());

    Torneo torneo = new Torneo(equipos, partidas);

    assertTrue(torneo instanceof Torneo);
  }

  @Test
  public void testConstrcutorVoid(){
    Torneo torneo = new Torneo();

    assertTrue(torneo instanceof Torneo);
  }

  @Test
  public void testAgregarEquipos(){
    String nameEquipo = "gamma";
    t.agregarEquipo(nameEquipo);

    assertTrue(t.getEquipos().get(nameEquipo).getNombre().equals(nameEquipo));
  }

  @Test
  public void testAgregarJugador(){
    t.agregarJugador("beta", j);

    assertTrue(
    t.getEquipos().get("beta").getJugadores().contains(j)
    );
  }

  @Test
  public void testRegistrarResultado(){
    t.registrarResultado(
            "2024-06-12",
            "beta",
            "beta",
            3,
            0);


    // assertTrue(t.getResultados().contains(p));
    List<Partida> partidosFiltrados =
    t.getResultados().stream()
            .filter(juego ->
                    juego.getEquipoLocal().getNombre().equals("beta") &&
                    juego.getEquipoVisita().getNombre().equals("beta")) //&&
                    //juego.getFechaPartida().equals("2024-06-12"))
            .collect(Collectors.toList());

    assertTrue(partidosFiltrados.get(0).getEquipoLocal().getNombre().equals("beta"));


  }

}

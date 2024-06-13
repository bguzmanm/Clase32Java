package cl.praxis;

import cl.praxis.model.Jugador;
import cl.praxis.model.Torneo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Torneo torneo = new Torneo();

        // Agregar equipos
        torneo.agregarEquipo("Equipo Alpha");
        torneo.agregarEquipo("Equipo Beta");

        // Agregar jugadores a los equipos
        torneo.agregarJugador("Equipo Alpha", new Jugador("Alice", "Alicia2000"));
        torneo.agregarJugador("Equipo Alpha", new Jugador("Bob", "Bobster"));
        torneo.agregarJugador("Equipo Beta", new Jugador("Charlie", "Chaz"));

        // Registrar resultados de partidos
        torneo.registrarResultado("2024-06-07", "Equipo Alpha", "Equipo Beta", 3, 0);

        // Mostrar ranking
        torneo.mostrarRanking();
    }
}

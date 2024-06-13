package cl.praxis.model;

public class Jugador {
  private String nombre;
  private String alias;

  public Jugador() {
  }

  public Jugador(String nombre, String alias) {
    this.nombre = nombre;
    this.alias = alias;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }
}

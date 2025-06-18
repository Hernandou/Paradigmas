public class Deportista {
    String nombre;
    Integer dni;
    Integer numeroJugador;

    public Deportista(String nombre, Integer dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setNumeroJugador(Integer numeroJugador){
        this.numeroJugador = numeroJugador;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Integer getDni(){
        return  this.dni;
    }

    public Integer getNumeroJugador(){
        return  this.numeroJugador;
    }

}

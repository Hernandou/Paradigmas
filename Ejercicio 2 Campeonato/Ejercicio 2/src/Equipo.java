import java.util.ArrayList;
import java.util.List;

public class Equipo implements IDeporte{
    String nombre;
    List<Deportista> jugadores = new ArrayList<>();
    public Equipo(String nombre){
        this.nombre = nombre;
    }

    @Override
    public Boolean conformar(List<Deportista> integrantes) {
        return integrantes.size() >= cantidad_minima;
    }

    @Override
    public void mostrar() {
        System.out.println("Equipo " + this.nombre);
        for (int i = 0; i< this.jugadores.size(); i++){
            System.out.println("Nombre: " + this.jugadores.get(i).getNombre() + " Numero jugador: " + this.jugadores.get(i).getNumeroJugador());
        }
    }

    @Override
    public void numeroDeportista() {

    }

    @Override
    public void setCantidad_minima() {

    }

    public void setJugadores(List<Deportista> jugadores){
        this.jugadores = jugadores;
    }

    public String getNombre(){
        return this.nombre;
    }

}

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Campeonato campeonato = new Campeonato();
        List<Deportista> deportistas = campeonato.leerArchivo("src/Archivos/inscriptosFutbol.csv");
        List<IDeporte> deportistasEquipos = campeonato.crearEquipos(deportistas,5);

        for(int i = 0; i < deportistasEquipos.size(); i++){
            deportistasEquipos.get(i).mostrar();
        }

    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    public String separador = ",";

    public List<Deportista> leerArchivo(String nombreArchivo) throws EmptyName, IOException, EmptyID {
        BufferedReader bufferedReader = null;
        List<Deportista> datos = new ArrayList<Deportista>();

        try {
            bufferedReader = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            while((linea = bufferedReader.readLine()) != null) {
                String[] campos = linea.split(separador);
                if(campos[0].trim().isEmpty()) {
                    throw new EmptyName("Nombre vacio");
                }

                if(campos[1].trim().isEmpty()) {
                    throw new EmptyID("DNI vacio");
                }

                Integer dni = Integer.parseInt(campos[1]);
                Deportista deportista = new Deportista(campos[0], dni);
                datos.add(deportista);
            }
        }catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }catch (EmptyName e){
            System.out.println("Error " + e);
        }catch (EmptyID e){
            System.out.println("Error " + e);
        }finally {
            if(bufferedReader != null){
                bufferedReader.close();
            }
        }
        return datos;
    }

    public List<IDeporte> crearEquipos(List<Deportista> datos, Integer cantJugadores) throws insufficientTeamMembers {
        Integer numeroJugador = 1;
        Integer numeroEquipo = 1;
        List<IDeporte> listaEquipo = new ArrayList<IDeporte>();
        List<Deportista> subgrupo = new ArrayList<Deportista>();

        for(int i = 0; i< datos.size(); i++ ){
            Deportista deportista = datos.get(i);
            deportista.setNumeroJugador(numeroJugador);
            numeroJugador++;
            subgrupo.add(deportista);

                if(subgrupo.size() == cantJugadores){
                    Equipo equipo = new Equipo("Equipo " + numeroEquipo);
                    if(equipo.conformar(subgrupo)) {
                        equipo.setJugadores(subgrupo);
                        listaEquipo.add(equipo);
                    }

                    subgrupo = new ArrayList<Deportista>();
                    numeroJugador = 1;

                    numeroEquipo++;
                }

        }
        return  listaEquipo;
    }

    public List<IDeporte> crearParejas(List<Deportista> datos){
        List<IDeporte> listaEquipo = new ArrayList<IDeporte>();
        List<Deportista> parejas = new ArrayList<Deportista>();
        Integer numeroJugador = 1;

        for(int i = 0 ; i < datos.size(); i++){
            Deportista deportista = datos.get(i);
            deportista.setNumeroJugador(numeroJugador);
            parejas.add(deportista);

            if(parejas.size() == 2){
                Parejas parejasTenis = new Parejas();
                parejasTenis.setParejas(parejas);
                listaEquipo.add(parejasTenis);
                parejas = new ArrayList<Deportista>();
            }

        }

        return listaEquipo;
    }
}

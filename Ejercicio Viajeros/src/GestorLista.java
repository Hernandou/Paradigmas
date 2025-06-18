import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GestorLista {
    List<ViajeroFrecuente> viajeroFrecuenteList;
    public GestorLista(){
        this.viajeroFrecuenteList = new ArrayList<ViajeroFrecuente>();
    }

    public void cargarViajero(ViajeroFrecuente viajero){
        this.viajeroFrecuenteList.add(viajero);
    }

    public void cargarViajeros(List<ViajeroFrecuente> viajeros){
        System.out.println("Entra");
        this.viajeroFrecuenteList = viajeros;
    }

    public List<ViajeroFrecuente> orderByMiles(){
        System.out.println(this.viajeroFrecuenteList.size());
        return this.viajeroFrecuenteList.stream().sorted(Comparator.comparing(ViajeroFrecuente :: getMillas)).collect(Collectors.toList());
    }

    public List<ViajeroFrecuente> moreThan200Miles(){
        List<ViajeroFrecuente> filteredTravelers = new ArrayList<ViajeroFrecuente>();
        filteredTravelers = this.viajeroFrecuenteList;

        return filteredTravelers.stream().filter((viajero) -> viajero.getMillas() > 200).collect(Collectors.toList());
    }

    public ViajeroFrecuente mostMilesAcumulated(){
        List<ViajeroFrecuente> filteredTravelers = new ArrayList<ViajeroFrecuente>();
        filteredTravelers = this.viajeroFrecuenteList;
        filteredTravelers.stream().max((v1,v2) -> v2.getMillas() - v1.getMillas());
        return  filteredTravelers.get(0);
    }
}

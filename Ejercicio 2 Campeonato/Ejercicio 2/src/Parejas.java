import java.util.ArrayList;
import java.util.List;

public class Parejas implements IDeporte{

    List<Deportista> listaPareja = new ArrayList<Deportista>();

    @Override
    public Boolean conformar(List<Deportista> integrantes) {
        return null;
    }

    @Override
    public void mostrar() {

    }

    @Override
    public void numeroDeportista() {

    }

    @Override
    public void setCantidad_minima() {

    }

    public void setParejas(List<Deportista> pareja){
        this.listaPareja = pareja;
    }
}

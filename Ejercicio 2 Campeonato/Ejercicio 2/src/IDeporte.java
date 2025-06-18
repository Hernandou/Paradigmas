import java.util.List;

public interface IDeporte {
    public Integer cantidad_minima = 2;
    public Boolean conformar(List<Deportista> integrantes);
    public void mostrar();
    public void numeroDeportista();
    public void setCantidad_minima();
}

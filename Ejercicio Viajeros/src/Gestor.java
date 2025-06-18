public class Gestor {
    Integer cantidad;
    ViajeroFrecuente[] viajeros;

    public Gestor(Integer cantidad){
        this.cantidad = cantidad;
        this.viajeros = new ViajeroFrecuente[cantidad];
    }

    public void cargarViajero(ViajeroFrecuente viajero){
        Integer i = 0;
        while(i < this.viajeros.length && this.viajeros[i] != null) {
            i++;
        }
        if(i == 0 || i >= this.viajeros.length ){
            ViajeroFrecuente[] auxArregloViajeros = new ViajeroFrecuente[this.viajeros.length + 1];
            System.arraycopy(this.viajeros,0,auxArregloViajeros,0,this.viajeros.length);
            this.viajeros[this.viajeros.length-1] = viajero;
            System.out.println(this.viajeros);
        }else{
            this.viajeros[i] = viajero;
        }

    }






}

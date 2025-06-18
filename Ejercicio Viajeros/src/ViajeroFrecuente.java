public class ViajeroFrecuente {

    Integer numero;
    String dni;
    String nombre;
    String apellido;
    Integer millas;

    public ViajeroFrecuente(Integer numero, String dni, String nombre, String apellido, Integer millas){
        this.numero = numero;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.millas = millas;
    }

    public Integer getMillas(){
        return this.millas;
    }

    public void setMillas (Integer millas){
        this.millas = millas;
    }

    public void acumularMillas(Integer millas){
        this.setMillas(millas + this.getMillas());
    }

    public Integer canjearMillas(Integer millas){

        if(this.getMillas() <= millas){
            this.setMillas(this.getMillas() - millas);
            System.out.println("Millas canjeadas tu saldo actual es" + this.getMillas());
        }else{
            System.out.println("Error, no tenes la cantidad de millas suficientes, tu saldo actual es" + this.getMillas());
        }
        return this.getMillas();
    }

    public String getDni(){
        return this.dni;
    }
}

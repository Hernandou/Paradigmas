import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public Menu() {
        //Gestor gestor = new Gestor(10);
        GestorLista gestor = new GestorLista();
        Scanner in = new Scanner(System.in);
        gestor.cargarViajeros(this.cargarViajeros());

        System.out.println(
                "Ingresa una opción wachin:\n" +
                        "1 - Cargar Viajero\n" +
                        "2 - Consultar millas de un wachin\n" +
                        "3 - Canjear millas\n" +
                        "4 - Mejor viajero\n" +
                        "[Ingresa 0 para terminar]\n" +
                        "-----------------------------------\n" +
                        "------------- Streams -------------\n" +
                        "5 - Mostrar datos de viajeros ordenados por cantidad de millas\n" +
                        "6 - Mostrar los nombres de los viajeros que tienen más de 200 millas\n" +
                        "7 - Obtener el viajero que tiene más millas"
        );


        Integer opcion = in.nextInt();

        while (opcion != 0) {
            if (opcion == 1) {
                System.out.println("Nombre viajero: ");
                String nombre = in.nextLine();
                System.out.println("Apellido del viajero: ");
                String apellido = in.nextLine();

                System.out.println("Dni viajero: ");
                String dni = in.nextLine();

                System.out.println("Numero viajero: ");
                Integer numero = in.nextInt();

                System.out.println("Millas viajero: ");
                Integer millas = in.nextInt();

                ViajeroFrecuente viajero = new ViajeroFrecuente(numero, dni, nombre, apellido, millas);

                gestor.cargarViajero(viajero);

            }

            if (opcion == 2) {
                System.out.println("Ingrese DNI a buscar: ");
                String dni = in.nextLine();

            }

            if (opcion == 5) {
                List<ViajeroFrecuente> viajerosOrdenados = new ArrayList<>();
                viajerosOrdenados = gestor.orderByMiles();
            }

            if(opcion == 6){
                List<ViajeroFrecuente> viajerosCon200Millas = new ArrayList<>();
                viajerosCon200Millas = gestor.moreThan200Miles();
                viajerosCon200Millas.stream().forEach((viajero) -> System.out.println(viajero.getMillas()));
            }

            if(opcion == 7){
                System.out.println("El viajero con mas millas es: " + gestor.mostMilesAcumulated().getMillas());
            }


            System.out.println(
                    "Ingresa una opción wachin:\n" +
                            "1 - Cargar Viajero\n" +
                            "2 - Consultar millas de un wachin\n" +
                            "3 - Canjear millas\n" +
                            "4 - Mejor viajero\n" +
                            "[Ingresa 0 para terminar]\n" +
                            "-----------------------------------\n" +
                            "------------- Streams -------------\n" +
                            "5 - Mostrar datos de viajeros ordenados por cantidad de millas\n" +
                            "6 - Mostrar los nombres de los viajeros que tienen más de 200 millas\n" +
                            "7 - Obtener el viajero que tiene más millas"
            );

                opcion = in.nextInt();


        }
    }

    public List<ViajeroFrecuente> cargarViajeros() {
        List<ViajeroFrecuente> lista = new ArrayList<>();

        lista.add(new ViajeroFrecuente(1, "12345678", "Juan", "Pérez", 15000));
        lista.add(new ViajeroFrecuente(2, "23456789", "María", "Gómez", 12000));
        lista.add(new ViajeroFrecuente(3, "34567890", "Pedro", "Rodríguez", 8000));
        lista.add(new ViajeroFrecuente(4, "45678901", "Lucía", "Fernández", 20000));
        lista.add(new ViajeroFrecuente(5, "56789012", "Carlos", "López", 5000));
        lista.add(new ViajeroFrecuente(6, "67890123", "Ana", "Martínez", 9500));
        lista.add(new ViajeroFrecuente(7, "78901234", "Javier", "Sánchez", 17000));
        lista.add(new ViajeroFrecuente(8, "89012345", "Florencia", "Torres", 11000));
        lista.add(new ViajeroFrecuente(9, "90123456", "Diego", "Ramírez", 3000));
        lista.add(new ViajeroFrecuente(10, "01234567", "Sofía", "Alvarez", 25000));

        return lista;
    }

}

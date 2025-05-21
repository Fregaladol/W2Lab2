import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* 2- Preguntar al usuario elementos típicos de la fiesta de Sant Jordi.

        Para acabar, escribir 'salir'. Al final, mostrar todos los elementos introducidos por el usuario. */
    

        ArrayList<String> santJordiElements= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        String exit;


        System.out.println("Dime elementos tipicos de las fiesttas de Sant Jordi");
        santJordiElements.add(scanner.nextLine());
        
        do {

            System.out.println("Escribe 'Salir' si no quieres añadir más elementos, de lo contrario sigue añadiendo elementos.");
            exit = scanner.nextLine();

            if (!exit.equalsIgnoreCase("salir")){
               
                santJordiElements.add(exit);
            } else {
           
                  quit = true;
            }

        } while (!quit);

        System.out.println("Los elementos que has añadido son:");
        System.out.println(santJordiElements);
    
        scanner.close();
    
    
    }
}

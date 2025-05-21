import java.util.ArrayList;

public class App {


    public static void embassadorsList(ArrayList<String> array) {
        System.out.println("Por lo que la lista de embajadores queda por el momento:");
        for (int i=0;i<array.size();i++){
            System.out.println("- "+ array.get(i));;
        }
        
    }

    public static void main(String[] args) throws Exception {
        /* 3- CRUD: recepción internacional... y universal!

        Te han encargado organizar la recepción oficial para el primer contacto extraterrestre, en la montaña de Montserrat.

        Solo unos pocos en el mundo pueden asistir. ¿A quién enviarías? De momento la lista sólo puede ser de cinco elegid@s.

        Pero dos de ellos, en los puestos 2 y 3, se asustan y se dan de baja, y entra entonces el personaje X (darle nombre) en el puesto 2.

        La persona que está en el último puesto, se pone enferma y te recomienda que pongas en su lugar al personaje Y (darle nombre). Ojo con saber qué índice es el último

        En el último momento, se añade el personaje Z (darle nombre) al puesto vacante (puesto 3).

        Ves mostrando a cada paso cómo va quedando la lista actualizada: los medios están muy interesados en seguir la noticia al minuto!

 */

        ArrayList<String> embassadorsEarth = new ArrayList<String>();

        String[] names = {"Luis", "Manolo","Elena","Pepe","María"};

        for (int i=0;i<names.length;i++){
            embassadorsEarth.add(names[i]);
        }

        System.out.println("La recepción oficial para el primer contacto extraterrestre, en la montaña de Montserrat, tendrá lugar próximo mes y los embajadores de la tierra son: ");
        
        embassadorsList(embassadorsEarth);

        System.out.printf("NOTICIA DE ÚLTIMA HORA!!!! Dos de los embajadores de la tierra, %s y %s, se han asustan y se dan de baja. \n", embassadorsEarth.get(2),embassadorsEarth.get(3));

        System.out.printf("Pero no os preocupeis se ha escogido a Mariana para sustituir %s.\n", names[2]);

        embassadorsEarth.set(2, "Mariana");
        embassadorsEarth.remove(3);


        embassadorsList(embassadorsEarth);

        System.out.printf("ÚLTIMA NOTICIA!!!  La persona que está en el último puesto (%s), se pone enferma y recomienda que pongas en su lugar a %s.\n", embassadorsEarth.get(embassadorsEarth.size()-1),"Juan");

        embassadorsEarth.set(embassadorsEarth.size()-1,"Juan");
        
        
        embassadorsList(embassadorsEarth);

        System.out.println("NOTICIA ÚLTIMA HORA!!!! En el último momento, se añade a la lista de embajadores a Concepción para la última vacante que dejo Pepe.");

        embassadorsEarth.add(3,"Concepción");

        embassadorsList(embassadorsEarth);



    }

}

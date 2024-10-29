/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package streamflex;

import cl.duoc.models.Documental;
import cl.duoc.models.Pelicula;
import cl.duoc.models.Serie;
import cl.duoc.models.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class StreamFlex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc = 0;
        Scanner input = new Scanner(System.in);
        List<Usuario> usuarios = new ArrayList<>();
        List<Pelicula> peliculas = new ArrayList<>();
        List<Serie> series = new ArrayList<>();
        List<Documental> documentales = new ArrayList<>();
        
        Pelicula insP = new Pelicula(0, "Base");
        Serie insS = new Serie(0, "Base");
        Documental insD = new Documental(0, "Base");
        Usuario insU = new Usuario(0);
        
        
        
        while(opc != 9){
            System.out.println("===========================");
            System.out.println("===     StreamFlex      ===");
            System.out.println("===========================");
            System.out.println("[1] - Crear Pelicula");
            System.out.println("[2] - Crear Serie");
            System.out.println("[3] - Crear Documental");
            System.out.println("[4] - Crear Usuario");
            System.out.println("°=°=°=°=°=°=°=°=°=°=°=°=°");
            System.out.println("[5] - Listar Usuarios");
            System.out.println("[6] - Listar Contenidos");
            System.out.println("°=°=°=°=°=°=°=°=°=°=°=°=°");
            System.out.println("[7] - Consumir Contenido");
            System.out.println("[8] - Consultar Costo Suscripcion");
            System.out.println("[9] - Apagar Sistema");
            
            opc = input.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Ingresa el Nombre de la Pelicula: ");
                    String nombreP = input.nextLine();
                    System.out.println("Ingresa la calificacion de la critica: ");
                    int rate = input.nextInt();
                    System.out.println("Ingresa la duración de la película en formato '0h00m'");
                    String durP = input.next();
                    insP.crearPelicula(nombreP, peliculas, rate, durP);
                    break;
                case 2:
                    System.out.println("Ingresa el Nombre de la Serie:");
                    String nombreS = input.nextLine();
                    System.out.println("Ingresa el numero de temporadas:");
                    int nT = input.nextInt();
                    System.out.println("Sigue en emision? (True/False)");
                    boolean estE = input.nextBoolean();
                    insS.crearSerie(nombreS, series, nT, estE);
                    break;
                case 3:
                    System.out.println("Ingresa el Nombre del documental: ");
                    String nombreD = input.nextLine();
                    System.out.println("Ingresa el Enfoque Educativo: ");
                    String enE = input.nextLine();
                    System.out.println("Ingresa la duración de la película en minutos");
                    int durD = input.nextInt();
                    insD.crearDocumental(nombreD, documentales, enE, durD);
                    break;
                case 4:
                    System.out.println("Ingresa el username de la cuenta:");
                    String user = input.next();
                    insU.crearUsuario(user, usuarios);
                    break;
                case 5:
                    insU.mostrarContenidos(usuarios);
                    System.out.println("Presiona Enter cuando finalices.");
                    input.next();
                    break;
                case 6:
                    System.out.println("Peliculas: ");
                    System.out.println(peliculas);
                    System.out.println("Series: ");
                    System.out.println(series);
                    System.out.println("Documentales: ");
                    System.out.println(documentales);
                    System.out.println("Presiona Enter cuando finalices.");
                    input.next();
                    break;
                case 7:
                    System.out.println("Se acabo el tiempo de elaboracion, pruebe en la siguiente entrega. (no me quedo mas tiempo XD)");
                case 8:
                    insU.calcularSuscripcion();
                    break;
                case 9:
                    System.out.println("Gracias por preferirnos, adios.");
                    break;
            }
        }
    }
    
}

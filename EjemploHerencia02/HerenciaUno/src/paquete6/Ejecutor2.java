/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete6;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Carlos Morocho - PC
 */
public class Ejecutor2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        boolean bandera = true; 
        String cadena = "--------------------------------";
        
        while (bandera) {
            System.out.print("\nIngrese el Nombre del Estudiante: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese el Apellido del Estudiante: ");
            String apellido = sc.nextLine();
            System.out.print("Ingrese la Identificación del Estudiante: ");
            String identificacion = sc.nextLine();
            System.out.print("Ingrese la Edad del Estudiante: ");
            int edad = sc.nextInt();
            System.out.print("Ingrese el Numero de Creditos: ");
            int numCreditos = sc.nextInt();
            System.out.print("Ingrese el Costo de los Creditos: ");
            double costoCre = sc.nextDouble();
            sc.nextLine();

            paquete5.EstudiantePresencial estPresencial = new paquete5.EstudiantePresencial(nombre,
                    apellido, identificacion, edad, numCreditos, costoCre);

            estPresencial.calcularMatriculaPresencial();

            cadena = String.format("%s\n%s"
                    + "--------------------------------", cadena, estPresencial);

            System.out.print("\n¿Desea Seguir Ingresando Alumnos? Pulse Cualquier tecla"
                    + " (si desea salir escriba x): ");
            String seguir = sc.nextLine();
        
            if(seguir.equals("x")) {
                bandera = false;
            }
        }
        
        System.out.printf("%s", cadena);
    }
}

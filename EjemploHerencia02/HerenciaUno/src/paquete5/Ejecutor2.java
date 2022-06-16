/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;
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
        
        System.out.print("Ingrese el Nombre del Estudiante: ");
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
        
                
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad, numCreditos, costoCre);
        
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println("");
        System.out.println(estPresencial);
        
        
        
    }
}

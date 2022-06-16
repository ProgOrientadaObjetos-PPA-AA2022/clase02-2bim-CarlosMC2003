/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author Carlos Morocho - PC
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        //Crear un objeto de estudiante Presencial
        
        String nombre = "Carlos";
        String apellido = "Morocho";
        String identificacion = "1105559098";
        int edad = 19;
        
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);
        
        estPresencial.establecerCostoCredito(50.5);
        estPresencial.establecerNumeroCreditos(5);
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
    }
}

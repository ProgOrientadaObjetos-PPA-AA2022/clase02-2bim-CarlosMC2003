/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

/**
 *
 * @author Carlos Morocho - PC
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        
        EstudiantePresencial estPresencial = new EstudiantePresencial("Carlos",
                "Morocho", "11011", 19, 4, 7.75);
        
        estPresencial.calcularMatriculaPresencial();
        System.out.println(estPresencial);
    }
}

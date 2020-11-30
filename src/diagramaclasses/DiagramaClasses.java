/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramaclasses;

/**
 *
 * @author Rodrigo
 */
public class DiagramaClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        cli.setNome("Rodrigo");
        
        System.out.println(cli.getNome());
    }
    
}

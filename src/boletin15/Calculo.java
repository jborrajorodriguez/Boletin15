package boletin15;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Calculo {
    private float notaEscrita1,notaEscrita2,practica,nBoletines,notaTotal;
   
   public void calculoDeNotas(){
       notaEscrita1=Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota de la primera proba escrita"));
       notaEscrita2=Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota de la segunda proba escrita"));
       practica=Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota de la proba practica"));
       nBoletines=Float.parseFloat(JOptionPane.showInputDialog("Introduce el numero de boletines"));
       notaTotal=(float) ((((notaEscrita1+notaEscrita2)/2)*0.4)+(practica*0.4));
       
       
     
      
         
       
   }
    

}

package boletin15;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Calculo {

    private float notaEscrita1, notaEscrita2, practica, nBoletines, nBoletinesTotal=17, notaTotal,notaBoletin;

    public void calculoDeNotas() {
        notaEscrita1=Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota de la primera proba escrita"));
        notaEscrita2=Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota de la segunda proba escrita"));
        practica=Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota de la proba practica"));
        nBoletines=Float.parseFloat(JOptionPane.showInputDialog("Introduce el numero de boletines"));

        if (nBoletines>(nBoletinesTotal/0.9)) {
            notaBoletin=2;
        }
        else if (nBoletines<nBoletinesTotal/0.9&&nBoletines>nBoletinesTotal/0.7) {
            notaBoletin=1;
        }
        else {
            notaBoletin=0;

        }

        notaTotal=(float) ((((notaEscrita1+notaEscrita2)/2)*0.4)+(practica*0.4))+notaBoletin;
        
        JOptionPane.showMessageDialog(null,"Nota de la avaliación = "+notaTotal);

    }

}

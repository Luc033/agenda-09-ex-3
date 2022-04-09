
package agenda.pkg9.ex.pkg3;

import javax.swing.JOptionPane;

public class Agenda9Ex3 {
    public static void main(String[] args) {

//    DECLARAÇÃO DE VARIÁVEIS
    int [] num = new int [5];
    int cont;
//      ENTRADA DE DADOS COM LAÇO for
    for (cont = 0; cont < 5; cont++ ){
    num[cont] = Integer.parseInt(JOptionPane.showInputDialog( "entre com valor" + (cont+1)));
}
    JOptionPane.showMessageDialog(null,  "resultado " +  num[4]); 
    JOptionPane.showMessageDialog(null,  "resultado " +  num[3]); 
    JOptionPane.showMessageDialog(null,  "resultado " +  num[2]); 
    JOptionPane.showMessageDialog(null,  "resultado " +  num[1]); 
    JOptionPane.showMessageDialog(null,  "resultado " +  num[0]); 
    
    }
}

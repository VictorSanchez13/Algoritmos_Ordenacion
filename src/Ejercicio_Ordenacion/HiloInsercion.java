package Ejercicio_Ordenacion;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class HiloInsercion extends Thread{

	static JPanel panel;
	int array[];
	
	public HiloInsercion (JPanel panel, int [] array){
		this.panel = panel;
		this.array = array;
	}
	
	public void run (){

	    for (int i = 1; i <= array.length - 1; i++) {
	        int x = array[i];
	        int j = i - 1;
	        while (j >= 0 && x < array[j]) {
	        	array[j + 1] = array[j];
	            j = j - 1;
 
	        }
	        array[j + 1] = x;
   
	    }
	    
	    
	    for (int i = 0; i < array.length; i++){
	    	((JButton)this.panel.getComponent(i)).setText(""+ array[i]);
	    	try {
				sleep(500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    	this.panel.getComponent(i).setBackground(Color.cyan);
	    }
	}
}

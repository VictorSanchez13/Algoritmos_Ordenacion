package Ejercicio_Ordenacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

public class Ordenacion extends JFrame {

	private JButton iniciar;
	private JPanel panel1, panel2, panel3;
	private JButton btn;
	int arrayAlgoritmo1[] = new int [20];
	int arrayAlgoritmo2[] = new int [20];
	int arrayAlgoritmo3[] = new int [20];


	
	public Ordenacion() 
	{
		for (int i = 0; i < 20; i++)
		{
			arrayAlgoritmo1[i] = (int) (Math.random()*100) + 1;
			arrayAlgoritmo2[i] = (int) (Math.random()*100) + 1;
			arrayAlgoritmo3[i] = (int) (Math.random()*100) + 1;
				
		}
		iniciarComponentes();
		iniciarArrays();
	}
	
	

	private void iniciarComponentes() 
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ordenacion");
		
		iniciar = new JButton();
		
		panel1 = new JPanel();
		GroupLayout jPanel1Layout = new GroupLayout(panel1);
		
		panel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );
        
		panel2 = new JPanel();
		GroupLayout jPanel2Layout = new GroupLayout(panel2);
		
		panel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );
		
		panel3 = new JPanel();
		GroupLayout jPanel3Layout = new GroupLayout(panel3);
		
		panel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );
		
		
		Font fuente = new Font("Comic Sans MS", 1, 36);
		SoftBevelBorder borde = new SoftBevelBorder(BevelBorder.RAISED);
		
		panel1.setFont(fuente);
		panel1.setBorder(borde);
		
		panel2.setFont(fuente);
		panel2.setBorder(borde);
		
		panel3.setFont(fuente);
		panel3.setBorder(borde);
		
		fuente = new Font("Times New Roman", 1, 24);
		iniciar.setFont(fuente);
		iniciar.setText("Iniciar");
		iniciar.setHorizontalAlignment(SwingConstants.CENTER);
		
		//Evento de escucha del boton iniciar
		iniciar.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent evt) {
				iniciarMouseClicked(evt);
			}

			

		});
		
		setBounds(100, 100, 1600, 800);
		
		 javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(500, 500, 500)
	                .addComponent(iniciar)
	                .addContainerGap(513, Short.MAX_VALUE))
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                	.addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    
	                    )
	                .addContainerGap())
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(43, 43, 43)
	                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(44, 44, 44)
	                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(44, 44, 44)
	                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(44, 44, 44)
	                .addComponent(iniciar)
	                .addContainerGap(169, Short.MAX_VALUE))
	        );

		
	}
	
	private void iniciarArrays() {
		this.panel1.setLayout(new GridLayout(1,20));
		for (int i = 0; i < arrayAlgoritmo1.length; i++)
		{
			btn = new JButton();
			String valor = String.valueOf(arrayAlgoritmo1[i]);
			btn.setText(valor);
			
			panel1.add(btn);
		
			
		}
		
		this.panel2.setLayout(new GridLayout(1,20));
		for (int i = 0; i < arrayAlgoritmo2.length; i++)
		{
			btn = new JButton();
			String valor = String.valueOf(arrayAlgoritmo2[i]);
			btn.setText(valor);

			panel2.add(btn);

			
			
		}
		
		this.panel3.setLayout(new GridLayout(1,20));
		for (int i = 0; i < arrayAlgoritmo3.length; i++)
		{
			btn = new JButton();
			String valor = String.valueOf(arrayAlgoritmo3[i]);
			btn.setText(valor);

			panel3.add(btn);
			
			
		}
		
	}
	
	private void iniciarMouseClicked(MouseEvent evt) {
		HiloBurbuja hb = new HiloBurbuja(panel1, arrayAlgoritmo1);
		HiloSeleccion hs = new HiloSeleccion(panel2, arrayAlgoritmo2);
		HiloInsercion hi = new HiloInsercion(panel3, arrayAlgoritmo3);
		
		hb.start(); //Burbuja
		hs.start(); //Seleccion
		hi.start(); //Insercion
		
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ordenacion frame = new Ordenacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}

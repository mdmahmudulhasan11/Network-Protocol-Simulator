
package linecoding;

import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class lc extends javax.swing.JFrame {

    public int x1=50, x2=50, y1=100, y2=100;
    int [] baud;
    int [] bit;
    public lc() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        techniques = new javax.swing.JComboBox<>();
        drawPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rcvData = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        input = new javax.swing.JTextArea();
        encode = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        clear1 = new javax.swing.JButton();
        decode = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        techniques.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        techniques.setForeground(new java.awt.Color(255, 255, 255));
        techniques.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NRZ-I", "NRZ-L", "Manchester", "Differential Manchester", "AMI", "Pseudoternary" }));

        javax.swing.GroupLayout drawPanelLayout = new javax.swing.GroupLayout(drawPanel);
        drawPanel.setLayout(drawPanelLayout);
        drawPanelLayout.setHorizontalGroup(
            drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        drawPanelLayout.setVerticalGroup(
            drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        rcvData.setColumns(20);
        rcvData.setRows(5);
        jScrollPane1.setViewportView(rcvData);

        input.setColumns(20);
        input.setRows(5);
        jScrollPane2.setViewportView(input);

        encode.setBackground(new java.awt.Color(51, 255, 51));
        encode.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        encode.setForeground(new java.awt.Color(255, 255, 255));
        encode.setText("Encode");
        encode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encodeActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(51, 255, 51));
        clear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        clear1.setBackground(new java.awt.Color(204, 0, 0));
        clear1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clear1.setForeground(new java.awt.Color(255, 255, 255));
        clear1.setText("Back");
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });

        decode.setBackground(new java.awt.Color(51, 255, 51));
        decode.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        decode.setForeground(new java.awt.Color(255, 255, 255));
        decode.setText("Decode");
        decode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decodeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Input Data");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Output Data");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Technique");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Line Coding");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(drawPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(techniques, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(encode, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(decode, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4))
                        .addGap(0, 47, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(encode, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(decode, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4)
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(techniques, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(48, 48, 48)
                .addComponent(drawPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void encode() {		
		
		
		char data[]=input.getText().toCharArray();
		
		
		if(techniques.getSelectedItem()=="NRZ-L") {
		baud = new int[data.length]; 
		 for(int i=0;i<data.length;i++){
	            if(data[i]=='1'){
	                baud[i]=50;
	            }
	            else{
	                baud[i]=-50;
	            }
	        }
		 
		 rcvData.setText(Arrays.toString(baud));
		draw(baud);
		}
		
		if(techniques.getSelectedItem()=="NRZ-I") {
			baud = new int[data.length]; 
			//baud[0]= 50;
			y1=50;
			if(data[0]=='1')
				baud[0]= -50;
			else
				baud[0]=50;
			 for(int i=1;i<data.length;i++){
		            if(data[i]=='1'){
		                baud[i]=-baud[i-1];
		            }
		            else{
		                baud[i]=baud[i-1];
		            }
		        }
			 
			 rcvData.setText(Arrays.toString(baud));
			draw(baud);
			}
		
		
		
		if(techniques.getSelectedItem()=="Manchester") {
			baud = new int[data.length*2];
			int j=0;
			 for(int i=0;i<data.length;i++){
		            if(data[i]=='1'){
		                baud[j]=50;
		                baud[j+1]=-50;
		            }
		            else{
		                baud[j]=-50;
		                baud[j+1]=+50;
		            }
                          
		            j=j+2;
		        }
			 
			 rcvData.setText(Arrays.toString(baud));
			draw1(baud);
			}
		
		if (techniques.getSelectedItem() == "Differential Manchester") {
            int j = 2;
            y1=50;
            baud = new int[data.length*2];
            if (data[0] == '1') {
                baud[0] = 50;
            } else if (data[0] == '0') {
                baud[0] = -50;
            }
            baud[1] = baud[0] * (-1);
            for (int i = 1; i < data.length; i++) {
                if (data[i] == '1') {
                    baud[j] = baud[j - 1];
                } else {
                    baud[j] = baud[j - 1]*(-1);
                }
                baud[++j] = baud[j - 1]*(-1);
                j++;
            }
            rcvData.setText(Arrays.toString(baud));
			draw1(baud);
        }
		
		if(techniques.getSelectedItem()=="AMI") {
			baud = new int[data.length]; 
			//baud[0]= 50;
			int count=0;
			 for(int i=0;i<data.length;i++){
				 
					 
		            if(data[i]=='1'){
		            	count++;
		            	if(count%2==0)
		                baud[i]= -50;
		            	else
		            		baud[i]= 50;
		            }
		            if(data[i]=='0')
		                baud[i]=0;
		            }
		        
			 
			 rcvData.setText(Arrays.toString(baud));
			draw(baud);
			}
		
		if(techniques.getSelectedItem()=="Pseudoternary") {
			baud = new int[data.length]; 
			
			int count=0;
			 for(int i=0;i<data.length;i++){
				 
					 
		            if(data[i]=='0'){
		            	count++;
		            	if(count%2==0)
		                baud[i]= -50;
		            	else
		            		baud[i]= 50;
		            }
		            if(data[i]=='1')
		                baud[i]=0;
		            }
		        
			 
			 rcvData.setText(Arrays.toString(baud));
			draw(baud);
			}
		
		
		
		
	}
        
   private void decode() {
		
		
		if(techniques.getSelectedItem()=="NRZ-L") {
			x1=300;y1=100;x2=300;y2=100;
			 int j=0;
		        bit=new int[baud.length];
		        for(int i=0;i<baud.length;i++){
		        	if(baud[i]==50){
		                bit[j]=1;
		                j++;
		            }
		            else {
		                bit[j]=0;
		                j++;
		            }
		        }
		        rcvData.setText(Arrays.toString(bit));
		}
	
		if(techniques.getSelectedItem()=="NRZ-I") {
			x1=300;y1=100;x2=300;y2=100;
			 int j=1;
		        bit=new int[baud.length];
		        if(baud[0]==50)
		        	bit[0]=0;
		        else
		        	bit[0]=1;
		        for(int i=1;i<baud.length;i++){
		        	if(baud[i-1]!=baud[i]){
		                bit[i]=1;
		               
		            }
		            else {
		                bit[i]=0;
		                
		            }
		        }
		        rcvData.setText(Arrays.toString(bit));
		}
	
		
		
		if(techniques.getSelectedItem()=="Manchester") {
			x1=300;y1=50;x2=300;y2=50;
			 int j=0;
		        bit=new int[baud.length/2];
		        for(int i=0;i<baud.length;i=i+2){
		             if(baud[i]==-50)
		            	 bit[j]=0;
		             else
		            	 bit[j]=1;
		             j++;
		        }
		        rcvData.setText(Arrays.toString(bit));
		}
		
		
		
		if(techniques.getSelectedItem()=="Differential Manchester") {
			 x1=300;y1=50;x2=300;y2=50;
			 int j=0;
		        bit=new int[baud.length/2];
		        for(int i=0;i<baud.length;i=i+2){
		        	if(i==0){
		                if(baud[i]==50) 
		                	bit[j]=1;
		                else bit[j]=0;
		                j++;
		        	}
		            else {
		            	if(baud[i]==baud[i-1]) 
		            		bit[j]=1;
		            	else bit[j]=0;
		                j++; 
		            }
		        }
		        rcvData.setText(Arrays.toString(bit));
		}
		
		if(techniques.getSelectedItem()=="AMI") {
			 x1=300;y1=100;x2=300;y2=100;
			 int j=0;
		        bit=new int[baud.length];
		        for(int i=0;i<baud.length;i++){
		        	if(baud[i]==50 || baud[i]==-50){
		                bit[j]=1;
		                j++;
		            }
		            else {
		                bit[j]=0;
		                j++;
		            }
		        }
		        rcvData.setText(Arrays.toString(bit));
		}
		
		
		if(techniques.getSelectedItem()=="Pseudoternary") {
			 x1=300;y1=100;x2=300;y2=100;
			 int j=0;
		        bit=new int[baud.length];
		        for(int i=0;i<baud.length;i++){
		        	if(baud[i]==50 || baud[i]==-50){
		                bit[j]=0;
		                j++;
		            }
		            else {
		                bit[j]=1;
		                j++;
		            }
		        }
		        rcvData.setText(Arrays.toString(bit));
		}
                x1=50; 
                x2=50; 
                y1=100; 
                y2=100;
		
		
	}
        
private void draw(int[] baud) {
    Graphics g = drawPanel.getGraphics();
    Graphics2D g2 = (Graphics2D) g;
    char data[]=input.getText().toCharArray();
   
    g2.setStroke(new BasicStroke(3)); 

  

    for (int i = 0; i < baud.length; i++) {
       
        if (baud[i] == 100 - y1) {
            
            y2 = y1;
            x2 = x1 + 30;
        
            g2.drawLine(x1, y1, x2, y2);
        } else {
            
            x2 = x1;
            y2 = 100 - baud[i];
           
           g2.drawLine(x1, y1, x2, y2);
            y1 = y2;
            x2 = x1 + 30;
          
           g2.drawLine(x1, y1, x2, y2);
        }

       
        g2.drawString(String.valueOf(data[i]), x1 + 10, 180);

        x1 = x2;
        y1 = y2;
    }

    
    g2.setStroke(new BasicStroke(1)); 
    g2.drawLine(50, 20, 50, 180);
    g2.drawLine(50, 100, drawPanel.getWidth() - 10, 100); 

    
    g2.setFont(new Font("Arial", Font.PLAIN, 12));

  

    
    g2.drawString("0", 30, 100);    
    g2.drawString("+50", 30, 50);   
    g2.drawString("-50", 30, 150); 
    x1=50; 
    x2=50; 
    y1=100; 
    y2=100;
}
private void draw1(int[] baud) {
    Graphics g = drawPanel.getGraphics();
    Graphics2D g2 = (Graphics2D) g;
    char data[] = input.getText().toCharArray();
    float x = 103;
  
    g2.setStroke(new BasicStroke(3));

    for (int i = 0; i < baud.length; i++) {

        if (baud[i] == 100 - y1) {
            y2 = y1;
            x2 = x1 + 30;
            g2.drawLine(x1, y1, x2, y2);
        } else {
            x2 = x1;
            y2 = 100 - baud[i];
            g2.drawLine(x1, y1, x2, y2);
            y1 = y2;
            x2 = x1 + 30;
            g2.drawLine(x1, y1, x2, y2);
        }
         System.out.println(x1);
        
      
        if (i < data.length) { 
            g2.drawString(String.valueOf(data[i]),  x, 180); 
            x +=61;
        }

        x1 = x2;
        y1 = y2;
    }

  
    g2.setStroke(new BasicStroke(1)); 
    g2.drawLine(50, 20, 50, 180); 
    g2.drawLine(50, 100, drawPanel.getWidth() - 10, 100); 

    
    g2.setFont(new Font("Arial", Font.PLAIN, 12));

    
    g2.drawString("0", 30, 100); 
    g2.drawString("+50", 30, 50); 
    g2.drawString("-50", 30, 150); 
     x1=50; 
    x2=50; 
    y1=100; 
    y2=100;
}
    
    
    private void encodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encodeActionPerformed
            encode();

    }//GEN-LAST:event_encodeActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
              repaint();
    }//GEN-LAST:event_clearActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
        MainMenu m = new MainMenu();
       this.setVisible(false);
       m.setVisible(true);
    }//GEN-LAST:event_clear1ActionPerformed

    private void decodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decodeActionPerformed
       decode();
    }//GEN-LAST:event_decodeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(lc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton clear1;
    private javax.swing.JButton decode;
    private javax.swing.JPanel drawPanel;
    private javax.swing.JButton encode;
    private javax.swing.JTextArea input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea rcvData;
    private javax.swing.JComboBox<String> techniques;
    // End of variables declaration//GEN-END:variables
}

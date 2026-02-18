
package linecoding;
import static java.lang.constant.ConstantDescs.NULL;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class HammingCode extends javax.swing.JFrame {
    
    int[] in = new int[32];
     int[] cd = new int[32];

     int hCalc(int p, int cl) {
        int c = 0;
        int i = p - 1;
        while (i < cl) {
            for (int j = i; j < i + p; j++) {
                if (cd[j] == 1)
                    c++;
            }
            i = i + 2 * p;
        }
        return c % 2;
    }

    int calcP(int[] r, int p, int cl) {
        int c = 0;
        int i = p - 1;
        while (i < cl) {
            for (int j = i; j < i + p; j++) {
                if (r[j] == 1)
                    c++;
            }
            i = i + 2 * p;
        }
        return c % 2;
    }

     void solve(int[] in, int n){ 
         r.setEnabled(false);
       StringBuilder pritext = new StringBuilder();
       StringBuilder pritext1 = new StringBuilder();
       String s1;
       String s2;
        int p_n = 0, cl, j, k;
        int i = 0;
        while (n > (int) Math.pow(2, i) - (i + 1)) {
            p_n++;
            i++;
        }
        cl = p_n + n;
        j = k = 0;
        for (i = 0; i < cl; i++) {
            if (i == ((int) Math.pow(2, k) - 1)) {
                cd[i] = 0;
                k++;
            } else {
                cd[i] = in[j];
                j++;
            }
        }
        for (i = 0; i < p_n; i++) {
            int p = (int) Math.pow(2, i);
            int v = hCalc(p, cl);
            cd[p - 1] = v;
        }
        System.out.println("\nThe length of the Hamming Code is: " + cl);
        ni.setText(Integer.toOctalString(cl));
        System.out.println("The parity bits are:");
        
        for (i = 0; i < p_n; i++) {
            
            int p = (int) Math.pow(2, i) - 1;
            System.out.println("p" + (p + 1) + "=" + cd[p]);
            pritext.append("p").append(p + 1).append("=").append(cd[p]).append("\n");
            pri.setText(pritext.toString()); 
            pri.repaint();
           
              
        }
        
        pri.setText(pritext.toString());
        
           System.out.print("\nThe generated Code Word is: ");
        for (i = 0; i < cl; i++) {
            System.out.print(cd[i] + " ");
            pritext1.append(cd[i]);
        }
        gm.setText(pritext1.toString());
        System.out.println();
        
       
    }
     
     
     
     void solve2(int[] in,int n){
         
       StringBuilder pritext = new StringBuilder();
       StringBuilder pritext1 = new StringBuilder();
       StringBuilder pritext2 = new StringBuilder();



        int p_n = 0, cl, j, k;
        int i = 0;
        while (n > (int) Math.pow(2, i) - (i + 1)) {
            p_n++;
            i++;
        }
        cl = p_n + n;
         
       

        int[] rc = new int[32];
        
        
          String s = rechieve.getText(); 
    if(s.length() != cl){
        if(s.length() == 0) {
            JOptionPane.showMessageDialog(this, "Please Enter The Receive code");
        }else{
            JOptionPane.showMessageDialog(this, "Please enter the correct Hamming code length");
        }
          
    }
    else if(s.length()> 0 ){
        
    
    for (i = 0; i < cl; i++) {
        char c = s.charAt(i);
        
        rc[i] = Character.getNumericValue(c);
        System.out.println(rc[i]);
    }

        
        
        
        System.out.println("The parity bits in the received code are:");
        for (i = 0; i < p_n; i++) {
            int p = (int) Math.pow(2, i) - 1;
            int v = calcP(rc, p + 1, cl);
            System.out.println("p" + (p + 1) + "=" + v);
            pritext.append("p").append(p + 1).append("=").append(v).append("\n");
          
        }
           pri1.setText(pritext.toString());
        int e_p = 0;
        for (i = 0; i < p_n; i++) {
            int p = (int) Math.pow(2, i);
            int c = 0;
            for (j = p - 1; j < cl; j += 2 * p) {
                for (k = 0; k < p && j + k < cl; k++) {
                    if (rc[j + k] == 1) {
                        c++;
                    }
                }
            }
            if (c % 2 != 0) {
                e_p += p;
            }
        }
        if (e_p != 0) {
            System.out.println("\nError detected at bit position: " + e_p);
            ch.setText(Integer.toString(e_p));
            rc[e_p - 1] = (rc[e_p - 1] == 1) ? 0 : 1;
            System.out.print("Corrected Hamming code is: ");
            for (i = 0; i < cl; i++) {
                System.out.print(rc[i] + " ");
                 pritext1.append(rc[i]);
        }
        bp.setText(pritext1.toString());

            System.out.println();
        } else {
            System.out.println("\nNo error detected in the received Hamming code.");
            ch.setText("No error detected in the received hamming code");
            bp.setText("No error detection bit is present.");

        }
     }else{
        JOptionPane.showMessageDialog(this, "Please Enter The Receive code");
    }
    
    
    r.setEnabled(true);
     }

   void ham1(){
    String s = input.getText(); 
    
    
    for (int j = 0; j < s.length(); j++) {
        char c = s.charAt(j);
        
        in[j] = Character.getNumericValue(c);
    }
    
    
   solve(in, s.length());
    }
    void ham2(){
    String s = input.getText(); 
    
    
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        
        in[i] = Character.getNumericValue(c);
        System.out.println(in[i]);
    }
    
    
   solve2(in,s.length());
    }
    
    public HammingCode() {
        initComponents();
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        input = new javax.swing.JTextField();
        r = new javax.swing.JButton();
        pri = new javax.swing.JTextField();
        rechieve = new javax.swing.JTextField();
        encode1 = new javax.swing.JButton();
        pri1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        gm = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ni = new javax.swing.JTextField();
        bp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ref = new javax.swing.JButton();
        encode3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        r.setBackground(new java.awt.Color(51, 255, 51));
        r.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        r.setForeground(new java.awt.Color(255, 255, 255));
        r.setText("Hamming Code");
        r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rActionPerformed(evt);
            }
        });

        pri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priActionPerformed(evt);
            }
        });

        rechieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechieveActionPerformed(evt);
            }
        });

        encode1.setBackground(new java.awt.Color(51, 255, 0));
        encode1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        encode1.setForeground(new java.awt.Color(255, 255, 255));
        encode1.setText("Error Check");
        encode1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encode1ActionPerformed(evt);
            }
        });

        pri1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pri1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Currected Hamming code");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Error Bit Position");

        ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Parity of Input Bits");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Parity of Rechieved Bits");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hamming Code Error Detection & Correction");

        gm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gmActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Hamming code");

        ni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                niActionPerformed(evt);
            }
        });

        bp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Length");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Rechieved Bits");

        ref.setBackground(new java.awt.Color(51, 255, 51));
        ref.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ref.setForeground(new java.awt.Color(255, 255, 255));
        ref.setText("Refresh");
        ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refActionPerformed(evt);
            }
        });

        encode3.setBackground(new java.awt.Color(255, 0, 51));
        encode3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        encode3.setForeground(new java.awt.Color(255, 255, 255));
        encode3.setText("Back");
        encode3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encode3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Input Bits");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12))
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ni, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pri, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gm, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rechieve, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pri1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ch, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bp, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(437, 437, 437)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ref, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(encode1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(encode3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rechieve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel12)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ch, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(ni, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gm, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pri, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(pri1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(encode1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ref, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(encode3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rActionPerformed
        ham1();
      //  ham2();
    }//GEN-LAST:event_rActionPerformed

    private void priActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priActionPerformed

    private void rechieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechieveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rechieveActionPerformed

    private void encode1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encode1ActionPerformed
        ham2();
    }//GEN-LAST:event_encode1ActionPerformed

    private void pri1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pri1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pri1ActionPerformed

    private void chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chActionPerformed

    private void gmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gmActionPerformed

    private void niActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_niActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_niActionPerformed

    private void bpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bpActionPerformed

    private void refActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refActionPerformed
        input.setText("");
        ni.setText("");
        gm.setText("");
        pri.setText("");
        rechieve.setText("");
        ch.setText("");
        bp.setText("");
        pri1.setText("");
        r.setEnabled(true);
    }//GEN-LAST:event_refActionPerformed

    private void encode3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encode3ActionPerformed
        MainMenu m = new MainMenu();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_encode3ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HammingCode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bp;
    private javax.swing.JTextField ch;
    private javax.swing.JButton encode1;
    private javax.swing.JButton encode3;
    private javax.swing.JTextField gm;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField ni;
    private javax.swing.JTextField pri;
    private javax.swing.JTextField pri1;
    private javax.swing.JButton r;
    private javax.swing.JTextField rechieve;
    private javax.swing.JButton ref;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package area_Calculator;

/**
 *
 * @author liezel
 */
public class newFrame extends javax.swing.JFrame {

    /**
     * Creates new form newFrame
     */
    public newFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setBackground(new java.awt.Color(255, 204, 255));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(255, 204, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acres", "Square meters", "Square feet", "Square inches", "Ares", "Hectares" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Area Calculator");

        jTextField3.setBackground(new java.awt.Color(255, 204, 255));

        jComboBox3.setBackground(new java.awt.Color(255, 204, 204));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acres", "Square meters", "Square feet", "Square inches", "Ares", "Hectares" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double num = Double.parseDouble(jTextField1.getText());
        if(jComboBox1.getSelectedItem().toString() == "Acres"&&jComboBox2.getSelectedItem().toString() == "Square meters"){
            double result = num*4047;
            jTextField2.setText(result+"");
        }
         if(jComboBox1.getSelectedItem().toString() == "Acres"&&jComboBox2.getSelectedItem().toString() == "Square feet"){
            double result = num*43560;
            jTextField2.setText(result+"");
        }
          if(jComboBox1.getSelectedItem().toString() == "Acres"&&jComboBox2.getSelectedItem().toString() == "Square inches"){
            double result = num*6.273e+6;
            jTextField2.setText(result+"");
        }
           if(jComboBox1.getSelectedItem().toString() == "Acres"&&jComboBox2.getSelectedItem().toString() == "Ares"){
            double result = num*40.469;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Acres"&&jComboBox2.getSelectedItem().toString() == "Hectares"){
            double result = num/2.471;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Square meters"&&jComboBox2.getSelectedItem().toString() == "Acres"){
            double result = num/4047;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Square meters"&&jComboBox2.getSelectedItem().toString() == "Square feet"){
            double result = num*10.764;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Square meters"&&jComboBox2.getSelectedItem().toString() == "Square inches"){
            double result = num*1550;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Square meters"&&jComboBox2.getSelectedItem().toString() == "Ares"){
            double result = num/100;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Square meters"&&jComboBox2.getSelectedItem().toString() == "Hectares"){
            double result = num/10000;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Square feet"&&jComboBox2.getSelectedItem().toString() == "Acres"){
            double result = num/43560;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Square feet"&&jComboBox2.getSelectedItem().toString() == "Square meters"){
            double result = num/10.764;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Square feet"&&jComboBox2.getSelectedItem().toString() == "Square inches"){
            double result = num*144;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Square feet"&&jComboBox2.getSelectedItem().toString() == "Ares"){
            double result = num/1076;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Square feet"&&jComboBox2.getSelectedItem().toString() == "Hectares"){
            double result = num/107600;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Square inches"&&jComboBox2.getSelectedItem().toString() == "Acres"){
            double result = num/6.273e+6;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Square inches"&&jComboBox2.getSelectedItem().toString() == "Square meters"){
            double result = num/1550;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Square inches"&&jComboBox2.getSelectedItem().toString() == "Square feet"){
            double result = num/144;
            jTextField2.setText(result+"");
        }
           
            if(jComboBox1.getSelectedItem().toString() == "Square inches"&&jComboBox2.getSelectedItem().toString() == "Ares"){
            double result = num/155000;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Square inches"&&jComboBox2.getSelectedItem().toString() == "Hectares"){
            double result = num/1.55e+7;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Ares"&&jComboBox2.getSelectedItem().toString() == "Acres"){
            double result = num*1076;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Ares"&&jComboBox2.getSelectedItem().toString() == "Square meters"){
            double result = num*100;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Ares"&&jComboBox2.getSelectedItem().toString() == "Square feet"){
            double result = num*1076;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Ares"&&jComboBox2.getSelectedItem().toString() == "Square inches"){
            double result = num*155000;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Ares"&&jComboBox2.getSelectedItem().toString() == "Hectares"){
            double result = num/100;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Hectares"&&jComboBox2.getSelectedItem().toString() == "Acres"){
            double result = num*2.71;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Hectares"&&jComboBox2.getSelectedItem().toString() == "Square meters"){
            double result = num*10000;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Hectares"&&jComboBox2.getSelectedItem().toString() == "Square feet"){
            double result = num*107600;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Hectares"&&jComboBox2.getSelectedItem().toString() == "Square inches"){
            double result = num*1.55e+7;
            jTextField2.setText(result+"");
        }
            if(jComboBox1.getSelectedItem().toString() == "Hectares"&&jComboBox2.getSelectedItem().toString() == "Ares"){
            double result = num*100;
            jTextField2.setText(result+"");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        newFrame frame = new newFrame();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(newFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

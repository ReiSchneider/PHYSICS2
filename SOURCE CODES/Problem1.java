/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package specificheat;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;

/**
 *
 * @author Kyle Cancio
 */
public class Problem1 extends javax.swing.JFrame {

    /**
     * Creates new form Problem1
     */
    public Problem1() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        calVal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        massVal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ToText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TfText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        solveB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SolutionField = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        givenField = new javax.swing.JTextPane();
        answerField = new javax.swing.JTextField();
        clearB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Word Problem 1: Specific Heat");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                openMenu(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Klavika Regular", 0, 18)); // NOI18N
        jLabel1.setText("Word Problem 1: Specific Heat");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Given an unknown metal, calculate the specific heat that required ");

        calVal.setName(""); // NOI18N
        calVal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calValActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("cal");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("of heat to raise the temperature of a");

        massVal.setName(""); // NOI18N
        massVal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                massValActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("g metal from");

        ToText.setName(""); // NOI18N
        ToText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToTextActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("<html>&#x2103 to</html> ");

        TfText.setName(""); // NOI18N
        TfText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfTextActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("<html>&#x2103</html>");

        solveB.setText("SOLVE!");
        solveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveBActionPerformed(evt);
            }
        });

        SolutionField.setContentType("text/html"); // NOI18N
        SolutionField.setText("<b>SOLUTION</b>");
        jScrollPane1.setViewportView(SolutionField);

        givenField.setEditable(false);
        givenField.setContentType("text/html"); // NOI18N
        givenField.setText("<b>GIVEN:</b>"
            + "<br>"
            + "Q: "
            + "<br>"
            + "m: "
            + "<br>"
            + "To: "
            + "<br>"
            + "Tf: "
            + "<br>"
            + "<b>REQUIRED:</b>"
            + "<br>"
            + "c?"
            + "<br>"
            + "<b>EQUATION:</b>"
            + "c = Q / mc&#916;T");
        jScrollPane2.setViewportView(givenField);

        answerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerFieldActionPerformed(evt);
            }
        });
        answerField.setText("ANSWER: ");

        clearB.setText("CLEAR");
        clearB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jScrollPane2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(answerField)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(TfText, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel7)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(10, 10, 10)
                                                    .addComponent(clearB, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(massVal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel5)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(solveB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addGap(1, 1, 1)
                                                    .addComponent(ToText, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 21, Short.MAX_VALUE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(calVal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addGap(20, 20, 20)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(calVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(massVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(ToText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TfText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(solveB)
                    .addComponent(clearB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(answerField)))
                .addContainerGap())
        );

        calVal.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkVals(String cal, String mass, String To, String Tf) throws NumberFormatException,raiseTempValue, noNegativeMass{
        if (cal.equals("") || mass.equals("") || To.equals("") || Tf.equals("")){
            throw new NumberFormatException();
        
        }else{
            double calm, m, inim, finm;
            calm = Double.parseDouble(cal);
            m = Double.parseDouble(mass);
            if(m < 0){
                throw new noNegativeMass();
            }else{
            inim = Double.parseDouble(To);
            finm = Double.parseDouble(Tf);
            if(finm <= inim){
                throw new raiseTempValue();
            }else{
                String x = null;
                try {
                   x =  givenField.getDocument().getText(0, givenField.getDocument().getLength()) ;
                } catch (BadLocationException ex) {
                    Logger.getLogger(SpecificHeatGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                givenField.setText("<b>GIVEN:</b>"
                + "<br>"
                + "Q: " + String.valueOf(calm) + "cal"
                + "<br>"
                + "m: " + String.valueOf(m) + "g"
                + "<br>"
                + "To: " + String.valueOf(inim) + "&#x2103;"
                + "<br>"
                + "Tf: " + String.valueOf(finm) + "&#x2103;"
                + "<br>"
                + "<b>REQUIRED:</b>"
                + "<br>"
                + "c?"
                + "<br>"
                + "<b>EQUATION:</b>"
                + "c = Q / mc&#916;T");
                
                String finalAns = String.valueOf(solveC(calm, m, inim, finm));
                
                x = null;
                try {
                   x =  SolutionField.getDocument().getText(0, SolutionField.getDocument().getLength()) ;
                } catch (BadLocationException ex) {
                    Logger.getLogger(SpecificHeatGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                SolutionField.setText("<b>SOLUTION:</b>"
                + "<br>"
                + "c =  (" + String.valueOf(calm) + "cal) / (" + String.valueOf(m) + "g)(" + String.valueOf(finm) + " - " + String.valueOf(inim) + ")&#x2103;"
                + "<br>"
                + "c = <b>" + finalAns + "</b> cal/g-&#x2103;");
                
                answerField.setText("ANSWER: " + finalAns + " cal/g-C");
        
            }
           }
        }
    }
    
    private double solveC(Double cal, Double mass, Double To, Double Tf){
        double retVal = 0.0;
        
        retVal = (double)Math.round(((cal)/(mass*(Tf-To)))*1000)/1000;
        
        return retVal;
    }
    
    private void ToTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToTextActionPerformed

    private void TfTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfTextActionPerformed

    private void calValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calValActionPerformed

    private void massValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_massValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_massValActionPerformed

    private void solveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveBActionPerformed
        try{
            checkVals(calVal.getText(),massVal.getText(), ToText.getText(), TfText.getText());
        }
        catch(noNegativeMass nnm){
            JOptionPane.showMessageDialog(null, "Mass cannot be negative", "Warning", JOptionPane.ERROR_MESSAGE);
        }
        catch(raiseTempValue rtv){
            JOptionPane.showMessageDialog(null, "'From [temperature]' cannot be higher than 'to [temperature]'", "Warning", JOptionPane.ERROR_MESSAGE);
        }
        catch(NumberFormatException nfe){
            if(calVal.equals("") || massVal.equals("") || ToText.equals("") || TfText.equals("")){
                JOptionPane.showMessageDialog(null, "Fields cannot be left blank", "Warning", JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid Input", "Warning", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_solveBActionPerformed

    private void answerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerFieldActionPerformed

    private void openMenu(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_openMenu
        new MenuSelector().setVisible(true);
        evt.getWindow().dispose();
    }//GEN-LAST:event_openMenu

    private void clearBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBActionPerformed
        calVal.setText("");
        massVal.setText("");
        ToText.setText("");
        TfText.setText("");
        givenField.setText("<b>GIVEN:</b>"
            + "<br>"
            + "Q: "
            + "<br>"
            + "m: "
            + "<br>"
            + "To: "
            + "<br>"
            + "Tf: "
            + "<br>"
            + "<b>REQUIRED:</b>"
            + "<br>"
            + "c?"
            + "<br>"
            + "<b>EQUATION:</b>"
            + "c = Q / mc&#916;T");
        SolutionField.setText("<b>SOLUTION</b>");
        answerField.setText("ANSWER: ");

    }//GEN-LAST:event_clearBActionPerformed

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
            java.util.logging.Logger.getLogger(Problem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Problem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Problem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Problem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Problem1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane SolutionField;
    private javax.swing.JTextField TfText;
    private javax.swing.JTextField ToText;
    private javax.swing.JTextField answerField;
    private javax.swing.JTextField calVal;
    private javax.swing.JButton clearB;
    private javax.swing.JTextPane givenField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField massVal;
    private javax.swing.JButton solveB;
    // End of variables declaration//GEN-END:variables
}

class raiseTempValue extends Exception{}

class noNegativeMass extends Exception{}
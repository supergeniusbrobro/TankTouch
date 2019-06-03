
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Component;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.JFrame;

/**
 *
 * @author chenm7302
 */
public class TitleFrame extends javax.swing.JFrame {

    /**
     * Creates new form TitleFrame
     */
    public ArrayList<String> tl = new ArrayList<String>();
    public ArrayList<int[]> kb = new ArrayList<int[]>();
    int pcount = 0;

    public TitleFrame() {
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

        mainPanel = new javax.swing.JPanel();
        TitleLBL = new javax.swing.JLabel();
        infoTF = new javax.swing.JTextField();
        pCountLBL = new javax.swing.JLabel();
        loadKeysTF = new javax.swing.JTextField();
        loadKeysBTN = new javax.swing.JButton();
        StartBTN = new javax.swing.JButton();
        formatLBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setPreferredSize(new java.awt.Dimension(1440, 900));

        TitleLBL.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        TitleLBL.setForeground(new java.awt.Color(150, 20, 255));
        TitleLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLBL.setText("Tank Touch");
        TitleLBL.setToolTipText("");

        infoTF.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        infoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoTFActionPerformed(evt);
            }
        });
        infoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                infoTFKeyReleased(evt);
            }
        });

        pCountLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pCountLBL.setText("Player Count: 0");

        loadKeysTF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        loadKeysBTN.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        loadKeysBTN.setText("Load Keybinds");
        loadKeysBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadKeysBTNActionPerformed(evt);
            }
        });

        StartBTN.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        StartBTN.setText("Start");
        StartBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartBTNActionPerformed(evt);
            }
        });

        formatLBL.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        formatLBL.setText("Name LTurn RTurn Shoot");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(364, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(formatLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pCountLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(infoTF)
                            .addComponent(TitleLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                        .addGap(556, 556, 556))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(loadKeysTF, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadKeysBTN)
                        .addGap(480, 480, 480))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(StartBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(596, 596, 596))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(TitleLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(infoTF, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(formatLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(pCountLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loadKeysTF)
                    .addComponent(loadKeysBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(StartBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(437, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void infoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_infoTFActionPerformed

    private void infoTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_infoTFKeyReleased
        // Checks if 4 inputs
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            String[] inp = infoTF.getText().split(" ");
            if (inp.length == 4 && inp[1].length() == 1 && inp[2].length() == 1 && inp[3].length() == 1) {
                tl.add(inp[0]);
                //kb.add(new int[]{(int) inp[1].charAt(0), (int) inp[2].charAt(0), (int) inp[3].charAt(0)});
                kb.add(new int[]{(int) (char) Character.toUpperCase(inp[1].charAt(0)), (int)(char) Character.toUpperCase(inp[2].charAt(0)),(int) (char) Character.toUpperCase(inp[3].charAt(0))});
                pcount++;
                pCountLBL.setText("Player Count: " + pcount);
            } else {
                infoTF.setText("Incorrect formatting");
            }
        }
    }//GEN-LAST:event_infoTFKeyReleased

    private void loadKeysBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadKeysBTNActionPerformed
        // TODO add your handling code here:
        Scanner scn = new Scanner("keys.txt");
        int num = scn.nextInt();
        int pnum = (int) loadKeysTF.getText().charAt(0);
        if (num > pnum) {
            for (int i = 0; i < pnum; i++) {
                String[] inp = infoTF.getText().trim().split(" ");
                if (inp.length == 4 && inp[1].length() == 1 && inp[2].length() == 1 && inp[3].length() == 1) {
                    tl.add(inp[0]);
                    kb.add(new int[]{(int) (char) Character.toUpperCase(inp[1].charAt(0)), (int)(char) Character.toUpperCase(inp[2].charAt(0)),(int) (char) Character.toUpperCase(inp[3].charAt(0))});
                    System.out.print(inp[1].charAt(0));
                    pcount++;
                    pCountLBL.setText("Player Count: " + pcount);
                }
            }
        }
        else{
            loadKeysTF.setText("Not enough keybinds stored");
        }
    }//GEN-LAST:event_loadKeysBTNActionPerformed

    private void StartBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartBTNActionPerformed
        // TODO add your handling code here:
        TankTouch go = new TankTouch(kb, tl);
    }//GEN-LAST:event_StartBTNActionPerformed

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
            java.util.logging.Logger.getLogger(TitleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TitleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TitleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TitleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TitleFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton StartBTN;
    private javax.swing.JLabel TitleLBL;
    private javax.swing.JLabel formatLBL;
    private javax.swing.JTextField infoTF;
    private javax.swing.JButton loadKeysBTN;
    private javax.swing.JTextField loadKeysTF;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel pCountLBL;
    // End of variables declaration//GEN-END:variables
}

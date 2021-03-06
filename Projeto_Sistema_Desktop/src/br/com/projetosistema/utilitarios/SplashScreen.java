package br.com.projetosistema.utilitarios;

import br.com.projetosistema.controle.ConectaBanco;
import br.com.projetosistema.visao.JfrmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     *
     */
    private Timer t;
    private ActionListener al;

    public SplashScreen() {

        al = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (jProgressBarSplash.getValue() < 100) {
                    jProgressBarSplash.setValue(jProgressBarSplash.getValue() + 1);
                    if (jProgressBarSplash.getValue() < 40) {
                        jLFraseCarregando.setText("Carregando Banco de Dados");
                        if (jProgressBarSplash.getValue() > 30 && jProgressBarSplash.getValue() < 40) {
                            testConectaBanco();
                        } 
                    } else {
                        if (jProgressBarSplash.getValue() < 70) {
                            jLFraseCarregando.setText("Abrindo Interface");
                           if (jProgressBarSplash.getValue() > 60 && jProgressBarSplash.getValue() < 70) {
                                testAberturaInterface();
                            }
                        } else {
                            if (jProgressBarSplash.getValue() < 100) {
                                jLFraseCarregando.setText("Abrindo Sistema");
                            } else {
                            }
                        }
                    }

                } else {
                    t.stop();
                    mostraTela();
                }
            }

        };
        t = new Timer(80, al);
        initComponents();
        t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBarSplash = new javax.swing.JProgressBar();
        jLFraseCarregando = new javax.swing.JLabel();
        jLImagem = new javax.swing.JLabel();

        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jProgressBarSplash.setStringPainted(true);
        getContentPane().add(jProgressBarSplash);
        jProgressBarSplash.setBounds(420, 297, 190, 30);
        getContentPane().add(jLFraseCarregando);
        jLFraseCarregando.setBounds(420, 340, 190, 20);

        jLImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem_projeto/java-800x480.jpg"))); // NOI18N
        jLImagem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLImagemFocusLost(evt);
            }
        });
        getContentPane().add(jLImagem);
        jLImagem.setBounds(0, 0, 740, 440);

        setSize(new java.awt.Dimension(744, 437));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLImagemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLImagemFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jLImagemFocusLost

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }

        });

    }

    private void mostraTela() {
        JfrmPrincipal frmPrincipal = new JfrmPrincipal();
        frmPrincipal.setLocationRelativeTo(null);
        frmPrincipal.setVisible(true);
        this.dispose();
    }

    private void testConectaBanco() {
        ConectaBanco cb = new ConectaBanco();
        cb.conecta();
        System.out.println("Conectado com sucesso");
    }

    private void testAberturaInterface() {
        System.out.println("logica da interface");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLFraseCarregando;
    private javax.swing.JLabel jLImagem;
    private javax.swing.JProgressBar jProgressBarSplash;
    // End of variables declaration//GEN-END:variables
}

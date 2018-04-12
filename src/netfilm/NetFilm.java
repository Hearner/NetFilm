/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netfilm;

/**
 *
 * @author Champeau
 */
public class NetFilm extends javax.swing.JFrame  {

    /**
     * Creates new form NetFilm
     */
    public NetFilm() {
        initComponents();
        initDependencies();
        
        et = EtatType.FILM;
        disconnect();
        
        afficherAccueil();
    }
    
    public void initDependencies() {
        jPanelConnecté1.init(this);
        jPanelDéconnecté1.init(this);
        pageCinéma1.init(this);
        pageFilm2.init(this);
        prochainesSorties1.init(this);
        rechercheCinéma1.init(this);
        rechercheFilm1.init(this);
        filmsALAffiche1.init(this);
        monCompteConnecté1.init(this);
        monCompteDéconnecté1.init(this);
        panelHeader1.init(this);
    }

    public void connect() {
        this.ec = EtatConnexion.CONNECTE;
        jPanel3.removeAll();
        jPanel3.add(jPanelConnecté1);
        jPanel3.repaint();
        jPanel3.revalidate();
    }
    
    public void disconnect() {
        this.ec = EtatConnexion.DECONNECT;
        jPanel3.removeAll();
        jPanel3.add(jPanelDéconnecté1);
        jPanel3.repaint();
        jPanel3.revalidate();
    }
    
    public void afficherAccueil() {
        jPanel2.removeAll();
        jPanel2.add(accueil1);
        jPanel2.repaint();
        jPanel2.revalidate();
        
        jBAccueil.setEnabled(false);
        jBFAffiche.setEnabled(true);
        jBMCompte.setEnabled(true);
        jBPSortie.setEnabled(true);
    }
    
    public void afficherFilmAffiche() {
        jPanel2.removeAll();
        jPanel2.add(filmsALAffiche1);
        jPanel2.repaint();
        jPanel2.revalidate();
        
        jBAccueil.setEnabled(true);
        jBFAffiche.setEnabled(false);
        jBMCompte.setEnabled(true);
        jBPSortie.setEnabled(true);
    }
    
    public void afficherMonCompte() {
        jPanel2.removeAll();
        switch (ec) {
            case CONNECTE:
                jPanel2.add(monCompteConnecté1);
                break;
            case DECONNECT:
                jPanel2.add(monCompteDéconnecté1);
                break;
        }
        jPanel2.repaint();
        jPanel2.revalidate();
        
        jBAccueil.setEnabled(true);
        jBFAffiche.setEnabled(true);
        jBMCompte.setEnabled(false);
        jBPSortie.setEnabled(true);
    }
    
    public void afficherProchaineSortie() {
        jPanel2.removeAll();
        jPanel2.add(prochainesSorties1);
        jPanel2.repaint();
        jPanel2.revalidate();
        
        jBAccueil.setEnabled(true);
        jBFAffiche.setEnabled(true);
        jBMCompte.setEnabled(true);
        jBPSortie.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBAccueil = new javax.swing.JButton();
        jBFAffiche = new javax.swing.JButton();
        jBPSortie = new javax.swing.JButton();
        jBMCompte = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        monCompteDéconnecté1 = new netfilm.MonCompteDéconnecté();
        filmsALAffiche1 = new netfilm.FilmsALAffiche();
        rechercheFilm1 = new netfilm.RechercheFilm();
        rechercheCinéma1 = new netfilm.RechercheCinéma();
        prochainesSorties1 = new netfilm.ProchainesSorties();
        pageFilm2 = new netfilm.PageFilm();
        pageCinéma1 = new netfilm.PageCinéma();
        accueil1 = new netfilm.Accueil();
        monCompteConnecté1 = new netfilm.MonCompteConnecté();
        jPanel3 = new javax.swing.JPanel();
        jPanelDéconnecté1 = new netfilm.JPanelDéconnecté();
        jPanelConnecté1 = new netfilm.JPanelConnecté();
        panelHeader1 = new netfilm.PanelHeader();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(713, 662));

        jBAccueil.setText("Accueil");
        jBAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAccueilActionPerformed(evt);
            }
        });

        jBFAffiche.setText("Films à l'affiche");
        jBFAffiche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFAfficheActionPerformed(evt);
            }
        });

        jBPSortie.setText("Prochaines sorties");
        jBPSortie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPSortieActionPerformed(evt);
            }
        });

        jBMCompte.setText("Mon compte");
        jBMCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMCompteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBAccueil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBFAffiche)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBPSortie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBMCompte)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAccueil)
                    .addComponent(jBFAffiche)
                    .addComponent(jBPSortie)
                    .addComponent(jBMCompte))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout monCompteDéconnecté1Layout = new javax.swing.GroupLayout(monCompteDéconnecté1);
        monCompteDéconnecté1.setLayout(monCompteDéconnecté1Layout);
        monCompteDéconnecté1Layout.setHorizontalGroup(
            monCompteDéconnecté1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
        );
        monCompteDéconnecté1Layout.setVerticalGroup(
            monCompteDéconnecté1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );

        jPanel2.add(monCompteDéconnecté1, "card10");

        filmsALAffiche1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                filmsALAffiche1KeyPressed(evt);
            }
        });
        jPanel2.add(filmsALAffiche1, "card2");
        jPanel2.add(rechercheFilm1, "card3");
        jPanel2.add(rechercheCinéma1, "card4");
        jPanel2.add(prochainesSorties1, "card5");
        jPanel2.add(pageFilm2, "card6");
        jPanel2.add(pageCinéma1, "card7");
        jPanel2.add(accueil1, "card8");

        javax.swing.GroupLayout monCompteConnecté1Layout = new javax.swing.GroupLayout(monCompteConnecté1);
        monCompteConnecté1.setLayout(monCompteConnecté1Layout);
        monCompteConnecté1Layout.setHorizontalGroup(
            monCompteConnecté1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
        );
        monCompteConnecté1Layout.setVerticalGroup(
            monCompteConnecté1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );

        jPanel2.add(monCompteConnecté1, "card9");

        jPanel3.setLayout(new java.awt.CardLayout());
        jPanel3.add(jPanelDéconnecté1, "card2");
        jPanel3.add(jPanelConnecté1, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(panelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBMCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMCompteActionPerformed
        /**
         * Bouton mon compte cliqué.
         */
        afficherMonCompte();
    }//GEN-LAST:event_jBMCompteActionPerformed

    private void jBAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAccueilActionPerformed
        /**
         * Bouton Film à l'affiche cliqué.
         */
        afficherAccueil();
    }//GEN-LAST:event_jBAccueilActionPerformed

    private void jBFAfficheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFAfficheActionPerformed
        /**
         * Bouton Film à l'affiche cliqué.
         */
        afficherFilmAffiche();
    }//GEN-LAST:event_jBFAfficheActionPerformed

    private void jBPSortieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPSortieActionPerformed
        /**
         * Bouton des prochaines sorties cliqué.
         */
        afficherProchaineSortie();
    }//GEN-LAST:event_jBPSortieActionPerformed

    private void filmsALAffiche1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filmsALAffiche1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_filmsALAffiche1KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private netfilm.Accueil accueil1;
    private netfilm.FilmsALAffiche filmsALAffiche1;
    private javax.swing.JButton jBAccueil;
    private javax.swing.JButton jBFAffiche;
    private javax.swing.JButton jBMCompte;
    private javax.swing.JButton jBPSortie;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private netfilm.JPanelConnecté jPanelConnecté1;
    private netfilm.JPanelDéconnecté jPanelDéconnecté1;
    private netfilm.MonCompteConnecté monCompteConnecté1;
    private netfilm.MonCompteDéconnecté monCompteDéconnecté1;
    private netfilm.PageCinéma pageCinéma1;
    private netfilm.PageFilm pageFilm2;
    private netfilm.PanelHeader panelHeader1;
    private netfilm.ProchainesSorties prochainesSorties1;
    private netfilm.RechercheCinéma rechercheCinéma1;
    private netfilm.RechercheFilm rechercheFilm1;
    // End of variables declaration//GEN-END:variables


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
            java.util.logging.Logger.getLogger(NetFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NetFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NetFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NetFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                /*JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.getContentPane().add(new Accueil());
                frame.pack();
                frame.setVisible(true);*/
                new NetFilm().setVisible(true);
            }
        });
    }
    private EtatConnexion ec;
    private EtatType et;
}

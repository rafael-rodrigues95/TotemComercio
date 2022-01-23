/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package totemcomercio;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author rfl
 */
public class NewJFrame extends javax.swing.JFrame {

    // Inicialização das variáveis;
    float TotalVotos = 0;
    float TotalNota = 0;
    NumberFormat formatador = new DecimalFormat("0.00"); 
    
    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotaoUm = new javax.swing.JButton();
        BotaoDois = new javax.swing.JButton();
        BotaoTres = new javax.swing.JButton();
        BotaoQuatro = new javax.swing.JButton();
        BotaoCinco = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        VotosCinco = new javax.swing.JLabel();
        VotosDois = new javax.swing.JLabel();
        VotosTres = new javax.swing.JLabel();
        VotosUm = new javax.swing.JLabel();
        VotosQuatro = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        MediaVotos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(370, 340));

        jLabel1.setText("Selecione uma Nota entre 1 (péssimo) e 5 (excelente):");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Como foi seu atendimento?");

        BotaoUm.setText("1");
        BotaoUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoUmActionPerformed(evt);
            }
        });

        BotaoDois.setText("2");
        BotaoDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDoisActionPerformed(evt);
            }
        });

        BotaoTres.setText("3");
        BotaoTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoTresActionPerformed(evt);
            }
        });

        BotaoQuatro.setText("4");
        BotaoQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoQuatroActionPerformed(evt);
            }
        });

        BotaoCinco.setText("5");
        BotaoCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCincoActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantidade de votos 1:");

        jLabel4.setText("Quantidade de votos 2:");

        jLabel5.setText("Quantidade de votos 3:");

        jLabel6.setText("Quantidade de votos 4:");

        jLabel7.setText("Quantidade de votos 5:");

        VotosCinco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        VotosCinco.setText("0");

        VotosDois.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        VotosDois.setText("0");

        VotosTres.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        VotosTres.setText("0");

        VotosUm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        VotosUm.setText("0");

        VotosQuatro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        VotosQuatro.setText("0");

        jLabel13.setText("Nota média atual");

        MediaVotos.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        MediaVotos.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VotosUm)
                            .addComponent(VotosDois)
                            .addComponent(VotosTres)
                            .addComponent(VotosQuatro)
                            .addComponent(VotosCinco))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel13)
                            .addComponent(MediaVotos))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotaoUm, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoDois, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoTres, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoUm)
                    .addComponent(BotaoDois)
                    .addComponent(BotaoCinco)
                    .addComponent(BotaoQuatro)
                    .addComponent(BotaoTres))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(VotosDois))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(VotosTres))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(VotosQuatro)))
                            .addComponent(MediaVotos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(VotosCinco))
                            .addComponent(jLabel13)))
                    .addComponent(VotosUm))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoTresActionPerformed
        TotalVotos = TotalVotos + 1;
        
        // Pega a quantidade de votos atuais para esta nota e acrescenta um;
        int n2 = Integer.parseInt(VotosTres.getText()) + 1;
        VotosTres.setText(Integer.toString(n2));
        
        // Calcula a média das notas fornecidas até agora e seta no label específico;
        float media = TotalNota = TotalNota + 3;
        media = media/TotalVotos;
        MediaVotos.setText(formatador.format(media));
        
        System.out.println("--------------------------");
        System.out.println("Soma das Notas: "+ TotalNota);
        System.out.println("Quantidade de Votos: "+ TotalVotos);
    }//GEN-LAST:event_BotaoTresActionPerformed

    private void BotaoQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoQuatroActionPerformed
        TotalVotos = TotalVotos + 1;
        
        int n2 = Integer.parseInt(VotosQuatro.getText()) + 1;
        VotosQuatro.setText(Integer.toString(n2));
        
        float media = TotalNota = TotalNota + 4;
        media = media/TotalVotos;
        MediaVotos.setText(formatador.format(media));
        
        System.out.println("--------------------------");
        System.out.println("Soma das Notas: "+ TotalNota);
        System.out.println("Quantidade de Votos: "+ TotalVotos);
    }//GEN-LAST:event_BotaoQuatroActionPerformed

    private void BotaoUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoUmActionPerformed
        
        TotalVotos = TotalVotos + 1;
        
        int n1 = Integer.parseInt(VotosUm.getText()) + 1;
        VotosUm.setText(Integer.toString(n1));
        
        float media = TotalNota = TotalNota + 1;
        media = media/TotalVotos;
        MediaVotos.setText(formatador.format(media));
        
        System.out.println("--------------------------");
        System.out.println("Soma das Notas: "+ TotalNota);
        System.out.println("Quantidade de Votos: "+ TotalVotos);
    }//GEN-LAST:event_BotaoUmActionPerformed

    private void BotaoDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDoisActionPerformed
        
        TotalVotos = TotalVotos + 1;
        
        int n2 = Integer.parseInt(VotosDois.getText()) + 1;
        VotosDois.setText(Integer.toString(n2));
        
        float media = TotalNota = TotalNota + 2;
        media = media/TotalVotos;
        MediaVotos.setText(formatador.format(media));
        
        System.out.println("--------------------------");
        System.out.println("Soma das Notas: "+ TotalNota);
        System.out.println("Quantidade de Votos: "+ TotalVotos);
    }//GEN-LAST:event_BotaoDoisActionPerformed

    private void BotaoCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCincoActionPerformed
        TotalVotos = TotalVotos + 1;
        
        int n2 = Integer.parseInt(VotosCinco.getText()) + 1;
        VotosCinco.setText(Integer.toString(n2));
        
        
        
        float media = TotalNota = TotalNota + 5;
        media = media/TotalVotos;
        MediaVotos.setText(formatador.format(media));
        
        
        System.out.println("--------------------------");
        System.out.println("Soma das Notas: "+ TotalNota);
        System.out.println("Quantidade de Votos: "+ TotalVotos);
    }//GEN-LAST:event_BotaoCincoActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCinco;
    private javax.swing.JButton BotaoDois;
    private javax.swing.JButton BotaoQuatro;
    private javax.swing.JButton BotaoTres;
    private javax.swing.JButton BotaoUm;
    private javax.swing.JLabel MediaVotos;
    private javax.swing.JLabel VotosCinco;
    private javax.swing.JLabel VotosDois;
    private javax.swing.JLabel VotosQuatro;
    private javax.swing.JLabel VotosTres;
    private javax.swing.JLabel VotosUm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}

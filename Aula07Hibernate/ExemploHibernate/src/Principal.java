
import dao.HibernateConfiguracao;
import view.FrmManterDepartamento;


public class Principal extends javax.swing.JFrame {

    /** Creates new form Principal */
    public Principal() {
       
        HibernateConfiguracao configuracao = new HibernateConfiguracao();
        configuracao.criaSessionFactory();
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnExibirDepartamento = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBtnExibirDepartamento.setText("Departamentos");
        jBtnExibirDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExibirDepartamentoActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jBtnExibirDepartamento)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jBtnExibirDepartamento)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnExibirDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExibirDepartamentoActionPerformed
        FrmManterDepartamento telaDepartamento = new FrmManterDepartamento();
        telaDepartamento.setVisible(true);
        telaDepartamento.setLocationRelativeTo(this);
    }//GEN-LAST:event_jBtnExibirDepartamentoActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        Principal telaPrincipal = new Principal();
        telaPrincipal.setVisible(true);
        telaPrincipal.setExtendedState(MAXIMIZED_BOTH);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnExibirDepartamento;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

}

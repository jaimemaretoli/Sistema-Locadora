package teste2;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableModel;

public class filmes extends javax.swing.JFrame {

    DefaultTableModel model;
    
    public filmes() {
        initComponents();
        setDefaultCloseOperation(filmes.HIDE_ON_CLOSE);
        model = (DefaultTableModel)Tabela.getModel();
    }

    public DefaultTableModel monta_modelo(javax.swing.JTable tabela) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (javax.swing.table.DefaultTableModel) tabela.getModel();
        return modelo;
    }
    
    public String[] separa_str(String linha, String separador) {
        String[] vet = linha.split(separador);
        return (vet);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pop = new javax.swing.JPopupMenu();
        Editar = new javax.swing.JMenuItem();
        Excluir = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        txtDataLancamento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtElenco = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnTeste = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        pop.add(Editar);

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });
        pop.add(Excluir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FILMES");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("SISTEMA FILMES LOCADORA");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Pesquisar:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Código:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Tipo:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("Nome:");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setText("Data Lançamento:");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setText("Elenco:");

        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnInserir.setText("INSERIR");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnTeste.setText("TESTE");
        btnTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTesteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("AÇÕES");

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOME", "TIPO", "DATA", "ELENCO"
            }
        ));
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TabelaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel3)
                        .addGap(11, 11, 11)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel7)))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtElenco, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDataLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtElenco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTesteActionPerformed
        Connection conn = new conexao().conectar();
        if (conn != null) {
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao conectar!");
        }
    }//GEN-LAST:event_btnTesteActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        Connection conn = new conexao().conectar();
        try{
            java.sql.Statement stm = conn.createStatement();
            stm.executeUpdate("INSERT INTO filmes VALUES ("
                    + txtCodigo.getText() + ", '"
                    + txtNome.getText() + "', '"
                    + txtTipo.getText() + "', '"
                    + txtDataLancamento.getText() + "', '"
                    + txtElenco.getText() + "');");
            conn.close();
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
            funcionarios fr02 = new funcionarios();
            fr02.show();
            this.dispose();
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "" + "O cadastro não pode ser efetuado!");
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        Connection conn = new conexao().conectar();
        try{
            java.sql.Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT id_filme, nome, "
                    + "tipo_filme, data_lancamento, elenco "
                    + "FROM filmes WHERE nome LIKE '" 
                    + txtPesquisar.getText() + "%';");
            String linha;
            monta_modelo(Tabela).setNumRows(0);
            int i = 0;
            while(rs.next()){
                linha = String.valueOf((rs.getString("id_filme")) + ";"
                + "" + String.valueOf(rs.getString("nome")) + ";"
                + "" + String.valueOf(rs.getString("tipo_filme")) + ";"
                + "" + String.valueOf(rs.getString("data_lancamento")) + ";"
                + "" + String.valueOf(rs.getString("elenco")));
                monta_modelo(Tabela).addRow(separa_str(linha, ";"));
                i++;
            }
            conn.close();
        }catch(Exception e){
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void TabelaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseReleased
        if (evt.isPopupTrigger()) {
            pop.show(evt.getComponent(), evt.getX(), evt.getY());
        }    
    }//GEN-LAST:event_TabelaMouseReleased

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        String codigo = (String) Tabela.getValueAt(Tabela.getSelectedRow(), 0);
        String nome = (String) Tabela.getValueAt(Tabela.getSelectedRow(), 1);
        
        Connection conn = new conexao().conectar();
        int i = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o "
                + "cliente \n Código " + codigo + "\n Nome: " + nome,
                "Saída", JOptionPane.YES_NO_OPTION);
        if (i == JOptionPane.YES_OPTION) {
            try{
                java.sql.Statement stm = conn.createStatement();
                stm.executeUpdate("DELETE FROM filmes WHERE id_filme = " + codigo + ";");
                //TALVEZ ESTEJA ERRADO O EXECUTEUPDATE, VERIFICAR
                conn.close();
                JOptionPane.showMessageDialog(null, "Exlusão efetuada com sucesso!");
            }catch(Exception e){
                System.out.println("ERRO! " + e.getMessage());
                JOptionPane.showMessageDialog(null, "A exclusão não pode ser efetuada!"
                        + " Verifique os dados!");
            }
            Clientes fr02 = new Clientes();
            fr02.show();
            this.dispose();
        }
    }//GEN-LAST:event_ExcluirActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        try{
            String codigo = (String) Tabela.getValueAt(Tabela.getSelectedRow(), 0);
            String nome = (String) Tabela.getValueAt(Tabela.getSelectedRow(), 1);
            String tipo = (String) Tabela.getValueAt(Tabela.getSelectedRow(), 2);
            String data = (String) Tabela.getValueAt(Tabela.getSelectedRow(), 3);
            String elenco = (String) Tabela.getValueAt(Tabela.getSelectedRow(), 4);
            
            txtCodigo.setText(codigo);
            txtNome.setText(nome);
            txtTipo.setText(tipo);
            txtTipo.setText(data);
            txtElenco.setText(elenco);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Uma linha deve ser selecionada!");
        }
    }//GEN-LAST:event_EditarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Connection conn = new conexao().conectar();
        
        int i = JOptionPane.showConfirmDialog(null, "Deseja realmente "
                + "alterar os dados?", "Saída", JOptionPane.YES_NO_OPTION);
        if (i == JOptionPane.YES_OPTION) {
            try{
                java.sql.Statement stm = conn.createStatement();
                stm.executeUpdate("UPDATE filmes SET nome = '" + txtNome.getText() 
                        + "', tipo_filme = '" + txtTipo.getText() 
                        + "', data_lancamento = '" + txtDataLancamento.getText() 
                        + "', elenco = '" + txtElenco.getText() 
                        + "' WHERE id_filme = " + txtCodigo.getText() + ";");
                conn.close();
                JOptionPane.showMessageDialog(null, "Alteração efetuada com sucesso!");
                Clientes fr02 = new Clientes();
                fr02.show();
                this.dispose();
            }catch(Exception e){
                System.out.println("ERRO: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Alteração não pode ser efetuada!"
                        + "Verifique os dados!");
            }
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new filmes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Editar;
    private javax.swing.JMenuItem Excluir;
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnTeste;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu pop;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDataLancamento;
    private javax.swing.JTextField txtElenco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}

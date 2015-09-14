package teste2;

import com.mysql.jdbc.Connection;
import java.beans.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class funcionarios extends javax.swing.JFrame {
    
    DefaultTableModel model;
    
    public funcionarios() {
        initComponents();
        setDefaultCloseOperation(funcionarios.HIDE_ON_CLOSE);
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
        popAtualizar = new javax.swing.JMenuItem();
        popExcluir = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        txtNivelAcesso = new javax.swing.JTextField();
        btnTesteConexao = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();

        popAtualizar.setText("Editar");
        popAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popAtualizarActionPerformed(evt);
            }
        });
        pop.add(popAtualizar);

        popExcluir.setText("Excluir");
        popExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popExcluirActionPerformed(evt);
            }
        });
        pop.add(popExcluir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FUNCIONÁRIOS");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("SISTEMA FUNCIONARIOS LOCADORA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Pesquisar: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Código:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nome:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Telefone:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("E-Mail:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Usuário:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Senha:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Nivel Acesso:");

        btnTesteConexao.setText("TESTE DE CONEXÃO");
        btnTesteConexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTesteConexaoActionPerformed(evt);
            }
        });

        btnInserir.setText("INSERIR");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("AÇÕES");

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOME", "TELEFONE", "E-MAL", "USUÁRIO", "SENHA", "NÍVEL ACESSO"
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
                        .addGap(320, 320, 320)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTesteConexao)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)
                        .addGap(10, 10, 10)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel8)
                        .addGap(7, 7, 7)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9)
                        .addGap(1, 1, 1)
                        .addComponent(txtNivelAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel5)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnTesteConexao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtNivelAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTesteConexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTesteConexaoActionPerformed
        Connection conn = new conexao().conectar();
        if (conn != null) {
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao conectar!");
        }
    }//GEN-LAST:event_btnTesteConexaoActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        Connection conn = new conexao().conectar();
        try{
            java.sql.Statement stm = conn.createStatement();
            stm.executeUpdate("INSERT INTO funcionarios VALUES ( "
                    + txtCodigo.getText() + ", '"
                    + txtNome.getText() + "', '"
                    + txtTelefone.getText() + "', '"
                    + txtEmail.getText() + "', '"
                    + txtUsuario.getText() + "', '"
                    + txtSenha.getText() + "', '"
                    + txtNivelAcesso.getText() + "');");
            conn.close();
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
            Clientes fr02 = new Clientes();
            fr02.show();
            this.dispose();
        }catch(Exception e){
            System.out.println("ERRO: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "" + "O cadastro não pode ser efetuado!");
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        Connection conn = new conexao().conectar();
        try{
            java.sql.Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT id_funcionario, nome, "
                    + "telefone, email, usuario, senha, nivel_acesso "
                    + "FROM funcionarios WHERE nome LIKE "
                    + "'" + txtPesquisar.getText() + "%';");
            String linha;
            monta_modelo(Tabela).setNumRows(0);
            int i = 0;
            while (rs.next()) {
                linha = String.valueOf((rs.getString("id_funcionario")) + ";"
                        + "" + String.valueOf(rs.getString("nome")) + ";"
                        + "" + String.valueOf(rs.getString("telefone")) + ";"
                        + "" + String.valueOf(rs.getString("email")) + ";"
                        + "" + String.valueOf(rs.getString("usuario")) + ";"
                        + "" + String.valueOf(rs.getString("senha")) + ";"
                        + "" + String.valueOf(rs.getString("nivel_acesso")));
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

    private void popExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popExcluirActionPerformed
        String codigo = (String) Tabela.getValueAt(Tabela.getSelectedRow(), 0);
        String nome = (String) Tabela.getValueAt(Tabela.getSelectedRow(), 1);
        
        Connection conn = new conexao().conectar();
        int i = JOptionPane.showConfirmDialog(null, "Deseja realemente excluir o "
                + "cliente \n Código: " + codigo + "\n Nome: " + nome,
                "Saída", JOptionPane.YES_NO_OPTION);
        if (i == JOptionPane.YES_OPTION) {
            try{
                java.sql.Statement stm = conn.createStatement();
                stm.executeUpdate("DELETE FROM funcionarios WHERE id_funcionario = " + codigo + ";");
                conn.close();
                JOptionPane.showMessageDialog(null, "Exclusão efetuada com sucesso!");
            }catch (Exception e){
                System.out.println("ERRO: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "A exclusão não pode ser "
                        + "efetuada! Verifique os dados!");
            }
            Clientes fr02 = new Clientes();
            fr02.show();
            this.dispose();
        }
    }//GEN-LAST:event_popExcluirActionPerformed

    private void popAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popAtualizarActionPerformed
        try{
            String codigo = (String) Tabela.getValueAt(Tabela.getSelectedRow(), 0);
            String nome = (String) Tabela.getValueAt(Tabela.getSelectedRow(), 1);
            String telefone = (String) Tabela.getValueAt(Tabela.getSelectedRow(), 2);
            String email = (String) Tabela.getValueAt(Tabela.getSelectedRow(), 3);
            String usuario = (String) Tabela.getValueAt(Tabela.getSelectedRow(), 4);
            String senha = (String) Tabela.getValueAt(Tabela.getSelectedRow(), 5);
            String nivelAcesso = (String) Tabela.getValueAt(Tabela.getSelectedRow(), 6);
            
            txtCodigo.setText(codigo);
            txtNome.setText(nome);
            txtTelefone.setText(telefone);
            txtEmail.setText(email);
            txtUsuario.setText(usuario);
            txtSenha.setText(senha);
            txtNivelAcesso.setText(nivelAcesso);
        }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Uma linha deve ser selecionada!");   
        }
    }//GEN-LAST:event_popAtualizarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Connection conn = new conexao().conectar();
        int i = JOptionPane.showConfirmDialog(null, 
                "Deseja realmente alterar os dados?", "Saída", JOptionPane.YES_NO_OPTION);
        if (i == JOptionPane.YES_OPTION) {
            try{
                java.sql.Statement stm = conn.createStatement();
                stm.executeUpdate("UPDATE funcionarios SET nome = '" + txtNome.getText() + "'"
                        + ", telefone = '" + txtTelefone.getText() + "', "
                        + "email = '" + txtEmail.getText() + "', "
                        + "usuario '" + txtUsuario.getText() + "', "
                        + "senha = '" + txtSenha.getText() +"', "
                        + "nivel_acesso = " + txtNivelAcesso.getText() + " "
                        + "WHERE id_funcionario = " + txtCodigo.getText() + ";");
                conn.close();
                JOptionPane.showMessageDialog(null, "Alteração efetuada com sucesso!");
                Clientes fr02 = new Clientes();
                fr02.show();
                this.dispose();
            }catch(Exception e){
                System.out.println("ERRO: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Alteração não pode ser efetuada, verifique os dados!");
            }
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new funcionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnTesteConexao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu pop;
    private javax.swing.JMenuItem popAtualizar;
    private javax.swing.JMenuItem popExcluir;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNivelAcesso;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

package teste2;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class locacao extends javax.swing.JFrame {

    DefaultTableModel model;
    
    public locacao() {
        initComponents();
        setDefaultCloseOperation(locacao.HIDE_ON_CLOSE);
        model = (DefaultTableModel)tabela.getModel();
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
        popEditar = new javax.swing.JMenuItem();
        popExcluir = new javax.swing.JMenuItem();
        grupoConsulta = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        txtCodigoLocacao = new javax.swing.JTextField();
        txtCodigoFilme = new javax.swing.JTextField();
        txtCodigoFuncionario = new javax.swing.JTextField();
        txtCodigoCliente = new javax.swing.JTextField();
        txtDataLocacao = new javax.swing.JTextField();
        txtDataEntrega = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnTeste = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        radioCodigo = new javax.swing.JRadioButton();
        radioNome = new javax.swing.JRadioButton();

        popEditar.setText("Editar");
        popEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popEditarActionPerformed(evt);
            }
        });
        pop.add(popEditar);

        popExcluir.setText("Excluir");
        popExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popExcluirActionPerformed(evt);
            }
        });
        pop.add(popExcluir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOCAÇÃO");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("SISTEMA LOCAÇÃO LOCADORA");

        jLabel2.setText("Pesquisar:");

        jLabel3.setText("Código Locação:");

        jLabel4.setText("Código Funcionário:");

        jLabel5.setText("Código Filme:");

        jLabel6.setText("Código Cliente:");

        jLabel7.setText("Data Locação:");

        jLabel8.setText("Data Entrega:");

        jLabel9.setText("Valor:");

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
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

        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("AÇÕES");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Locação", "Código Filme", "Código Funcionário", "Código Cliente", "Data Locação", "Data Entrega", "Valor"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        grupoConsulta.add(radioCodigo);
        radioCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioCodigo.setText("Pesquisa por Código");

        grupoConsulta.add(radioNome);
        radioNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioNome.setSelected(true);
        radioNome.setText("Pesquisa por Nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(radioCodigo)
                        .addGap(1, 1, 1)
                        .addComponent(radioNome))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addComponent(txtCodigoLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(txtCodigoFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel7)))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel8)
                        .addGap(2, 2, 2)
                        .addComponent(txtDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel9)
                        .addGap(2, 2, 2)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioCodigo)
                    .addComponent(radioNome))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigoLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtCodigoFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel6)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtDataLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        Connection conn = new conexao().conectar();
        try {
            java.sql.Statement stm = conn.createStatement();
            stm.executeUpdate("INSERT INTO locacao_filmes VALUES ( " + txtCodigoLocacao.getText() + ", "
                    + txtCodigoFilme.getText() + ", "
                    + txtCodigoFuncionario.getText() + ", "
                    + txtCodigoCliente.getText() + ", '"
                    + txtDataLocacao.getText() + "', '"
                    + txtDataEntrega.getText() + "', "
                    + txtValor.getText() + ")");
            conn.close();
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
            locacao fr02 = new locacao();
            fr02.show();
            this.dispose();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "" + "O cadastro não pode ser efetuado!");
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTesteActionPerformed
        Connection conn = new conexao().conectar();
        if (conn != null) {
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao conectar!");
        }
    }//GEN-LAST:event_btnTesteActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        String consulta = "";

        if (radioCodigo.isSelected()) {
            consulta = " AND F.id_filme = " + txtPesquisar.getText() + " ";
        } else if (radioNome.isSelected()){
            consulta = " AND F.nome LIKE '" + txtPesquisar.getText() + "%' ";
        }
        
        Connection conn = new conexao().conectar();
        try {
            java.sql.Statement stm = conn.createStatement();

            System.out.println("SELECT LF.id_locacao, LF.id_filme, "
                    + "LF.id_funcionario, LF.id_cliente, LF.data_locacao, LF.data_entrega, "
                    + "LF.valor FROM locacao_filmes LF, filmes F WHERE LF.id_filme = F.id_filme " + consulta + " ;");
            
            ResultSet rs = stm.executeQuery("SELECT LF.id_locacao, LF.id_filme, "
                    + "LF.id_funcionario, LF.id_cliente, LF.data_locacao, LF.data_entrega, "
                    + "LF.valor FROM locacao_filmes LF, filmes F WHERE LF.id_filme = F.id_filme " + consulta + " ;");
            String linha;
            monta_modelo(tabela).setNumRows(0);
            int i = 0;
            while (rs.next()) {
                linha = String.valueOf((rs.getString("id_locacao")) + ";"
                        + "" + String.valueOf(rs.getString("id_filme")) + ";"
                        + "" + String.valueOf(rs.getString("id_funcionario")) + ";"
                        + "" + String.valueOf(rs.getString("id_cliente")) + ";"
                        + "" + String.valueOf(rs.getString("data_locacao")) + ";"
                        + "" + String.valueOf(rs.getString("data_entrega")) + ";"
                        + "" + String.valueOf(rs.getString("valor")));
                monta_modelo(tabela).addRow(separa_str(linha, ";"));
                i++;
            }
            conn.close();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Connection conn = new conexao().conectar();
        int i = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar os"
                + " dados?", "Saída", JOptionPane.YES_NO_OPTION);
        if (i == JOptionPane.YES_OPTION) {
            try {
                java.sql.Statement stm = conn.createStatement();
                stm.executeUpdate("UPDATE locacao_filmes SET id_cliente = "
                        + txtCodigoCliente.getText() + ", id_funcionario = "
                        + txtCodigoFuncionario.getText() + ", id_cliente = "
                        + txtCodigoCliente.getText() + ", data_locacao = '"
                        + txtDataLocacao.getText() + "', data_entrega = '"
                        + txtDataEntrega.getText() + "', valor = "
                        + txtValor.getText() + ";");
                conn.close();
                JOptionPane.showMessageDialog(null, "Alteração efetuada com sucesso!");
                locacao fr02 = new locacao();
                fr02.show();
                this.dispose();
            } catch (Exception e) {
                System.out.println("ERRO: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Alteração não pode "
                        + "ser efetuada! Verifique os dados!");
            }
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void tabelaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseReleased
        if (evt.isPopupTrigger()) {
            pop.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tabelaMouseReleased

    private void popExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popExcluirActionPerformed
        String codigo = (String) tabela.getValueAt(tabela.getSelectedRow(), 0);
        String nome = (String) tabela.getValueAt(tabela.getSelectedRow(), 1);

        Connection conn = new conexao().conectar();
        int i = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o "
                + "cliente \n Código: " + codigo + "\n Nome: " + nome,
                "Saída", JOptionPane.YES_NO_OPTION);
        if (i == JOptionPane.YES_OPTION) {
            try {
                java.sql.Statement stm = conn.createStatement();
                stm.executeUpdate("DELETE FROM locacao_filmes WHERE id_locacao = " + codigo + ";");
                conn.close();
                JOptionPane.showMessageDialog(null, "Esclusão efetuada com sucesso!");
            } catch (Exception e) {
                System.out.println("ERRO! " + e.getMessage());
                JOptionPane.showMessageDialog(null, "A exclusão não pode ser "
                        + "efetuada! Verifique os dados!");
            }
            locacao fr02 = new locacao();
            fr02.show();
            this.dispose();
        }
    }//GEN-LAST:event_popExcluirActionPerformed

    private void popEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popEditarActionPerformed
        try {
            String codigoLocacao = (String) tabela.getValueAt(tabela.getSelectedRow(), 0);
            String codFilme = (String) tabela.getValueAt(tabela.getSelectedRow(), 1);
            String codFuncionario = (String) tabela.getValueAt(tabela.getSelectedRow(), 2);
            String codCliente = (String) tabela.getValueAt(tabela.getSelectedRow(), 3);
            String dataLocacao = (String) tabela.getValueAt(tabela.getSelectedRow(), 4);
            String dataEntrega = (String) tabela.getValueAt(tabela.getSelectedRow(), 5);
            String valor = (String) tabela.getValueAt(tabela.getSelectedRow(), 6);

            txtCodigoLocacao.setText(codigoLocacao);
            txtCodigoFilme.setText(codFilme);
            txtCodigoFuncionario.setText(codFuncionario);
            txtCodigoCliente.setText(codCliente);
            txtDataLocacao.setText(dataLocacao);
            txtDataEntrega.setText(dataEntrega);
            txtValor.setText(valor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Uma linha deve ser selecionada!");
        }
    }//GEN-LAST:event_popEditarActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new locacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnTeste;
    private javax.swing.ButtonGroup grupoConsulta;
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
    private javax.swing.JMenuItem popEditar;
    private javax.swing.JMenuItem popExcluir;
    private javax.swing.JRadioButton radioCodigo;
    private javax.swing.JRadioButton radioNome;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtCodigoFilme;
    private javax.swing.JTextField txtCodigoFuncionario;
    private javax.swing.JTextField txtCodigoLocacao;
    private javax.swing.JTextField txtDataEntrega;
    private javax.swing.JTextField txtDataLocacao;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}

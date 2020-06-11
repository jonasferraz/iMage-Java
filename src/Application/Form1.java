package Application;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Form1 extends javax.swing.JFrame {

    private Imagem img;

    public Form1() {
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

        labelCaminhoArquivo = new javax.swing.JLabel();
        btnCarregarImagem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboModo = new javax.swing.JComboBox<>();
        btnAplicar = new javax.swing.JButton();
        labelResetar = new javax.swing.JLabel();
        checkAlterarAutomaticamente = new javax.swing.JCheckBox();
        checkModificarOriginal = new javax.swing.JCheckBox();
        labelImagem = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        MenuArquivo = new javax.swing.JMenu();
        MenuArquivoAbrir = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuArquivoSalvarComo = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        MenuArquivoAplicar = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        MenuArquivoSair = new javax.swing.JMenuItem();
        MenuAjuda = new javax.swing.JMenu();
        MenuAjudaSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("iMage");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });

        labelCaminhoArquivo.setForeground(new java.awt.Color(0, 0, 255));
        labelCaminhoArquivo.setText("<html><u>...</u>");

        btnCarregarImagem.setText("Carregar imagem...");
        btnCarregarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarImagemActionPerformed(evt);
            }
        });

        jLabel1.setText("Modo:");

        comboModo.setMaximumRowCount(10);
        comboModo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Escala de cinza", "Vermelho", "Verde", "Azul", "Amarelo (vermelho + verde)", "Rosa (vermelho + azul)", "Verde-água (verde + azul)", "Inversão de cores" }));
        comboModo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboModoActionPerformed(evt);
            }
        });

        btnAplicar.setText("Aplicar");
        btnAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarActionPerformed(evt);
            }
        });

        labelResetar.setForeground(new java.awt.Color(0, 0, 255));
        labelResetar.setText("<html><u>Resetar</u>");
        labelResetar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelResetarMouseClicked(evt);
            }
        });

        checkAlterarAutomaticamente.setText("Alterar automaticamente");

        checkModificarOriginal.setText("Modificar o arquivo original");
        checkModificarOriginal.setToolTipText("");

        labelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Application/Recursos/fundo.png"))); // NOI18N
        labelImagem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        labelImagem.setFocusable(false);

        MenuArquivo.setText("Arquivo");

        MenuArquivoAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        MenuArquivoAbrir.setText("Abrir...");
        MenuArquivoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuArquivoAbrirActionPerformed(evt);
            }
        });
        MenuArquivo.add(MenuArquivoAbrir);
        MenuArquivo.add(jSeparator1);

        MenuArquivoSalvarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        MenuArquivoSalvarComo.setText("Salvar imagem como...");
        MenuArquivoSalvarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuArquivoSalvarComoActionPerformed(evt);
            }
        });
        MenuArquivo.add(MenuArquivoSalvarComo);
        MenuArquivo.add(jSeparator2);

        MenuArquivoAplicar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        MenuArquivoAplicar.setText("Aplicar");
        MenuArquivoAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuArquivoAplicarActionPerformed(evt);
            }
        });
        MenuArquivo.add(MenuArquivoAplicar);
        MenuArquivo.add(jSeparator3);

        MenuArquivoSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        MenuArquivoSair.setText("Sair");
        MenuArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuArquivoSairActionPerformed(evt);
            }
        });
        MenuArquivo.add(MenuArquivoSair);

        Menu.add(MenuArquivo);

        MenuAjuda.setText("Ajuda");

        MenuAjudaSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        MenuAjudaSobre.setText("Sobre este aplicativo");
        MenuAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAjudaSobreActionPerformed(evt);
            }
        });
        MenuAjuda.add(MenuAjudaSobre);

        Menu.add(MenuAjuda);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 369, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnCarregarImagem)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCaminhoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(comboModo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnAplicar))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(checkAlterarAutomaticamente)
                                                .addGap(18, 18, 18)
                                                .addComponent(checkModificarOriginal))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(labelResetar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(47, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 412, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCaminhoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnCarregarImagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(comboModo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAplicar))
                        .addGap(5, 5, 5)
                        .addComponent(labelResetar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkAlterarAutomaticamente)
                            .addComponent(checkModificarOriginal))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuArquivoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuArquivoAbrirActionPerformed
        btnCarregarImagem.doClick();
    }//GEN-LAST:event_MenuArquivoAbrirActionPerformed

    private void MenuArquivoAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuArquivoAplicarActionPerformed
        btnAplicar.doClick();
    }//GEN-LAST:event_MenuArquivoAplicarActionPerformed

    private void MenuArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuArquivoSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_MenuArquivoSairActionPerformed

    private void MenuAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAjudaSobreActionPerformed
        Sobre s = new Sobre();
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        s.setVisible(true);
    }//GEN-LAST:event_MenuAjudaSobreActionPerformed

    private void btnCarregarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarImagemActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Escolha um arquivo...");
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (jfc.showOpenDialog(null) == JOptionPane.YES_OPTION) {
            img = new Imagem(jfc.getSelectedFile().getAbsolutePath());
            labelImagem.setIcon(img.getImagem());
            labelCaminhoArquivo.setText(jfc.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_btnCarregarImagemActionPerformed

    int tempo = 0;

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                setTitle("iMage (posição: (" + getLocation().x + "; " + getLocation().y + "))");
                tempo += 500;
                if (tempo >= 5000) {
                    timer.cancel();
                    tempo = 0;
                    setTitle("iMage");
                }
            }
        }, 0, 500);
    }//GEN-LAST:event_formComponentMoved

    private void btnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarActionPerformed
        try {
            switch (comboModo.getSelectedIndex()) {
                case 0: // Normal
                {
                    img = new Imagem(labelCaminhoArquivo.getText());
                    labelImagem.setIcon(img.getImagem());
                }
                break;
                case 1: // Escala de cinza
                {
                    BufferedImage bi = prepararImagemParaAplicarFiltro();
                    if (bi == null) {
                        return;
                    }
                    for (int x = 0; x < bi.getWidth(); x++) {
                        for (int y = 0; y < bi.getHeight(); y++) {
                            int p = bi.getRGB(x, y);

                            int a = (p >> 24) & 0xff;
                            int r = (p >> 16) & 0xff;
                            int g = (p >> 8) & 0xff;
                            int b = p & 0xff;

                            int media = (r + g + b) / 3;

                            p = (a << 24) | (media << 16) | (media << 8) | (media);

                            bi.setRGB(x, y, p);
                        }
                    }
                    img.setImagem(bi);
                    labelImagem.setIcon(new ImageIcon(bi));
                }
                break;
                case 2: // Vermelho
                {
                    BufferedImage bi = prepararImagemParaAplicarFiltro();
                    if (bi == null) {
                        return;
                    }
                    for (int x = 0; x < bi.getWidth(); x++) {
                        for (int y = 0; y < bi.getHeight(); y++) {
                            int p = bi.getRGB(x, y);

                            int a = (p >> 24) & 0xff;
                            int r = (p >> 16) & 0xff;

                            p = (a << 24) | (r << 16);

                            bi.setRGB(x, y, p);
                        }
                    }
                    img.setImagem(bi);
                    labelImagem.setIcon(new ImageIcon(bi));
                }
                break;
                case 3: // Verde
                {
                    BufferedImage bi = prepararImagemParaAplicarFiltro();
                    if (bi == null) {
                        return;
                    }
                    for (int x = 0; x < bi.getWidth(); x++) {
                        for (int y = 0; y < bi.getHeight(); y++) {
                            int p = bi.getRGB(x, y);

                            int a = (p >> 24) & 0xff;
                            int g = (p >> 8) & 0xff;

                            p = (a << 24) | (g << 8);

                            bi.setRGB(x, y, p);
                        }
                    }
                    img.setImagem(bi);
                    labelImagem.setIcon(new ImageIcon(bi));
                }
                break;
                case 4: // Azul
                {
                    BufferedImage bi = prepararImagemParaAplicarFiltro();
                    if (bi == null) {
                        return;
                    }
                    for (int x = 0; x < bi.getWidth(); x++) {
                        for (int y = 0; y < bi.getHeight(); y++) {
                            int p = bi.getRGB(x, y);

                            int a = (p >> 24) & 0xff;
                            int b = p & 0xff;

                            p = (a << 24) | (b);

                            bi.setRGB(x, y, p);
                        }
                    }
                    img.setImagem(bi);
                    labelImagem.setIcon(new ImageIcon(bi));
                }
                break;
                case 5: // Amarelo
                {
                    BufferedImage bi = prepararImagemParaAplicarFiltro();
                    if (bi == null) {
                        return;
                    }
                    for (int x = 0; x < bi.getWidth(); x++) {
                        for (int y = 0; y < bi.getHeight(); y++) {
                            int p = bi.getRGB(x, y);

                            int a = (p >> 24) & 0xff;
                            int r = (p >> 16) & 0xff;
                            int g = (p >> 8) & 0xff;

                            p = (a << 24) | (r << 16) | (g << 8);

                            bi.setRGB(x, y, p);
                        }
                    }
                    img.setImagem(bi);
                    labelImagem.setIcon(new ImageIcon(bi));
                }
                break;
                case 6: // Rosa
                {
                    BufferedImage bi = prepararImagemParaAplicarFiltro();
                    if (bi == null) {
                        return;
                    }
                    for (int x = 0; x < bi.getWidth(); x++) {
                        for (int y = 0; y < bi.getHeight(); y++) {
                            int p = bi.getRGB(x, y);

                            int a = (p >> 24) & 0xff;
                            int r = (p >> 16) & 0xff;
                            int b = p & 0xff;

                            p = (a << 24) | (r << 16) | (b);

                            bi.setRGB(x, y, p);
                        }
                    }
                    img.setImagem(bi);
                    labelImagem.setIcon(new ImageIcon(bi));
                }
                break;
                case 7: // Verde-água
                {
                    BufferedImage bi = prepararImagemParaAplicarFiltro();
                    if (bi == null) {
                        return;
                    }
                    for (int x = 0; x < bi.getWidth(); x++) {
                        for (int y = 0; y < bi.getHeight(); y++) {
                            int p = bi.getRGB(x, y);

                            int a = (p >> 24) & 0xff;
                            int g = (p >> 8) & 0xff;
                            int b = p & 0xff;

                            p = (a << 24) | (g << 8) | (b);

                            bi.setRGB(x, y, p);
                        }
                    }
                    img.setImagem(bi);
                    labelImagem.setIcon(new ImageIcon(bi));
                }
                break;
                case 8: // Inversão de cores
                {
                    BufferedImage bi = prepararImagemParaAplicarFiltro();
                    if (bi == null) {
                        return;
                    }
                    for (int x = 0; x < bi.getWidth(); x++) {
                        for (int y = 0; y < bi.getHeight(); y++) {
                            int p = bi.getRGB(x, y);

                            int a = (p >> 24) & 0xff;
                            int r = 255 - ((p >> 16) & 0xff);
                            int g = 255 - ((p >> 8) & 0xff);
                            int b = 255 - (p & 0xff);

                            p = (a << 24) | (r << 16) | (g << 8) | (b);

                            bi.setRGB(x, y, p);
                        }
                    }
                    img.setImagem(bi);
                    labelImagem.setIcon(new ImageIcon(bi));
                }
                break;
                case 9: // Personalizado
                {

                }
                break;

            }
        } catch (Exception ex) {
            String mensagem = retornarParâmetrosExceção(ex.getStackTrace());
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: \n\n" + ex.getMessage() + "\n" + mensagem, "Erro ao processar imagem", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAplicarActionPerformed

    private String retornarParâmetrosExceção(StackTraceElement[] exceção) {
        String mensagem = "";
        for (StackTraceElement ste : exceção) {
            mensagem += ste.toString() + "\n";
        }
        return mensagem;
    }

    private BufferedImage prepararImagemParaAplicarFiltro() {
        BufferedImage bi;
        File f;
        try {
            if (checkModificarOriginal.isSelected()) {
                f = new File(labelCaminhoArquivo.getText());
                bi = ImageIO.read(f);
            } else {
                bi = converterImageIconParaBufferedImage(img.getImagem());
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir: " + e, "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return bi;
    }

    private BufferedImage converterImageIconParaBufferedImage(ImageIcon imagem) {
        BufferedImage bi = new BufferedImage(imagem.getIconWidth(), imagem.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        imagem.paintIcon(null, bi.createGraphics(), 0, 0);
        return bi;
    }

    private void labelResetarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelResetarMouseClicked
        img = new Imagem(labelCaminhoArquivo.getText());
        labelImagem.setIcon(img.getImagem());
    }//GEN-LAST:event_labelResetarMouseClicked

    private void comboModoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboModoActionPerformed
        if (checkAlterarAutomaticamente.isSelected()) {
            btnAplicar.doClick();
        }
    }//GEN-LAST:event_comboModoActionPerformed

    private void MenuArquivoSalvarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuArquivoSalvarComoActionPerformed
        try {
            JFileChooser jfc = new JFileChooser();
            jfc.setDialogTitle("Escolha um nome de arquivo...");
            jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            jfc.setDialogType(JFileChooser.SAVE_DIALOG);
            if (jfc.showSaveDialog(null) == JOptionPane.YES_OPTION) {
                File f = jfc.getSelectedFile();
                if (f.exists()) {
                    int substituir = JOptionPane.showConfirmDialog(null, "O arquivo já existe. Deseja substituí-lo?", "Substituir arquivo existente", JOptionPane.YES_NO_OPTION);
                    if (substituir == JOptionPane.NO_OPTION) {
                        return;
                    }
                }
                BufferedImage bi = converterImageIconParaBufferedImage(img.getImagem());
                ImageIO.write(bi, "jpg", f);
            }
        } catch (Exception ex) {
            String mensagem = retornarParâmetrosExceção(ex.getStackTrace());
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: \n\n" + ex.getMessage() + "\n" + mensagem, "Erro ao salvar imagem", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_MenuArquivoSalvarComoActionPerformed

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
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu MenuAjuda;
    private javax.swing.JMenuItem MenuAjudaSobre;
    private javax.swing.JMenu MenuArquivo;
    private javax.swing.JMenuItem MenuArquivoAbrir;
    private javax.swing.JMenuItem MenuArquivoAplicar;
    private javax.swing.JMenuItem MenuArquivoSair;
    private javax.swing.JMenuItem MenuArquivoSalvarComo;
    private javax.swing.JButton btnAplicar;
    private javax.swing.JButton btnCarregarImagem;
    private javax.swing.JCheckBox checkAlterarAutomaticamente;
    private javax.swing.JCheckBox checkModificarOriginal;
    private javax.swing.JComboBox<String> comboModo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel labelCaminhoArquivo;
    private javax.swing.JLabel labelImagem;
    private javax.swing.JLabel labelResetar;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import command.Colar;
import controller.FacadeController;
import controller.UserController;
import java.awt.Dimension;
import java.awt.image.ImageFilter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import export.ExportBuilder;
import export.ExportBuilderImpl;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

import javax.swing.undo.UndoManager;
import command.*;
import java.awt.event.KeyEvent;

import references.AddReference;
import references.ManageReference;


/**
 *
 * @author user
 */
public class JFrameEditorText extends javax.swing.JFrame {

    File fileOpen = null;

    
    
    public JFrameEditorText(FacadeController fc) {
        initComponents();
        String username = fc.getUc().getCurrentUser().getUsername();
        setTitle("Ref Manager 0.01 - Welcome " + username);        
        //setSize(new Dimension(500, 500));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextAreaArtigo = new TextArea();
        MenuNotePade = new javax.swing.JMenuBar();
        jMenuFicheiro = new javax.swing.JMenu();
        jMenuFicheiroNovo = new javax.swing.JMenuItem();
        jMenuFicheiroAbrir = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuFicheiroGuardar = new javax.swing.JMenuItem();
        jMenuFicheiroGuardarComo = new javax.swing.JMenuItem();
        exportHtml = new javax.swing.JMenuItem();
        exportTxt = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuFicheiroSair = new javax.swing.JMenuItem();
        jMenuEditar = new javax.swing.JMenu();
        jMenuEditarCopiar = new javax.swing.JMenuItem();
        jMenuEditarCortar = new javax.swing.JMenuItem();
        jMenuEditarColar = new javax.swing.JMenuItem();
        Undo = new javax.swing.JMenuItem();
        Redo = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuAddReference = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuInsertReference = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuManageReference = new javax.swing.JMenuItem();
        jMenuFicheiroEditar = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuColar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextAreaArtigo.setColumns(20);
        jTextAreaArtigo.setRows(5);
        jTextAreaArtigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextAreaArtigoKeyPressed(evt);
            }
        });

        jMenuFicheiro.setText("File");

        jMenuFicheiroNovo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuFicheiroNovo.setText("Novo");
        jMenuFicheiroNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFicheiroNovoActionPerformed(evt);
            }
        });
        jMenuFicheiro.add(jMenuFicheiroNovo);

        jMenuFicheiroAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuFicheiroAbrir.setText("Abrir");
        jMenuFicheiroAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFicheiroAbrirActionPerformed(evt);
            }
        });
        jMenuFicheiro.add(jMenuFicheiroAbrir);
        jMenuFicheiro.add(jSeparator2);

        jMenuFicheiroGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuFicheiroGuardar.setText("Guardar");
        jMenuFicheiroGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFicheiroGuardarActionPerformed(evt);
            }
        });
        jMenuFicheiro.add(jMenuFicheiroGuardar);

        jMenuFicheiroGuardarComo.setText("Guardar Como");
        jMenuFicheiroGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFicheiroGuardarComoActionPerformed(evt);
            }
        });
        jMenuFicheiro.add(jMenuFicheiroGuardarComo);

        exportHtml.setText("Export to HTML");
        exportHtml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportHtmlActionPerformed(evt);
            }
        });
        jMenuFicheiro.add(exportHtml);

        exportTxt.setText("Export to txt");
        exportTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportTxtActionPerformed(evt);
            }
        });
        jMenuFicheiro.add(exportTxt);
        jMenuFicheiro.add(jSeparator1);

        jMenuFicheiroSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuFicheiroSair.setText("Sair");
        jMenuFicheiroSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFicheiroSairActionPerformed(evt);
            }
        });
        jMenuFicheiro.add(jMenuFicheiroSair);

        MenuNotePade.add(jMenuFicheiro);

        jMenuEditar.setText("Editar");
        jMenuEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuEditarMouseClicked(evt);
            }
        });

        jMenuEditarCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuEditarCopiar.setText("Copiar");
        jMenuEditarCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEditarCopiarActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuEditarCopiar);

        jMenuEditarCortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuEditarCortar.setText("Cortar");
        jMenuEditarCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEditarCortarActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuEditarCortar);

        jMenuEditarColar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuEditarColar.setText("Colar");
        jMenuEditarColar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEditarColarActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuEditarColar);

        Undo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        Undo.setText("Undo");
        Undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoActionPerformed(evt);
            }
        });
        jMenuEditar.add(Undo);

        Redo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        Redo.setText("Redo");
        Redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedoActionPerformed(evt);
            }
        });
        jMenuEditar.add(Redo);

        MenuNotePade.add(jMenuEditar);

        jMenu1.setText("Reference");

        jMenuAddReference.setText("Add new");
        jMenuAddReference.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddReferenceActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuAddReference);
        jMenu1.add(jSeparator3);

        jMenuInsertReference.setText("Insert at cursor");
        jMenu1.add(jMenuInsertReference);
        jMenu1.add(jSeparator4);

        jMenuManageReference.setText("Manage");
        jMenuManageReference.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuManageReferenceActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuManageReference);

        MenuNotePade.add(jMenu1);

        jMenuFicheiroEditar.setText("Menu");

        jMenuItem3.setText("jMenuItem3");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuFicheiroEditar.add(jMenuItem3);

        jMenuColar.setText("jMenuItem1");
        jMenuColar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuColarActionPerformed(evt);
            }
        });
        jMenuFicheiroEditar.add(jMenuColar);

        MenuNotePade.add(jMenuFicheiroEditar);

        setJMenuBar(MenuNotePade);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextAreaArtigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextAreaArtigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuFicheiroAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFicheiroAbrirActionPerformed
        Historico.getInstance().cleanHist();
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter txtfilter = new FileNameExtensionFilter(
                "html files (*.txt)", "txt");
        fc.setAcceptAllFileFilterUsed(false);
        fc.setFileFilter(txtfilter);
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            try {
                BufferedReader inputStream = new BufferedReader(new FileReader(file.getPath()));
                String inputLine;
                jTextAreaArtigo.setText("");
                while ((inputLine = inputStream.readLine()) != null) {
                    jTextAreaArtigo.append(inputLine + "\n");
                }
                //Guardar o ficheiro aberto
                fileOpen = file;
                setTitle("Ref Manager - " + file.getName());
            } catch (FileNotFoundException ioe) {
                JOptionPane.showMessageDialog(null, "Ficheiro n�o encontrado.", "", JOptionPane.WARNING_MESSAGE);
            } catch (IOException ioe) {
                System.out.println(file.getAbsoluteFile());
            }
        }
    }//GEN-LAST:event_jMenuFicheiroAbrirActionPerformed

    private void jMenuEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEditarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuEditarMouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //jTextArea2.append("teste");
        jTextAreaArtigo.insert("teste2", jTextAreaArtigo.getCaretPosition());
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuEditarCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEditarCopiarActionPerformed
        final Command cm = new Copiar(jTextAreaArtigo.getSelectedText());
        cm.execute();
    }//GEN-LAST:event_jMenuEditarCopiarActionPerformed

    private void jMenuEditarColarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEditarColarActionPerformed
        final Command cm = new Colar(jTextAreaArtigo);
        cm.execute();
    }//GEN-LAST:event_jMenuEditarColarActionPerformed

    private void jMenuEditarCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEditarCortarActionPerformed
        final Command cm = new Cortar(jTextAreaArtigo);
        cm.execute();
    }//GEN-LAST:event_jMenuEditarCortarActionPerformed

    private void jMenuFicheiroGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFicheiroGuardarActionPerformed

        saveOnFile((fileOpen == null ? getSaveFile() : fileOpen));
    }//GEN-LAST:event_jMenuFicheiroGuardarActionPerformed

    private void jMenuColarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuColarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuColarActionPerformed
    private void saveOnFile(File file) {
        try {
            if (file != null) {
                String filePath = "";
                if (!file.getName().endsWith(".txt")) {
                    filePath = file.getPath() + ".txt";
                } else {
                    filePath = file.getPath();
                }
                try (FileWriter outputStream = new FileWriter(filePath)) {
                    setTitle("Ref Manager--" + file.getName());
                    outputStream.write(jTextAreaArtigo.getText());
                }
                fileOpen = file;
            }
        } catch (FileNotFoundException ioe) {
            JOptionPane.showMessageDialog(null, "Ficheiro n�o encontrado.", "", JOptionPane.WARNING_MESSAGE);
        } catch (IOException ioe) {
            System.out.println("IOException");
        }

    }

    private File getSaveFile() {

        File file = null;
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter txtfilter = new FileNameExtensionFilter(
                "html files (*.txt)", "txt");
        fc.setAcceptAllFileFilterUsed(false);
        fc.setFileFilter(txtfilter);
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal = fc.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
        }
        return file;
    }

    private void jMenuFicheiroGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFicheiroGuardarComoActionPerformed

        saveOnFile(getSaveFile());
    }//GEN-LAST:event_jMenuFicheiroGuardarComoActionPerformed

    private void jMenuFicheiroSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFicheiroSairActionPerformed
        int aske = JOptionPane.showConfirmDialog(this, "Pretende mesmo sair de" + getTitle() + " ?");
        if (aske == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_jMenuFicheiroSairActionPerformed

    private void jMenuFicheiroNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFicheiroNovoActionPerformed
        Historico.getInstance().cleanHist();
        int nuask = JOptionPane.showConfirmDialog(this, "Tem acerteza que quer iniciar um novo documento?");
        if (nuask == JOptionPane.YES_OPTION) {
            jTextAreaArtigo.setText("");
        }
    }//GEN-LAST:event_jMenuFicheiroNovoActionPerformed

    private void UndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoActionPerformed
        final Command cm = new Undo(jTextAreaArtigo);
        cm.execute();
    }//GEN-LAST:event_UndoActionPerformed

    private void RedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedoActionPerformed
        final Command cm = new Redo(jTextAreaArtigo);
        cm.execute();
    }//GEN-LAST:event_RedoActionPerformed

    private void exportHtmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportHtmlActionPerformed
        String path = null;
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter htmlfilter = new FileNameExtensionFilter(
                "html files (*.html)", "html");
        fc.setAcceptAllFileFilterUsed(false);
        fc.setFileFilter(htmlfilter);
        int returnVal = fc.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            path = file.getAbsolutePath();
            if (!path.contains(".html")) {
                path = path + ".html";
            }
            ExportBuilder builder = new ExportBuilderImpl("html");
            builder.exportText(jTextAreaArtigo.getText(), path);
        }
    }//GEN-LAST:event_exportHtmlActionPerformed

    private void exportTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportTxtActionPerformed
        String path = null;
        
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter txtfilter = new FileNameExtensionFilter(
                "txt files (*.txt)", "txt");
        fc.setFileFilter(txtfilter);
        fc.setAcceptAllFileFilterUsed(false);
        int returnVal = fc.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            path = file.getAbsolutePath();
            if (!path.contains(".txt")) {
                path = path + ".txt";
            }
            ExportBuilder builder = new ExportBuilderImpl("txt");
            builder.exportText(jTextAreaArtigo.getText(), path);
        }
    }//GEN-LAST:event_exportTxtActionPerformed

    private void jMenuAddReferenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddReferenceActionPerformed
        JFrame addRef = new AddReference();
        addRef.setLocationRelativeTo(null);
        addRef.setVisible(true);
    }//GEN-LAST:event_jMenuAddReferenceActionPerformed

    private void jMenuManageReferenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuManageReferenceActionPerformed
       JFrame man = new ManageReference();
        man.setLocationRelativeTo(null);
        man.setVisible(true);
    }//GEN-LAST:event_jMenuManageReferenceActionPerformed

    private void jTextAreaArtigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaArtigoKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetterOrDigit(c) || c==KeyEvent.VK_SPACE || c == KeyEvent.VK_BACK_SPACE){
            final Command cm = new Write(jTextAreaArtigo);
            cm.execute();
        }
    }//GEN-LAST:event_jTextAreaArtigoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuNotePade;
    private javax.swing.JMenuItem Redo;
    private javax.swing.JMenuItem Undo;
    private javax.swing.JMenuItem exportHtml;
    private javax.swing.JMenuItem exportTxt;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuAddReference;
    private javax.swing.JMenuItem jMenuColar;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenuItem jMenuEditarColar;
    private javax.swing.JMenuItem jMenuEditarCopiar;
    private javax.swing.JMenuItem jMenuEditarCortar;
    private javax.swing.JMenu jMenuFicheiro;
    private javax.swing.JMenuItem jMenuFicheiroAbrir;
    private javax.swing.JMenu jMenuFicheiroEditar;
    private javax.swing.JMenuItem jMenuFicheiroGuardar;
    private javax.swing.JMenuItem jMenuFicheiroGuardarComo;
    private javax.swing.JMenuItem jMenuFicheiroNovo;
    private javax.swing.JMenuItem jMenuFicheiroSair;
    private javax.swing.JMenuItem jMenuInsertReference;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuManageReference;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTextArea jTextAreaArtigo;
    // End of variables declaration//GEN-END:variables
}

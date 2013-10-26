/**
 * This file is part of RibbonClient application (check README).
 * Copyright (C) 2013 Stanislav Nepochatov
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
**/

package ribbonclient;

/**
 * Main window class.
 * @author Stanislav Nepochatov
 */
public class mainFrame extends javax.swing.JFrame {
    
    /**
     * Directories tree model;
     */
    public javax.swing.tree.DefaultTreeModel dirTreeModel = new javax.swing.tree.DefaultTreeModel(null);
    
    /**
     * Current directory (selected by user);
     */
    public DirClasses.DirEntry currDirectory;
    
    /**
     * Current message (selected by user);
     */
    public MessageClasses.MessageEntry currMessage;

    /** Creates new form mainFrame */
    public mainFrame() {
        initComponents();
        dirTree.expandRow(0);
        dirTree.setRootVisible(false);
        refreshStatusBar();
    }
    
    /**
     * Refresh message list;
     */
    public void refreshMessageList() {
        Integer selected = this.messageList.getSelectedIndex();
        javax.swing.DefaultListModel<String> msgModel = new javax.swing.DefaultListModel();
        for (String indexEntry : currDirectory.DIR_INDEXCES) {
            msgModel.addElement(MessageStore.getHeader(indexEntry));
        }
        this.messageList.setModel(msgModel);
        this.messageList.setSelectedIndex(selected);
        refreshStatusBar();
    }
    
    public void refreshStatusBar() {
        this.statusLabel.setText(RibbonClient.ClientApplication.CURR_LOGIN + " на " + RibbonClient.ClientApplication.SERVER_IP + " (" + MessageStore.messageIndex.size() + ")");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        messageList = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        messagePane = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        dirTree = new javax.swing.JTree();
        statusBar = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        clientBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        reloginItem = new javax.swing.JMenuItem();
        optionsItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitItem = new javax.swing.JMenuItem();
        messageMenu = new javax.swing.JMenu();
        addItem = new javax.swing.JMenuItem();
        editItem = new javax.swing.JMenuItem();
        repostItem = new javax.swing.JMenuItem();
        removeBut = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        infoItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Клієнт системи \"Стрічка\"");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jSplitPane1.setDividerLocation(140);
        jSplitPane1.setDividerSize(5);
        jSplitPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSplitPane2.setDividerLocation(150);
        jSplitPane2.setDividerSize(5);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        messageList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                messageListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(messageList);

        jSplitPane2.setTopComponent(jScrollPane2);

        messagePane.setEditable(false);
        jScrollPane3.setViewportView(messagePane);

        jSplitPane2.setRightComponent(jScrollPane3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel1);

        dirTree.setModel(DirEntrySW.rootDir);
        dirTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                dirTreeValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(dirTree);

        jSplitPane1.setLeftComponent(jScrollPane4);

        statusBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        statusLabel.setText("СТАТУС");

        javax.swing.GroupLayout statusBarLayout = new javax.swing.GroupLayout(statusBar);
        statusBar.setLayout(statusBarLayout);
        statusBarLayout.setHorizontalGroup(
            statusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statusBarLayout.setVerticalGroup(
            statusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusLabel, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        fileMenu.setText("Клієнт");

        reloginItem.setText("Переувійти до системи");
        reloginItem.setToolTipText("");
        reloginItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloginItemActionPerformed(evt);
            }
        });
        fileMenu.add(reloginItem);

        optionsItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        optionsItem.setText("Налаштування");
        fileMenu.add(optionsItem);
        fileMenu.add(jSeparator1);

        exitItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        exitItem.setText("Вийти");
        exitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitItem);

        clientBar.add(fileMenu);

        messageMenu.setText("Повідомлення");

        addItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        addItem.setText("Додати");
        addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemActionPerformed(evt);
            }
        });
        messageMenu.add(addItem);

        editItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        editItem.setText("Редагувати");
        editItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editItemActionPerformed(evt);
            }
        });
        messageMenu.add(editItem);

        repostItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        repostItem.setText("Перевипустити");
        repostItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repostItemActionPerformed(evt);
            }
        });
        messageMenu.add(repostItem);

        removeBut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        removeBut.setText("Видалити");
        removeBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButActionPerformed(evt);
            }
        });
        messageMenu.add(removeBut);
        messageMenu.add(jSeparator3);

        infoItem.setText("Інформація");
        infoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoItemActionPerformed(evt);
            }
        });
        messageMenu.add(infoItem);

        clientBar.add(messageMenu);

        helpMenu.setText("Довідка");

        aboutItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        aboutItem.setText("Про програму");
        aboutItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutItem);

        clientBar.add(helpMenu);

        setJMenuBar(clientBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(statusBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutItemActionPerformed
        aboutFrame bikiAbout = new aboutFrame(this, true);
        bikiAbout.setVisible(true);
    }//GEN-LAST:event_aboutItemActionPerformed

    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemActionPerformed
        RibbonClient.ClientApplication.appWorker.sendCommand("RIBBON_NCTL_CLOSE:");
        System.exit(0);
    }//GEN-LAST:event_exitItemActionPerformed

    private void dirTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_dirTreeValueChanged
        this.currDirectory = DirEntrySW.getEndDir(dirTree.getSelectionPath());
        this.currMessage = null;
        javax.swing.DefaultListModel<String> msgModel = new javax.swing.DefaultListModel();
        for (String indexEntry : currDirectory.DIR_INDEXCES) {
            msgModel.addElement(MessageStore.getHeader(indexEntry));
        }
        this.messageList.setModel(msgModel);
    }//GEN-LAST:event_dirTreeValueChanged

    private void messageListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_messageListValueChanged
        if (this.messageList.getSelectedIndex() != -1) {
            this.currMessage = MessageStore.getMessageEntryByIndex(this.currDirectory.DIR_INDEXCES.get(this.messageList.getSelectedIndex()));
            messagePane.setText(RibbonClient.ClientApplication.appWorker.sendCommandWithCollect("RIBBON_GET_MESSAGE:" + currDirectory.FULL_DIR_NAME
                    + "," + this.currMessage.INDEX));
        }
    }//GEN-LAST:event_messageListValueChanged

    private void addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemActionPerformed
        editorFrame editor = new editorFrame(this, false, null, editorFrame.editMode.POST);
        editor.setVisible(true);
    }//GEN-LAST:event_addItemActionPerformed

    private void editItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editItemActionPerformed
        MessageClasses.Message editedMessage = new MessageClasses.Message(currMessage, this.messagePane.getText().trim());
        editorFrame editor = new editorFrame(this, false, editedMessage, editorFrame.editMode.MODIFY);
        editor.setVisible(true);
    }//GEN-LAST:event_editItemActionPerformed

    private void repostItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repostItemActionPerformed
        MessageClasses.Message editedMessage = new MessageClasses.Message(currMessage, this.messagePane.getText().trim());
        editorFrame editor = new editorFrame(this, false, editedMessage, editorFrame.editMode.RE_POST);
        editor.setVisible(true);
    }//GEN-LAST:event_repostItemActionPerformed

    private void removeButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButActionPerformed
        Object[] options = {"Да", "Нет"};
        Integer result = javax.swing.JOptionPane.showOptionDialog(this,
            "Удалить сообщение '" + this.currMessage.HEADER + "' из системы?",
            "Вопрос",
            javax.swing.JOptionPane.YES_NO_CANCEL_OPTION,
            javax.swing.JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[1]);
        if (result == 0) {
            String answer = RibbonClient.ClientApplication.appWorker.sendCommandWithReturn("RIBBON_DELETE_MESSAGE:" + this.currMessage.INDEX);
            if (answer.startsWith("OK:")) {
            } else {
                RibbonClient.ClientApplication.reportError(answer);
            }
        }
    }//GEN-LAST:event_removeButActionPerformed

    private void infoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoItemActionPerformed
        informFrame informer = new informFrame(this, false, new MessageClasses.Message(currMessage, this.messagePane.getText().trim()));
        informer.setVisible(true);
    }//GEN-LAST:event_infoItemActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        RibbonClient.ClientApplication.appWorker.sendCommand("RIBBON_NCTL_CLOSE:");
    }//GEN-LAST:event_formWindowClosing

    private void reloginItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloginItemActionPerformed
      new Thread() {
            @Override
            public void run() {
                UIComponents.LoginWindow loginFrame = new UIComponents.LoginWindow(RibbonClient.ClientApplication, null);
                loginFrame.setVisible(true);
                loginFrame.waitForClose();
                RibbonClient.clientWindow.refreshStatusBar();
            }
        }.start();
    }//GEN-LAST:event_reloginItemActionPerformed

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutItem;
    private javax.swing.JMenuItem addItem;
    private javax.swing.JMenuBar clientBar;
    private javax.swing.JTree dirTree;
    private javax.swing.JMenuItem editItem;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem infoItem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JList messageList;
    private javax.swing.JMenu messageMenu;
    private javax.swing.JTextPane messagePane;
    private javax.swing.JMenuItem optionsItem;
    private javax.swing.JMenuItem reloginItem;
    private javax.swing.JMenuItem removeBut;
    private javax.swing.JMenuItem repostItem;
    private javax.swing.JPanel statusBar;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}

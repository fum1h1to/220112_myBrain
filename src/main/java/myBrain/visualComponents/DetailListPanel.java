package myBrain.visualComponents;

import java.awt.Desktop;
import java.net.URI;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import myBrain.Main;
import myBrain.util.JsonFormat;

/**
 *
 * @author Ayahito0223
 */
public class DetailListPanel extends javax.swing.JPanel {

    private DefaultListModel<String> tagsModel;
    private DefaultListModel<String> urlsModel;
    private int nowIndex = -1;

    /**
     * Creates new form detailListPanel
     */
    public DetailListPanel() {
        tagsModel = new DefaultListModel<>();
        urlsModel = new DefaultListModel<>();
        initComponents();
        tagsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        urlsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public boolean initPanel(int detailIndex) {
        JsonFormat thisItem = Main.getMainFrame().getDataList().get(detailIndex);
        this.nowIndex = detailIndex;
        if (thisItem != null) {
            //title
            titleText.setText(thisItem.getTitle());

            //url
            urlsModel.clear();
            if (thisItem.getUrls() != null) {
                for (int i = 0; i < thisItem.getUrls().size(); i++) {
                    urlsModel.addElement(thisItem.getUrls().get(i));
                }
            }

            //tag
            tagsModel.clear();
            for (int i = 0; i < thisItem.getTags().size(); i++) {
                tagsModel.addElement(thisItem.getTags().get(i));
            }

            //result
            resultText.setText(thisItem.getResult());

            //other
            otherText.setText(thisItem.getOther());
            return true;
        }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detailListPanel_controlPanel = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        changeBtn = new javax.swing.JButton();
        detailList_wrap = new javax.swing.JPanel();
        titleText = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        resultText = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        otherText = new javax.swing.JTextArea();
        tagsPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tagsTextToAdd = new javax.swing.JTextField();
        tagsAdd = new javax.swing.JButton();
        tagsDel = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tagsList = new javax.swing.JList<>();
        urlPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        urlsTextToAdd = new javax.swing.JTextField();
        urlsAdd = new javax.swing.JButton();
        urlsDel = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        urlsList = new javax.swing.JList<>();

        backBtn.setText("戻る");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        changeBtn.setText("変更の反映");
        changeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout detailListPanel_controlPanelLayout = new javax.swing.GroupLayout(detailListPanel_controlPanel);
        detailListPanel_controlPanel.setLayout(detailListPanel_controlPanelLayout);
        detailListPanel_controlPanelLayout.setHorizontalGroup(
            detailListPanel_controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailListPanel_controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(changeBtn)
                .addContainerGap())
        );
        detailListPanel_controlPanelLayout.setVerticalGroup(
            detailListPanel_controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailListPanel_controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailListPanel_controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(changeBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        titleText.setBorder(javax.swing.BorderFactory.createTitledBorder("タイトル"));
        titleText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTextActionPerformed(evt);
            }
        });

        resultText.setColumns(20);
        resultText.setRows(5);
        resultText.setBorder(javax.swing.BorderFactory.createTitledBorder("結果"));
        jScrollPane3.setViewportView(resultText);

        otherText.setColumns(20);
        otherText.setRows(5);
        otherText.setBorder(javax.swing.BorderFactory.createTitledBorder("その他"));
        jScrollPane4.setViewportView(otherText);

        tagsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("タグ"));
        tagsPanel.setMaximumSize(new java.awt.Dimension(280, 32767));
        tagsPanel.setPreferredSize(new java.awt.Dimension(280, 91));

        tagsAdd.setText("追加");
        tagsAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tagsAddMouseClicked(evt);
            }
        });

        tagsDel.setText("削除");
        tagsDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tagsDelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tagsTextToAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tagsDel, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(tagsAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tagsTextToAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tagsAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tagsDel)
                .addContainerGap())
        );

        tagsList.setModel(tagsModel);
        jScrollPane5.setViewportView(tagsList);

        javax.swing.GroupLayout tagsPanelLayout = new javax.swing.GroupLayout(tagsPanel);
        tagsPanel.setLayout(tagsPanelLayout);
        tagsPanelLayout.setHorizontalGroup(
            tagsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tagsPanelLayout.createSequentialGroup()
                .addGroup(tagsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tagsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5)))
                .addContainerGap())
        );
        tagsPanelLayout.setVerticalGroup(
            tagsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tagsPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        urlPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("URL"));
        urlPanel.setMaximumSize(new java.awt.Dimension(280, 32767));
        urlPanel.setPreferredSize(new java.awt.Dimension(280, 91));

        urlsAdd.setText("追加");
        urlsAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                urlsAddMouseClicked(evt);
            }
        });

        urlsDel.setText("削除");
        urlsDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                urlsDelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(urlsTextToAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(urlsDel, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(urlsAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urlsTextToAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(urlsAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(urlsDel)
                .addContainerGap())
        );

        urlsList.setModel(urlsModel);
        urlsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                urlsListMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(urlsList);

        javax.swing.GroupLayout urlPanelLayout = new javax.swing.GroupLayout(urlPanel);
        urlPanel.setLayout(urlPanelLayout);
        urlPanelLayout.setHorizontalGroup(
            urlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(urlPanelLayout.createSequentialGroup()
                .addGroup(urlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(urlPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6)))
                .addContainerGap())
        );
        urlPanelLayout.setVerticalGroup(
            urlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, urlPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout detailList_wrapLayout = new javax.swing.GroupLayout(detailList_wrap);
        detailList_wrap.setLayout(detailList_wrapLayout);
        detailList_wrapLayout.setHorizontalGroup(
            detailList_wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailList_wrapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailList_wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(titleText)
                    .addGroup(detailList_wrapLayout.createSequentialGroup()
                        .addComponent(urlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tagsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        detailList_wrapLayout.setVerticalGroup(
            detailList_wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailList_wrapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleText, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailList_wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tagsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(urlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailListPanel_controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(detailList_wrap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detailListPanel_controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailList_wrap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        // TODO add your handling code here:
        Main.getMainFrame().changeScreen(0);
    }//GEN-LAST:event_backBtnMouseClicked

    private void titleTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTextActionPerformed

    private void changeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeBtnMouseClicked
        // TODO add your handling code here:
        ArrayList<String> tagsList = new ArrayList<>();
        for (int i = 0; i < tagsModel.getSize(); i++) {
            tagsList.add((String) tagsModel.get(i));
        }
        ArrayList<String> urlsList = new ArrayList<>();
        for (int i = 0; i < urlsModel.getSize(); i++) {
            urlsList.add((String) urlsModel.get(i));
        }

        myBrain.util.JsonFormat data = new myBrain.util.JsonFormat(this.titleText.getText(), urlsList, tagsList, this.resultText.getText(), this.otherText.getText());
        if (data.checkStr()) {
            Main.getMainFrame().getDataList().set(nowIndex, data);
            Main.getMainFrame().changeScreen(0);

            this.titleText.setText("");
            this.urlsModel.clear();
            this.tagsModel.clear();
            this.resultText.setText("");
            this.otherText.setText("");
        } else {
            Object[] msg = {"タイトル、タグ、結果は必須記入項目です。"};
            JOptionPane.showMessageDialog(this, msg, "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_changeBtnMouseClicked

    private void tagsAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tagsAddMouseClicked
        // TODO add your handling code here:
        String tagItem = tagsTextToAdd.getText();
        if (!tagItem.isEmpty()) {
            tagsModel.addElement(tagItem);
            this.tagsTextToAdd.setText("");
        } else {
            Object[] msg = {"項目を入力してください。"};
            JOptionPane.showMessageDialog(this, msg, "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tagsAddMouseClicked

    private void tagsDelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tagsDelMouseClicked
        // TODO add your handling code here:
        int delIndex = tagsList.getSelectedIndex();
        if (delIndex == -1) {
            Object[] msg = {"リストから項目を選択してください。"};
            JOptionPane.showMessageDialog(this, msg, "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            tagsModel.remove(delIndex);
        }
    }//GEN-LAST:event_tagsDelMouseClicked

    private void urlsAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urlsAddMouseClicked
        // TODO add your handling code here:
        String urlItem = urlsTextToAdd.getText();
        if (!urlItem.isEmpty()) {
            urlsModel.addElement(urlItem);
            this.urlsTextToAdd.setText("");
        } else {
            Object[] msg = {"項目を入力してください。"};
            JOptionPane.showMessageDialog(this, msg, "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_urlsAddMouseClicked

    private void urlsDelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urlsDelMouseClicked
        // TODO add your handling code here:
        int delIndex = urlsList.getSelectedIndex();
        if (delIndex == -1) {
            Object[] msg = {"リストから項目を選択してください。"};
            JOptionPane.showMessageDialog(this, msg, "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            urlsModel.remove(delIndex);
        }
    }//GEN-LAST:event_urlsDelMouseClicked

    private void urlsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urlsListMouseClicked
        // TODO add your handling code here:
        JList list = (JList) evt.getSource();
        DefaultListModel model = (DefaultListModel) list.getModel();
        if (evt.getClickCount() == 2) {
            int index = list.locationToIndex(evt.getPoint());
            String url = (String) model.get(index);
            if (url.isEmpty()) {
                Object[] msg = {"URLが空です。"};
                JOptionPane.showMessageDialog(this, msg, "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            try {
                URI uri = new URI(url);
                desktop.browse(uri);
            } catch (Exception e) {
                Object[] msg = {"URLが不適切である可能性があります。"};
                JOptionPane.showMessageDialog(this, msg, "Error",
                        JOptionPane.ERROR_MESSAGE);
                System.err.println("ブラウザ起動で何か問題が起こりました。");
                if (Main.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_urlsListMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton changeBtn;
    private javax.swing.JPanel detailListPanel_controlPanel;
    private javax.swing.JPanel detailList_wrap;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea otherText;
    private javax.swing.JTextArea resultText;
    private javax.swing.JButton tagsAdd;
    private javax.swing.JButton tagsDel;
    private javax.swing.JList<String> tagsList;
    private javax.swing.JPanel tagsPanel;
    private javax.swing.JTextField tagsTextToAdd;
    private javax.swing.JTextField titleText;
    private javax.swing.JPanel urlPanel;
    private javax.swing.JButton urlsAdd;
    private javax.swing.JButton urlsDel;
    private javax.swing.JList<String> urlsList;
    private javax.swing.JTextField urlsTextToAdd;
    // End of variables declaration//GEN-END:variables
}
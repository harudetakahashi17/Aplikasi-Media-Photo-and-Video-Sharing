/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View2;

/**
 *
 * @author Harude
 */
public class ViewMedia extends javax.swing.JPanel {

    /**
     * Creates new form PickMedia
     */
    public ViewMedia() {
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

        PreviewMedia = new javax.swing.JPanel();
        Tag = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        pMedia = new javax.swing.JPanel();
        etcSect = new javax.swing.JPanel();
        Like = new javax.swing.JLabel();
        jLike = new javax.swing.JList<>();
        Comment = new javax.swing.JLabel();
        WriteComment = new javax.swing.JLabel();
        tfComment = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jComment = new javax.swing.JList<>();

        Tag.setText("Tag :");

        jScrollPane1.setBorder(null);

        jList1.setBackground(new java.awt.Color(240, 240, 240));
        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Disini Tag" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        pMedia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pMediaLayout = new javax.swing.GroupLayout(pMedia);
        pMedia.setLayout(pMediaLayout);
        pMediaLayout.setHorizontalGroup(
            pMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
        );
        pMediaLayout.setVerticalGroup(
            pMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PreviewMediaLayout = new javax.swing.GroupLayout(PreviewMedia);
        PreviewMedia.setLayout(PreviewMediaLayout);
        PreviewMediaLayout.setHorizontalGroup(
            PreviewMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PreviewMediaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PreviewMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tag)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PreviewMediaLayout.setVerticalGroup(
            PreviewMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PreviewMediaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PreviewMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PreviewMediaLayout.createSequentialGroup()
                        .addComponent(Tag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                .addContainerGap())
        );

        etcSect.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Like.setText("Like");

        jLike.setBackground(new java.awt.Color(240, 240, 240));
        jLike.setEnabled(false);

        Comment.setText("Comment :");

        WriteComment.setText("Write Comment : ");

        tfComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCommentActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(null);

        jComment.setBackground(new java.awt.Color(240, 240, 240));
        jComment.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Disini Komen" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jComment.setEnabled(false);
        jScrollPane2.setViewportView(jComment);

        javax.swing.GroupLayout etcSectLayout = new javax.swing.GroupLayout(etcSect);
        etcSect.setLayout(etcSectLayout);
        etcSectLayout.setHorizontalGroup(
            etcSectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(etcSectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(etcSectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(etcSectLayout.createSequentialGroup()
                        .addGroup(etcSectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(etcSectLayout.createSequentialGroup()
                                .addComponent(WriteComment)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfComment))
                            .addGroup(etcSectLayout.createSequentialGroup()
                                .addGroup(etcSectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(etcSectLayout.createSequentialGroup()
                                        .addComponent(Like)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLike, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Comment))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        etcSectLayout.setVerticalGroup(
            etcSectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(etcSectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(etcSectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Like, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLike, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Comment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(etcSectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WriteComment)
                    .addComponent(tfComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etcSect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PreviewMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PreviewMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etcSect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCommentActionPerformed
    }//GEN-LAST:event_tfCommentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Comment;
    private javax.swing.JLabel Like;
    private javax.swing.JPanel PreviewMedia;
    private javax.swing.JLabel Tag;
    private javax.swing.JLabel WriteComment;
    private javax.swing.JPanel etcSect;
    private javax.swing.JList<String> jComment;
    private javax.swing.JList<String> jLike;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pMedia;
    private javax.swing.JTextField tfComment;
    // End of variables declaration//GEN-END:variables
}

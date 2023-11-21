
package csynch.form;

import csynch.tabbed.TabbedForm;
import javax.swing.JOptionPane;


public class ChatForm extends TabbedForm {


  
    public ChatForm() {
        initComponents();
    }

//    public void initComponents(){
//        
////        jButton1 = new javax.swing.JButton();
////        jScrollPane1 = new javax.swing.JScrollPane();
////        txt = new javax.swing.JTextArea();
////
////        jButton1.setText("Test");
////
////        txt.setColumns(20);
////        txt.setRows(5);
////        jScrollPane1.setViewportView(txt);
////
////        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
////        this.setLayout(layout);
////        layout.setHorizontalGroup(
////            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
////            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
////                .addContainerGap(432, Short.MAX_VALUE)
////                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
////                    .addComponent(jScrollPane1)
////                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
////                .addGap(136, 136, 136))
////        );
////        layout.setVerticalGroup(
////            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
////            .addGroup(layout.createSequentialGroup()
////                .addGap(142, 142, 142)
////                .addComponent(jButton1)
////                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
////                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
////                .addContainerGap(209, Short.MAX_VALUE)));
//                
//    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextArea();

        jButton1.setText("jButton1");

        txt.setColumns(20);
        txt.setRows(5);
        jScrollPane1.setViewportView(txt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(456, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

   @Override
    public boolean formClose() {

       if(txt.getText().trim().equals("")){
           return true;
       }
       int opt=JOptionPane.showConfirmDialog(this, "Data not save do you want to close ?", "Close", JOptionPane.YES_NO_OPTION);
       return opt==JOptionPane.YES_OPTION;
    }
    
      @Override
    public void formOpen() {
        System.out.println("Form open");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceltest;

import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.AbstractButton;
import javax.swing.table.*;
import table.Table;



/**
 *
 * @author Vince
 */
public class ExcelFrame extends javax.swing.JFrame {

    /**
     * Creates new form ExcelFrame
     */
    
    Table curTable;
    final int DEFAULT_INC = 6;
    KeyboardFocusManager manager;
    AbstractButton abstractButton;
    boolean multiSelected;
    DefaultTableModel tableModel;
    HashMap<String,Integer> multiMap;
    static int multiCounter;
    
    public ExcelFrame(Table table){
        
        this.curTable = table; 
        multiCounter = 0;
        initComponents();
        tableModel = (DefaultTableModel)theTable.getModel();
        multiMap = new HashMap<String,Integer>();
    }
    
    DefaultTableModel getModel(){
        
        return tableModel;
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        techFieldName = new javax.swing.JTextField();
        devFieldName = new javax.swing.JTextField();
        techField = new javax.swing.JLabel();
        deviceField = new javax.swing.JLabel();
        tablePanel = new javax.swing.JScrollPane();
        theTable = new javax.swing.JTable();
        button1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        techFieldName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                techFieldNameKeyPressed(evt);
            }
        });

        devFieldName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                devFieldNameFocusGained(evt);
            }
        });
        devFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devFieldNameActionPerformed(evt);
            }
        });
        devFieldName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                devFieldNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                devFieldNameKeyTyped(evt);
            }
        });

        techField.setText("Tech");

        deviceField.setText("Device");

        theTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"2277", "0", "0", "0", "0", "0"},
                {"2273", "0", "0", "0", "0", "0"},
                {"0025", "0", "0", "0", "0", "0"},
                {"1234", "0", "0", "0", "0", "0"},
                {"0000", "0", "0", "0", "0", "0"},
                {"Total Dev", "0", "0", "0", "0", "0"}
            },
            new String [] {
                "Tech", "Dev1", "Dev2", "Dev3", "Dev4", "Tech Total"
            }
        ));
        theTable.setColumnSelectionAllowed(true);
        tablePanel.setViewportView(theTable);
        theTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        button1.setText("jButton1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Multi Scan");
        jToggleButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jToggleButton1StateChanged(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(techField))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(deviceField))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(devFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(techFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jToggleButton1)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(button1)))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(techField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(techFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deviceField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(devFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1)
                .addGap(69, 201, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void devFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_devFieldNameActionPerformed

    private void techFieldNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_techFieldNameKeyPressed
        // TODO add your handling code here:
        int keyCode = evt.getKeyCode();
        if(keyCode == KeyEvent.VK_ENTER){
            manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
            manager.focusNextComponent();
        }
    }//GEN-LAST:event_techFieldNameKeyPressed

    private void devFieldNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_devFieldNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_devFieldNameKeyTyped

    private void devFieldNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_devFieldNameKeyPressed
        // TODO add your handling code here:
        int keyCode = evt.getKeyCode();
        
        if(keyCode == KeyEvent.VK_ENTER && !multiSelected){
            toTable();
            manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
            manager.focusPreviousComponent();
            techFieldName.setText("");
        }else if(keyCode == KeyEvent.VK_ENTER && multiSelected){
            if(!devFieldName.getText().equals("")){
                toMulti();
            }else{
                commitMTable();
            }  
        }   
    }//GEN-LAST:event_devFieldNameKeyPressed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        
        curTable.updateTable(getModel());
        
    }//GEN-LAST:event_button1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        abstractButton = (AbstractButton) evt.getSource();
        multiSelected = abstractButton.getModel().isSelected();
        
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jToggleButton1StateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jToggleButton1StateChanged

    private void devFieldNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_devFieldNameFocusGained
        // TODO add your handling code here:
    
                
    }//GEN-LAST:event_devFieldNameFocusGained
    
    private void toMulti(){

        String device = devFieldName.getText();
        devFieldName.setText("");
        
        if(!multiMap.containsKey(device)){
            multiMap.put(device, 1);
        }else{
            int currentVal = multiMap.get(device);
            multiMap.replace(device, currentVal+1);
        }  
    }
    
    private void commitMTable(){
        
        if(!multiMap.isEmpty()){
            int row = getRow(tableModel,techFieldName.getText());
            
            for(Map.Entry<String,Integer> entry:multiMap.entrySet()){
                
                String device = entry.getKey();
                
                int value = entry.getValue();                
                int col = getCol(tableModel,device);

                int oldValue = Integer.parseInt(tableModel.getValueAt(row, col).toString());
                int newValue = oldValue + value;
                
                setTableValues(newValue,row,col);
            }
        }
        
        multiMap.clear();
                
    }
    
    private void toTable(){
        
        String device = devFieldName.getText();
        devFieldName.setText("");
        
        int col = getCol(tableModel,device);
        int row = getRow(tableModel,techFieldName.getText());
        
        devFieldName.setText("");
            
        int oldValue = Integer.parseInt(tableModel.getValueAt(row, col).toString());
        int newValue = oldValue + DEFAULT_INC;
           
        setTableValues(newValue,row,col);    
        
    }
    
    private void setTableValues(int val, int row, int col){
        
        tableModel.setValueAt(val, row, col);    
        updateTotalDev(tableModel);
        updateTotalTech(tableModel);
    }
    
    private void updateTotalDev(DefaultTableModel model){
        String[] devNames = {"Dev1","Dev2","Dev3","Dev4"};
        
        int col =0;
        int devRow =0;
        int sum =0;
        
        devRow = getRow(model,"Total Dev");
               
        for(String dev:devNames){
            sum = 0;
            col = getCol(model,dev);

            for(int row =0;row<model.getRowCount()-1;row++){
                sum += Integer.parseInt(model.getValueAt(row, col).toString());
            }
            
            model.setValueAt(sum, devRow, col);
    
        }
    }
    
    private void updateTotalTech(DefaultTableModel model){
        String[] devNames = {"Dev1","Dev2","Dev3","Dev4"};    
        int totCol,sum,value;
        int tttSum = 0;

        totCol = getCol(model,"Tech Total");
        
        for(String tech:curTable.getRosterNum()){
            int row = getRow(model,tech);
            sum = 0;
            for(String dev:devNames){
                int col = getCol(model,dev);
                value = Integer.parseInt(model.getValueAt(row, col).toString());
                sum += value;
            }
            
            tttSum += sum;
            
            model.setValueAt(sum,row,totCol);
        }
        
        updateTTT(tttSum,model);
 
    }
    
    private void updateTTT(int sum,DefaultTableModel model){
        
        int totCol = getCol(model,"Tech Total");
        int totRow = getRow(model,"Total Dev");
        
        model.setValueAt(sum, totRow, totCol);
             
    }
    private int getCol(DefaultTableModel model, String deviceName){
        return model.findColumn(deviceName);
    }
    
    private int getRow(DefaultTableModel model, String value){
  
        String rowValue = "";
       
        for(int i=0;i<model.getRowCount();i++){

           rowValue = (String)model.getValueAt(i, 0);
           if(rowValue.equals(value)){
               return i;
           }
        }
          
        return 0;
    }
    
    DefaultTableModel getTableModel(){
        DefaultTableModel tbModel = (DefaultTableModel)theTable.getModel();
        
        return tbModel;
    }
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
            java.util.logging.Logger.getLogger(ExcelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1;
    private javax.swing.JTextField devFieldName;
    private javax.swing.JLabel deviceField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JScrollPane tablePanel;
    private javax.swing.JLabel techField;
    private javax.swing.JTextField techFieldName;
    private javax.swing.JTable theTable;
    // End of variables declaration//GEN-END:variables
}

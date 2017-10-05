/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vince
 */
public class Table{
    
    ArrayList<String> tRosterNames;
    ArrayList<String> tRosterTechNum;
    HashMap<String,String> roster;
    int ID;
    String[][] table;
    
    
    Table(int ID,HashMap<String,String> roster){
        this.ID = ID;
        this.roster = roster;
        tRosterNames = new ArrayList<String>();
        tRosterTechNum = new ArrayList<String>(); 
        System.out.println("Table Object Created ID: " + ID);
        
        setRosterNames();
        setRosterTechNum();
        
    }
    
    private void setRosterNames(){
        for(String key:roster.keySet()){
            tRosterNames.add(roster.get(key));
        }
        
    }
    
    private void setRosterTechNum(){
        for(String key:roster.keySet()){
            tRosterTechNum.add(key);
        }
    }
    
    public ArrayList<String> getRosterNames(){
        
        return tRosterNames;
       
    }
    
    public ArrayList<String> getRosterNum(){
        
        return tRosterTechNum;
       
    }
    
    public void updateTable(DefaultTableModel tModel){
        int numCol = tModel.getColumnCount();
        int numRow = tModel.getRowCount();
        this.table = new String[numRow][numCol];
        
        for(int i=0;i<numRow;i++){
            for(int j=0;j<numCol;j++){
                table[i][j] = tModel.getValueAt(i, j).toString();
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
            
        } 
    }
    
}

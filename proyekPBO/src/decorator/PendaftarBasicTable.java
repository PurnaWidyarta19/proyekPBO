/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.Database;
import main.Pendaftar;

/**
 *
 * @author kadekpurna22
 */
public class PendaftarBasicTable implements Table<Pendaftar>{
    
    @Override
    public ArrayList<Pendaftar> getList(){
        ArrayList<Pendaftar> pfrList = new ArrayList();
        try{
            pfrList = (ArrayList<Pendaftar>) Database.getInstance().getListPendaftar();
        }catch(SQLException e){
            Logger.getLogger(PendaftarBasicTable.class.getName()).log(Level.SEVERE, null, e);
        }
        return pfrList;
    }
}

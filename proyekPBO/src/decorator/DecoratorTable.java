/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package decorator;

import java.util.ArrayList;

/**
 *
 * @author kadekpurna22
 */
public class DecoratorTable implements Table{
    protected Table decoratedTable;
    
    public DecoratorTable (Table decoratedTable){
        this.decoratedTable = decoratedTable;
    }
    
    @Override
    public ArrayList getList(){
        return decoratedTable.getList();
    }
}

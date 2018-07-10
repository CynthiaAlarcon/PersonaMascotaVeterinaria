/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author UsuarioPC
 */
public class PanelTablaPersonas extends JPanel{
    
    public JTable tabla;
    public DefaultTableModel modelo;
    private JScrollPane scroll;

    public PanelTablaPersonas() {
    }
    
    private void initComponents(){
        this.modelo = new DefaultTableModel();
        this.tabla = new JTable();
        this.tabla.setModel(modelo);
        this.modelo.addColumn("Rut");
        this.modelo.addColumn("Nombres");
        this.modelo.addColumn("Apellidos");
        this.modelo.addColumn("Fecha de Nacimiento");
        this.scroll = new JScrollPane(tabla);
        this.add(this.scroll);
}
}

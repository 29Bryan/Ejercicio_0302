/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_0302;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author PCG
 */
public class Ventana1 extends JFrame {
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JCheckBox> jCheckboxList;
    private List<JComboBox> jComboBoxList;
    private List<JComboBox> jComboBoxList2;
    
    public Ventana1(String title) throws HeadlessException {
        super(title);
        this.setSize(300,300);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
        
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(5,1));
//        this.jPanel1.setLayout(new BorderLayout(1,5));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
        this.iniciarBotones();
//        this.iniciarChecks();
        this.iniciarCombo();
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setBackground(Color.BLUE);
        this.jPanelList.get(1).setBackground(Color.WHITE);
        this.jPanelList.get(2).setBackground(Color.WHITE);
        this.jPanelList.get(3).setBackground(Color.WHITE);
        this.jPanelList.get(4).setBackground(Color.WHITE);
        
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));

        
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("INSCRIBETE"));
        this.jLabelList.add(new JLabel("Seleccione una Sede: "));
        this.jLabelList.add(new JLabel("Tipo de Documento: "));
        this.jLabelList.add(new JLabel("Ingrese su Identificacion: "));
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));  
        this.jPanelList.get(3).add(this.jLabelList.get(3));  
        
//        this.jPanel1.add(this.jLabelList.get(1),BorderLayout.WEST);
//        this.jPanel1.add(this.jLabelList.get(2),BorderLayout.WEST);
//        this.jPanel1.add(this.jLabelList.get(3),BorderLayout.WEST);
    }
    
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());

        this.jTextFieldList.get(3).setColumns(10);
        
        this.jPanelList.get(3).add(this.jTextFieldList.get(3));
    }
    
    public void iniciarBotones(){
        this.jButtonList = new ArrayList<>(); 
        this.jButtonList.add(new JButton());

        this.jButtonList.get(0).setText("Ingrese");
        
        this.jPanelList.get(4).add(this.jButtonList.get(0));
    }
    
//    public void iniciarChecks(){
//        this.jCheckboxList = new ArrayList<>();
//        this.jCheckboxList.add(new JCheckBox("Adidas"));
//        this.jCheckboxList.add(new JCheckBox("Nike"));
//        this.jCheckboxList.add(new JCheckBox("Coca Cola"));
//        this.jCheckboxList.add(new JCheckBox("Pepsi"));
//        this.jCheckboxList.add(new JCheckBox("FIFA",true));      
//        
//        this.jPanelList.get(3).add(this.jCheckboxList.get(0));
//        this.jPanelList.get(3).add(this.jCheckboxList.get(1));
//        this.jPanelList.get(3).add(this.jCheckboxList.get(2));
//        this.jPanelList.get(3).add(this.jCheckboxList.get(3));
//        this.jPanelList.get(3).add(this.jCheckboxList.get(4));
//        
//    }
    
    public void iniciarCombo(){
        
        this.jComboBoxList = new ArrayList<>(); 
        this.jComboBoxList.add(new JComboBox()); 
        
        this.jComboBoxList.get(0).addItem("MATRIZ CUENCA");
        this.jComboBoxList.get(0).addItem("MATRIZ QUITO");
        this.jComboBoxList.get(0).addItem("MATRIZ GUAYAQUIL");
        
        this.jPanelList.get(1).add(this.jComboBoxList.get(0));
        this.jPanelList.get(1).add(this.jComboBoxList.get(0));
        this.jPanelList.get(1).add(this.jComboBoxList.get(0));
        
        this.jComboBoxList2 = new ArrayList<>(); 
        this.jComboBoxList2.add(new JComboBox()); 
        
        this.jComboBoxList2.get(0).addItem("CEDULA");
        this.jComboBoxList2.get(0).addItem("PASAPORTE");
        
        this.jPanelList.get(2).add(this.jComboBoxList2.get(0));
        this.jPanelList.get(2).add(this.jComboBoxList2.get(0));

    }
}

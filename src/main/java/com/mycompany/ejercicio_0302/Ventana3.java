/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_0302;

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
public class Ventana3 extends JFrame {
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
//    private List<JButton> jButtonList;
//    private List<JCheckBox> jCheckboxList;
    private List<JComboBox> jComboBoxList;
    private List<JComboBox> jComboBoxList2;
    private List<JComboBox> jComboBoxList3;
    private List<JComboBox> jComboBoxList4;
    private List<JComboBox> jComboBoxList5;
    
    public Ventana3(String title) throws HeadlessException {
        super(title);
        this.setSize(300,300);
        this.setLocation(800, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.GRAY);
        this.jPanel1.setLayout(new GridLayout(8,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
//        this.iniciarBotones();
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
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setBackground(Color.BLUE);
        this.jPanelList.get(1).setBackground(Color.WHITE);
        this.jPanelList.get(2).setBackground(Color.WHITE);
        this.jPanelList.get(3).setBackground(Color.WHITE);
        this.jPanelList.get(4).setBackground(Color.WHITE);
        this.jPanelList.get(5).setBackground(Color.WHITE);
        this.jPanelList.get(6).setBackground(Color.WHITE);
        this.jPanelList.get(7).setBackground(Color.WHITE);
        
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanel1.add(this.jPanelList.get(5));
        this.jPanel1.add(this.jPanelList.get(6));
        this.jPanel1.add(this.jPanelList.get(7));

        
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        
        this.jLabelList.add(new JLabel("INFORMACION DE CARRERA"));
        this.jLabelList.add(new JLabel("Periodo Academico: "));
        this.jLabelList.add(new JLabel("Carrera: "));
        this.jLabelList.add(new JLabel("Modalidad: "));
        this.jLabelList.add(new JLabel("Sede: "));
        this.jLabelList.add(new JLabel("Campus: "));
        this.jLabelList.add(new JLabel("Jornada: "));
        this.jLabelList.add(new JLabel("Fecha de Registro: "));
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));  
        this.jPanelList.get(3).add(this.jLabelList.get(3));  
        this.jPanelList.get(4).add(this.jLabelList.get(4));
        this.jPanelList.get(5).add(this.jLabelList.get(5));  
        this.jPanelList.get(6).add(this.jLabelList.get(6)); 
        this.jPanelList.get(7).add(this.jLabelList.get(7)); 
    }
    
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());

        this.jTextFieldList.get(1).setColumns(10);
        this.jTextFieldList.get(7).setColumns(10);
        
        this.jPanelList.get(1).add(this.jTextFieldList.get(1));
        this.jPanelList.get(7).add(this.jTextFieldList.get(7));
    }

    public void iniciarCombo(){
        
        this.jComboBoxList = new ArrayList<>(); 
        this.jComboBoxList.add(new JComboBox()); 
        
        this.jComboBoxList.get(0).addItem("ELECTRONICA");
        this.jComboBoxList.get(0).addItem("TELECOMUNICACIONES");
        this.jComboBoxList.get(0).addItem("COMPUTACION");
        
        this.jPanelList.get(2).add(this.jComboBoxList.get(0));
        this.jPanelList.get(2).add(this.jComboBoxList.get(0));
        this.jPanelList.get(2).add(this.jComboBoxList.get(0));
        
        this.jComboBoxList2 = new ArrayList<>(); 
        this.jComboBoxList2.add(new JComboBox()); 
        
        this.jComboBoxList2.get(0).addItem("PRESENCIAL");
        this.jComboBoxList2.get(0).addItem("VIRTUAL");
        
        this.jPanelList.get(3).add(this.jComboBoxList2.get(0));
        this.jPanelList.get(3).add(this.jComboBoxList2.get(0));
        
        this.jComboBoxList3 = new ArrayList<>(); 
        this.jComboBoxList3.add(new JComboBox()); 
        
        this.jComboBoxList3.get(0).addItem("MATRIZ CUENCA");
        this.jComboBoxList3.get(0).addItem("MATRIZ QUITO");
        this.jComboBoxList3.get(0).addItem("MATRIZ GUAYAQUIL");
        
        this.jPanelList.get(4).add(this.jComboBoxList3.get(0));
        this.jPanelList.get(4).add(this.jComboBoxList3.get(0));
        this.jPanelList.get(4).add(this.jComboBoxList3.get(0));
        
        this.jComboBoxList4 = new ArrayList<>(); 
        this.jComboBoxList4.add(new JComboBox()); 
        
        this.jComboBoxList4.get(0).addItem("EL VECINO");
        this.jComboBoxList4.get(0).addItem("SUR");
        this.jComboBoxList4.get(0).addItem("CENTENARIO");
        
        this.jPanelList.get(5).add(this.jComboBoxList4.get(0));
        this.jPanelList.get(5).add(this.jComboBoxList4.get(0));
        this.jPanelList.get(5).add(this.jComboBoxList4.get(0));
        
        this.jComboBoxList5 = new ArrayList<>(); 
        this.jComboBoxList5.add(new JComboBox()); 
        
        this.jComboBoxList5.get(0).addItem("VESPERTINA");
        this.jComboBoxList5.get(0).addItem("DIURNO");
        
        this.jPanelList.get(6).add(this.jComboBoxList5.get(0));
        this.jPanelList.get(6).add(this.jComboBoxList5.get(0));
    }
}

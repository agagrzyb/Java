
import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.ButtonModel;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsd09
 */
public class CarHire extends javax.swing.JFrame {

    //Global variables
    private boolean appendToFile;

    /**
     * Creates new form CaHire
     */
    public CarHire() {
        initComponents();
        //select the first item in the list
        lstMake.setSelectedIndex(0);
        jList2.setSelectedIndex(0);
        //transmission
        //assigning an action command to a components
        rdAnyTransmission.setActionCommand("Any");
        rdManual.setActionCommand("Manual");
        rdAutomatic.setActionCommand("Automatic");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTransmission = new javax.swing.ButtonGroup();
        buttonGroupFuelType = new javax.swing.ButtonGroup();
        buttonGroupNumberOfSeats = new javax.swing.ButtonGroup();
        lbImage = new javax.swing.JLabel();
        lbTheBestCarHire = new javax.swing.JLabel();
        lblMake = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        lblColour = new javax.swing.JLabel();
        lblFuelType = new javax.swing.JLabel();
        lblNumberOfSeats = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMake = new javax.swing.JList();
        lblTransmission = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        btnPlaceOrder = new javax.swing.JButton();
        btnSaveToFile = new javax.swing.JButton();
        btnLoadFromFile = new javax.swing.JButton();
        btnClearAll = new javax.swing.JButton();
        cmbModel = new javax.swing.JComboBox();
        lbTheBestCarHire2 = new javax.swing.JLabel();
        plnTransmission = new javax.swing.JPanel();
        rdManual = new javax.swing.JRadioButton();
        rdAutomatic = new javax.swing.JRadioButton();
        rdAnyTransmission = new javax.swing.JRadioButton();
        plnFuelType = new javax.swing.JPanel();
        rdBioethanol = new javax.swing.JRadioButton();
        rdPetrol = new javax.swing.JRadioButton();
        rdHybrid = new javax.swing.JRadioButton();
        rdDiesel = new javax.swing.JRadioButton();
        rdAnyFuelType = new javax.swing.JRadioButton();
        plnNumOfSeats = new javax.swing.JPanel();
        rd2seats = new javax.swing.JRadioButton();
        rd4seats = new javax.swing.JRadioButton();
        rd5seats = new javax.swing.JRadioButton();
        rd8seats = new javax.swing.JRadioButton();
        rd7seats = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Car Hire Form");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car.jpg"))); // NOI18N
        lbImage.setText("Image");

        lbTheBestCarHire.setFont(new java.awt.Font("Andalus", 1, 36)); // NOI18N
        lbTheBestCarHire.setForeground(new java.awt.Color(102, 0, 0));
        lbTheBestCarHire.setText("The Best ");

        lblMake.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        lblMake.setText("Make");

        lblModel.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        lblModel.setText("Model");

        lblColour.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        lblColour.setText("Colour");

        lblFuelType.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        lblFuelType.setText("Fuel Type");

        lblNumberOfSeats.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        lblNumberOfSeats.setText("Number of Seats");

        lstMake.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lstMake.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Audi", "BMW", "Ford", "Honda", "Lexus", "Mazda", "Mitsubishi", "Toyota", "Volkswagen" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstMake.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstMake.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstMakeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstMake);

        lblTransmission.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        lblTransmission.setText("Transmission");

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane2.setViewportView(txtArea);

        jList2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Black", "Blue", "Silver", "Red", "White", "Pink", "Green" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList2);

        btnPlaceOrder.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        btnSaveToFile.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        btnSaveToFile.setText("Save to File");
        btnSaveToFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveToFileActionPerformed(evt);
            }
        });

        btnLoadFromFile.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        btnLoadFromFile.setText("Load from File");
        btnLoadFromFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadFromFileActionPerformed(evt);
            }
        });

        btnClearAll.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        btnClearAll.setText("Clear All");
        btnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllActionPerformed(evt);
            }
        });

        cmbModel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Make" }));

        lbTheBestCarHire2.setFont(new java.awt.Font("Andalus", 1, 36)); // NOI18N
        lbTheBestCarHire2.setForeground(new java.awt.Color(102, 0, 0));
        lbTheBestCarHire2.setText("Car Hire in Town!");

        buttonGroupTransmission.add(rdManual);
        rdManual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdManual.setText("Manual");

        buttonGroupTransmission.add(rdAutomatic);
        rdAutomatic.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdAutomatic.setText("Automatic");

        buttonGroupTransmission.add(rdAnyTransmission);
        rdAnyTransmission.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdAnyTransmission.setText("Any");

        javax.swing.GroupLayout plnTransmissionLayout = new javax.swing.GroupLayout(plnTransmission);
        plnTransmission.setLayout(plnTransmissionLayout);
        plnTransmissionLayout.setHorizontalGroup(
            plnTransmissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plnTransmissionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plnTransmissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdManual)
                    .addComponent(rdAutomatic)
                    .addComponent(rdAnyTransmission))
                .addContainerGap())
        );
        plnTransmissionLayout.setVerticalGroup(
            plnTransmissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plnTransmissionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdAnyTransmission, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdManual, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdAutomatic)
                .addContainerGap())
        );

        buttonGroupFuelType.add(rdBioethanol);
        rdBioethanol.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdBioethanol.setText("Bioethanol");

        buttonGroupFuelType.add(rdPetrol);
        rdPetrol.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdPetrol.setText("Petrol");
        rdPetrol.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonGroupFuelType.add(rdHybrid);
        rdHybrid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdHybrid.setText("Hybrid");

        buttonGroupFuelType.add(rdDiesel);
        rdDiesel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdDiesel.setText("Diesel");

        buttonGroupFuelType.add(rdAnyFuelType);
        rdAnyFuelType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdAnyFuelType.setText("Any");

        javax.swing.GroupLayout plnFuelTypeLayout = new javax.swing.GroupLayout(plnFuelType);
        plnFuelType.setLayout(plnFuelTypeLayout);
        plnFuelTypeLayout.setHorizontalGroup(
            plnFuelTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plnFuelTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plnFuelTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdAnyFuelType)
                    .addComponent(rdPetrol)
                    .addComponent(rdDiesel)
                    .addComponent(rdHybrid)
                    .addComponent(rdBioethanol))
                .addContainerGap())
        );
        plnFuelTypeLayout.setVerticalGroup(
            plnFuelTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plnFuelTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdAnyFuelType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdPetrol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdDiesel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdHybrid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdBioethanol)
                .addContainerGap())
        );

        buttonGroupNumberOfSeats.add(rd2seats);
        rd2seats.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rd2seats.setText("2");

        buttonGroupNumberOfSeats.add(rd4seats);
        rd4seats.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rd4seats.setText("4");

        buttonGroupNumberOfSeats.add(rd5seats);
        rd5seats.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rd5seats.setText("5");

        buttonGroupNumberOfSeats.add(rd8seats);
        rd8seats.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rd8seats.setText("8");

        buttonGroupNumberOfSeats.add(rd7seats);
        rd7seats.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rd7seats.setText("7");

        javax.swing.GroupLayout plnNumOfSeatsLayout = new javax.swing.GroupLayout(plnNumOfSeats);
        plnNumOfSeats.setLayout(plnNumOfSeatsLayout);
        plnNumOfSeatsLayout.setHorizontalGroup(
            plnNumOfSeatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plnNumOfSeatsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plnNumOfSeatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rd4seats, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd7seats, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd5seats)
                    .addComponent(rd8seats, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd2seats, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        plnNumOfSeatsLayout.setVerticalGroup(
            plnNumOfSeatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plnNumOfSeatsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rd2seats)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rd4seats)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rd5seats)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rd7seats)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rd8seats)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTheBestCarHire, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTheBestCarHire2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSaveToFile, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLoadFromFile, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMake)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblModel)
                                    .addComponent(lblTransmission)
                                    .addComponent(plnTransmission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(cmbModel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblColour)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFuelType)
                            .addComponent(plnFuelType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumberOfSeats)
                            .addComponent(plnNumOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lbTheBestCarHire)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTheBestCarHire2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbImage)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblColour)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMake)
                                    .addComponent(lblModel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbModel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(lblTransmission)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(plnTransmission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNumberOfSeats)
                                .addGap(18, 18, 18)
                                .addComponent(plnNumOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFuelType)
                                .addGap(18, 18, 18)
                                .addComponent(plnFuelType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPlaceOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSaveToFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLoadFromFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearAll))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstMakeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstMakeValueChanged
        //get the string selected in the lstMake
        String make = lstMake.getSelectedValue().toString();
        //adding items into a combo box
        //1. add each item into a Model : DefaultComboBoxModel
        //2. and when its done  assign the model to the combo box model : cmbModel.setModel(model);
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        
        switch (make) {
            case "Audi":
                model.addElement("Q2");
                model.addElement("Q5");
                model.addElement("A3");
                model.addElement("A5 Coupe");
                break;
            case "BMW":
                model.addElement("M Coupe");
                model.addElement("M2");
                model.addElement("M3");
                model.addElement("M4");
                model.addElement("M5");
                model.addElement("M6");
                break;
            case "Ford":
                model.addElement("C-MAX");
                model.addElement("CAPRI");
                model.addElement("FIESTA");
                model.addElement("FOCUS");
                model.addElement("GALAXY");
                model.addElement("KUGA");
                model.addElement("MONDEO");
                break;
            case "Honda":
                model.addElement("ACCORD");
                model.addElement("CIVIC");
                model.addElement("HR-V");
                model.addElement("CR-V");
                model.addElement("FIT");
                model.addElement("INTEDRA");
                break;
            case "Lexus":
                model.addElement("CT");
                model.addElement("GS");
                model.addElement("IS");
                model.addElement("RC F");
                model.addElement("RX");
                break;
            case "Mazda":
                model.addElement("121");
                model.addElement("323");
                model.addElement("CX-3");
                model.addElement("CX-5");
                model.addElement("MPV");
                break;
            case "Mitsubishi":
                model.addElement("CARISMA");
                model.addElement("COLT");
                model.addElement("LANCER");
                model.addElement("PAJERO");
                model.addElement("SPACE STAR");
                break;
            case "Toyota":
                model.addElement("AURIS");
                model.addElement("AVENSIS");
                model.addElement("COROLLA");
                model.addElement("COROLLA VERSO");
                model.addElement("PRIUS");
                model.addElement("YARIS");
                break;
            case "Volkswagen":
                model.addElement("BORA");
                model.addElement("CADDY");
                model.addElement("GOLF");
                model.addElement("JETTA");
                model.addElement("LUPO");
                model.addElement("PASSAT");
                model.addElement("POLO");
                model.addElement("SCIROCCO");
                model.addElement("TIGUAN");
                model.addElement("TAUREG");
                model.addElement("TOURAN");
                break;
            default:
                model.addElement("Choose Car Make");
        }
        cmbModel.setModel(model);// loads the model into cmbModel combo box
    }//GEN-LAST:event_lstMakeValueChanged

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        //string displayed in the txtArea
        String order = "";
        //car make string
        String make = lstMake.getSelectedValuesList().toString();
        //removing []
        order += "\nCar make : " + make.substring(1, make.length() - 1);
        //car model
        order += ", \nModel : " + cmbModel.getSelectedItem().toString().toLowerCase();

        //Transmission
        ButtonModel model = buttonGroupTransmission.getSelection();
        if (model != null) {
            order += ", \nTransmission : ";
            order += model.getActionCommand().toLowerCase();
        }

        //Colour
        order += ", \nColour : " + jList2.getSelectedValue().toString().toLowerCase();

        //Fuel type  
        //enclosed in a Panel, loop through them using  plnFuelType.getComponents()
        //to get an array of components in that panel
        for (Component com : plnFuelType.getComponents()) {
            if (com instanceof JRadioButton) {
                JRadioButton rb = (JRadioButton) com;
                if (rb.isSelected()) {
                    // add selected radioButton
                    order += ", \nFuel type : " + rb.getText().toLowerCase();
                }
            }
        }
        //Number of seats
        //looping through components using panel plnNumOfSeats.getComponents()
        for (Component com : plnNumOfSeats.getComponents()) {
            if (com instanceof JRadioButton) {
                JRadioButton rb = (JRadioButton) com;
                if (rb.isSelected()) {
                    order += ", \nNumber of seats : " + rb.getText();
                }
            }
        }

        //if the order isEmpty
        if (order.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please choose your car");
        } else {
            txtArea.setText("Your order : " + order);
        }
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void btnSaveToFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveToFileActionPerformed
        if (txtArea.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please place an order");
        } else {
            JFileChooser chooser = new JFileChooser();
            if (chooser.showDialog(this, "OK") == JFileChooser.APPROVE_OPTION) {
                File filename = chooser.getSelectedFile();
                try (FileWriter fw = new FileWriter(filename, appendToFile);
                        PrintWriter pw = new PrintWriter(fw)) {
                    pw.println(txtArea.getText());
                    JOptionPane.showMessageDialog(this, "Order written to file");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Unable to create file");
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Unable to create file");
                }
            }
        }
    }//GEN-LAST:event_btnSaveToFileActionPerformed

    private void btnLoadFromFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadFromFileActionPerformed
        JFileChooser chooser = new JFileChooser();
        if (chooser.showDialog(this, "OK") == JFileChooser.APPROVE_OPTION) {
            File filename = chooser.getSelectedFile();
            try (FileReader fr = new FileReader(filename);
                    BufferedReader br = new BufferedReader(fr)) {
                String line = "";
                String wholeFile = "";
                while ((line = br.readLine()) != null) {
                    wholeFile += line + "\n";                    
                }
                if (wholeFile.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "File is empty");
                } else {
                    txtArea.setText(wholeFile);
                }
            }catch(IOException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "File could not be opened");
            }
        }
    }//GEN-LAST:event_btnLoadFromFileActionPerformed

    private void btnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllActionPerformed
        this.dispose();
        new CarHire().setVisible(true);
    }//GEN-LAST:event_btnClearAllActionPerformed

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
            java.util.logging.Logger.getLogger(CarHire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarHire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarHire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarHire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarHire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnLoadFromFile;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnSaveToFile;
    private javax.swing.ButtonGroup buttonGroupFuelType;
    private javax.swing.ButtonGroup buttonGroupNumberOfSeats;
    private javax.swing.ButtonGroup buttonGroupTransmission;
    private javax.swing.JComboBox cmbModel;
    private javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbImage;
    private javax.swing.JLabel lbTheBestCarHire;
    private javax.swing.JLabel lbTheBestCarHire2;
    private javax.swing.JLabel lblColour;
    private javax.swing.JLabel lblFuelType;
    private javax.swing.JLabel lblMake;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblNumberOfSeats;
    private javax.swing.JLabel lblTransmission;
    private javax.swing.JList lstMake;
    private javax.swing.JPanel plnFuelType;
    private javax.swing.JPanel plnNumOfSeats;
    private javax.swing.JPanel plnTransmission;
    private javax.swing.JRadioButton rd2seats;
    private javax.swing.JRadioButton rd4seats;
    private javax.swing.JRadioButton rd5seats;
    private javax.swing.JRadioButton rd7seats;
    private javax.swing.JRadioButton rd8seats;
    private javax.swing.JRadioButton rdAnyFuelType;
    private javax.swing.JRadioButton rdAnyTransmission;
    private javax.swing.JRadioButton rdAutomatic;
    private javax.swing.JRadioButton rdBioethanol;
    private javax.swing.JRadioButton rdDiesel;
    private javax.swing.JRadioButton rdHybrid;
    private javax.swing.JRadioButton rdManual;
    private javax.swing.JRadioButton rdPetrol;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}

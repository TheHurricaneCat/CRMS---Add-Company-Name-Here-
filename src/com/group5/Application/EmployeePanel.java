/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.group5.Application;

import com.group5.Car.Car;
import com.group5.Car.CarDBHandler;
import com.group5.Login.LoginPanel;
import com.group5.Login.UserDBHandler;
import com.group5.User.Employee;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;

/**
 *
 * @author Josefe Gillego
 */
public class EmployeePanel extends javax.swing.JFrame {
    private Employee employee;
    private static EmployeePanel instance;
    private UserDBHandler handler;
    
    
    /**
     * Creates new form ApplicationPanel
     */
    
    
    //sa login panel mag run not here
    public EmployeePanel(Employee employee) throws IOException {
        this.employee = employee;
        this.handler = UserDBHandler.getInstance();
        initComponents();
        setupScrollPane();
        jLabel4.setText(handler.getActiveUser(employee.getUsername()).getUsername());
        getContentPane().setBackground(new java.awt.Color(29, 34, 67));
        
       CarDBHandler.preLoad(CarViewerPanel);
    };
    
    public static EmployeePanel getInstance(Employee employee) throws IOException {
        if (instance == null) {
            instance = new EmployeePanel(employee);
        }
        return instance;
    }
    
    private void setupScrollPane() {
        // Set layout for jPanel1
        CarViewerPanel.setLayout(new GridLayout(0, getDynamicGridColumn())); // Dynamic GridLayout

        // Initialize JScrollPane
        CarViewerScrollPanel.setViewportView(CarViewerPanel);
        
    }
    
    private JPanel createSubPanel() {
        // Create a new subpanel with consistent design
        JPanel subPanel = new JPanel();
        subPanel.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        // Set up the layout for the subPanel
        GroupLayout layout = new GroupLayout(subPanel);
        subPanel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Create components to be added to the subPanel
        JLabel label = new JLabel("Car Panel " + (CarViewerPanel.getComponentCount() + 1));
        JButton button = new JButton("Action");

        // Define the layout for the subPanel
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(label)
                .addComponent(button)
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(label)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button)
        );
        
        // Set the minimum size for the subPanel
        Dimension minSize = new Dimension(150, getContentPane().getHeight() / 2);
        subPanel.setMinimumSize(minSize);
        subPanel.setPreferredSize(minSize);
        
        //add actionListener for each button
        button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Retrieve the action command from the button click
            String actionCommand = e.getActionCommand();
            handleButtonAction(actionCommand);
        }
    });

        return subPanel;
    }
    
    private void handleButtonAction(String actionCommand) {
        switch (actionCommand) {
            case "ACTION_1":
                // Handle Action 1
                JOptionPane.showMessageDialog(this, "Action 1 executed");
                break;
            case "ACTION_2":
                // Handle Action 2
                JOptionPane.showMessageDialog(this, "Action 2 executed");
                break;
            // Add more cases for other actions if needed
            default:
                JOptionPane.showMessageDialog(this, "Unknown action");
                break;
        }
    }

    
    private void addSubpanel() {
        // Show input dialog to get the car name
        String carName = JOptionPane.showInputDialog(this, "Enter the name of the car:", "Input Car Name", JOptionPane.PLAIN_MESSAGE);

        // Check if the user provided input
        if (carName != null && !carName.trim().isEmpty()) {
            try {
                // Fetch the car details using the car name
                Car car = CarDBHandler.getCar(Integer.parseInt(carName.trim()));

                if (car != null) {
                    // Create the subpanel with the fetched car details
                    CarPanel subPanel = new CarPanel(CarViewerPanel, car);

                    // Add the subpanel to the main panel
                    CarViewerPanel.add(subPanel);

                    // Refresh the UI to reflect changes
                    CarViewerPanel.revalidate();
                    CarViewerPanel.repaint();
                } else {
                    // Show an error message if the car is not found
                    JOptionPane.showMessageDialog(this, "Car not found.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IOException e) {
                // Show an error message if there was an issue fetching the car details
                JOptionPane.showMessageDialog(this, "Error fetching car details: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Show an error message if the input is invalid
            JOptionPane.showMessageDialog(this, "Please enter a valid car name.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    // For dynamic resizing
    private int getDynamicGridColumn () {
        
        int w = this.getSize().width;
        int panelW = 180;
        
        return (w / panelW) - 2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LogOutButton = new javax.swing.JButton();
        AddCarButton = new javax.swing.JButton();
        ViewCarButton = new javax.swing.JButton();
        EditCarButton = new javax.swing.JButton();
        GenerateReportButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DeleteCarButton = new javax.swing.JButton();
        CarViewerScrollPanel = new javax.swing.JScrollPane();
        CarViewerPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(223, 74, 70));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 235, 235));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CRMS");

        jLabel2.setForeground(new java.awt.Color(184, 38, 34));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("POWERED BY SIGMA CORP");

        LogOutButton.setBackground(new java.awt.Color(148, 28, 0));
        LogOutButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LogOutButton.setForeground(new java.awt.Color(242, 235, 235));
        LogOutButton.setText("Log out");
        LogOutButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });

        AddCarButton.setBackground(new java.awt.Color(184, 38, 34));
        AddCarButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddCarButton.setForeground(new java.awt.Color(242, 235, 235));
        AddCarButton.setText("ADD CAR");
        AddCarButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCarButtonActionPerformed(evt);
            }
        });

        ViewCarButton.setBackground(new java.awt.Color(184, 38, 34));
        ViewCarButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ViewCarButton.setForeground(new java.awt.Color(242, 235, 235));
        ViewCarButton.setText("VIEW CAR");
        ViewCarButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        EditCarButton.setBackground(new java.awt.Color(184, 38, 34));
        EditCarButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EditCarButton.setForeground(new java.awt.Color(242, 235, 235));
        EditCarButton.setText("EDIT CAR");
        EditCarButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        GenerateReportButton.setBackground(new java.awt.Color(184, 38, 34));
        GenerateReportButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GenerateReportButton.setForeground(new java.awt.Color(242, 235, 235));
        GenerateReportButton.setText("GENERATE REPORT");
        GenerateReportButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel3.setForeground(new java.awt.Color(242, 235, 235));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("[Employee View]");

        jLabel4.setForeground(new java.awt.Color(242, 235, 235));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ADMIN");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Misc/!!!!revisedcrms (250 x 250 px) (2).png"))); // NOI18N

        DeleteCarButton.setBackground(new java.awt.Color(184, 38, 34));
        DeleteCarButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeleteCarButton.setForeground(new java.awt.Color(242, 235, 235));
        DeleteCarButton.setText("DELETE CAR");
        DeleteCarButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewCarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AddCarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(EditCarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(GenerateReportButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DeleteCarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ViewCarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddCarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditCarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DeleteCarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GenerateReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CarViewerScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        CarViewerScrollPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        CarViewerPanel.setBackground(new java.awt.Color(54, 63, 125));

        javax.swing.GroupLayout CarViewerPanelLayout = new javax.swing.GroupLayout(CarViewerPanel);
        CarViewerPanel.setLayout(CarViewerPanelLayout);
        CarViewerPanelLayout.setHorizontalGroup(
            CarViewerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
        );
        CarViewerPanelLayout.setVerticalGroup(
            CarViewerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        CarViewerScrollPanel.setViewportView(CarViewerPanel);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 235, 235));
        jLabel5.setText("VIEW CAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CarViewerScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(CarViewerScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        handler.logoutUser(employee.getUsername()); // Logout the user from the handler
        dispose(); // Close the current CustomerPanel
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPanel().setVisible(true); // Open a new LoginPanel
            }
        });
    }//GEN-LAST:event_LogOutButtonActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        this.CarViewerPanel.setLayout(new GridLayout(0, getDynamicGridColumn()));
    }//GEN-LAST:event_formComponentResized

    private void AddCarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCarButtonActionPerformed
        
        
        
    }//GEN-LAST:event_AddCarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCarButton;
    private javax.swing.JPanel CarViewerPanel;
    private javax.swing.JScrollPane CarViewerScrollPanel;
    private javax.swing.JButton DeleteCarButton;
    private javax.swing.JButton EditCarButton;
    private javax.swing.JButton GenerateReportButton;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JButton ViewCarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

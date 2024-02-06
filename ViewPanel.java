/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author hanee
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    
    User u;
    
    public ViewPanel(User inputUser) {
        initComponents();
        this.u = inputUser;
        populateDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        heading = new javax.swing.JLabel();
        fNameLabel1 = new javax.swing.JLabel();
        fName = new javax.swing.JLabel();
        lNameLabel = new javax.swing.JLabel();
        lName = new javax.swing.JLabel();
        ageLabel1 = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        patientTypeLabel = new javax.swing.JLabel();
        patientType = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        patientTypeLabel1 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        message = new javax.swing.JLabel();

        heading.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        heading.setText("View Panel");

        fNameLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fNameLabel1.setText("First Name");

        lNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lNameLabel.setText("Last Name");

        ageLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ageLabel1.setText("Age");

        emailLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emailLabel.setText("Email");

        patientTypeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patientTypeLabel.setText("Patient Type");

        genderLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genderLabel.setText("Gender");

        patientTypeLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patientTypeLabel1.setText("Date of admission");

        messageLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        messageLabel.setText("Message");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(heading))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(patientType, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(patientTypeLabel)
                                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(fNameLabel1)
                                            .addComponent(lNameLabel))
                                        .addGap(113, 113, 113))
                                    .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ageLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(patientTypeLabel1)
                                    .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(messageLabel))))))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(heading)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fNameLabel1)
                                .addGap(4, 4, 4)
                                .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ageLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(patientTypeLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(messageLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patientTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patientType, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(genderLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel ageLabel1;
    private javax.swing.JLabel date;
    private javax.swing.JLabel email;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel fName;
    private javax.swing.JLabel fNameLabel1;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JLabel message;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel patientType;
    private javax.swing.JLabel patientTypeLabel;
    private javax.swing.JLabel patientTypeLabel1;
    private javax.swing.JLabel photo;
    // End of variables declaration//GEN-END:variables

    private void populateDetails() {
        
        ImageIcon icon = new ImageIcon(u.imagePath);
        Image image = icon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(image);
        
        lName.setText(u.fname);
        fName.setText(u.lname);
        email.setText(u.email);
        message.setText(u.message);
        age.setText(u.age);
        patientType.setText(u.patientType);
        gender.setText(u.gender);
        photo.setIcon(scaledIcon);
        date.setText(u.date);
    }
}

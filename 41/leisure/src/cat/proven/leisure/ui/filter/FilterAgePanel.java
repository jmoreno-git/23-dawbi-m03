/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cat.proven.leisure.ui.filter;

/**
 *
 * @author jmorenp
 */
public class FilterAgePanel extends javax.swing.JPanel {

    /**
     * Creates new form FilterAgePanel
     */
    public FilterAgePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        tfLower = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfUpper = new javax.swing.JTextField();
        btFilter = new javax.swing.JButton();

        jLabel3.setText("Age between");
        add(jLabel3);

        tfLower.setText("jTextField1");
        add(tfLower);

        jLabel4.setText("and");
        add(jLabel4);

        tfUpper.setText("jTextField2");
        add(tfUpper);

        btFilter.setText("Filter");
        add(btFilter);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFilter;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfLower;
    private javax.swing.JTextField tfUpper;
    // End of variables declaration//GEN-END:variables
}

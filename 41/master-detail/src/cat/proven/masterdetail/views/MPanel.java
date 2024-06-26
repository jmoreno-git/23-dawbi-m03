
package cat.proven.masterdetail.views;

import cat.proven.masterdetail.model.ProductModel;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;

public class MPanel extends javax.swing.JPanel {

    public MPanel() {
        initComponents();
        loadList();
        list.addListSelectionListener((lse) -> {
            if (lse.getValueIsAdjusting() == false) {
                setSelectedCode((String)list.getSelectedValue());
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();

        scrollPane.setViewportView(list);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> list;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables

    private List<String> data;
    private String selectedCode;
    
    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }    

    public String getSelectedCode() {
        return selectedCode;
    }

    public void setSelectedCode(String selectedCode) {
        String oldValue = this.selectedCode;
        this.selectedCode = selectedCode;
        firePropertyChange("selectedCode", oldValue, selectedCode);
        //System.out.println("selectedCode:"+selectedCode);
    }
    
    private void loadList() {
        ProductModel model = new ProductModel();
        List<String> codeList = model.getProductCodes();
        DefaultListModel listModel = new DefaultListModel<>();
        listModel.addAll(codeList);
        list.setModel(listModel);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setSelectedIndex(0);
        setSelectedCode(codeList.get(0));
    }
}

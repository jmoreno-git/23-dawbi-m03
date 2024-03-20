package cat.proven.leisure.ui.filter;

import cat.proven.leisure.model.Activity;
import cat.proven.leisure.model.LeisureService;
import cat.proven.leisure.model.LeisureService2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author jasmm
 */
public class FilterActivityPanel extends javax.swing.JPanel {

    //private String[] items;
    private Activity[] activities;
    
    /**
     * Creates new form FilterActivityPanel
     */
    public FilterActivityPanel() {  
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

        lbActivities = new javax.swing.JLabel();
        cbActivities = new javax.swing.JComboBox<>();

        lbActivities.setText("Activity");
        add(lbActivities);

        cbActivities.setModel(getComboBoxModel());
        add(cbActivities);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Activity> cbActivities;
    private javax.swing.JLabel lbActivities;
    // End of variables declaration//GEN-END:variables
  
    public ComboBoxModel getComboBoxModel() {
        LeisureService2 dataService = new LeisureService2();
        List<Activity> activityList = dataService.getAllActivities();
        //System.out.println("activityList"+activityList);
        //items = activityList
        activities = activityList
                    .stream()
                    //.map((t) -> t.getName())
                    .collect(Collectors.toList())
                    //.toArray(String[]::new);
                    .toArray(Activity[]::new);
        return new DefaultComboBoxModel<>(activities);
    }
    
}
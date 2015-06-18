
/*
 * RecipePanel.java
 *
 * Created on Dec 13, 2011, 11:08:55 AM
 */
package RecipeWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;

/**
 *
 * @author tjen
 */
public class RecipePanel extends javax.swing.JPanel implements RecipeGetI, RecipeSetI {

    Model model;
    ArrayList<Recipe> recepten;
    DefaultListModel listModel;
    ArrayList<SaveAble> saveNotifiers;

    /** Creates new form RecipePanel */
    public RecipePanel() {
        initComponents();
        model = new Model();
        this.recepten = new ArrayList<Recipe>();
        this.listModel = new DefaultListModel();
        for (String recipeTitle : model.getRecipeTitles()) {
            this.listModel.addElement(recipeTitle);
        }
        this.listCurrentRecipes.setModel(listModel);
        this.listCurrentRecipes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        saveNotifiers = new ArrayList<SaveAble>();
    }

    public void addSaveNotifier(SaveAble sa) {
        saveNotifiers.add(sa);
    }

    public void setActiveRecipe(RecipeGetI recipe) {
        txtComments.setText(recipe.getComments());
        txtIngredients.setText(recipe.getIngredients());
        txtInstructions.setText(recipe.getInstructions());
        txtPrepTime.setText(recipe.getPrepTime());
        txtCookTime.setText(recipe.getCookTime());
        txtQuantity.setText(recipe.getQuantity());
        txtTitel.setText(recipe.getRecipeTitle());
        txtUrl.setText(recipe.getUrl());
    }

    private void clear() {
        txtComments.setText("");
        txtIngredients.setText("");
        txtInstructions.setText("");
        txtPrepTime.setText("");
        txtCookTime.setText("");
        txtQuantity.setText("");
        txtTitel.setText("");
        txtUrl.setText("");
    }

    private Recipe makeRecipe() {
        return new Recipe(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        listCurrentRecipes = new javax.swing.JList();
        lblCurrentrecipes = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnExport = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtXml = new javax.swing.JTextArea();
        lblXml = new javax.swing.JLabel();
        btnSaveToFle = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtPrepTime = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtIngredients = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtComments = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInstructions = new javax.swing.JTextArea();
        lblUrl = new javax.swing.JLabel();
        lblComments = new javax.swing.JLabel();
        lblTitel = new javax.swing.JLabel();
        lblKookTijd = new javax.swing.JLabel();
        lblOpbrengst = new javax.swing.JLabel();
        txtCookTime = new javax.swing.JTextField();
        lblBereidingsTijd = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtUrl = new javax.swing.JTextField();
        btnEmpty = new javax.swing.JButton();
        txtTitel = new javax.swing.JTextField();
        lblInstructions = new javax.swing.JLabel();
        lblIngredients = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();

        btnEdit.setText("Show");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(listCurrentRecipes);

        lblCurrentrecipes.setText("Current recipes:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEdit)
                        .addGap(5, 5, 5)
                        .addComponent(btnDelete)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCurrentrecipes)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCurrentrecipes)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addContainerGap())
        );

        btnExport.setText("Show xml");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        txtXml.setColumns(20);
        txtXml.setRows(5);
        jScrollPane5.setViewportView(txtXml);

        lblXml.setText("Xml:");

        btnSaveToFle.setText("Save this xml");
        btnSaveToFle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveToFleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(lblXml, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnExport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(btnSaveToFle)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblXml)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExport)
                    .addComponent(btnSaveToFle))
                .addContainerGap())
        );

        txtIngredients.setColumns(20);
        txtIngredients.setRows(5);
        jScrollPane1.setViewportView(txtIngredients);

        txtComments.setColumns(20);
        txtComments.setRows(5);
        jScrollPane3.setViewportView(txtComments);

        txtInstructions.setColumns(20);
        txtInstructions.setRows(5);
        jScrollPane2.setViewportView(txtInstructions);

        lblUrl.setText("Url:");

        lblComments.setText("Comments:");

        lblTitel.setText("Title:");

        lblKookTijd.setText("Cook time:");

        lblOpbrengst.setText("Quantity: ");

        lblBereidingsTijd.setText("Prep time:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEmpty.setText("Clear");
        btnEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmptyActionPerformed(evt);
            }
        });

        lblInstructions.setText("Instructions:");

        lblIngredients.setText("Ingredients:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblTitel)
                        .addGap(61, 61, 61)
                        .addComponent(txtTitel, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblBereidingsTijd)
                        .addGap(31, 31, 31)
                        .addComponent(txtPrepTime, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblKookTijd)
                        .addGap(29, 29, 29)
                        .addComponent(txtCookTime, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblOpbrengst)
                        .addGap(35, 35, 35)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                    .addComponent(lblIngredients)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addComponent(lblInstructions)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addComponent(lblComments)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblUrl)
                        .addGap(5, 5, 5)
                        .addComponent(txtUrl, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btnEmpty)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblTitel))
                    .addComponent(txtTitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblBereidingsTijd))
                    .addComponent(txtPrepTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblKookTijd))
                    .addComponent(txtCookTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblOpbrengst))
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(lblIngredients)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lblInstructions)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lblComments)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblUrl))
                    .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd)
                    .addComponent(btnEmpty))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Recipe recept = makeRecipe();
        String recipeTitle = recept.getRecipeTitle();
        if (!recipeTitle.isEmpty()) {
            model.addRecipe(recept);
            if (!listModel.contains(recipeTitle)) {
                listModel.addElement(recipeTitle);
                System.out.println("" + recipeTitle);
            } else {
                System.out.println("recipe " + recipeTitle + " edited");
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmptyActionPerformed
        clear();
    }//GEN-LAST:event_btnEmptyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Object selectedRecipe = listCurrentRecipes.getSelectedValue();
        if (selectedRecipe instanceof String) {
            String recipeTitle = ((String) selectedRecipe);
            model.removeRecipe(recipeTitle);
            listModel.removeElement(selectedRecipe);
        } else {
            System.out.println("Error");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        txtXml.setText(model.getXml());
    }//GEN-LAST:event_btnExportActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        Object selectedRecipe = listCurrentRecipes.getSelectedValue();
        if (selectedRecipe instanceof String) {
            String recipeTitle = ((String) selectedRecipe);
            Recipe recept = model.getRecipeByTitle(recipeTitle);
            setActiveRecipe(recept);
        } else {
            System.out.println("Error");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveToFleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveToFleActionPerformed
        notifySave();
    }//GEN-LAST:event_btnSaveToFleActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEmpty;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnSaveToFle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblBereidingsTijd;
    private javax.swing.JLabel lblComments;
    private javax.swing.JLabel lblCurrentrecipes;
    private javax.swing.JLabel lblIngredients;
    private javax.swing.JLabel lblInstructions;
    private javax.swing.JLabel lblKookTijd;
    private javax.swing.JLabel lblOpbrengst;
    private javax.swing.JLabel lblTitel;
    private javax.swing.JLabel lblUrl;
    private javax.swing.JLabel lblXml;
    private javax.swing.JList listCurrentRecipes;
    private javax.swing.JTextArea txtComments;
    private javax.swing.JTextField txtCookTime;
    private javax.swing.JTextArea txtIngredients;
    private javax.swing.JTextArea txtInstructions;
    private javax.swing.JTextField txtPrepTime;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTitel;
    private javax.swing.JTextField txtUrl;
    private javax.swing.JTextArea txtXml;
    // End of variables declaration//GEN-END:variables

    @Override
    public String getRecipeTitle() {
        return txtTitel.getText();
    }

    @Override
    public String getPrepTime() {
        return txtPrepTime.getText();
    }

    @Override
    public String getCookTime() {
        return txtCookTime.getText();
    }

    @Override
    public String getQuantity() {
        return txtQuantity.getText();
    }

    @Override
    public String getIngredients() {
        return txtIngredients.getText();
    }

    @Override
    public String getInstructions() {
        return txtInstructions.getText();
    }

    @Override
    public String getComments() {
        return txtComments.getText();
    }

    @Override
    public String getUrl() {
        return txtUrl.getText();
    }

    @Override
    public void setRecipeTitle(String recipeTitle) {
        txtTitel.setText(recipeTitle);
    }

    @Override
    public void setPrepTime(String prepTime) {
        txtPrepTime.setText(prepTime);
    }

    @Override
    public void setCookTime(String cookTime) {
        txtCookTime.setText(cookTime);
    }

    @Override
    public void setQuantity(String quantity) {
        txtQuantity.setText(quantity);
    }

    @Override
    public void setIngredients(String ingredients) {
        txtIngredients.setText(ingredients);
    }

    @Override
    public void setInstructions(String instructions) {
        txtInstructions.setText(instructions);
    }

    @Override
    public void setComments(String comments) {
        txtComments.setText(comments);
    }

    @Override
    public void setUrl(String url) {
        txtUrl.setText(url);
    }

    public void saveToFile(File file) {
        System.out.println("SAVE");
        try {
            // Create file 
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF8"));
            out.write(txtXml.getText());
            //Close the output stream
            out.close();
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    }

    private void notifySave() {
        for (SaveAble sa : saveNotifiers) {
            sa.save();
        }
    }
}

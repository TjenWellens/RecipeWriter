package RecipeWriter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Tjen
 */
public class RecipeWriter extends JFrame implements SaveAble {
    public static void main(String[] args) {
        new RecipeWriter();
    }

    private final RecipePanel panel;
    private JFileChooser filechooser;

    public RecipeWriter() {
        super("RecipeWriter");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel = new RecipePanel();
        panel.addSaveNotifier(this);
        this.setContentPane(panel);
        this.pack();
        this.setVisible(true);
    }

    private void initFileChooser() {
        filechooser = new JFileChooser();
        filechooser.setAcceptAllFileFilterUsed(false);
        filechooser.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        filechooser.setCurrentDirectory(null);
        String defaultPath = System.getProperty("user.home") + File.separator + "*.xml";
        filechooser.setSelectedFile(new java.io.File(defaultPath));
        filechooser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                fileSelectionPerformed();
            }
        });
    }

    private void fileSelectionPerformed() {
        File selectedFile = filechooser.getSelectedFile();
        this.setContentPane(panel);
        this.pack();
        panel.saveToFile(selectedFile);
    }

    @Override
    public void save() {
        initFileChooser();
        this.setContentPane(filechooser);
        this.pack();
    }
}

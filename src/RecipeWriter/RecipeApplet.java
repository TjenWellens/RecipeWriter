package RecipeWriter;

import javax.swing.JApplet;

/**
 *
 * @author tjen
 */
public class RecipeApplet extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded
     * into the browser.
     */
    @Override
    public void init() {
        this.add(new RecipePanel());
        this.setSize(480, 800);
    }
    // TODO overwrite start(), stop() and destroy() methods
}

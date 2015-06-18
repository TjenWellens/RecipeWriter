/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
    }
    // TODO overwrite start(), stop() and destroy() methods
}

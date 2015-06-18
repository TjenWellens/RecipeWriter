/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RecipeWriter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 *
 * @author tjen
 */
public class Model {
    HashMap<String, Recipe> recepten;

    public Model() {
        this.recepten = new HashMap<String, Recipe>();
    }

    public Model(List<Recipe> recepten) {
        this.recepten = new HashMap<String, Recipe>();
        for (Recipe recipe : recepten) {
            this.recepten.put(recipe.getRecipeTitle(), recipe);
        }
    }
    
    public void addRecept(RecipeGetI recipe)
    {
        this.recepten.put(recipe.getRecipeTitle(), new Recipe(recipe));
    }
    
    public void addRecipe(Recipe recipe)
    {
        this.recepten.put(recipe.getRecipeTitle(), new Recipe(recipe));
    }
    
    public void removeRecipe(String recipeTitle)
    {
        this.recepten.remove(recipeTitle);
    }
    
    public Set<String> getRecipeTitles()
    {
        return recepten.keySet();
    }
    
    public String getXml()
    {
        return Recipe.toXML(new ArrayList<Recipe>(recepten.values()));
    }
}

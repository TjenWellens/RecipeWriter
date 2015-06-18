package RecipeWriter;

/**
 *
 * @author tjen
 */
public interface RecipeSetI {

    void setRecipeTitle(String recipeTitle);

    void setPrepTime(String prepTime);

    void setCookTime(String cookTime);

    void setQuantity(String quantity);

    void setIngredients(String ingredients);

    void setInstructions(String instructions);

    void setComments(String comments);

    void setUrl(String url);
}

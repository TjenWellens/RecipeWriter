/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RecipeWriter;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/**
 *
 * @author tjen
 */
public class Recipe implements RecipeGetI, RecipeSetI {

    private String recipeTitle = "";
    private String prepTime = "";
    private String cookTime = "";
    private String quantity = "";
    private String ingredients = "";
    private String instructions = "";
    private String comments = "";
    private String url = "";

    public Recipe() {
    }

    public Recipe(RecipeGetI ri) {
        this.recipeTitle = ri.getRecipeTitle();
        this.prepTime = ri.getPrepTime();
        this.cookTime = ri.getCookTime();
        this.quantity = ri.getQuantity();
        this.ingredients = ri.getIngredients();
        this.instructions = ri.getInstructions();
        this.comments = ri.getComments();
        this.url = ri.getUrl();
    }

    public void encodeRecipeValues() {
            this.recipeTitle = encodeString(recipeTitle);
            this.prepTime = encodeString(prepTime);
            this.cookTime = encodeString(cookTime);
            this.quantity = encodeString(quantity);
            this.ingredients = encodeString(ingredients);
            this.instructions = encodeString(instructions);
            this.comments = encodeString(comments);
            this.url = encodeString(url);
    }

    private String encodeString(String toEncode) {
        String encoded = toEncode;

        encoded = encoded.replaceAll("&", "&amp;");
        encoded = encoded.replaceAll(">", "&gt;");
        encoded = encoded.replaceAll("<", "&lt;");

        return encoded;
    }

    public static String toXML(List<Recipe> recepten) {
        String xml = "";

        xml += "<?xml version=\"1.0\" encoding=\"utf-8\"?><cookbook version=\"35\">";
        for (Recipe recept : recepten) {
            recept.encodeRecipeValues();
            xml += "<recipe>";
            xml += "<title>" + recept.recipeTitle + "</title>";
            xml += "<preptime>" + recept.prepTime + "</preptime>";
            xml += "<cooktime>" + recept.cookTime + "</cooktime>";
            xml += "<ingredient>";
            if (!recept.ingredients.isEmpty()) {
                String ingredientsdArray[] = recept.ingredients.split("\n");
                for (int i = 0; i < ingredientsdArray.length; i++) {
                    xml += "<li>" + ingredientsdArray[i] + "</li>";
                }
            }
            xml += "</ingredient>";
            xml += "<recipetext>";
            if (!recept.instructions.isEmpty()) {
                String instructionsArray[] = recept.instructions.split("\n");
                for (int i = 0; i < instructionsArray.length; i++) {
                    xml += "<li>" + instructionsArray[i] + "</li>";
                }
            }
            xml += "</recipetext>";
            xml += "<url>" + recept.url + "</url>";
            xml += "<quantity>" + recept.quantity + "</quantity>";
            xml += "<comments>";
            if (!recept.comments.isEmpty()) {
                String commentsArray[] = recept.comments.split("\n");
                for (int i = 0; i < commentsArray.length; i++) {
                    xml += "<li>" + commentsArray[i] + "</li>";
                }
            }
            xml += "</comments>";
            xml += "</recipe>";
        }
        xml += "</cookbook>";
        //        xml = xml.replaceAll("±", "ca.");
        //        xml = xml.replaceAll("º", "");
        //        xml = xml.replaceAll("à", "a");
        //        xml = xml.replaceAll("é", "e");
        //        xml = xml.replaceAll("è", "e");
        //        xml = xml.replaceAll("ë", "e");
        //        xml = xml.replaceAll("ï", "i");
        //        xml = xml.replaceAll(" ½", ",5");
        //        xml = xml.replaceAll("½", ",5");

//        try {
//            xml = URLEncoder.encode(xml, "UTF-8");
//        } catch (UnsupportedEncodingException ex) {
//            System.out.println("Encode Error");
//        }
        return xml;
    }

    @Override
    public String getComments() {
        return comments;
    }

    @Override
    public String getCookTime() {
        return cookTime;
    }

    @Override
    public String getIngredients() {
        return ingredients;
    }

    @Override
    public String getInstructions() {
        return instructions;
    }

    @Override
    public String getPrepTime() {
        return prepTime;
    }

    @Override
    public String getQuantity() {
        return quantity;
    }

    @Override
    public String getRecipeTitle() {
        return recipeTitle;
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public void setCookTime(String cookTime) {
        this.cookTime = cookTime;
    }

    @Override
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public void setPrepTime(String prepTime) {
        this.prepTime = prepTime;
    }

    @Override
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }

    @Override
    public void setUrl(String url) {
        this.url = url;
    }
}

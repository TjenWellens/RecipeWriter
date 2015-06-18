/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RecipeWriter;

import java.util.List;

/**
 *
 * @author tjen
 */
public class Recipe {

    public String titel = "";
    public String bereidingstijd = "";
    public String kooktijd = "";
    public String opbrenst = "";
    public String ingredients = "";
    public String instructions = "";
    public String comments = "";
    public String url = "";

    public static String toXML(List<Recipe> recepten) {
        String xml = "";

        xml += "<?xml version=\"1.0\" encoding=\"utf-8\"?><cookbook version=\"35\">";
        for (Recipe recept : recepten) {
            xml += "<recipe>";
            xml += "<title>" + recept.titel + "</title>";
            xml += "<preptime>" + recept.bereidingstijd + "</preptime>";
            xml += "<cooktime>" + recept.kooktijd + "</cooktime>";
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
            xml += "<quantity>" + recept.opbrenst + "</quantity>";
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
        xml.replaceAll("±", "ca.");
        xml.replaceAll("º", "");
        xml.replaceAll("à", "a");
        xml.replaceAll("é", "e");
        xml.replaceAll("è", "e");
        xml.replaceAll("ë", "e");
        xml.replaceAll("ï", "i");
        xml.replaceAll(" ½", ",5");
        xml.replaceAll("½", ",5");
        return xml;
    }
}

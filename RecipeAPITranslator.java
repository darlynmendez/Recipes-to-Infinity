public class RecipeAPITranslator implements RecipeAPIInterface {
    /**
     * Given a recipe id number this method queries the Recipe API and returns the title of the recipe and
     * the amount of time it will take to create it.
     * @param _id
     * @return
     */
    public String getRecipeName(int _id) {
        return "Apple Pie";
    }

    /**
     * Given a recipe id number and the amount of recipe recommendations desired this method queries the Recipe API
     * and returns the title and ready in minutes.
     * @param number
     * @return
     */
    @Override
    public String getRecommendationsForRecipes(int _id, int number) {
        return "Pecan pie is ready in 25 minutes";
    }
}

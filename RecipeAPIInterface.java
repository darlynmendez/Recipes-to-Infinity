public interface RecipeAPIInterface {
    public String getRecipeName(int _id);

    public String getRecommendationsForRecipes(int _id, int number);
}

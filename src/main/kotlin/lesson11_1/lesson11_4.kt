package lesson11_1

class RecipeCategory(
    val categoryName: String,
    val subCategory: String,
    val description: String,
    val listOfDishes: List<Recipes>,
)

class Recipes(
    val dishName: String,
    val recipe: String,
    val listOfIngredientIds: List<Ingredients>,
    val numberOfPortions: Int,
    val inFavorites: Boolean,
    val subCategory: String,
)

class Ingredients(
    val dishName: String,
    val ingredient: String,
    val name: String,
    val measure: String,
    val amount: Int,

    )
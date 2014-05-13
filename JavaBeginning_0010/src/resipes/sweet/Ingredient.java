package resipes.sweet;

/**
 * Created by Vladimir V. Kravchenko on 13.05.2014.
 */
public class Ingredient {
    private final String name;
    private final int weight;
    private final int calories;
    private final IngredientState state;

    private Ingredient(Builder builder) {
        this.name = builder.name;
        this.weight = builder.weight;
        this.calories = builder.calories;
        this.state = builder.state;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getCalories() {
        return calories;
    }

    public IngredientState getState() {
        return state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ingredient)) return false;

        Ingredient that = (Ingredient) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (state != that.state) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ingredient{");
        sb.append("name='").append(name).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", calories=").append(calories);
        sb.append(", state=").append(state);
        sb.append('}');
        return sb.toString();
    }

    public static class Builder {
        private String name;
        private int weight;
        private int calories;
        private IngredientState state;

        public Builder() {
        }

        public Builder(Ingredient ingredient) {
            this.name = ingredient.name;
            this.weight = ingredient.weight;
            this.calories = ingredient.calories;
            this.state = ingredient.state;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder setCalories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder setState(IngredientState state) {
            this.state = state;
            return this;
        }

        public Ingredient build() {
            return new Ingredient(this);
        }
    }

}

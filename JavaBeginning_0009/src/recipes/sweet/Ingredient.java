package recipes.sweet;

/**
 * Created by Vladimir V. Kravchenko on 09.05.2014.
 */
public class Ingredient {
    private final String name;
    private final int weight;
    private final int calories;

    private Ingredient(Builder builder) {
        this.name = builder.name;
        this.weight = builder.weight;
        this.calories = builder.calories;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ingredient)) return false;

        Ingredient that = (Ingredient) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + weight;
        result = 31 * result + calories;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ingredient{");
        sb.append("name='").append(name).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", calories=").append(calories);
        sb.append('}');
        return sb.toString();
    }

    public static class Builder {
        private String name;
        private int weight;
        private int calories;

        public Builder() {
        }

        public Builder(Ingredient ingredient) {
            this.name = ingredient.name;
            this.weight = ingredient.weight;
            this.calories = ingredient.calories;
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

        public Ingredient build() {
            return new Ingredient(this);
        }
    }
}

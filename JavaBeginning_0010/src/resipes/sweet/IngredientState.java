package resipes.sweet;

/**
 * Created by Vladimir V. Kravchenko on 13.05.2014.
 */
public enum IngredientState {
    AS_IS("asis"), SHAKED("shaked"), FRESH("Fresh"), BAKED("Baked"), FRIED("Fried"), BOILED("Boiled"), FROZEN("Frozen"), CUTTED("Cutted"), BEATEN("Beaten");

    private String state;

    IngredientState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IngredientState{");
        sb.append("state='").append(state).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

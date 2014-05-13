package resipes.sweet;

/**
 * Created by Vladimir V. Kravchenko on 13.05.2014.
 */
public enum YummyState {
    NOT_READY("not ready"), COOKED("cooked"), EATEN("eaten"), SOLD("sold");

    private String state;

    YummyState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("YummyState{");
        sb.append("state='").append(state).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

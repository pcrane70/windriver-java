package ua.windriver.model.automation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Condition {
    @JsonProperty("Name")
    private Property name;
    @JsonProperty("Value")
    private String value;

    public Condition() {
    }

    public Condition(Property name, String value) {
        this.name = name;
        this.value = value;
    }

    public Property getName() {
        return name;
    }

    public void setName(Property name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Condition{" +
                "name=" + name +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Condition that = (Condition) o;

        if (name != null ? !name.equals(that.name) : that.name != null)
            return false;
        return value != null ? value.equals(that.value) : that.value == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}

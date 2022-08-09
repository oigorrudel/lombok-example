import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class EqualsAndHashCodeExample {

    public static void main(String[] args) {

    }

    @Getter
    @Setter
    @ToString
    @EqualsAndHashCode
    public static class Person {
        private String name;
    }

    @Getter
    @Setter
    @ToString
    @EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
    public static class NaturalPerson extends Person {
        private String cpf;
    }
}

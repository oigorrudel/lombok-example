import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.With;

public class WithExample {

    public static void main(String[] args) {
        final var p1 = new Person("João", 20);
        final var p2 = p1.withAge(22);

        System.out.println(p1);
        System.out.println(p2);
    }

    @Getter
    @AllArgsConstructor
    @ToString
    public static class Person {
        private String name;
        @With(AccessLevel.PRIVATE) Integer age;
    }
}

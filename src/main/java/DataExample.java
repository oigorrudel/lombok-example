import lombok.Data;
import lombok.ToString;

public class DataExample {

    public static void main(String[] args) {
        final var p1 = Person.of("João");
        p1.setAge(19);

        System.out.println(p1);
    }

    @Data(staticConstructor = "of") //@Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
    @ToString(onlyExplicitlyIncluded = true)
    public static class Person {
        private final String name;
        private Integer age;
    }
}

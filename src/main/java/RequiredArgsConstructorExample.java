public class RequiredArgsConstructorExample {

    public static void main(String[] args) {
        final var p1 = Person.of("João");

        System.out.println(p1.getName());
    }
}

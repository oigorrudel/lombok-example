import lombok.ToString;
import lombok.experimental.SuperBuilder;

public class SuperBuilderExample {

    public static void main(String[] args) {
        final var p1 = NaturalPerson.init()
            .sssName("João")
            .sssCpf("123123123-99")
            .construct();

        final var builder = p1.toBuilder();

        final var p2 = builder.sssCpf("321312312-88")
            .construct();

        System.out.println(p1);
        System.out.println(p2);
    }

    @SuperBuilder(builderMethodName = "init", buildMethodName = "construct", toBuilder = true, setterPrefix = "sss")
    @ToString
    public static class Person {
        private String name;
    }

    @SuperBuilder(builderMethodName = "init", buildMethodName = "construct", toBuilder = true, setterPrefix = "sss")
    @ToString(callSuper = true)
    public static class NaturalPerson extends Person {
        private String cpf;
    }
}

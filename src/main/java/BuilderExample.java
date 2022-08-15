//import lombok.AccessLevel;
//import lombok.Builder;
//import lombok.ToString;
//
//public class BuilderExample {
//
//    public static void main(String[] args) {
////        final var p1 = Person.builder()
////            .name("João")
////            .age(20)
////            .build();
//
//        final var p1 = Person.init()
//            .withName("João")
//            .withAge(20)
//            .construct();
//
//        final var builder = p1.toBuilder();
//
//        final var p2 = builder.withName("Maria")
//            .construct();
//
//        System.out.println(p1);
//        System.out.println(p2);
//    }
//
//    @Builder(builderMethodName = "init", buildMethodName = "construct",
//        setterPrefix = "with", access = AccessLevel.PRIVATE, builderClassName = "PersonBB", toBuilder = true
//    )
//    @ToString
//    public static class Person {
//        @Builder.Default
//        private String name = "AA";
//        private Integer age;
//    }
//}

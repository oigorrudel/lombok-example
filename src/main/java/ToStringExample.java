//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//public class ToStringExample {
//
//    public static void main(String[] args) {
//        final var p1 = new NaturalPerson();
//        p1.setName("João");
//        p1.setCpf("111222333-98");
//
//        System.out.println(p1);
//    }
//
//    @Getter
//    @Setter
//    @ToString(onlyExplicitlyIncluded = true)
//    public static class Person {
//        @ToString.Include
//        private String name;
//    }
//
//    @Getter
//    @Setter
//    @ToString(callSuper = true, onlyExplicitlyIncluded = true)
//    public static class NaturalPerson extends Person {
//        @ToString.Include
//        private String cpf;
//    }
//}

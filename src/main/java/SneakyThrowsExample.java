//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import lombok.SneakyThrows;
//
//public class SneakyThrowsExample {
//
//    public static void main(String[] args) {
//        run();
//    }
//
//    @SneakyThrows({InterruptedException.class, FileNotFoundException.class})
//    public static void run() {
//        Thread.sleep(1000L);
//
//        new FileInputStream(new File("teste"));
//    }
//}

import java.util.Comparator;
import java.util.List;

public class StreamSample {

  public static void main(String[] args) {
    List<String> names = List.of("yamada", "yasuda", "suzuki", "iida", "Satou", "nakamura");
    System.out.println("1.降順に並び替え");
    names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    System.out.println("2.iで始まる人数");
    System.out.println(names.stream().filter(name -> name.startsWith("i")).count());
    System.out.println("3.suzukiさんはいるか");
    System.out.println(names.stream().anyMatch(name -> name.equals("suzuki")));
    System.out.println("4.nakamuraさんはいるか");
    if (names.contains("nakamura")) {
      System.out.println("nakamuraさんはいます");
    }
  }
}
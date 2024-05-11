import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Practise {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss");
        System.out.println(ldt.format(dtf));
    }
}

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> data = DataProvider.getData();

        List<String> result = EmailProcessor.process(data);

        for (String s : result) {
            System.out.println(s);
        }
    }
}
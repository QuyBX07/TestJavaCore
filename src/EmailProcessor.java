import java.util.ArrayList;
import java.util.List;

public class EmailProcessor {

    public static List<String> process(List<String> input) {
        List<String> result = new ArrayList<>();

        for (String s : input) {
            if (!s.contains("@")) {
                continue;
            }

            // Lấy vị trí @ cuối cùng
            int lastAtIndex = s.lastIndexOf('@');

            // Lấy phần trước @ cuối cùng
            String beforeAt = s.substring(0, lastAtIndex);

            // Loại bỏ toàn bộ ký tự @ ở phía trước
            beforeAt = beforeAt.replace("@", "");

            // Ghép kết quả
            String processed = beforeAt + "@...";

            result.add(processed);
        }

        return result;
    }
}

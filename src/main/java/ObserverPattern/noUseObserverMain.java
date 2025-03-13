package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class noUseObserverMain {
    public static void main(String[] args) {
        // Tạo danh sách các đối tượng
        List<noUseObserver> objectList = new ArrayList<>();

        noUseObserver obj1 = new noUseObserver("Object 1");
        noUseObserver obj2 = new noUseObserver("Object 2");
        noUseObserver obj3 = new noUseObserver("Object 3");

        objectList.add(obj1);
        objectList.add(obj2);
        objectList.add(obj3);

        // Object 1 thay đổi trạng thái và thông báo cho các object khác trong danh sách
        obj1.changeState("Trạng thái mới", objectList);
    }
}

package ObserverPattern;
import java.util.List;
public class noUseObserver {
    private String state;
    private String name;

    public noUseObserver(String name) {
        this.name = name;
    }

    public void changeState(String newState, List<noUseObserver> objectList) {
        this.state = newState;
        System.out.println(name + " đã thay đổi trạng thái thành: " + newState);
        for (noUseObserver obj : objectList) {
            if (obj != this) {
                obj.receiveNotification(newState);
            }
        }
    }
    public void receiveNotification(String newState) {
        System.out.println(name + " nhận được thông báo: trạng thái đã thay đổi thành " + newState);
    }
}


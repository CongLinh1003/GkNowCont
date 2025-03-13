package ObserverPattern.BaiTapDuAnPhanMem;

import java.util.ArrayList;
import java.util.List;

public class duAn implements Subject{
    private String tenDuAn;
    private String statusDuAn;
    private List<Observer> observerList;

    public duAn(String tenDuAn, String statusDuAn) {
        this.tenDuAn = tenDuAn;
        this.statusDuAn = statusDuAn;
        this.observerList = new ArrayList<>();
    }

    public String getStatusDuAn() {
        return statusDuAn;
    }

    public void setStatusDuAn(String statusDuAn) {
        this.statusDuAn = statusDuAn;
        System.out.println("Dự án \"" + tenDuAn + "\" đã thay đổi trạng thái thành: " + statusDuAn +"\n");
        notifyObserver();
    }

    public String getTenDuAn() {
        return tenDuAn;
    }

    public void setTenDuAn(String tenDuAn) {
        this.tenDuAn = tenDuAn;
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeOserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList ){
            observer.thongBao(tenDuAn, statusDuAn);
        }

    }
}

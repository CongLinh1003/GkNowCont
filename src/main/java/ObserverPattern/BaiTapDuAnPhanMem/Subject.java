package ObserverPattern.BaiTapDuAnPhanMem;

public interface Subject {
    void addObserver(Observer observer);
    void removeOserver(Observer observer);
    void notifyObserver(Observer observer);
}

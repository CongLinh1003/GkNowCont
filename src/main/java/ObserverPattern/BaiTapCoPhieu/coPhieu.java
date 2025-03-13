package ObserverPattern.BaiTapCoPhieu;

import java.util.ArrayList;
import java.util.List;

public class coPhieu implements Subject{
    private String symbol;
    private double price;
    private List<Observer> observers;

    public coPhieu(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
        this.observers = new ArrayList<>();
    }



    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.updateGia(symbol, price);
        }
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        System.out.println("Giá cổ phiếu " + symbol + " đã thay đổi thành " + price);
        notifyObservers();
    }
}

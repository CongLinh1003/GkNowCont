package ObserverPattern.BaiTapCoPhieu;

public class CoPhieuMain {
    public static void main(String[] args) {

//Khi giá của một cổ phiếu thay đổi, các nhà đầu tư đã đăng ký để theo dõi cổ
// phiếu đó sẽ nhận được thông báo ngay lập tức về sự thay đổi.
        coPhieu appleStock = new coPhieu("AAPL", 150.0);

        nhaDauTu nhaDauTu1 = new nhaDauTu("Nguyen");
        nhaDauTu nhaDauTu2 = new nhaDauTu("Lam");
        nhaDauTu nhaDauTu3 = new nhaDauTu("Nhi");

        appleStock.addObserver(nhaDauTu1);
        appleStock.addObserver(nhaDauTu2);
        appleStock.addObserver(nhaDauTu3);

        appleStock.setPrice(155.5);
    }
}

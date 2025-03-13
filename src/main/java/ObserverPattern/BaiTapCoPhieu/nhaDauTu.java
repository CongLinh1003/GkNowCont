package ObserverPattern.BaiTapCoPhieu;

public class nhaDauTu implements Observer {
    private String name;

    public nhaDauTu(String name) {
        this.name = name;
    }
    @Override
    public void updateGia(String kyHieuCoPhieu, double giaMoi) {
        System.out.println("Nhà đầu tư " + name + " nhận thông báo: giá của cổ phiếu " + kyHieuCoPhieu + " thay đổi thành " + giaMoi);
    }
}

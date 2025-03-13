package ObserverPattern.BaiTapDuAnPhanMem;

public class duAnMain {
    public static void main(String[] args) {
        duAn SolarRains = new duAn("SolarRains", "innitial");

        thanhVien tv1 = new thanhVien("Tuan", 1);
        thanhVien tv2 = new thanhVien("Hai", 2);
        thanhVien tv3 = new thanhVien("Trang", 3);

        SolarRains.addObserver(tv1);
        SolarRains.addObserver(tv2);
        SolarRains.addObserver(tv3);

        SolarRains.setStatusDuAn("Building");
        SolarRains.setStatusDuAn("G");
    }
}

package ObserverPattern.BaiTapDuAnPhanMem;

public class thanhVien implements Observer{
    private String name;
    private int id;

    public thanhVien(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void thongBao(String taskName, String newStatus) {
        System.out.println("Thành viên " + name +" nhận thông báo về dự án " + taskName + " đổi trạng thái " + newStatus);
    }
}

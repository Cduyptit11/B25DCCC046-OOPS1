
public class MAIN {
    public static void main(String[] args) {

        // Tao san pham
        SANPHAM sp1 = new SANPHAM("SP01", "Laptop", 15000000, 20);
        SANPHAM sp2 = new SANPHAM("SP02", "Chuot may tinh", 200000, 50);

        // Hien thi danh sach san pham
        System.out.println("DANH SACH SAN PHAM");
        sp1.hienThi();

        System.out.println("-------------------------");
        sp2.hienThi();

        // Tao don hang
        DONHANG dh1 = new DONHANG("Nguyen Duy Cuong", sp1, 2);
        DONHANG dh2 = new DONHANG("Hoang Trung Duc", sp2, 5);

        // In danh sach don hang
        System.out.println();
        System.out.println("DANH SACH DON HANG");

        dh1.inDonHang();
        dh2.inDonHang();
    }
}

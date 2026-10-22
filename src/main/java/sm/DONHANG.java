
public class DONHANG {
    private String tenKhach;
    private SANPHAM sanPham;
    private int soLuong;

    public DONHANG(String tenKhach, SANPHAM sanPham, int soLuong) {
        this.tenKhach = tenKhach;
        this.sanPham = sanPham;

        if (soLuong < 1) {
            this.soLuong = 1;
        } else {
            this.soLuong = soLuong;
        }
    }

    public double tinhThanhTien() {
        double thanhTien = sanPham.getDonGia() * soLuong;

        if (soLuong >= 5) {
            thanhTien = thanhTien * 0.9;
        }

        return thanhTien;
    }

    public void inDonHang() {
        System.out.println("Ten khach: " + tenKhach);
        System.out.println("San pham: " + sanPham.getTenSP());
        System.out.println("So luong: " + soLuong);
        System.out.println("Thanh tien: " + tinhThanhTien() + " VND");
        System.out.println("-------------------------");
    }
}

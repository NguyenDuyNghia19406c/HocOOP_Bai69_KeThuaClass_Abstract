package NguyenDuyNghia.com.test;
import NguyenDuyNghia.com.model.*;
public class testNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVienChinhThuc teo=new NhanVienChinhThuc(1, "Tèo Thẹo");
		teo.tinhLuong();
		
		NhanVienThoiVu ty=new NhanVienThoiVu(2, "Tý Mẻ");
		ty.tinhLuong();

	}

}

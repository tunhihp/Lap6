class Nhanvien {
    protected String ten;
    protected long luong;
    public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        this.ten=ten;
    }
    public long getLuong(){
        return luong;
    }
    public void setLuong(long luong){
        this.luong=luong;
    }
    protected String loainhanvien;
    public String getLoaiNhanVien(){
        return loainhanvien;
    }
    public void setLoaiNhanVien(String loainhanvien){
        this.loainhanvien=loainhanvien;
    }
    protected double tinhLuong;
    public double getTinhLuong(){
        return this.luong;
    }
}
class Nhanvienfulltime extends Nhanvien{
    private String loaiChucVu;
    private int ngayLamThem;
    
    public String  getLoaiChucVu(){
        return loaiChucVu;
    }
    public void setLoaiChucVu(String loaiChucVu){
        this.loaiChucVu=loaiChucVu;
    }
    public int getNgayLamThem(){
        return ngayLamThem;
    }
    public void setNgayLamThem(int ngayLamThem){
        this.ngayLamThem=ngayLamThem;
    }
    @Override
    public String getLoaiNhanVien(){
        return loainhanvien;
    }
    public void setLoaiNhanVien(String loainhanvien){
        this.loainhanvien=loainhanvien;
    }
    @Override
    public double getTinhLuong(){
        return this.ngayLamThem*luong; 
    }
}
class NhanvienParttime extends Nhanvien{
    private int gioLamViec;
    public int getGioLamViec(){
        return gioLamViec;
    }
    public void setGioLamViec(int gioLamViec){
        this.gioLamViec=gioLamViec;
    }
    @Override
    public String getLoaiNhanVien(){
        return loainhanvien;
    }
    public void setLoaiNhanVien(String loainhanvien){
        this.loainhanvien=loainhanvien;
    }
    @Override
    public double getTinhLuong(){
        return this.gioLamViec*luong;
    }
}
public class Bai1{
    public static void main(String[] args) {
        Nhanvien nv= new Nhanvien();
        nv.setTen("Giang");
        nv.setLoaiNhanVien("Xuat sac");
        nv.setLuong(2000000);
        System.out.println("Thong tin nhan vien: ");
        System.out.println("Ten: "+nv.getTen());
        System.out.println("Xep loai : "+nv.getLoaiNhanVien());
        System.out.println("Luong : "+nv.getLuong());

        Nhanvienfulltime nvft =new Nhanvienfulltime();
        nvft.setTen("Song");
        nvft.setLoaiChucVu("Sep");
        nvft.setLuong(2700000);
        nvft.setNgayLamThem(7);
        nvft.setLoaiNhanVien("Xuat sac");
        System.out.println("\nThong tin nhan vien: ");
        System.out.println("Ten: "+nvft.getTen());
        System.out.println("Loai chuc vu: "+nvft.getLoaiChucVu());
        System.out.println("Xep loai: "+nvft.getLoaiNhanVien());
        System.out.println("Luong: "+nvft.getLuong());
        System.out.println("So ngay lam them: "+nvft.getNgayLamThem());
        System.out.println("Tong luong da nhan: "+nvft.getTinhLuong());
        

        NhanvienParttime nvpt= new NhanvienParttime();
        nvpt.setTen("Hang");
        nvpt.setLuong(24000);
        nvpt.setLoaiNhanVien("Tot");
        nvpt.setGioLamViec(12);
        System.out.println("\nThong tin nhan vien: ");
        System.out.println("Ten: "+nvpt.getTen());
        System.out.println("Xep loai: "+nvpt.getLoaiNhanVien());
        System.out.println("Luong: "+nvpt.getLuong());
        System.out.println("Tong luong: "+nvpt.getTinhLuong());
    }
}
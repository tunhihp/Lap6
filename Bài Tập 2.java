class HocSinh {
    private String hoTen, lop;
    private double toan;
    private double ly;
    private double hoa;
    public String getHoTen(){
        return hoTen;
    }
    public void setHoTen(String hoTen){
        this.hoTen=hoTen;
    }
    public String getLop(){
        return lop;
    }
    public void setLop(String lop){
         this.lop=lop;
    }
    public double getToan(){
        return toan;
    }
    public void setToan(double toan){
         this.toan=toan;
    }
    public double getLy(){
        return ly;
    }
    public void setLy(double ly){
         this.ly=ly;
    }
    public double getHoa(){
        return hoa;
    }
    public void setHoa(double hoa){
        this.hoa=hoa;
    }
    public double tinhDiemTB(){
        return (this.toan + this.ly + this.hoa)/3;
    }
}
class HocSinhChuyenToan extends HocSinh{
    @Override
    public double tinhDiemTB(){
        return (this.getToan()*2 + this.getLy()+this.getHoa())/4;
    }

}
public class Bai2{
    public static void main(String[] args) {
        HocSinh hs=new HocSinh();
        hs.setHoTen("Toi ten A");
        hs.setLop("12");
        hs.setToan(6);
        hs.setLy(7);
        hs.setHoa(8);
        System.out.println("Ten hoc sinh: "+hs.getHoTen());
        System.out.println("Lop: "+hs.getLop());
        System.out.println("Diem Toan: "+hs.getToan() + "," + "\nDiem Ly: "+hs.getLy()+ "," + "\nDiem Hoa: "+hs.getHoa());
        
        HocSinhChuyenToan hsct=new HocSinhChuyenToan();
        hsct.setHoTen("Toi ten B");
        hsct.setLop("Chuyen toan 12");
        hsct.setToan(10);
        hsct.setLy(10);
        hsct.setHoa(10);
        System.out.println("\nTen hoc sinh: "+hsct.getHoTen());
        System.out.println("Lop: "+hsct.getLop());
        System.out.println("Diem Toan: "+hsct.getToan() + "," + "\nDiem Ly: "+hsct.getLy()+ "," + "\nDiem Hoa: "+hsct.getHoa());
        System.out.println("DTB: "+hsct.tinhDiemTB());
}
}
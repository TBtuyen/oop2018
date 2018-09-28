package week2.task3;

/**
 *
 * @author TB
 */
class lopHoc {
    public int soLuongHS;
    public String tenLop;
    public String GVCN;
    //setter thiet lap gia tri cho cac thuoc tinh
    public void setSoLuongHS(int soluong){
        this.soLuongHS = soluong;
    }
    public void setTenLOp( String tenlop){
        this.tenLop = tenlop;
    }
    public void setGVCN(String gv){
        this.GVCN= gv;
    }
    // ham getter truy xuat du lieu cua thuoc tinh
    public int getSoLuongHS(){
        return soLuongHS;
    }
    public String getTenLop(){
        return tenLop;
    }
    public String getGVCN(){
        return GVCN;
    }
    // so luong hs it hay nhieu
    public void itNhieu(){
        if(this.getSoLuongHS()> 50)
            System.out.println("Lop nay co nhieu hoc sinh!");
        else System.out.println("Lop nay co it hoc sinh ");      
    }
    
}
class sinhVien {
    public String hten;
    public String msv;
    public int namSinh;
    public int sv;
    //ham setter thiet lap cac gia tri tuong ung
     public void setSv(int sv){
        this.sv = sv;
    }
    public void setHten(String ten){
        this.hten= ten;
    }
    public void setMsv(String msv){
        this.msv= msv;
    }
    public void setNamSinh(int namSinh){
        this.namSinh= namSinh;
    }
    //ham getter truy xuat noi dung cua thuoc 
     public int getSv(){
        return sv;
    }
    public String getHten(){
        return hten;
    }
    public String getMsv(){
        return msv;
    }
    public int getNamSinh(){
        return namSinh;
    }
    public int tinhTuoi(){
        return 2018 - this.getNamSinh();
    }
    public void namHoc(){
        
        switch (this.getSv()) {
            case 1:
                System.out.println(" Sinh vien nam 1!");
                break;
            case 2:
                System.out.println(" Sinh vien nam 2!");
                break;
            case 3:
                System.out.println(" Sinh vien nam 3!");
                break;
            case 4:
                System.out.println(" Sinh vien nam 4!");
                break;
            case 5:
                System.out.println(" Sinh vien nam 5!");
                break;
            default:
                System.out.println("sinh vien no mon lau nam!");
                break;
        }
    }
}

 class nguoi {
    public String ten;// Tuyen,TU,Tung
    public String diaChi;
    public int tuoi;
    //ham setter thiet lap gia tri cho cac thuoc tinh
    public void setTen(String name){
        this.ten = name;
    }
    public void setDiaChi(String address){
        this.diaChi = address;
    }
     public void setTuoi(int age){
        this.tuoi = age;
    }
    
     // getter truy xuat noi dung cua cac thuoc tinh
    public String getDiaChi(){
        return diaChi;
    }
    
    public int getTuoi(){
        return tuoi;
    }
    public String getTen(){
        return ten;
    }
    // tinh nam sinh 
    public int namSinh(){
        System.out.println("test");
        return  2018 - this.getTuoi();
    }
    // xet trong nhom tuoi lao dong
    public void laoDong(){
        if(this.getTuoi()<=15)
            System.out.println(" Nguoi nayf nam ngoai do tuoi lao dong!");
        else if(this.getTuoi()<=55)
            System.out.println("nguoi nay trong do tuoi lao dong!");
        else System.out.println("Nguoi nay da qua do tuoi lao dong!");
    }
    public void ketHon(){
        if(this.getTuoi()<18)   System.out.println("Ban chua den do tuoi ket hon~~");
        else System.out.println("Ban dan trong do tuoi ket hon~~");
    }
} 

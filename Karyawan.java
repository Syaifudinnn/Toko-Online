
package TokoOnline;
import java.util.ArrayList;

public class Karyawan implements User{
    
    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();
    
    public Karyawan(){
        this.namaKaryawan.add("Budi");
        this.alamat.add("Surabaya");
        this.telepon.add("0987654321");
        this.jabatan.add(0);
    }
    
    //JABATAN
    public void setJabatan (int jabatan){
        this.jabatan.add(jabatan);
    }
    
    public void getJabatan (int id){
        this.jabatan.get(id);
    }
    
    public int getJmlKaryawan(){
        return this.namaKaryawan.size();
    }
    
    //SETTER
    @Override
    public void setNama (String namaKaryawan){
        this.namaKaryawan.add(namaKaryawan);
    }
    
    @Override
    public void setAlamat (String alamat){
        this.alamat.add(alamat);
    }
    
    @Override
    public void setTelepon (String telepon){
        this.telepon.add(telepon);
    }
    
    //GETTER
    @Override
    public String getNama (int idKaryawan){
        return this.namaKaryawan.get(idKaryawan);
    }
    
    @Override
    public String getAlamat (int idKaryawan){
        return this.alamat.get(idKaryawan);
    }
    
    @Override
    public String getTelepon (int idKaryawan){
        return this.telepon.get(idKaryawan);
    }
    
}

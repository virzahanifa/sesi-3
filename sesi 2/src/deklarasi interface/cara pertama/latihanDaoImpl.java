public class latihanDaoImpl implements latihanDao{
	public void save(latihan l){
		System.out.println("menyimpan latihan");
	}
	public void delete(latihan l){
		System.out.println("menghapus latihan");
	}
	public latihan getByid(Long id){
		latihan l = new latihan();
		l.setId(id);
		l.setNama("abc");
		return l;
	}
}
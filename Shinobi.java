public class Shinobi extends Ninja{
	
	public int jumlahCakra;

	public Shinobi(String cakra, int jumlahCakra){
		super(cakra);		
		this.jumlahCakra = jumlahCakra;
	}

	public Shinobi(String cakra){
		super(cakra);
	}


	public void showJumlahCakra(){
		System.out.println("Kapasitas "+jumlahCakra);
	}

}
import java.util.Scanner;

final public class DVD_Musik extends DVD {
	private String Penyanyi;
	private String Produser;
	private String TopHits;
	private DVD_Musik[] album;
	private static byte id = -1;
	
	
	Scanner in = new Scanner(System.in);
	
	public DVD_Musik () {
		album = new DVD_Musik [10];
	}
	
	public String getPenyanyi() {
		return Penyanyi;
	}
	
	public void setPenyanyi(String penyanyi) {
		Penyanyi = penyanyi;
	}
	
	public String getProduser() {
		return Produser;
	}
	
	public void setProduser(String produser) {
		Produser = produser;
	}
	
	public String getTopHits() {
		return TopHits;
	}
	
	public void setTopHits(String topHits) {
		TopHits = topHits;
	}
	
	public static void nextId() {
		id++;
	}
	
	public void tambahAlbum() {
		do {
			nextId();
			album[id] = new DVD_Musik();
			this.inputAlbum();
		}while(this.addMoreAlbum().equals("y"));
	}
	
	public String addMoreAlbum() {
		String addMore;
		
		System.out.println("\nApakah ingin menambahkan album lain? (y/n) : ");
		addMore = in.nextLine();

		return addMore;
	}
	
	public void inputAlbum(){
		System.out.println("\nMasukkan judul album musik : ");
		album[id].setJudul(in.nextLine());
		//super.setJudul(in.nextLine());
		System.out.println("Masukkan nama penyanyi : ");
		album[id].setPenyanyi(in.nextLine());
		System.out.println("Masukkan nama produser : ");
		album[id].setProduser(in.nextLine());
		System.out.println("Masukkan perusahaan publisher album : ");
		album[id].setPublisher(in.nextLine());
		//super.setPublisher(in.nextLine());
		System.out.println("Masukkan top hits lagu di album tersebut : ");
		album[id].setTopHits(in.nextLine());
		System.out.println("Masukkan Kategori (C = classic, J = jazz, P= pop, R= rock, K= K-Pop, O = Other) : ");
		this.pilihKategori();
		System.out.println("Masukkan stok DVD Musik : ");
		String st= in.nextLine();
		album[id].setStok(Integer.parseInt(st));
		//super.setStok(Integer.parseInt(st));
	}
	
	public void pilihKategori() {
		String kategori;
		
		kategori = in.nextLine();
		switch (kategori) {
		case "C" : album[id].setKategori("Classic");
				   //super.setKategori("Classic");
		break;
		case "J" : album[id].setKategori("Jazz");
				   //super.setKategori("Jazz");
		break;
		case "P" : album[id].setKategori("Pop");
				   //super.setKategori("Pop");
		break;
		case "R" : album[id].setKategori("Rock");
				   //super.setKategori("Rock");
		break;
		case "K" : album[id].setKategori("K-Pop");
				   //super.setKategori("K-Pop");
		break;
		case "O" : album[id].setKategori("Other");
				   //super.setKategori("Other");
		break;
		}
	}
	
	public void displayInfoMusik() {
		for (int i =0; i<=id; i++) {
			System.out.println("\n-----Info Album ["+i+"]-----");
			System.out.println("Judul : "+album[i].getJudul());
			System.out.println("Penyanyi : "+album[i].getPenyanyi());
			System.out.println("Produser : "+album[i].getProduser());
			System.out.println("Publisher : "+album[i].getPublisher());
			System.out.println("Top Hits : "+album[i].getTopHits());
			System.out.println("Kategori : "+album[i].getKategori());
			System.out.println("Stok : "+album[i].getStok());
		}
	}
	
}

import java.util.Scanner;

final public class DVD_Film extends DVD {
	private String Pemeran;
	private String Sutradara;
	private DVD_Film[] film;
	private static byte id = -1;
	
	
	Scanner in = new Scanner(System.in);
	
	public DVD_Film () {
		film = new DVD_Film [10];
	}
	
	public String getPemeran() {
		return Pemeran;
	}
	
	public void setPemeran(String pemeran) {
		Pemeran = pemeran;
	}
	
	public String getSutradara() {
		return Sutradara;
	}
	
	public void setSutradara(String sutradara) {
		Sutradara = sutradara;
	}
	
	public static void nextId() {
		id++;
	}
	
	public void tambahFilm() {
		do {
			nextId();
			film[id] = new DVD_Film();
			this.inputFilm();
		}while(this.addMoreFilm().equals("y"));
	}
	
	public String addMoreFilm() {
		String addMore;
		
		System.out.println("\nApakah ingin menambahkan film lain? (y/n) : ");
		addMore = in.nextLine();

		return addMore;
	}
	
	public void inputFilm(){
		System.out.println("\nMasukkan judul film : ");
		film[id].setJudul(in.nextLine());
		//super.setJudul(in.nextLine());
		System.out.println("Masukkan pemeran film : ");
		film[id].setPemeran(in.nextLine());
		System.out.println("Masukkan sutradara film : ");
		film[id].setSutradara(in.nextLine());
		System.out.println("Masukkan perusahaan publisher film : ");
		film[id].setPublisher(in.nextLine());
		//super.setPublisher(in.nextLine());
		System.out.println("Masukkan Kategori (SU = semua umur, D = dewasa, R = remaja, A = anak-anak : ");
		this.pilihKategori();
		System.out.println("Masukkan stok DVD Film : ");
		String st= in.nextLine();
		film[id].setStok(Integer.parseInt(st));
		//super.setStok(in.nextInt());
		
	}
	
	public void pilihKategori() {
		String kategori;
		
		kategori = in.nextLine();
		switch (kategori) {
		case "SU" : film[id].setKategori("Semua Umur");
				   //super.setKategori("Semua Umur");
		break;
		case "D" : film[id].setKategori("Dewasa");
				   //super.setKategori("Dewasa");
		break;
		case "R" : film[id].setKategori("Remaja");
				   //super.setKategori("Remaja");
		break;
		case "A" : film[id].setKategori("Anak-anak");
				   //super.setKategori("Anak-anak");
		break;
		}
	}
	
	public void displayInfoFilm() {
		for (int i =0; i<=id; i++) {
			System.out.println("\n\n-----Info DVD Film ["+i+"]-----");
			System.out.println("Judul : "+film[i].getJudul());
			System.out.println("Penyanyi : "+film[i].getPemeran());
			System.out.println("Produser : "+film[i].getSutradara());
			System.out.println("Publisher : "+film[i].getPublisher());
			System.out.println("Kategori : "+film[i].getKategori());
			System.out.println("Stok : "+film[i].getStok());
		}
	}
	
	public static void main(String[] args) {
		DVD_Film movie = new DVD_Film();
		
		movie.tambahFilm();
		movie.displayInfoFilm();
		
	}
}

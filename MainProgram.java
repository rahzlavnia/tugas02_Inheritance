
public class MainProgram {
	
	public static void main(String[] args) {
		System.out.println("=======Test Program DVD_Musik=======");
		DVD_Musik album = new DVD_Musik();
		album.tambahAlbum();
		album.displayInfoMusik();
		
		System.out.println("\n\n\n=======Test Program DVD_Film=======");
		DVD_Film movie = new DVD_Film();
		movie.tambahFilm();
		movie.displayInfoFilm();

	}
}

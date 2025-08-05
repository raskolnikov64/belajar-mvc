import controller.AlbumControllerRepositoryImpl;
import model.Album;
import view.AlbumViewRepositoryImpl;

public class Demo {
    public static void main(String[] args) {
        AlbumControllerRepositoryImpl albumControllerRepository = new AlbumControllerRepositoryImpl();
        AlbumViewRepositoryImpl albumViewRepository = new AlbumViewRepositoryImpl(albumControllerRepository);
//        albumViewRepository.showAllAlbum();
        Album data = new Album();
        data.setName("Test 1");
        data.setArtist("Yo: gurt");
        data.setYearOfRelease("2021");
        data.setRating("8");
        albumViewRepository.viewAddAlbum(data);
        albumViewRepository.showAllAlbum();
        albumViewRepository.viewRemoveAlbum("Jokowi");
    }
}

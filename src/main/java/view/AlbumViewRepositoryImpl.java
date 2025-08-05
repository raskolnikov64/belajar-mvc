package view;

import controller.AlbumControllerRepository;
import controller.AlbumControllerRepositoryImpl;
import model.Album;
import util.AlbumFullException;
import util.AlbumNotFoundException;

public class AlbumViewRepositoryImpl implements AlbumViewRepository{
    private AlbumControllerRepositoryImpl albumControllerRepository;

    public AlbumViewRepositoryImpl(AlbumControllerRepositoryImpl albumControllerRepository) {
        this.albumControllerRepository = albumControllerRepository;
    }

    @Override
    public void showAllAlbum() {

        var model = albumControllerRepository.getAllAlbum();
        int count = 0;
        for(Album temp : model){
            if(temp != null){
                System.out.printf("---------------------------------\n");
                System.out.printf("Album no %d.\n", count + 1);
                System.out.printf("Album name: %s\n", temp.getName());
                System.out.printf("Artist: %s\n", temp.getArtist());
                System.out.printf("Year of release: %s\n", temp.getYearOfRelease());
                System.out.printf("Rating: %s\n", temp.getRating());
                System.out.printf("---------------------------------\n");
                count++;
            }
        }

    }

    @Override
    public void showAlbum(String name) {
        var model = albumControllerRepository.getAlbum(name);

        if(model != null) {
            System.out.printf("---------------------------------\n");
            System.out.printf("Album name: %s\n", model.getName());
            System.out.printf("Artist: %s\n", model.getArtist());
            System.out.printf("Year of release: %s\n", model.getYearOfRelease());
            System.out.printf("Rating: %s\n", model.getRating());
            System.out.printf("---------------------------------\n");
        } else {
            System.out.printf("%s is not here\n", name);
        }
    }

    @Override
    public void viewAddAlbum(Album data) {

        try {
            albumControllerRepository.addAlbum(data);
            System.out.println("SUCCESS: Album " + data.getName() + " has successfully been added!");
        } catch(AlbumFullException e){
            System.out.println("ERROR: " + e.getMessage());
        }
        System.out.println("Album is full..");
    }

    @Override
    public void viewRemoveAlbum(String name) {
        try {
            System.out.println("Removing album...");
            albumControllerRepository.removeAlbum(name);

            System.out.println("Album has been successfully removed.");
        } catch (AlbumNotFoundException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}

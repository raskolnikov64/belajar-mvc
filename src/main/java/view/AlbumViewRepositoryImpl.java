package view;

import controller.AlbumControllerRepository;
import controller.AlbumControllerRepositoryImpl;
import model.Album;

public class AlbumViewRepositoryImpl implements AlbumViewRepository{
    private AlbumControllerRepositoryImpl albumControllerRepository;

    public AlbumViewRepositoryImpl(AlbumControllerRepositoryImpl albumControllerRepository) {
        this.albumControllerRepository = albumControllerRepository;
    }

    @Override
    public void showAllAlbum() {
        albumControllerRepository.getAllAlbum();
    }

    @Override
    public void showAlbum(String name) {
        albumControllerRepository.getAlbum(name);
    }

    @Override
    public void viewAddAlbum(Album data) {
        albumControllerRepository.addAlbum(data);
    }

    @Override
    public void viewRemoveAlbum(String name) {
        albumControllerRepository.removeAlbum(name);
    }
}

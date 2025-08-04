package view;

import model.Album;

public interface AlbumViewRepository {
    void showAllAlbum();
    void showAlbum(String name);
    void viewAddAlbum(Album data);
    void viewRemoveAlbum(String name);

}

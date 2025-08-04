package controller;

import model.Album;

public interface AlbumControllerRepository {
    Album[] getAllAlbum();
    Album getAlbum(String name);
    void addAlbum(Album data);
    void removeAlbum(String name);
}

package controller;

import model.Album;
import util.AlbumFullException;
import util.AlbumNotFoundException;

public interface AlbumControllerRepository {
    Album[] getAllAlbum();
    Album getAlbum(String name);
    void addAlbum(Album data) throws AlbumFullException;
    void removeAlbum(String name) throws AlbumNotFoundException;
}

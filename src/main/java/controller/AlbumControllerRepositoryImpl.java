package controller;

import model.Album;

public class AlbumControllerRepositoryImpl implements AlbumControllerRepository {

    private Album[] model = new Album[10];

    @Override
    public Album[] getAllAlbum() {
        return model;
    }

    @Override
    public Album getAlbum(String name) {
        for (Album album : model) {
            if (album.getName().equals(name)) {
                return album;
            }
        }

        return null;
    }

    @Override
    public void addAlbum(Album data) {
        for(int i = 0; i < model.length; i++){
            if(model[i].isNull()){
                model[i] = data;
                break;
            }
        }
    }

    @Override
    public void removeAlbum(String name) {
        for(int i = 0; i < model.length; i++){
            if(model[i].getName().equals(name)){
                model[i].setName(null);
                model[i].setArtist(null);
                model[i].setRating(null);
                model[i].setYearOfRelease(null);
            }
        }
    }
}

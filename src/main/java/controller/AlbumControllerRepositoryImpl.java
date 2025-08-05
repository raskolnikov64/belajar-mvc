package controller;

import model.Album;
import util.AlbumFullException;
import util.AlbumNotFoundException;

public class AlbumControllerRepositoryImpl implements AlbumControllerRepository {

    public Album[] model = new Album[10];

    public AlbumControllerRepositoryImpl(){

    }


    @Override
    public Album[] getAllAlbum() {
        return model;
    }

    @Override
    public Album getAlbum(String name) {
        for (Album album : model) {
            if (album != null && album.getName().equals(name)) {
                return album;
            }
        }

        return null;
    }

    @Override
    public void addAlbum(Album data) throws AlbumFullException{
        for(int i = 0; i < model.length; i++){
            if(model[i] == null){
                model[i] = data;
                return;
            }
        }

        throw new AlbumFullException("Failed to add album, storage is full.");
    }

    @Override
    public void removeAlbum(String name) throws AlbumNotFoundException{
        int flag = searchForAlbum(name);
        if(flag != -1){
            model[flag] = null;
            return;
        }

        throw new AlbumNotFoundException("Album " + name + " is not found, please input a valid album name.");
    }

    public int searchForAlbum(String name){
        for(int i = 0; i < model.length; i++){
            if(model[i] != null && model[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

}

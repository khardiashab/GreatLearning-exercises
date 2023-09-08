package com.ajay.service;

import com.ajay.model.Album;
import com.ajay.serviceInterface.IService;

public class Service implements IService {

  @Override
  public boolean deleteAlbum(int albumId) {
    for (Album album : Album.getAlbums()) {
      if (album.getAlbumId() == albumId) {
        System.out.print("Deleted album : ");
        System.out.println(album);
        return Album.getAlbums().remove(album);
      }
    }
    return false;
  }

  @Override
  public Album searchAlbum(int albumId) {
    for (Album album : Album.getAlbums()) {
      if (album.getAlbumId() == albumId) {
        System.out.print("Searched album : ");
        System.out.println(album);
        return album;
      }
    }
    System.out.println("null");
    return null;
  }
  
  @Override
  public Album searchAlbumByYear(int releaseYear) {
    for (Album album : Album.getAlbums()) {
      if (album.getReleaseYear() == releaseYear) {
        System.out.print("Searched album : ");
        System.out.println(album);
        return album;
      }
    }
    System.out.println("null");
    return null;
  }

  @Override
  public void showAlbumWithRealseYear() {

    for (Album album : Album.getAlbums()) {
      System.out.println(album);

    }

  }

}

package com.ajay.serviceInterface;

import com.ajay.model.Album;

public interface IService {

  public void showAlbumWithRealseYear();

  public Album searchAlbum(int albumId);

  public Album searchAlbumByYear(int releaseYear );

  public boolean deleteAlbum(int albumId);

}

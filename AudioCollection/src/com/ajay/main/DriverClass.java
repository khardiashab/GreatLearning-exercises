package com.ajay.main;

import com.ajay.model.Album;
import com.ajay.service.Service;

public class DriverClass {

  public static void main(String[] args) {
    Service AudioHouse = new Service();

    new Album("Album ajay", 2020, "Group A");
    new Album("Album 2", 2018, "Group B");
    new Album("Album 3", 2015, "Group C");
    new Album("Album 4", 2019, "Group D");
    new Album("Album 5", 2017, "Group E");
    new Album("Album 6", 2021, "Group F");
    new Album("Album 7", 2016, "Group G");
    new Album("Album 8", 2014, "Group H");
    new Album("Album 9", 2022, "Group I");
    new Album("Album 10", 2013, "Group J");

    AudioHouse.searchAlbum(0);
    AudioHouse.searchAlbum(1);
    AudioHouse.searchAlbum(220);
    AudioHouse.searchAlbumByYear(2013);
    AudioHouse.searchAlbumByYear(2023);
    AudioHouse.searchAlbumByYear(2003);
    AudioHouse.showAlbumWithRealseYear();
    AudioHouse.deleteAlbum(2);
    AudioHouse.deleteAlbum(2);
    AudioHouse.deleteAlbum(5);
    AudioHouse.showAlbumWithRealseYear();

    System.out.println(Album.getAlbums().size());

  }
}

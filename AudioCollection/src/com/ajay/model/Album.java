package com.ajay.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Album {
  private static final ArrayList<Album> ALBUMS = (new ArrayList<>());
  private static int count = 1;

  private int albumId;
  private String albumName;
  private int releaseYear;
  private String group;

  public Album(String albumName, int releaseYear, String group) {
    this.albumId = count++;
    this.albumName = albumName;
    this.releaseYear = releaseYear;
    this.group = group;
    ALBUMS.add(this); // add this current item to albums
  }

  public int getAlbumId() {
    return albumId;
  }

  public String getAlbumName() {
    return albumName;
  }

  public void setAlbumName(String albumName) {
    this.albumName = albumName;
  }

  public int getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }

  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  @Override
  public String toString() {
    return "Album Name: " + albumName + ", Release Year: " + releaseYear;
  }

  public static ArrayList<Album> getAlbums(){
    return ALBUMS;
  }

  // /c
}
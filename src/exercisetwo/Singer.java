/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercisetwo;

/**
 *
 * @author josue
 */
public class Singer {
    
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public Singer(String name){
        this.name = name;
    }
    
    public void changeFavSong(Song newSong){
        this.favoriteSong = newSong;
    }
    
    public void performForAudience(int audNumber){
        this.noOfPerformances++;
        this.earnings += 100*audNumber;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercisethree;

/**
 *
 * @author josue
 */
public class Singer {
    
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    
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
    
    public String getName(){
        return this.name;
    }
    
    public void setFavSong(Song newFav){
        this.favoriteSong = newFav;
    }
    
    public Song getFavSong(){
        return this.favoriteSong;
    }
    
    public double getEarnings(){
        return this.earnings;
    }
    
    public void setEarnings(double newMoney){
        this.earnings = newMoney;
    }
}

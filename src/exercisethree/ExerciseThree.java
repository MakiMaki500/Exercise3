/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercisethree;

/**
 *
 * @author josue
 */
public class ExerciseThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Archon wisdom = new Archon("Nahida");
        Archon justice = new Archon("Furina");
        Archon eternity = new Archon("Raiden");
        
        Song halloates = new Song("Out of Touch");
        Song astley = new Song("Never Gonna Give You Up");
        
        Singer flumpool = new Singer("Flumpool");
        
        flumpool.setFavSong(halloates);
        System.out.println(flumpool.getEarnings());
        flumpool.performForAudience(12);
        System.out.println(flumpool.getEarnings());
        flumpool.changeFavSong(astley);
    }
    
}

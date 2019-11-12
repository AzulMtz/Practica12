/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traditionalsearch_;

/**
 *
 * @author pumit
 */
public class Animal_ {
    private String species ;
    private boolean canHop ;
    private boolean canSwim ;
    public Animal_(String speciesName , boolean hopper , boolean swimmer ) {
        species = speciesName ;
        canHop = hopper ;
        canSwim = swimmer ;
    }
    public boolean canHop ( ) { return canHop ; }
    public boolean canSwim ( ) { return canSwim ; }
    public String toString ( ) { return species ; }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traditionalsearch_;

import java.util.ArrayList;

/**
 *
 * @author pumit
 */
public class TraditionalSearch_ {

    public static void main ( String []  args ) {
        ArrayList<Animal_>animals = new ArrayList<Animal_> ( );
        animals.add (new Animal_("fish", false , true));
        animals.add ( new Animal_ ("kangaroo" , true, false));
        animals.add ( new Animal_ ("rabbit" , true , false));
        animals.add ( new Animal_ ("turtle" , false , true));
        
        //print ( animals , new CheckIfHopper ( )); //<− ∗∗∗∗∗∗∗
        System.out.println("Animales que pueden Saltar:");
        print (animals, a->a.canHop());
        System.out.println("Animales que pueden nadar");
        print (animals, a->a.canSwim());
    }
    private static void print (ArrayList<Animal_> animals , CheckTrait checker) {
        for ( Animal_ animal : animals ) {
            if (checker.test ( animal ) ) // the g e n e r al check
                System.out.print ( animal + " " ) ;
        }
        System.out.println ( );
    }
}

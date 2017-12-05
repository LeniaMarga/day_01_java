import java.util.ArrayList;
import java.util.Collections;


public class ArrayListEightBall {

        private ArrayList<String> answers;

            public ArrayListEightBall ( ) {
                this.answers = new ArrayList<> ( ); ///here I declare an empty array.
            }


            public int getAnswerCount () {
                return this.answers.size ( );
            }

            public void addAnswer (String answer){
                this.answers.add (answer);
            }

            public void removeAnswer (String answer){
                this.answers.remove (answer);
            }


            public void shuffleAnswer () {
                Collections.shuffle(< this.answers >);

            }

    }
}


//package com.tutorialspoint;
//
//import java.util.*;
//
//public class CollectionsDemo {
//    public static void main(String args[]) {
//        ArrayList arrlist = new ArrayList();
//
//
//        arrlist.add("A");
//        arrlist.add("B");
//        arrlist.add("C");
//
//        System.out.println("Initial collection: "+arrlist);
//
//
//        Collections.shuffle(arrlist);
//
//        System.out.println("Final collection after shuffle: "+arrlist);
//    }
//
//}
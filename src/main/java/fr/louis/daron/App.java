package fr.louis.daron;

import java.util.Random;

public class App {
    
    public static void main(String[] args) {
        Random generateur = new Random(); 
        int nbreDeCasesRest = 20;
        int caseEndroit = 0;
        for(int i = 1; i <= 5; i++){
            int lancer = generateur.nextInt(6) + 1;
            caseEndroit = lancer(caseEndroit, nbreDeCasesRest,i,lancer);
            nbreDeCasesRest = nbreDeCasesRest -lancer;
            
            /*int lancer = generateur.nextInt(6) + 1;
            caseEndroit += lancer;
            nbreDeCasesRest = nbreDeCasesRest - lancer;
            System.out.println("Lancer "+ i +" : Vous avez fait " + lancer + ". Vous etes sur la case " + caseEndroit + " (encore " + nbreDeCasesRest + " cases)" );*/
        }
        perduGagne(nbreDeCasesRest);

        /*if (nbreDeCasesRest != 0){
            System.out.println("Vous avez perdu ! ");
        }else{
            System.out.println("Vous avez gagné ! ");
        }*/

    }
    public static void perduGagne( int gagne){
        if (gagne != 0){
            System.out.println("Vous avez perdu ! ");
        }else{
            System.out.println("Vous avez gagné ! ");
        }
    }

    public static int lancer(int caseActu,int nbreDeCasesRest,int i,int lancer){
        caseActu += lancer;
        nbreDeCasesRest -= lancer;
        System.out.println("Lancer "+ i +" : Vous avez fait " + lancer + ". Vous etes sur la case " + caseActu + " (encore " + nbreDeCasesRest + " cases)" );
        return caseActu;    
    }
}

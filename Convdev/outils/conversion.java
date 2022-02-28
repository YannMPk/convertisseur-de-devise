package outils;

import currency.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class conversion {
    public static void convers()
    {
        Scanner scf = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        String mdest = "MAD";
        double mnt = 1.0;
        String devc = "MAD";

        System.out.println("\t\tVous pouvez saisir le sige de la devise, le nom complet ou meme le nom du pays correspondant\n\n");
        System.out.println("\t\tEx : Pour le dollar americain 'Dollar us' ou 'USD' ou encore 'USA'\n\n");
        System.out.println("\t\tP.S : Pour le dollar canadien 'Dollar ca' ou 'CAD' ou 'canada' \n\n");


        
        try
                {
                    System.out.print("\t\tEntrer le montant à convertir : \t");
                    mnt = scf.nextDouble();
                }
                catch(InputMismatchException e)
                {
                    System.out.println("Erreur de types de donnees, veuillez saisir un reel");
                }
            
                try
                {
                    System.out.print("\t\tEntrer votre devise : \t");
                    mdest = scs.nextLine();
                }
                catch(InputMismatchException e)
                {
                    System.out.println("Erreur de types de donnees, veuillez saisir un text");
                }
                // INFO DEVISE CIBLE;
                try
                {
                    System.out.print("\t\tentrer la devise cible :\t");
                    devc = scs.nextLine();
                }
                catch(InputMismatchException e)
                {
                    System.out.println("Erreur de types de donnees, veuillez saisir un text");
                }
                // ON CONSTRUIT ALORS LA DEVISE CIBLE
                MonnaieInit moi = new MonnaieInit(mnt, mdest, devc);
                
                System.out.println("\n\t\t----------- "+moi.getMontant()+" "+moi.getMdeviseAbrev().toString()+" :: = :: "+moi.getCibleMontant() +" "+ moi.mDeviseCible.getMabrev()+" -----------\n");
                System.out.println("\t\t"+moi.getMdeviseName()+"\t    \t\t\t"+ moi. getMdeviseciblenom());
                System.out.println("\t\t\t\ttaux de change : "+moi.getTauxdechange());
    }
}

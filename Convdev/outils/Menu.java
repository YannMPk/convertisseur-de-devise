package outils;
import java.util.*;

public class Menu {
    public void app() {

        int ch_effectue = 0;
        int nouvelle_conv = 0;
        int retour_effectue = 0;
        Scanner nc = new Scanner(System.in);
        
		
		System.out.println("\t\t--------------------------------------------------------\n\n");
		System.out.println("\t\t\tBIENVENUE SUR VOTRE APPLI\n\n");
		System.out.println("\t\t--------------------------------------------------------\n\n");
		System.out.println("\t\t 1)consultez les taux d'echanges\n");
		System.out.println("\t\t 2)convertir une somme d'argent \n");
		System.out.println("\t\t 3)Quitter l'application \n");
        System.out.print("\n\t\t  >> ");
        
        try
        {
            Scanner ch = new Scanner(System.in);
            ch_effectue = ch.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Erreur d'entree, veuillez saisir un de choix proposer ...");
            app();
        }
        switch(ch_effectue) 
        {
        	case 1 : 
                System.out.println("\t\t--------------------------------------------------------\n\n");
                System.out.println("\t\t\t\tLES TAUX D'ECHANGES\n\n");
                System.out.println("\t\t--------------------------------------------------------\n\n");
                System.out.println("\t\t----------- 1 MAD\t::\t =\t::\t0.0937 EUR --- Euro\n\n");
                System.out.println("\t\t----------- 1 MAD\t::\t =\t::\t0.1052 USD --- Dollar Americain\n\n");
                System.out.println("\t\t----------- 1 MAD\t::\t =\t::\t0.1343 CAD --- Dollar Canadien\n\n");
                System.out.println("\t\t----------- 1 MAD\t::\t =\t::\t0.3050 GBP --- Livre Sterling\n\n");
                System.out.println("\t\tCe convertisseur ne dispose de donnees que pour ces 5 devives\n\t\tToutes fois, faite nous connaitre en commentaire la devise que vous souhaiter voir sur cette liste\n\t\tMerci d'avance ^_^\n\n");
        	
                System.out.print("\t\ttapez 1 Retourner au menu ... 0 pour quitter\n\t\t");
    		
                try
                {
                    Scanner retour = new Scanner(System.in);
                    retour_effectue = retour.nextInt();
                    if(retour_effectue == 1) {
                        app();
                    }
                    else if(retour_effectue == 0)
                    {
                        System.out.println("\tBye Bye !! a plus tard ^_^ ...");
                        System.exit(0);
                    }
                    else
                    {
                        while(retour_effectue > 1 || retour_effectue < 0)
                        {
                            System.out.println("\tErreur d'entree, veuillez saisir un de choix proposer ...^_^ ...");
                            System.out.print("=> ");
                            retour_effectue = retour.nextInt();
                        }
                    }
                }
                catch(InputMismatchException e)
                {
                    System.out.println("Erreur de choix, veuillez saisir 1 pour retourner au menu ou 0 pour quitter ...");
                    break;
                }

            case 2 :
                System.out.println("\t\t--------------------------------------------------------\n\n");
                System.out.println("\t\t\t\tCONVERTISSEUR\n\n");
                System.out.println("\t\t--------------------------------------------------------\n\n");

                conversion.convers();

                System.out.println("\n\t\tEffectuer une nouvelle conversion ? 1 oui 0 non");
                System.out.print("\t\t=> ");

                try
                {
                    nouvelle_conv = nc.nextInt();
                    if(nouvelle_conv == 1) {
                        conversion.convers();
                    }
                    else if(nouvelle_conv == 0)
                    {
                        app();
                    }
                    else
                    {
                        while(nouvelle_conv > 1 || nouvelle_conv < 0)
                        {
                            System.out.println("\t\tErreur d'entree, veuillez saisir un de choix proposer ...^_^ ...");
                            System.out.print("\t\t=> ");
                            nouvelle_conv = nc.nextInt();
                        }
                    }

                    System.out.println("\n\t\tEffectuer une nouvelle conversion ? 1 oui 0 non");
                    System.out.print("\t\t=> ");
                    nouvelle_conv = nc.nextInt();
                }
                catch(InputMismatchException e)
                {
                    System.out.println("Erreur de choix, veuillez saisir 1 pour retourner au menu ou 0 pour quitter ...");
                    break;
                }

                
                break;
            case 3 :
                System.out.println("\t\tBye Bye !! a plus tard ^_^ ...");
                System.exit(0);
                break;
            default :
                    System.out.println("\tErreur d'entree, veuillez saisir un de choix proposer ...");

        }
    }   
}

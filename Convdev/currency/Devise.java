package currency;
import outils.*;

public class Devise
{
    public Annotation abrev;
    public Annotation cible = abrev;
    private String pays;
    private String nom;
    private double taux = 0;

//CONSTRUCTEUR
    public Devise(){}

    public Devise(String var)
    {
        setAll(var);
        /*setAbrev(var);*/
    }

// GETTERS ET SETTERS

    public String getNom()
    {
        return this.nom;
    }
    public String getPays()
    {
        return this.pays;
    }
    public double getTaux()
    {
        return this.taux;
    }

    public void setAll(String var)
    {
        if(var.equalsIgnoreCase("france") || var.equalsIgnoreCase("euro") || var.equalsIgnoreCase("eur"))
        {
            this.nom = "Euro";
            this.pays = "France et Union europeenne";
            this.abrev = Annotation.EUR;
        }
        else if(var.equalsIgnoreCase("USA") || var.equalsIgnoreCase("dollar") || var.equalsIgnoreCase("dollar us") || var.equalsIgnoreCase("USD"))
        {
            this.nom = "Dollard americain";
            this.pays = "Etats unis d'amerique";
            this.abrev = Annotation.USD;
        }
        else if(var.equalsIgnoreCase("Maroc") || var.equalsIgnoreCase("dirham") || var.equalsIgnoreCase("mad"))
        {
           this.nom = "Dirham marocain";
           this.pays = "Maroc";
           this.abrev = Annotation.MAD;
        }
        else if(var.equalsIgnoreCase("canada") || var.equalsIgnoreCase("CAD") || var.equalsIgnoreCase("dollar ca"))
        {
            this.nom = "Dollar Canadien";
            this.pays = "Canada";
            this.abrev = Annotation.CAD;
        }
        else if(var.equalsIgnoreCase("angleterre") || var.equalsIgnoreCase("GBP") || var.equalsIgnoreCase("Livre sterling") || var.equalsIgnoreCase("Livre"))
        {
            this.nom = "Livre Sterling";
            this.pays = "Royaume Uni";
            this.abrev = Annotation.GBP;
        }
        else{
            System.out.println("Desole !!! Aucun traitement pour la monnaie que vous vennet d'entrer.");
        }// ON PEUT ICI RETOURNER IUN BOOLEEN POUR AFFICHER DES MESSAGE SPECIFIQUE POUR UNE ERREUR DE DEVISE SRC OU DST
        
        
    }

    public String getAbrev()
    {
        return this.abrev.toString();
    }

    /*private void setAbrev(String var)
    {
        if(var.equalsIgnoreCase("france") || var.equalsIgnoreCase("euro"))
        {
            this.abrev = Annotation.EUR;
        }
        else if(var.equalsIgnoreCase("USA") || var.equalsIgnoreCase("dollar") || var.equalsIgnoreCase("dollar us"))
        {
            this.abrev = Annotation.USD;
        }
        else if(var.equalsIgnoreCase("Maroc") || var.equalsIgnoreCase("dirham"))
        {
            this.abrev = Annotation.MAD;
        }
        else if(var.equalsIgnoreCase("canada") || var.equalsIgnoreCase("CAD") || var.equalsIgnoreCase("dollar ca"))
        {
            this.abrev = Annotation.CAD;
        }
        else{
            System.out.println("Aucun traitement pour cette valeur\n");
        }
    }*/
// CALCUL DES TAUX DE CHANGES
   /* private void setTaux(String var)
    {
       if(var.equalsIgnoreCase("france") || var.equalsIgnoreCase("euro"))
        {
            this.cible = Annotation.EUR;
        }
        else if(var.equalsIgnoreCase("USA") || var.equalsIgnoreCase("dollar") || var.equalsIgnoreCase("dollar us"))
        {
            this.cible = Annotation.USD;
        }
        else if(var.equalsIgnoreCase("Maroc") || var.equalsIgnoreCase("dirham"))
        {
            this.taux = Annotation.MAD;
        }
        else{
            System.out.println("Aucun traitement pour cette valeur\n");
        } 
    }*/


}
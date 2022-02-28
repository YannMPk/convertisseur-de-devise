package currency;

import outils.*;

public class MonnaieInit extends Monnaie
{
    public String mdevcID;
    public MonnaieFin mDeviseCible = new MonnaieFin();
    double montantconverti = 0.0f;

    public MonnaieInit()
    {
        // CONSTR PAR DEFAUT
        super();
       /* setMontant(1.0f);
        setmdevise("MAD");*/

    }

    public MonnaieInit(double montant, String mdevisenom, String mdevcID)
    {
        setMontant(montant);
        setmdevise(mdevisenom);
        setMdeviseCible(mdevcID);
        this.montantconverti = convertir(this.mDeviseCible.tauxdechange);
        this.mDeviseCible.montant = montantconverti;

        /*nb ++;*/
    }

     protected double convertir(double tauxdechange)
    {
        return this.montant * this.mDeviseCible.tauxdechange;

    }

    public double getMontant()
    {
        return this.montant;
    }

    public double getMontantConverti()
    {
        return this.mDeviseCible.montant;
    }
// ON RECUPE ICI LES ABREV DES DEVISES A AFFICHER A L'UTILISATEUR
    public Annotation getMdeviseAbrev()
    {
        return this.mdevise.abrev;
    }
    public String getMdevisecibleabrev()
    {
        return this.mDeviseCible.getCdeviseAbrev();
    }

    public String getMdeviseciblenom()
    {
        return this.mDeviseCible.getCdeviseName();
    }

    public String getMdeviseName()
    {
        return this.mdevise.getNom();
    }
    public double getTauxdechange()
    {
        return this.mDeviseCible.tauxdechange;
    }
    public double getCibleMontant()
    {
        return this.mDeviseCible.montant;
    }

//SETTER DU MONTANT A CONVERTIR
    private void setMontant(double montant)
    {
        this.montant = montant;
    }

    public void setmdevise(String mdevisenom)
    {
        this.mdevise.setAll(mdevisenom);
    }

    private void setMdeviseCible(String mdevcID)
    {
        this.mDeviseCible.setcDevise(mdevcID, getMdeviseAbrev());
    }


    
}
package currency;
import outils.*;

public class MonnaieFin extends Monnaie
{
    public double tauxdechange = 0.0;
    public MonnaieFin()
    {
        super();
    }

    public MonnaieFin(String mdevisenom, Annotation devsrc)
    {
        setcDevise(mdevisenom, devsrc);
        this.tauxdechange = setMtauxdechange(devsrc);
        
    }

    public double convertir(double qqch)
    {
        return 0.0 ;
    }

// SETTERS ET GETTERS

    public double getCdeviseMontant()
    {
        return this.montant;// QUI EST RETOURNER APRES CONVERTION
    }

     public String getCdeviseAbrev()
    {
        return this.mdevise.getAbrev();
    }
    public Annotation getMabrev()
    {
        return this.mdevise.abrev;
        
    }

    public String getCdeviseName()
    {
        return this.mdevise.getNom();
    }
// ON DEFINI ICI TOUTE LES INFORMATION DE LA MONNAIE FINAL C A D SA DEVISE ET LE MONTANT CONVERTIT
    public void setcDevise(String mdevisenom,Annotation devsrc)
    {
        this.mdevise.setAll(mdevisenom);
        this.tauxdechange = setMtauxdechange(devsrc);
    }

    private double setMtauxdechange(Annotation devsrc)
    {
        if(devsrc == Annotation.EUR)
        {
            if(getMabrev() == Annotation.MAD)
            {
                return 10.69;
            }
            else if(getMabrev() == Annotation.CAD)
            {
                return 1.43;
            }
            else if(getMabrev() == Annotation.USD)
            {
                return 1.13;
            }
            else if(getMabrev() == Annotation.GBP)
            {
                return 0.84 ;
            }
            else
            {
                return 1.0 ;
            }
        }
        else if(devsrc == Annotation.USD)
        {
            if(getMabrev() == Annotation.MAD)
            {
                return 9.49 ;
            }
            else if(getMabrev() == Annotation.CAD)
            {
                return 1.27 ;
            }
            else if(getMabrev() == Annotation.EUR)
            {
                return 0.89 ;
            }
            else if(getMabrev() == Annotation.GBP)
            {
                return 0.75 ;
            }
            else
            {
                return 1.0 ;
            }
        }
        else if(devsrc == Annotation.GBP)
        {
            if(getMabrev() == Annotation.MAD)
            {
                return 12.73 ;
            }
            else if(getMabrev()== Annotation.CAD)
            {
                return 1.70 ;
            }
            else if(getMabrev() == Annotation.EUR)
            {
                return 1.19 ;
            }
            else if(getMabrev() == Annotation.USD)
            {
                return 1.34 ;
            }
            else
            {
                return 1.0 ;
            }
        }
        else if(devsrc == Annotation.CAD)
        {
            if(getMabrev() == Annotation.MAD)
            {
                return 7.46 ;
            }
            else if(getMabrev() == Annotation.GBP)
            {
                return 0.59 ;
            }
            else if(getMabrev() == Annotation.EUR)
            {
                return 0.70 ;
            }
            else if(getMabrev() == Annotation.USD)
            {
                return 0.79 ;
            }
            else
            {
                return 1.0 ;
            }
        }
         else if(devsrc == Annotation.MAD)
        {
            if(getMabrev() == Annotation.CAD)
            {
                return 0.13 ;
            }
            else if(getMabrev() == Annotation.GBP)
            {
                return 0.079 ;
            }
            else if(getMabrev() == Annotation.EUR)
            {
                return 0.094 ;
            }
            else if(getMabrev() == Annotation.USD)
            {
                return 0.11 ;
            }
            else
            {
                return 1.0 ;
            }
        }
        return 1;
    }
}
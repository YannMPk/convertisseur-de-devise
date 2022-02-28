package currency;

public abstract class Monnaie
{
    protected double montant;
    public Devise mdevise = new Devise();
    public static final int nb = 2;

    /*abstract protected void Monnaie(int montant);*/

    abstract protected double convertir(double tauxdechange); 
}
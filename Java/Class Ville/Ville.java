public class Ville {


    /////////  Attribut  //////////////:

    //  private ou public  type  nom_attribut

    //Privé : je ne peux pas y accéder depuis l'exterieur
    private String nomVille;
    private int population;

    //Public : je peux y accéder depuis l'exterieur
    public int superficie;






    ////////// Constructeur ///////////////

    public Ville(){
        this.nomVille = "";
        this.population = 0;
        this.superficie = 0;
        System.out.println("Construction de l'objet Ville");
    }

    public Ville(String nom)
    {
        this.nomVille = nom;
        this.population = 0;
        this.superficie = 0;
        System.out.println("Construction de l'objet Ville, avec le deuxieme constructeur");
    }

    public Ville(String nom, int superficie, int population)
    {
        this.nomVille = nom;
        this.population = population;
        this.superficie = superficie;
        System.out.println("Construction de l'objet Ville, avec le troisième constructeur");
    }


    //Constructeur par copie
    public Ville(Ville ville)
    {
        this.nomVille = ville.getNomVille();
        this.population = ville.getPopulation();
        this.superficie = ville.getSuperficie();
        System.out.println("Construction de l'objet Ville, avec le constructeur par copie");
    }

    /////////////////////////////////




    ///////// Getter and Setter ///////////

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }



    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }


    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    /////////////////////////////



    public String toString(){

        String chaine = new String();
        chaine = "La ville " + this.nomVille +" possède " + this.population + " habitants et a une superficie de "
                + this.superficie;

        return chaine;
    }


    ///////////////////////////////



    public boolean equals( Ville ville) {

        boolean test = true;

        if (this.superficie != ville.getSuperficie()) {
            test = false;
        }

        if (this.population != ville.getPopulation()) {
            test = false;

        }

        if (!this.nomVille.equals(ville.getNomVille())) {
            test = false;

        }

        return test;
    }

        ///////////////////////////////


        public void augmenteHabitant(int nombre){

            if( nombre > 0 ){
                this.population += nombre;
            }
        }

        public int additionPopulationVille( Ville ville2 ){

            int nombre;

            nombre = this.population  + ville2.population;

            return nombre;


        }


}

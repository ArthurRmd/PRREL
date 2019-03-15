public class Carre {

    private Segment a;
    private Segment b;
    private Segment c;
    private Segment d;



    public Carre(){

        this.a = new Segment(0,0, 0 , 1 );
        this.b = new Segment(0,0,1,0);
        this.c = new Segment(1,0,1,1);
        this.d = new Segment(0,1,1,1);
    }

  public Carre (Point a, int valeur){

        int xa = a.getX();
        int ya = a.getY();


      this.a = new Segment(xa,ya, xa , ya+valeur );
      this.b = new Segment(xa, ya, xa+valeur, ya );
      this.c = new Segment(xa,ya+valeur,xa, ya+valeur );
      this.d = new Segment(xa+valeur,ya, xa+valeur,ya+valeur);


  }
  public String toString(){
        String chaine = new String();
      /*  String s1 = new String (a.toString());
      String s2 = new String (b.toString());
      String s3 = new String (c.toString());
      String s4 = new String (d.toString());

      chaine = ( s1 + "\n"+ s2 + "\n"+ s3 + "\n"+s4);

*/

        chaine = ( a + "\n"+ b + "\n"+ c + "\n"+ d);



        return chaine;

  }



  public double perimetre(){

        double longueur = (a.longueur())*4;
        return longueur;
  }

}

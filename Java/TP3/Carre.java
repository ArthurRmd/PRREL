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

}

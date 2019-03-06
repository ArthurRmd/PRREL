public class Segment {


    private Point a;
    private Point b;

    public Segment(){

        this.a = new Point();
        this.b = new Point();
    }


    public Segment(Point a , Point b){

      int xa = a.getX();
      int ya = a.getY();

      this.a.setX(xa);
      this.a.setY(ya);


        int xb = b.getX();
        int yb = b.getY();

        this.b.setX(xb);
        this.b.setY(yb);


    }



    public Segment(int xa , int ya , int xb, int yb) {

        this.b.setX(xb);
        this.b.setY(yb);

        this.a.setX(xa);
        this.a.setY(ya);

    }

    public double longueur(){

        int xa = a.getX();
        int ya = a.getY();

        int xb = b.getX();
        int yb = b.getY();

        double nombre;

        nombre = ( ( xb - xa) * ( xb - xa) ) + ( ( yb - ya) * ( yb - ya) );


        return Math.sqrt(nombre);





    }


    }

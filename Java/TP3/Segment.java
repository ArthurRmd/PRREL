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

        int xb = b.getX();
        int yb = b.getY();

        this.a = new Point(xa, ya );
        this.b = new Point(xb, yb );



    }



    public Segment(int xa , int ya , int xb, int yb) {

        this.a = new Point(xa, ya );
        this.b = new Point(xb, yb );

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

    public String toString(){
        String chaine = new String();
        chaine = ("Segment(" + this.a.getX() + ";" + this.a.getY() + ")" + ";" + "(" + this.b.getX() + ";" + this.b.getY() + ")");
        return chaine;
    }


    }

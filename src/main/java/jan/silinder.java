package jan;

public class silinder extends ring{

    double k6rgus;
    double raadius;

    public silinder(double k6rgus, double raadius){

        super(raadius);
        this.k6rgus = k6rgus;

    }

    public double kujundiRuumala(){

        return kujundiPindala()/3 * k6rgus;

    }

}
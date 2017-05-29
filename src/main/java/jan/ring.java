package jan;

public class ring extends kujundid{

    double raadius;

    public ring(double raadius){

        this.raadius = raadius;

    }


    @Override
    public double kujundiPindala(){

        return Math.PI * raadius * raadius;

    }

    @Override
    public double kujundiYmberm66t(){

        return 2 * Math.PI * raadius;

    }
}
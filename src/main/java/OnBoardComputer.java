public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;

        if (burn < 100) {
            burn = (status.Velocity * status.Velocity) / (2 * status.Altitude) + 99;
        } else {
            burn = (status.Velocity * status.Velocity) / (2 * status.Altitude);
        }




        System.out.println(burn); /*hack!*/
        return burn;
    }

}

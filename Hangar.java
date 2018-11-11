public class Hangar {
    public static void main(String[] args) {

        Vehicle clio = new Car("Clio", 12000);
        Vehicle titanic = new Boat("Titanic", 400);

        System.out.println(clio.doStuff());
        System.out.println(titanic.doStuff());
    }
}

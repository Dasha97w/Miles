
public class Main {
    public static void main(String[] args) {
        int priceTicket = 15895;
        int miles = priceTicket / 20;

        if (miles < 1) {
            miles = 1;
        }
        System.out.println("количество миль:" + miles);

    }
}

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Lviv", "Ugorska", 11);
        Address address2 = new Address("Lviv", "Ugorska", 11);

//        if (address1 == address2) {
//            System.out.println("Equal");
//        } else {
//            System.out.println("NOT equal");
//        }

        // Тепер Equal, тому що ми перевизначили метод equals у класі Address
        if (address1.equals(address2)) {
            System.out.println("Equal");
        } else {
            System.out.println("NOT equal");
        }


        // Є правило, якщо перевизначаємо метод equals, завжди також перевизначаємо метод hashCode
        System.out.println(address1.hashCode());
        System.out.println(address2.hashCode());
    }
}

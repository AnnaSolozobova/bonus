class Main {
    public static void main(String[] args) {

        int current = 300;


        int topUp = 720;


        int finalAcc = current + topUp;


        System.out.println("Итоговый счёт: " + finalAcc);


        int bonus = finalAcc > 1000 ? finalAcc / 100 : 0;


        System.out.println("Начислено бонусных рублей: " + bonus);
    }
}

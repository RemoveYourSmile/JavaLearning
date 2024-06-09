import java.util.*;

public class Buyer extends Thread implements IBuyer, IUseBasket {

    private static Random rand = new Random();

    private static final Map<String, Integer> goodsMap = new HashMap<>(){{
        put("Помидоры", 200);
        put("Огурцы", 130);
        put("Макароны", 70);
        put("Сыр", 170);
        put("Колбаса", 200);
        put("Хлеб", 50);
        put("Сахар", 60);
        put("Вода", 50);
        put("Картошка", 100);
        put("Чай", 150);
    }};

    public static void main(String[] args) throws InterruptedException {
        List<Thread> listThreads = new ArrayList<>();
        for (int i = 0; i < 120; i++) {
            for (int j = 0; j < rand.nextInt(0, 3); j++) {
                listThreads.add(new Thread(new Buyer()));
                listThreads.get(j).start();
            }
            listThreads.clear();
            Thread.sleep(1000);
        }
    }

    @Override
    public void enterToMarket() {
        System.out.println("Покупатель вошел в магазин.");
    }

    @Override
    public void chooseGoods() {
        System.out.println("Покупатель думает что взять.");
        for (int i = 0; i < rand.nextInt(1, 5); i++) {
            System.out.println("Выбрал продукт: " + goodsMap.keySet().toArray()[rand.nextInt(0,10)]);
        }
    }

    @Override
    public void goOut() {
        System.out.println("Покупатель ушел из магазина.");
    }

    @Override
    public void takeBasket() {
        System.out.println("Покупатель взял корзину.");
    }

    @Override
    public void putGoodsToBasket() {
        System.out.println("Покупатель положил продукты в корзину.");
    }


    @Override
    public void run() {
        try {
            enterToMarket();
            Thread.sleep(rand.nextInt(500, 2001));
            takeBasket();
            Thread.sleep(rand.nextInt(500, 2001));
            chooseGoods();
            Thread.sleep(rand.nextInt(500, 2001));
            putGoodsToBasket();
            Thread.sleep(rand.nextInt(500, 2001));
            goOut();
        } catch (InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
    }
}
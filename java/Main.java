public class Main {
    public static void main(String[] args) {
        Burger Shefbyrger = new Burger();
        Shefbyrger.name = "Шефбургер";
        Shefbyrger.id = "https://www.kfc.ru/foodorder/product/2384";
        Shefbyrger.description = "Попробуйте новый уникальный бургер от шефа! " +
                "Нежный сливочный соус, сочное филе в оригинальной панировке, " +
                "салат айcберг и помидоры на пшеничной булочке с черно-белым кунжутом.";
        Shefbyrger.price = 129;
        Shefbyrger.weight = 213;
        Shefbyrger.calories = 236;
        Shefbyrger.protein = 13;
        Shefbyrger.fats = 10.7;
        Shefbyrger.carbohydrates = 22;

        System.out.println(Shefbyrger);

        Burger ShefbyrgerJunior = new Burger();
        ShefbyrgerJunior.name = "Шефбургер Джуниор";
        ShefbyrgerJunior.id = "https://www.kfc.ru/foodorder/product/2962";
        ShefbyrgerJunior.description = "Нежный сливочный соус, два сочных стрипса в оригинальной панировке," +
                " салат айcберг и помидоры на пшеничной булочке с черно-белым кунжутом.";
        ShefbyrgerJunior.price = 99;
        ShefbyrgerJunior.weight = 177;
        ShefbyrgerJunior.calories = 248;
        ShefbyrgerJunior.protein = 12.5;
        ShefbyrgerJunior.fats = 10.3;
        ShefbyrgerJunior.carbohydrates = 26.1;

        System.out.println(ShefbyrgerJunior);
    }
}

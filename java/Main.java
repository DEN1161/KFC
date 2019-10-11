public class Main {
    public static void main(String[] args) {
        Burger shefbyrger = new Burger();
        shefbyrger.name = "Шефбургер";
        shefbyrger.id = "https://www.kfc.ru/foodorder/product/2384";
        shefbyrger.description = "Попробуйте новый уникальный бургер от шефа! " +
                "Нежный сливочный соус, сочное филе в оригинальной панировке, " +
                "салат айcберг и помидоры на пшеничной булочке с черно-белым кунжутом.";
        shefbyrger.price = 129;
        shefbyrger.weight = 213;
        shefbyrger.calories = 236;
        shefbyrger.protein = 13;
        shefbyrger.fats = 10.7;
        shefbyrger.carbohydrates = 22;

        System.out.println(shefbyrger);

        Burger shefbyrgerJunior = new Burger();
        shefbyrgerJunior.name = "Шефбургер Джуниор";
        shefbyrgerJunior.id = "https://www.kfc.ru/foodorder/product/2962";
        shefbyrgerJunior.description = "Нежный сливочный соус, два сочных стрипса в оригинальной панировке," +
                " салат айcберг и помидоры на пшеничной булочке с черно-белым кунжутом.";
        shefbyrgerJunior.price = 99;
        shefbyrgerJunior.weight = 177;
        shefbyrgerJunior.calories = 248;
        shefbyrgerJunior.protein = 12.5;
        shefbyrgerJunior.fats = 10.3;
        shefbyrgerJunior.carbohydrates = 26.1;

        System.out.println(shefbyrgerJunior);
    }
}

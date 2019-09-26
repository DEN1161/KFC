public class Burger {
    String name;
    String id;
    String description;
    int price;
    int weight;
    int calories;
    double protein;
    double fats;
    double carbohydrates;

    public String toString(){
        return name + " :" + id + " " + "\n" + description + "\n" + price + "\u20BD" + "\n" + weight + " грамм" +
               "\n" + calories + " Ккал" + "\n" + protein + " Б" + "\n" + fats + " Ж" + "\n" + carbohydrates + " У" + "\n";
    }

}


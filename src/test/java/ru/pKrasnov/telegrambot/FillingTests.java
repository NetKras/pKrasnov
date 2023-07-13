package ru.pKrasnov.telegrambot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer;
import org.springframework.boot.test.context.SpringBootTest;
import ru.pKrasnov.telegrambot.Repositories.CategoryRepository;
import ru.pKrasnov.telegrambot.Repositories.ClientOrderRepository;
import ru.pKrasnov.telegrambot.Repositories.ClientRepository;
import ru.pKrasnov.telegrambot.Repositories.ProductRepository;
import ru.pKrasnov.telegrambot.entities.Category;
import ru.pKrasnov.telegrambot.entities.Client;
import ru.pKrasnov.telegrambot.entities.Product;

@SpringBootTest
public class FillingTests {
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Test
    void CreateCategoriesAndProducts() {
        // Основные категории
        Category pizza = new Category();
        pizza.setName("Пицца");
        categoryRepository.save(pizza);

        Category roll = new Category();
        roll.setName("Роллы");
        categoryRepository.save(roll);

        Category burger = new Category();
        burger.setName("Бургеры");
        categoryRepository.save(burger);

        Category drinks = new Category();
        drinks.setName("Напитки");
        categoryRepository.save(drinks);

        // Дочерние категории
        Category classicalRoll = new Category();
        classicalRoll.setName("Классические роллы");
        classicalRoll.setParent(roll);
        categoryRepository.save(classicalRoll);

        Category bakedRoll = new Category();
        bakedRoll.setName("Запеченые роллы");
        bakedRoll.setParent(roll);
        categoryRepository.save(bakedRoll);

        Category sweetRoll = new Category();
        sweetRoll.setName("Сладкие роллы");
        sweetRoll.setParent(roll);
        categoryRepository.save(sweetRoll);

        Category setsRoll = new Category();
        setsRoll.setName("Наборы");
        setsRoll.setParent(roll);
        categoryRepository.save(setsRoll);

        Category classicalBurger = new Category();
        classicalBurger.setName("Классические бургеры");
        classicalBurger.setParent(burger);
        categoryRepository.save(classicalBurger);

        Category spicyBurger = new Category();
        spicyBurger.setName("Острые бургеры");
        spicyBurger.setParent(burger);
        categoryRepository.save(spicyBurger);

        Category gasDrinks = new Category();
        gasDrinks.setName("Газированные напитки");
        gasDrinks.setParent(drinks);
        categoryRepository.save(gasDrinks);

        Category energyDrinks = new Category();
        energyDrinks.setName("Энергетические напитки");
        energyDrinks.setParent(drinks);
        categoryRepository.save(energyDrinks);

        Category juices = new Category();
        juices.setName("Соки");
        juices.setParent(drinks);
        categoryRepository.save(juices);

        Category othersDrinks = new Category();
        othersDrinks.setName("Другие");
        othersDrinks.setParent(drinks);
        categoryRepository.save(othersDrinks);

        Category italianPizza = new Category();
        italianPizza.setName("Итальянские пиццы");
        italianPizza.setParent(pizza);
        categoryRepository.save(italianPizza);

        Category frenchPizza = new Category();
        frenchPizza.setName("Французские пиццы");
        frenchPizza.setParent(pizza);
        categoryRepository.save(frenchPizza);

        Category japanesePizza = new Category();
        japanesePizza.setName("Японские пиццы");
        japanesePizza.setParent(pizza);
        categoryRepository.save(japanesePizza);

        // Пиццы
        Product caesarPizza = new Product();
        caesarPizza.setName("Пицца Цезарь");
        caesarPizza.setPrice(350.0);
        caesarPizza.setDescription("Пицца с сыром и черри");
        caesarPizza.setCategory(italianPizza);
        productRepository.save(caesarPizza);

        Product pepperoniPizza = new Product();
        pepperoniPizza.setName("Пепперони");
        pepperoniPizza.setPrice(400.0);
        pepperoniPizza.setDescription("Пицца с пепперони");
        pepperoniPizza.setCategory(italianPizza);
        productRepository.save(pepperoniPizza);

        Product margaritaPizza = new Product();
        margaritaPizza.setName("Маргарита");
        margaritaPizza.setPrice(200.0);
        margaritaPizza.setDescription("Пицца с томатами");
        margaritaPizza.setCategory(italianPizza);
        productRepository.save(margaritaPizza);

        Product fourCheese = new Product();
        fourCheese.setName("Четыре сыра");
        fourCheese.setPrice(230.0);
        fourCheese.setDescription("Пицца с сырами");
        fourCheese.setCategory(frenchPizza);
        productRepository.save(fourCheese);

        Product BBQ = new Product();
        BBQ.setName("Барбекю пицца");
        BBQ.setPrice(270.0);
        BBQ.setDescription("Пицца с барбекю");
        BBQ.setCategory(frenchPizza);
        productRepository.save(BBQ);

        Product ranch = new Product();
        ranch.setName("Ранч пицца");
        ranch.setPrice(300.0);
        ranch.setDescription("Пицца с соусом ранч");
        ranch.setCategory(italianPizza);
        productRepository.save(ranch);

        Product meat = new Product();
        meat.setName("Мясная пицца");
        meat.setPrice(350.0);
        meat.setDescription("Пицца с мясом");
        meat.setCategory(japanesePizza);
        productRepository.save(meat);

        Product fourSeasons = new Product();
        fourSeasons.setName("Четыре сезона");
        fourSeasons.setPrice(500.0);
        fourSeasons.setDescription("Пицца с томатоми и ветчиной");
        fourSeasons.setCategory(japanesePizza);
        productRepository.save(pepperoniPizza);

        Product cheeseChick = new Product();
        cheeseChick.setName("Сырный цыпленок");
        cheeseChick.setPrice(500.0);
        cheeseChick.setDescription("Пицца с сыром и курицей");
        cheeseChick.setCategory(japanesePizza);
        productRepository.save(margaritaPizza);

        // Классические роллы
        Product ham = new Product();
        ham.setName("Мясной ролл");
        ham.setPrice(80.0);
        ham.setDescription("Ролл с ветчиной");
        ham.setCategory(classicalRoll);
        productRepository.save(meat);

        Product cheeseRoll = new Product();
        cheeseRoll.setName("Сырный ролл");
        cheeseRoll.setPrice(80.0);
        cheeseRoll.setDescription("Ролл с сыром");
        cheeseRoll.setCategory(classicalRoll);
        productRepository.save(cheeseRoll);

        Product BBQRoll = new Product();
        BBQRoll.setName("Ролл песто");
        BBQRoll.setPrice(70.0);
        BBQRoll.setDescription("Ролл с соусом песто");
        BBQRoll.setCategory(classicalRoll);
        productRepository.save(BBQRoll);

        // Запеченые роллы
        Product tomatoesRoll = new Product();
        tomatoesRoll.setName("Томатный ролл");
        tomatoesRoll.setPrice(50.0);
        tomatoesRoll.setDescription("Ролл с томатами");
        tomatoesRoll.setCategory(classicalRoll);
        productRepository.save(meat);

        Product potatoRoll = new Product();
        potatoRoll.setName("Картофельный ролл");
        potatoRoll.setPrice(40.0);
        potatoRoll.setDescription("Ролл с картошкой");
        potatoRoll.setCategory(classicalRoll);
        productRepository.save(potatoRoll);

        Product tomYumRoll = new Product();
        tomYumRoll.setName("Ролл Том Ям");
        tomYumRoll.setPrice(50.0);
        tomYumRoll.setDescription("Ролл с соусом Том Ям");
        tomYumRoll.setCategory(bakedRoll);
        productRepository.save(tomYumRoll);

        // Сладкие роллы
        Product raspberriesRoll = new Product();
        raspberriesRoll.setName("Ролл с малиной");
        raspberriesRoll.setPrice(50.0);
        raspberriesRoll.setDescription("Ролл с малиной");
        raspberriesRoll.setCategory(sweetRoll);
        productRepository.save(raspberriesRoll);

        Product cinnamonRoll = new Product();
        cinnamonRoll.setName("Ролл с корицей");
        cinnamonRoll.setPrice(55.0);
        cinnamonRoll.setDescription("Ролл с корицей");
        cinnamonRoll.setCategory(sweetRoll);
        productRepository.save(cinnamonRoll);

        Product sugarRoll = new Product();
        sugarRoll.setName("Сладкий ролл");
        sugarRoll.setPrice(150.0);
        sugarRoll.setDescription("Ролл с сахаром");
        sugarRoll.setCategory(sweetRoll);
        productRepository.save(sugarRoll);

        // Наборы
        Product RollWithDrink = new Product();
        RollWithDrink.setName("Набор из ролла и напитка");
        RollWithDrink.setPrice(200.0);
        RollWithDrink.setDescription("Ролл с напитком");
        RollWithDrink.setCategory(setsRoll);
        productRepository.save(RollWithDrink);

        Product RollWithPotatoes = new Product();
        RollWithPotatoes.setName("Набор из ролла и картошки");
        RollWithPotatoes.setPrice(300.0);
        RollWithPotatoes.setDescription("Ролл и картошка");
        RollWithPotatoes.setCategory(setsRoll);
        productRepository.save(RollWithPotatoes);

        Product RollWithBurger = new Product();
        RollWithBurger.setName("Набор из ролла и бургера");
        RollWithBurger.setPrice(250.0);
        RollWithBurger.setDescription("Ролл с бургером");
        RollWithBurger.setCategory(setsRoll);
        productRepository.save(RollWithBurger);

        // Классические бургеры
        Product cheeseBurger = new Product();
        cheeseBurger.setName("Чизбургер");
        cheeseBurger.setPrice(150.0);
        cheeseBurger.setDescription("Бургер с сыром");
        cheeseBurger.setCategory(classicalBurger);
        productRepository.save(cheeseBurger);

        Product HamBurger = new Product();
        HamBurger.setName("Гамбургер");
        HamBurger.setPrice(200.0);
        HamBurger.setDescription("Бургер с мясом");
        HamBurger.setCategory(classicalBurger);
        productRepository.save(HamBurger);

        Product doubleBurger = new Product();
        doubleBurger.setName("Двойной бургер");
        doubleBurger.setPrice(300.0);
        doubleBurger.setDescription("Бургер с двойной порцией мяса");
        doubleBurger.setCategory(spicyBurger);
        productRepository.save(doubleBurger);

        // Острые бургеры
        Product jalapeneoBurger = new Product();
        jalapeneoBurger.setName("Бургер с халапеньо");
        jalapeneoBurger.setPrice(150.0);
        jalapeneoBurger.setDescription("Бургер с халапеньо");
        jalapeneoBurger.setCategory(spicyBurger);
        productRepository.save(jalapeneoBurger);

        Product chilliBurger = new Product();
        chilliBurger.setName("Бургер с чилли");
        chilliBurger.setPrice(200.0);
        chilliBurger.setDescription("Бургер с чилли");
        chilliBurger.setCategory(spicyBurger);
        productRepository.save(chilliBurger);

        Product wasabiBurger = new Product();
        wasabiBurger.setName("Васаби бургер");
        wasabiBurger.setPrice(400.0);
        wasabiBurger.setDescription("Бургер с васаби");
        wasabiBurger.setCategory(classicalBurger);
        productRepository.save(wasabiBurger);

        // Газировынные напитки
        Product gasWater = new Product();
        gasWater.setName("Газированная вода");
        gasWater.setPrice(60.0);
        gasWater.setDescription("Вода с газом");
        gasWater.setCategory(gasDrinks);
        productRepository.save(gasWater);

        Product lemonade = new Product();
        lemonade.setName("Лимонад");
        lemonade.setPrice(100.0);
        lemonade.setDescription("Лимонад со вкусом лимона");
        lemonade.setCategory(gasDrinks);
        productRepository.save(lemonade);

        Product cola = new Product();
        cola.setName("Кола");
        cola.setPrice(120.0);
        cola.setDescription("Кола");
        cola.setCategory(gasDrinks);
        productRepository.save(cola);

        // Энергетические напитк
        Product energyCherry = new Product();
        energyCherry.setName("Вишневый энергетик");
        energyCherry.setPrice(150.0);
        energyCherry.setDescription("Энергетик с вишней");
        energyCherry.setCategory(energyDrinks);
        productRepository.save(energyCherry);

        Product energyRaspberies = new Product();
        energyRaspberies.setName("Энергетик с малиной");
        energyRaspberies.setPrice(200.0);
        energyRaspberies.setDescription("Энергетик со вкусом малины");
        energyRaspberies.setCategory(energyDrinks);
        productRepository.save(energyRaspberies);

        Product energyCoffe = new Product();
        energyCoffe.setName("Энергетик кофе");
        energyCoffe.setPrice(90.0);
        energyCoffe.setDescription("Энергетик со вкусом кофе");
        energyCoffe.setCategory(energyDrinks);
        productRepository.save(energyCoffe);

        // Соки
        Product juiceRaspberries = new Product();
        juiceRaspberries.setName("Сок с малиной");
        juiceRaspberries.setPrice(150.0);
        juiceRaspberries.setDescription("Сок с малиной");
        juiceRaspberries.setCategory(juices);
        productRepository.save(juiceRaspberries);

        Product energyApple = new Product();
        energyApple.setName("Яблочный сок");
        energyApple.setPrice(125.0);
        energyApple.setDescription("Сок со вкусом яблока");
        energyApple.setCategory(juices);
        productRepository.save(energyApple);

        Product energyOrange = new Product();
        energyOrange.setName("Апельсиновый сок");
        energyOrange.setPrice(70.0);
        energyOrange.setDescription("Сок со вкусом апельсина");
        energyOrange.setCategory(juices);
        productRepository.save(energyOrange);

        // Другие
        Product cocktail = new Product();
        cocktail.setName("Коклейль");
        cocktail.setPrice(300.0);
        cocktail.setDescription("Коктейль ванильный");
        cocktail.setCategory(othersDrinks);
        productRepository.save(cocktail);

        Product tea = new Product();
        tea.setName("Чай");
        tea.setPrice(50.0);
        tea.setDescription("Классический черный чай");
        tea.setCategory(othersDrinks);
        productRepository.save(tea);

        Product coffe = new Product();
        coffe.setName("Кофе");
        coffe.setPrice(150.0);
        coffe.setDescription("Кофе с молоком");
        coffe.setCategory(othersDrinks);
        productRepository.save(coffe);

    }
}

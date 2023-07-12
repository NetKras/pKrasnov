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
        juices.setParent(burger);
        categoryRepository.save(drinks);

        Category othersDrinks = new Category();
        othersDrinks.setName("Другие");
        othersDrinks.setParent(drinks);
        categoryRepository.save(othersDrinks);

        Category italianPizza = new Category();
        italianPizza.setName("Итальянская пицца");
        italianPizza.setParent(pizza);
        categoryRepository.save(italianPizza);

        Category meetPizza = new Category();
        meetPizza.setName("Мясная пицца");
        meetPizza.setParent(pizza);
        categoryRepository.save(meetPizza);

        Category cheesePizza = new Category();
        cheesePizza.setName("Сырная пицца");
        cheesePizza.setParent(pizza);
        categoryRepository.save(cheesePizza);
    }
}

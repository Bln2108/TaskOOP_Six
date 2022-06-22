package ru.netology.shop;

public class ManaderProduct {
    private RepositoriProduct repository;

// public ManaderProduct (RepositoriProduct repository) { this.repository = repository;}

    publiс

    void add(Product product) {
        repository.add(product);
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        int j =0;
        // тут будем хранить подошедшие запросу продукты
        for (Product product : repository.findAll()) {
            if (matches(product, text)) {
                Product[] tmp = new Product[result.length + 1];
                tmp [j] =product;
                j++;
                result = tmp;
            }

        }

        // "добавляем в конец" массива result продукт product
        return result;
    }

    // метод определения соответствия товара product запросу search
    public boolean matches(Product product, String search) {
        if (product.getName().contains(search)) {
            return true;
        } else {
            return false;
        }          // return product.getName().contains(search);
    }


}
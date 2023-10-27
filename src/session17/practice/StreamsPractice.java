package session17.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamsPractice {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //  printEvenNumbers(numbers);
        // printEvenNumbersWIthStream(numbers);

        List<String> strings = Arrays.asList("apple", "banana", "peach", "watermelon");
        //  printStringsByLengthBiggerThan(strings, 5);
        //  printStringLength(strings);

        List<Product> products = Arrays.asList(new Product("Phone", 999.99),
                new Product("Laptop", 2499.99),
                new Product("Gadged", 450.25));
        printProductListPrice(products);
        printProductIncreasedPrices(products);


        List<List<Integer>> listOfList = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 0, 1, 2));
        List<Integer> flattenedList = listOfList.stream()
                .flatMap(List::stream)
                .toList();
        //  System.out.println("Flattened list: " + flattenedList);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of numbers: " + sum);
        printSortedProductsByPrice(products);
        printProcessedNumbers(numbers);

        boolean anyMatch = strings.stream()
                .filter(fruit -> fruit.length() > 4)
                .anyMatch(fruit -> fruit.startsWith("a"));
        System.out.println("Is there any furit with lenght > 5 and starts with 'a' ? : " + anyMatch);
    }

    private static void printProcessedNumbers(List<Integer> integerList) {
        integerList.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .filter(number -> number > 20)
                .forEach(System.out::println);
    }

    private static void printSortedProductsByPrice(List<Product> productList) {
        List<Product> sortedProducts = productList.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();
        sortedProducts.forEach(product -> System.out.println(product.getName() + " " + product.getPrice()));
    }

    private static void printProductIncreasedPrices(List<Product> productList) {
        List<String> formatedPrices = productList.stream()
                .map(product -> product.getPrice() * 1.10)
                .map(newPrice -> "$" + String.format("%.2f", newPrice))
                .toList();
        System.out.println("Increased prices: " + formatedPrices);
    }

    private static void printProductListPrice(List<Product> productList) {
        productList.stream()
                .map(Product::getPrice)
                .forEach(System.out::println);
    }

    private static void printStringsByLengthBiggerThan(List<String> input, int minLenght) {
        List<String> filtered = new ArrayList<>();
        for (String element : input) {
            if (element.length() > minLenght) {
                filtered.add(element);
            }
        }
        System.out.println("Traditional approach: " + filtered);

        List<String> filteredString = input.stream()
                .filter(element -> element.length() > minLenght)
                .toList();
        System.out.println("Stream approach :" + filteredString);
    }

    private static void printStringLength(List<String> stringList) {
        List<Integer> stringLenghtList = stringList.stream()
                .map(String::length)
                .toList();
        System.out.println("The lenght of the strings: " + stringLenghtList);
    }

    private static void printEvenNumbersWIthStream(List<Integer> numbers) {
        //stream approach
        List<Integer> evenNumbersStream = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println("Stream approach: " + evenNumbersStream);
    }

    private static void printEvenNumbers(List<Integer> numbers) {
        //traditional approach
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println("Traditional approach: " + evenNumbers);
    }
}

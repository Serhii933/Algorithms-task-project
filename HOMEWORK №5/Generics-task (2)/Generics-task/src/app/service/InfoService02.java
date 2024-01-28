package app.service;

import app.entity.Client;
import app.utils.Rounder;

import java.util.Scanner;

public class InfoService02 {

    private Scanner scanner;
    private String phone;
    private double purchaseAmount;

    public String getData() {
        return formData(getInputs());
    }

    private Client<String, Double> getInputs() {
        scanner = new Scanner(System.in);
        System.out.print("Введіть телефон клієнта: ");
        phone = scanner.nextLine();
        System.out.print("Введіть суму покупки клієнта: ");
        purchaseAmount = scanner.nextDouble();
        scanner.nextLine();
        return new Client<>(phone, purchaseAmount);
    }

    private String formData(Client<String, Double> client) {
        double roundedValue = Double.parseDouble(Rounder.roundValue(client.getValue()));
        return "Телефон клієнта: " + client.getKey() +
                ", сума покупки: USD " + roundedValue;
    }
}

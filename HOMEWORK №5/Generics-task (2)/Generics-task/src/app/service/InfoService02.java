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
        System.out.print("Enter client's phone: ");
        phone = scanner.nextLine();
        System.out.print("Enter client's purchase amount: ");
        purchaseAmount = scanner.nextDouble();
        return new Client<>(phone, purchaseAmount);
    }

    private String formData(Client<String, Double> client) {
        String amountRounded = Rounder.roundValue(client.getValue());
        return "Client's phone is " + client.getKey() +
                ", purchase amount is USD " + amountRounded;
    }
}

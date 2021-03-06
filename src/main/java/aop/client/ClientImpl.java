package aop.client;

import java.util.Date;
import java.util.Random;

public class ClientImpl implements Client{
    private String name;
    private Random random;

    public ClientImpl(String name) {
        this.name = name;
        this.random = new Random();
    }

    public int goShopping() {
        System.out.println("Client " + name + " went shopping.");
        return random.nextInt(200);
    }

    public void checkTime() {
        System.out.println("Time is: " + new Date());
    }
}

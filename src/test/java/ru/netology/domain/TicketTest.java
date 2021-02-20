package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {
    private Ticket ticket1 = new Ticket(1, 6500, "LED", "VKO", 200);
    private Ticket ticket2 = new Ticket(2, 14000, "MMK", "KJA", 100);
    private Ticket ticket3 = new Ticket(3, 12300, "LED", "KLF", 50);
    private Ticket ticket4 = new Ticket(4, 17000, "LED", "VKO", 150);
    private Ticket ticket5 = new Ticket(5, 15000, "AER", "ARH", 120);
    private Ticket ticket6 = new Ticket(6, 20000, "LED", "VKO", 60);


    @Test
    public void shouldTicketPriceSort() {
        Ticket[] expected = new Ticket[]{ticket1, ticket3, ticket2, ticket5, ticket4, ticket6};
        Ticket[] actual = new Ticket[]{ticket1, ticket2, ticket3, ticket4, ticket5, ticket6};
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }
}
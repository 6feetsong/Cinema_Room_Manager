package cinema;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Cinema {

    public static List<int[]> bookStore = new ArrayList<>();

    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);

        System.out.println("Enter the number of rows:");
        int row = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();

        showMenu(row, seats);
    }

    private static void showMenu(int row, int seats) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
        int menu = scanner.nextInt();

        switch (menu) {
            case 1:
                printSeat(row, seats, false);
                showMenu(row, seats);
                break;
            case 2:
                buyTicket(row, seats);
                showMenu(row, seats);
                break;
            case 3:
                printStatistics(row, seats);
                showMenu(row, seats);
                break;
            case 0:
                break;
            default:
                System.out.println("Wrong input");
        }
    }

    private static void printStatistics(int row, int seats) {
        int totalSeats = row * seats;
        int soldTicketCount = bookStore.size();
        double bookRatio = (soldTicketCount == 0) ? 0 : (soldTicketCount / totalSeats) * 100;
        int curIncome = 0;
        for (int[] book: bookStore) {
            curIncome += getTicketPrice(row, seats, book[0]);
        }
        int totalIncome = getTotal(row, seats);

        System.out.println("");
        System.out.printf("Number of purchased tickets: %d\n", soldTicketCount);
        System.out.printf("Percentage: %.2f%s\n", bookRatio, "%");
        System.out.printf("Current income: $%d\n", curIncome);
        System.out.printf("Total income: $%d\n", totalIncome);
    }

    private static void buyTicket(int row, int seats) {
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a row number:");
        int seatRow = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int seatColumn = scanner.nextInt();

        if (seatRow > row || seatColumn > seats) {
            System.out.println("");
            System.out.println("Wrong input");
            buyTicket(row, seats);
        } else if (isBooked(seatRow, seatColumn)) {
            System.out.println("");
            System.out.println("That ticket has already been purchased");
            buyTicket(row, seats);
        } else {
            bookStore.add(new int[]{seatRow, seatColumn});
            showPrice(row, seats, seatRow);
            printSeat(row, seats, true);
        }
    }

    private static int getTotal(int row, int seats) {
        int total = row * seats;
        int income;
        if (total <= 60) {
            income = total * 10;
        } else {
            int front = row / 2;
            int back = row - front;
            income = (seats * front * 10) + (seats * back * 8);
        }
        return income;
    }

    private static int getTicketPrice(int row, int seats, int r) {
        int total = row * seats;
        if (total <= 60) {
            return 10;
        } else {
            int front = row / 2;
            if (r <= front) {
                return 10;
            } else {
                return 8;
            }
        }
    }

    private static void showPrice(int row, int seats, int r) {
        System.out.println("");
        int ticketPrice = getTicketPrice(row, seats, r);
        System.out.println("Ticket price: $" + ticketPrice);
    }

    private static void printSeat(int row, int seats, boolean showPrice) {

        String[] header = new String[seats + 1];
        header[0] = " ";
        for (int i = 1; i <= seats; i++) {
            header[i] = String.valueOf(i);
        }
        System.out.println("");
        System.out.println("Cinema:");
        printout(header);

        for (int i = 1; i <= row; i++) {
            String[] rowArr = new String[seats + 1];
            rowArr[0] = String.valueOf(i);
            for (int j = 1; j <= seats; j++) {
                rowArr[j] = isBooked(i, j) ? "B" : "S";
            }
            printout(rowArr);
        }
    }

    private static boolean isBooked(int r, int c) {
        boolean result = false;
        for (int[] book: bookStore) {
            if (book[0] == r && book[1] == c) {
                result = true;
            }
        }
        return result;
    }

    private static void printout(String[] arr) {
        System.out.println(String.join(" ", Arrays.asList(arr)));
    }
}
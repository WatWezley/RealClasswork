package xmasAssignments;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class InvoiceReceipt {

        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                int counter = 0;


                ArrayList<String> goods = new ArrayList<String>();
                ArrayList<Integer> Quantity = new ArrayList<Integer>();
                ArrayList<Integer> Price = new ArrayList<Integer>();
                ArrayList<Integer> Total = new ArrayList<Integer>();
                do {
                        System.out.println(goods);

                        System.out.println("Enter item to purchase: ");
                        String purchase = scanner.nextLine();
                        goods.add(counter, purchase);
                        counter++;
                        System.out.println(counter);


                }
                while (counter < 3);
                //for (String[] rows : header) {
                //System.out.println(Arrays.toString(header));

                String[][] purchaseSummary = new String[counter][4];
                System.out.println(Arrays.deepToString(purchaseSummary));


                //for (int i= 0; i < counter; i++) {
                // for (int j = 0; j < 4; j++) {
                //purchaseSummary[i][j] = " ";
                //}

                //System.out.println(Arrays.deepToString(purchaseSummary));

                for (String[] row : purchaseSummary) {
                        Arrays.fill(row, " ");
                }

                for (int i = 0; i < counter; i++) {
                        for (int j = 0; j < 4; j++) {
                                //System.out.println(goods.get(i));
                                purchaseSummary[i][2] = String.valueOf(goods.get(i));
                        }
                }
                for (String[] row : purchaseSummary) {
                        System.out.println(Arrays.toString(row)
                                .replace(",", "          "));
                }

                Date famiba = new Date();
                System.out.println("DATE: "+ famiba);


                        JFrame frame = new JFrame();

                        String[] columnNames = {"items", "quantity", "price", "total"};

                        JTable table = new JTable(purchaseSummary, columnNames);

                        frame.add(table);
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setSize(400,400);
                        frame.setLocationRelativeTo(null);
                        frame.setVisible(true);
                }

        }








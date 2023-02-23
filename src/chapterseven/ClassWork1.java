package chapterseven;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class ClassWork1 {

    public static void main(String[] args) {

       Integer[][] numbers = new Integer[3][3];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[1][0] = 4;
        numbers[1][1] = 5;
        numbers[1][2] = 6;
        numbers[2][0] = 7;
        numbers[2][1] = 8;
        numbers[2][2] = 9;

        System.out.println(Arrays.deepToString(numbers));

        for (Integer[] rows : numbers) {
            System.out.println(Arrays.toString(rows)
                    .replace("[", "     ")
                    .replace(",", "     ")
                    .replace("]", "     "));
        }

        String[] multiple = {"ITEMS","PRICE","QUANTITY"};


        JFrame frame = new JFrame();

        String[] columnNames = {"items", "quantity", "price"};

        JTable table = new JTable(numbers, columnNames);


     Font font = new Font("Verdana", Font.PLAIN, 12);
     table.setFont(font);
     table.setRowHeight(30);
     frame.setSize(600, 400);
     frame.add(new JScrollPane(table));
     frame.setVisible(true);
        }
    }




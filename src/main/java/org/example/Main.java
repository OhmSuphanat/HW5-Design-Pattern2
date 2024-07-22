/**6510450976
 *Suphanat Sroyphet
 */

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner intScanner = new Scanner(System.in);
        int totalGumball = 0;
        System.out.print("Provide the gumball amount: ");
        totalGumball = intScanner.nextInt();
        System.out.println("Creating the GumballMachine...");
        GumballMachine gumballMachine = new GumballMachine(totalGumball);
        boolean running = true;
        Scanner stringScanner = new Scanner(System.in);
        String buffer = "";
        while (running) {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Mighty Gumball, Inc.");
            System.out.println("There are " + gumballMachine.getCount() + " gumballs left.");
            System.out.print("Insert Quarter[I], Eject Quarter[E], Turn Crank[T], Choose Color[C]: ");
            buffer = stringScanner.nextLine();
            switch (buffer.toLowerCase().charAt(0)) {
                case 'i':
                    gumballMachine.insertQuarter();
                    break;
                case 'e':
                    gumballMachine.ejectQuarter();
                    break;
                case 't':
                    gumballMachine.turnCrank();
                    break;
                case 'c':
                    System.out.print("Choose the color: ");
                    buffer = stringScanner.nextLine();
                    gumballMachine.choose(buffer);
                    break;
            }

            if (gumballMachine.getCount() == 0) {
                running = false;
            }
        }
    }
}

/**6510450976
 *Suphanat Sroyphet
 */

package org.example;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void choose(String color);
}

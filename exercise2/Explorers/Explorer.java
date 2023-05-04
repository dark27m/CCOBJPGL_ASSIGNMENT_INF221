package Explorers;

import Planets.Mars;
import Planets.Planet;
import Planets.Mercury;
import Planets.Saturn;
import Planets.Earth;
import Planets.Jupiter;
import Planets.Neptune;
import Planets.Uranus;
import Planets.Venus;


public interface Explorer {

    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Venus venus);

    void visit(Earth earth);

    void visit(Jupiter jupiter);

    void visit(Uranus uranus);

    void visit(Neptune neptune);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}
package fr.Ih.controller;

import fr.Ih.model.GridModel;
import fr.Ih.model.IHooverModel;

public class CheckController {
	public static void checkCadre(GridModel grid, IHooverModel iHoover) {

		if (iHoover.getY() > grid.getHeight() || iHoover.getX() > grid.getWidth()) {
			System.out.println("la destination de l'aspirateur est hors du cadre");
			System.exit(0);
		}
	}

}
package example.practice8.controller;

import example.practice8.model.vo.Shape;

public class TriangleController {
	
	private Shape s = new Shape();
	
	public double calcArea(double height, double width) {
		s = new Shape(3, height, width);
		return width * height / 2;
	}

	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return "삼각형 " + s.information();
	}
}

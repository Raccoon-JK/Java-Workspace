package example.practice8.controller;

import example.practice8.model.vo.Shape;

public class SquareController {
	
	private Shape s = new Shape();
	
	public double calcPerimeter(double height, double width) {
		s = new Shape(4, height, width);
		return height*2 + width*2;
	}
	
	public double calcArea(double height, double width) {
		s = new Shape(4, height, width);
		return width * height;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return "사각형 " + s.information();
	}

}


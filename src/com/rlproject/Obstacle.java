package com.rlproject;
import java.awt.* ;
import javax.swing.* ;

public class Obstacle {
int xc, yc;


public Obstacle (int xc, int yc) {
	this.xc=xc;
	this.yc=yc;
	}
Color C;
Shape rect;
void drawObstacle(Graphics2D g) {
	 C = new Color(0, 0, 0);
     rect = new Rectangle(xc, yc, 10, 25);
     g.setPaint(C);
     g.fill(rect);
}









}
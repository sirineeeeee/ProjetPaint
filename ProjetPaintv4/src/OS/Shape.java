package OS;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.Serializable;

public abstract class Shape implements Serializable{
	protected int x;
	protected int y;
	protected int red=0;
	protected int green=0;
	protected int blue=0;
	protected int stroke=1;
	protected char stroketype='n';
	protected boolean filled = true;
	protected boolean selected = false;
	
	public void changeColor(int red, int green, int blue) {
		this.red=red;
		this.green=green;
		this.blue=blue;
	}
	
	public void select() {
		this.selected = true;
		this.changeColor(0, 255, 0);
	}
	
	public void unselect() {
		this.selected = false;
		this.changeColor(0, 0, 0);
	}
	
	public boolean getselected() {
		return this.selected;
	}
	
	public Boolean clicked(int x, int y, int x2, int y2) { 
		return false;
	}
	
	public void changestroketype(char stroketype) {
		this.stroketype = stroketype;
	}
	
	public void changefilled(boolean filled) {
		this.filled = filled;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void resize(int kx,int ky) {
	}
	
	public void properties(int x,int y,int w, int h) {
	}
	
	public void paint(Graphics g) {
	}

	public void move(int dx, int dy) {
		if (selected) {
			this.x += dx;
			this.y += dy;
		}	
	}
	
}

package juego;

import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import entorno.Entorno;
import entorno.Herramientas;

public class Nave {
	
	// Variables de instancia
	double x;
	double y;
	double angulo;
	Image img1;
	Image img2;
	Color color;
	
	public Nave(Entorno entorno, int x, int y) 
	{
		this.color = Color.CYAN;
		this.x = x;
		this.y = y;
		entorno.dibujarCirculo(this.x, this.y, 20, color);
		//img1 = Herramientas.cargarImagen("sprite.png");
	}
	
	public void derecha() {
		this.x = +5;
	}
	

	public void izquierda() {
		this.x = -5;
	}
	
	
	
}

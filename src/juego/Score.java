package juego;

import entorno.Entorno;
import java.awt.Color;
import java.awt.Font;

public class Score {
	
	private int value;
	private Color color;
	private Font font;
	private String palabra;
	
	public Score(Entorno entorno, int x, int y, String palabra) {
		this.value = 0;
		this.color = Color.magenta;
		entorno.cambiarFont(null, 25, this.color);
		entorno.escribirTexto(palabra + ": " + this.value, x, y);
	}
	
	public void SetScore(int value) {
		this.value = value;
	}
	
	public int GetScore() {
		
		return this.value;
	}
	

	
}

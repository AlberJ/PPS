package hotel;

public class Recomendacao {
	private float n = 0;
	
	public Recomendacao (){
		
	}
	
	public void setNota(float nn){
		if (this.n == 0) this.n = nn;
		else
			this.n = (this.n + nn)/2;
	}
	
	public float getNota(){
		return this.n;
	}
}

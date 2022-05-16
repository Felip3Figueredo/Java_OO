package ex008;

public class Televisao {

	private int volumeAtual;
	private int canalAtual;


	public int aumentarVolume() {
		volumeAtual++;
		return volumeAtual;	}

	public int diminuirVolume() {
		if (volumeAtual >= 0) {
			volumeAtual--;
		}
		return volumeAtual;
	}

	
	public int subirCanal() {
		canalAtual++;
		return canalAtual;
	}

	public int diminuirCanal() {
		if (canalAtual >= 0) {
			canalAtual--;
		}
		return canalAtual;
	}

	public int getVolumeAtual() {
		return volumeAtual;
	}

	public void setVolumeAtual(int volumeAtual) {
		this.volumeAtual = volumeAtual;
	}

	public int getCanalAtual() {
		return canalAtual;
	}

	public void setCanalAtual(int canalAtual) {
		this.canalAtual = canalAtual;
	}

	public String toString() {
		return "\n\t\tStatus:"
				+ "\nVolume Atual: " + volumeAtual 
				+ String.format("\nCanal Escolhido: %d\n", canalAtual);
				
	}

	

	

}
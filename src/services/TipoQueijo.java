package services;

public enum TipoQueijo {
	
	MUCARELA ("Muçarela"),
	MINAS_PADRAO ("Minas Padrão"),
	PARMESAO ("Parmesão"),
	PRATO ("Prato"),
	FRESCAL ("Frescal");
	
	private String tipoQueijo;
	
	private TipoQueijo(String tipoQueijo) {
		this.tipoQueijo = tipoQueijo;
	}

	public String getTipoQueijo() {
		return tipoQueijo;
	}

	public void setTipoQueio(String tipoQueijo) {
		this.tipoQueijo = tipoQueijo;
	}


	@Override
	public String toString() {
		return tipoQueijo;
	}
	
	public static String[] criaVetorTipoQueuijo() {
		String[] string = new String[TipoQueijo.values().length];
		
		for(int indice = 0; indice < TipoQueijo.values().length; indice++) {
			string[indice]=TipoQueijo.values()[indice].toString();
		}
		return string;
	}
}

package controller;

import java.util.ArrayList;


import enumeradores.Intensidade;
import modelo.Fisico;
import modelo.Humor;
import modelo.Libido;
import modelo.Secrecao;

public class ControlerSintomas {

	private ArrayList<Fisico> fisico;
	private ArrayList<Secrecao> secrecao;
	private ArrayList<Humor> humor;
	private ArrayList<Libido> libido;

	
	public ControlerSintomas(ControlerDados cd) {
		this.fisico = cd.getFisico();
		this.secrecao = cd.getSecrecao();
		this.humor = cd.getHumor();
		this.libido = cd.getLibido();
	}
	
	public String[] getFisicoNome() {
        String[] nomeS = new String[fisico.size()];
        for (int i = 0; i < fisico.size(); ++i) {
            if (fisico.get(i).getNomeSintoma() == null) {
                return nomeS;
            } else {
                nomeS[i] = fisico.get(i).getNomeSintoma();
            }
        }
        return nomeS;
    }
	
	public String[] getHumorNome() {
        String[] nomeS = new String[humor.size()];
        for (int i = 0; i < humor.size(); ++i) {
            if (humor.get(i).getNomeSintoma() == null) {
                return nomeS;
            } else {
                nomeS[i] = humor.get(i).getNomeSintoma();
            }
        }
        return nomeS;
    }
	
	public String[] getLibidoNome() {
        String[] nomeS = new String[libido.size()];
        for (int i = 0; i < libido.size(); ++i) {
            if (libido.get(i).getNomeSintoma() == null) {
                return nomeS;
            } else {
                nomeS[i] = libido.get(i).getNomeSintoma();
            }
        }
        return nomeS;
    }
	
	public String[] getSecrecaoNome() {
        String[] nomeS = new String[secrecao.size()];
        for (int i = 0; i < secrecao.size(); ++i) {
            if (secrecao.get(i).getNomeSintoma() == null) {
                return nomeS;
            } else {
                nomeS[i] = secrecao.get(i).getNomeSintoma();
            }
        }
        return nomeS;
    }
	
	
	public String[] getFisicoData() {
        String[] data = new String[fisico.size()];
        for (int i = 0; i < fisico.size(); ++i) {
            if (fisico.get(i).getData() == null) {
                return data;
            } else {
                data[i] = fisico.get(i).getData();
            }
        }
        return data;
    }
	
	public String[] getLibidoData() {
        String[] data = new String[libido.size()];
        for (int i = 0; i < libido.size(); ++i) {
            if (libido.get(i).getData() == null) {
                return data;
            } else {
                data[i] = libido.get(i).getData();
            }
        }
        return data;
    }
	
	public String[] getSecrecaoData() {
        String[] data = new String[secrecao.size()];
        for (int i = 0; i < secrecao.size(); ++i) {
            if (secrecao.get(i).getData() == null) {
                return data;
            } else {
                data[i] = secrecao.get(i).getData();
            }
        }
        return data;
    }
	
	public String[] getHumorData() {
        String[] data = new String[humor.size()];
        for (int i = 0; i < humor.size(); ++i) {
            if (humor.get(i).getData() == null) {
                return data;
            } else {
                data[i] = humor.get(i).getData();
            }
        }
        return data;
    }

	public ArrayList<Fisico> getFisico() {
		return fisico;
	}

	public void setFisico(ArrayList<Fisico> fisico) {
		this.fisico = fisico;
	}

	
	public Intensidade getIntensidadeFisico(int i) {
		return fisico.get(i).getIntensidade();
	}
	public String getDescricaoFisico(int i) {
		return fisico.get(i).getDescricao();
	}
	public String getNomeSintFisico(int i) {
		return fisico.get(i).getNomeSintoma();
	}
	public boolean getPraticaFisico(int i) {
		return fisico.get(i).getPratica();
	}
	public String getRemedioFisico(int i) {
		return fisico.get(i).getRemedioTomado();
	}
	public String getDataFisico(int i) {
		return fisico.get(i).getData();
	}
	
	public Intensidade getIntendisidadeHumor(int i) {
		return humor.get(i).getIntensidade();
	}
	public String getDescricaoHumor(int i) {
		return humor.get(i).getDescricao();
	}
	public String getNomeSintHumor(int i) {
		return humor.get(i).getNomeSintoma();
	}
	public String getGatilhoHumor(int i) {
		return humor.get(i).getGatilho();
	}
	public String getDataHumor(int i) {
		return humor.get(i).getData();
	}
	public String getSenHumor(int i) {
		return humor.get(i).getHumor();
	}

	public ArrayList<Humor> getHumor() {
		return humor;
	}

	public void setHumor(ArrayList<Humor> humor) {
		this.humor = humor;
	}
	public ArrayList<Secrecao> getSecrecao() {
		return secrecao;
	}

	public void setSecrecao(ArrayList<Secrecao> secrecao) {
		this.secrecao = secrecao;
	}
	
	public Intensidade getIntensidade(int i) {
		return libido.get(i).getIntensidade();
	}
	public String getDescricao(int i) {
		return libido.get(i).getDescricao();
	}
	public String getNomeSint(int i) {
		return libido.get(i).getNomeSintoma();
	}
	public boolean getRelComPar(int i) {
		return libido.get(i).isRelacoesComParceiro();
	}
	public boolean getRelSemPar(int i) {
		return libido.get(i).isRelacoesSemParceiro();
	}
	public String getData(int i) {
		return libido.get(i).getData();
	}


	public Intensidade getIntensidadeSecrecao(int i) {
		return secrecao.get(i).getIntensidade();
	}

	public String getDescricaoSecrecao(int i) {
		return secrecao.get(i).getDescricao();
	}

	public String getNomeSintSecrecao(int i) {
		return secrecao.get(i).getNomeSintoma();
	}

	public String getTexturaSecrecao(int i) {
		return secrecao.get(i).getTextura();
	}
	public String getDataSecrecao(int i) {
		return secrecao.get(i).getData();
	}

}

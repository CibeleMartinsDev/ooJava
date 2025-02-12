package classes;

public class Tablet {

    public String modelo;

    public String marca;

    public String anoFabricacao;

    public String armazenamento;

    public String sistemaOperacional;

    public String status;

    public void ligar(String valor){
        if(valor.equalsIgnoreCase("ligar")){
            this.status = "ligado";
        }else{
            this.status = "desligado";
        }
    }
    
    public void carregar(){
        this.status = "carregando";
    }

    public void conectarWifi(String senha){
        this.status = "ligado e conectado ao wifi";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
}

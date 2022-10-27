public class Elevador {
    private int andar_atual;
    private int total_de_andares;
    private int pessoas;
    private int capacidade;

    public void Inicializa(int capacidade, int total_de_andares) {
        this.capacidade = capacidade;
        this.total_de_andares = total_de_andares;
        this.pessoas = 0;
        this.andar_atual = 0;

    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public int getTotal_de_andares() {
        return total_de_andares;
    }

    public void setTotal_de_andares(int total_de_andares) {
        this.total_de_andares = total_de_andares;
    }

    public int getAndar_atual() {
        return andar_atual;
    }

    public void setAndar_atual(int andar_atual) {
        this.andar_atual = andar_atual;
    }



    public void entra() {
        if(this.getPessoas() >= this.getCapacidade()) {
            System.out.println("O elevador está cheio.");
        } else {
            this.setPessoas(this.getPessoas() + 1);
        }
    }

    public void sai(){
        if(this.getPessoas() > 0) {
            this.setPessoas(this.getPessoas() - 1);
        } else {
            System.out.println("Não existem pessoas dentro do elevador!");
        }
    }

    public void sobe() {
        if(this.getAndar_atual() >= this.getTotal_de_andares()) {
            System.out.println("O elevador já está no último andar");
        } else {
            this.setAndar_atual(this.getAndar_atual() + 1);
        }
    }

    public void desce() {
        if(this.getAndar_atual() == 0) {
            System.out.println("O elevador já está no térreo andar!");
        } else {
            this.setAndar_atual(this.getAndar_atual() - 1);
        }
    }

}

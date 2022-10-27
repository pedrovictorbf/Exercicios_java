class ControleRemoto extends Televisao {

    public ControleRemoto(int volume, int canal) {
        super(volume, canal);
    }

    public void aumentarVolume() {
        this.setVolume(this.getVolume() + 1);
    }

    public void diminuiVolume() {
        this.setVolume(this.getVolume() - 1);
    }

    public void consultarVolume() {
        this.getVolume();
    }

    public void proximoCanal() {
        this.setCanal(this.getCanal() + 1);
    }

    public void canalAnterior() {
        this.setCanal(this.getCanal() - 1);
    }

    public void trocarCanal(int canalDesejado) {
        this.setCanal(canalDesejado);
    }

    public void consultarCanal() {
        this.getCanal();
    }

}

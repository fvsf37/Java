public enum Sexo {
    hombre('h'),mujer('m');
    char sexo;

    Sexo(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}

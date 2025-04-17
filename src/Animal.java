public class Animal {
    protected String nome, som; //Usando o PROTECTED, pois se não, não conseguimos usar o "super" nas classes dos bichos (ex:gato)
    protected boolean dormindo, fome;

    public Animal(String nome, String som) { //Tiramos os booleans pois geralmente deixamos true ou false e depois definimos
        this.nome = nome;
        this.som = som;
        this.dormindo = false; //Vai ser criado ACORDADO
        this.fome = true; //Vai ser criado com FOME
    }

    public String emitirSom(){
        return "Animal emitindo som " + som;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public boolean isDormindo() {
        return dormindo;
    }

    public void setDormindo(boolean dormindo) {
        this.dormindo = dormindo;
    }

    public boolean isFome() {
        return fome;
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }

    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", som=" + som + ", dormindo=" + dormindo + ", fome=" + fome + "]";
    }

}

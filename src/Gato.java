public final class Gato extends Animal{
    
public Gato(String nome, String som){
    super (nome, som);
    //super.nome = nome;  -> Para caso NÃO tenha construtor na classe super "Animal"
    //super.som = som;
}

public String ronronar(){
    return "Ronronando...";
}

@Override
public String toString() {
    return "Gato [" + super.toString() + "]";
}    



}

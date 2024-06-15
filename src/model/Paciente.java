package model;

public class Paciente extends Pessoa {

    private double peso;
    private double altura;

    public Paciente(){}

    public Paciente(int id, String nome, String idade, double peso, double altura){
        super(id, nome, idade); //Referência ao construtor da Superclasse
        if(peso > 0 && peso < 250){
            this.peso = peso;
        }
        if(altura > 0 && altura < 3){
            this.altura = altura;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso > 0 && peso < 250){
            this.peso = peso;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura > 0 && altura < 3){
            this.altura = altura;
        }
    }

    public double calcularIMC(){
        return peso / (altura * altura);
    }

    public double calcularIMC(double peso, double altura){
        return peso / (altura * altura);
    }

    @Override
    public String toString() {
        return "Paciente{" +
                super.toString() +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}

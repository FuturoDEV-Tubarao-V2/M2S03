package model;

public class Medico extends Pessoa {

    private double salario;
    private String crm;

    public Medico(){}

    public Medico(int id, String nome, String idade, double salario, String crm) {
        super(id, nome, idade);
        if(salario > 0){
            this.salario = salario;
        }
        if(crm.length() == 6){
            this.crm = crm;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario > 0){
            this.salario = salario;
        }
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        if(crm.length() == 6){
            this.crm = crm;
        }
    }

    @Override
    public String toString() {
        return "Medico{" +
                super.toString() +
                ", salario=" + salario +
                ", crm='" + crm + '\'' +
                '}';
    }
}

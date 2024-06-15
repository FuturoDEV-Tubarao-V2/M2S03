import model.Hospital;
import model.Medico;
import model.Paciente;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static Hospital hospital = new Hospital();
    private static int opcao, opcaoMedico, opcaoPaciente, contMedico=0, contPaciente=0;

    public static void main(String[] args) throws IOException {

        do{

            System.out.print(
                            "1 - MÉDICO\n" +
                            "2 - PACIENTE\n" +
                            "3 - SAIR\n" +
                            "Escolha uma opção: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao){
                case 1:
                    do {
                        exibirMenu();
                        opcaoMedico = scan.nextInt();
                        scan.nextLine();

                        switch (opcaoMedico){
                            case 1:
                                System.out.print("Nome do Médico: ");
                                String nome = scan.nextLine();
                                System.out.print("Idade: ");
                                String idade = scan.nextLine();
                                System.out.print("Salário: ");
                                double salario = scan.nextDouble();
                                System.out.print("CRM: ");
                                String crm = scan.next();

                                scan.nextLine();

                                Medico medico = new Medico(contMedico++, nome, idade, salario, crm);

                                hospital.adicionarMedico(medico);

                                break;
                            case 2:
                                System.out.println("**** LISTA DE MÉDICOS ****\n" +
                                        hospital.listarMedicos());
                                System.out.println("\nTecle ENTER para continuar...");
                                System.in.read();
                                break;
                            case 3:
                                System.out.println("**** LISTA DE MÉDICOS ****\n" +
                                        hospital.listarMedicos());

                                System.out.print("Digite o ID do médico para EXCLUIR: ");
                                int key = scan.nextInt();
                                scan.nextLine();

                                hospital.excluirMedico(key);
                                break;
                            case 4:
                                System.out.println("Voltando ao MENU PRINCIPAL...");
                                break;
                            default:
                                System.out.println("Opção Inválida!");
                        }
                    }while(opcaoMedico != 4);
                    break;
                case 2:
                    do{
                        exibirMenu();
                        opcaoPaciente = scan.nextInt();
                        scan.nextLine();

                        switch (opcaoPaciente){
                            case 1:
                                System.out.print("Nome do Paciente: ");
                                String nome = scan.nextLine();
                                System.out.print("Idade: ");
                                String idade = scan.nextLine();
                                System.out.print("Peso: ");
                                double peso = scan.nextDouble();
                                System.out.print("Altura: ");
                                double altura = scan.nextDouble();

                                scan.nextLine();

                                Paciente paciente = new Paciente(contPaciente++, nome, idade, peso, altura);

                                hospital.adicionarPaciente(paciente);
                                break;
                            case 2:
                                System.out.print("**** LISTA DE PACIENTES ****\n" +
                                        hospital.listarPacientes());
                                System.out.println("\nTecle ENTER para continuar...");
                                System.in.read();
                                break;
                            case 3:
                                System.out.print("**** LISTA DE PACIENTES ****\n" +
                                        hospital.listarPacientes());

                                System.out.print("Digite o ID do paciente para EXCLUIR: ");
                                int key = scan.nextInt();

                                hospital.excluirPaciente(key);
                                break;
                            case 4:
                                System.out.println("Voltando ao MENU PRINCIPAL...");
                                break;
                            default:
                                System.out.println("Opção Inválida!");
                        }
                    }while(opcaoPaciente != 4);
                    break;
                case 3:
                    System.out.println("Bye :)");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }

        }while(opcao != 3);
    }

    public static void exibirMenu(){
        System.out.print(
                        "1 - CADASTRAR\n" +
                        "2 - LISTAR\n" +
                        "3 - EXCLUIR\n" +
                        "4 - SAIR\n" +
                        "Escolha uma opção: ");
    }
}

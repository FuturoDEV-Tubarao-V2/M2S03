package interfaces;

import model.Paciente;

public interface pacienteInterface {

    void adicionarPaciente(Paciente paciente);
    Paciente buscarPaciente(Integer id);
    String listarPacientes();
    void excluirPaciente(Integer key);
}

package interfaces;

import model.Medico;

public interface medicoInterface {

    void adicionarMedico(Medico medico);
    Medico buscarMedico(Integer id);
    String listarMedicos();
    void excluirMedico(Integer key);
}

package model;

import java.util.HashMap;
import java.util.Map;
import interfaces.*;

public class Hospital implements medicoInterface, pacienteInterface{

    private Map<Integer, Paciente> pacientes;
    private Map<Integer, Medico> medicos;

    public Hospital(){
        pacientes = new HashMap<>();
        medicos = new HashMap<>();
    }

    public void adicionarMedico(Medico medico){
        if(medico != null && !medicos.containsKey(medico.getId())){
            medicos.put(medico.getId(), medico);
        }
    }

    public Medico buscarMedico(Integer id){
       return medicos.get(id);
    }

    public String listarMedicos(){
        String text = "";
        for(Medico medico : medicos.values()){
            text += medico.toString() + "\n";
        }
        return text;
    }

    public void excluirMedico(Integer key){
        medicos.remove(key);
    }

    public void adicionarPaciente(Paciente paciente){
        if(paciente != null && !pacientes.containsKey(paciente.getId())){
            pacientes.put(paciente.getId(), paciente);
        }
    }

    public Paciente buscarPaciente(Integer id){
        return pacientes.get(id);
    }

    public String listarPacientes(){
        String text = "";
        for(Paciente paciente : pacientes.values()){
            text += paciente.toString() + "\n";
        }
        return text;
    }

    public void excluirPaciente(Integer key){
        pacientes.remove(key);
    }

}

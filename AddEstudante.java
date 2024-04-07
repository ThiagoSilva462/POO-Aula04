package view;

import controller.IControllerEstudante;
import controller.ControllerSuperior;
import controller.ControllerTecnico;
import model.Estudante;
import model.EstudanteSuperior;
import model.EstudanteTecnico;

public class AddEstudante {
    public static void main(String[] args) {
        EstudanteTecnico estTecnico = new EstudanteTecnico("123", "João", "joao@example.com", 7.5f, 6);
        IControllerEstudante controllerTecnico = new ControllerTecnico();
        System.out.println("Percentual de Rendimento do Estudante Técnico: " + controllerTecnico.percentualRendimento(estTecnico));
        System.out.println("Percentual de Progressão do Estudante Técnico: " + controllerTecnico.percentualProgressao(estTecnico));

        EstudanteSuperior estSuperior = new EstudanteSuperior("456", "Maria", "maria@example.com", 8.0f, 8, "Escola X", 2019);
        IControllerEstudante controllerSuperior = new ControllerSuperior();
        System.out.println("\nPercentual de Rendimento do Estudante Superior: " + controllerSuperior.percentualRendimento(estSuperior));
        System.out.println("Percentual de Progressão do Estudante Superior: " + controllerSuperior.percentualProgressao(estSuperior));
    }
}

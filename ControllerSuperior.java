package controller;

import model.Estudante;

public class ControllerSuperior implements IControllerEstudante {
    @Override
    public float percentualRendimento(Estudante est) {
        return est.percentualRendimento(est);
    }

    @Override
    public float percentualProgressao(Estudante est) {
        return est.percentualProgressao(est);
    }
}
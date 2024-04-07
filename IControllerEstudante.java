package controller;

import model.Estudante;

public interface IControllerEstudante {
    float percentualRendimento(Estudante est);
    float percentualProgressao(Estudante est);
}

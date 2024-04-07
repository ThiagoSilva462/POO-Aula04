package model;

public class EstudanteTecnico extends Estudante {
    public EstudanteTecnico(String ra, String nome, String email, float mediaNotas, int qtdAprovacoes) {
        super(ra, nome, email, mediaNotas, qtdAprovacoes);
    }

    @Override
    public float percentualRendimento(Estudante est) {
        return super.percentualRendimento(est) * 0.931f;
    }

    @Override
    public float percentualProgressao(Estudante est) {
        return getQtdAprovacoes() / 3.0f;
    }
}

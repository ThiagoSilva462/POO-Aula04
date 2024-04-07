package model;

public class EstudanteSuperior extends Estudante {
    private String instituicaoSegundoGrau;
    private int anoConclusaoSegundoGrau;

    public EstudanteSuperior(String ra, String nome, String email, float mediaNotas, int qtdAprovacoes,
            String instituicaoSegundoGrau, int anoConclusaoSegundoGrau) {
        super(ra, nome, email, mediaNotas, qtdAprovacoes);
        this.instituicaoSegundoGrau = instituicaoSegundoGrau;
        this.anoConclusaoSegundoGrau = anoConclusaoSegundoGrau;
    }

    public String getInstituicaoSegundoGrau() {
        return instituicaoSegundoGrau;
    }

    public void setInstituicaoSegundoGrau(String instituicaoSegundoGrau) {
        this.instituicaoSegundoGrau = instituicaoSegundoGrau;
    }

    public int getAnoConclusaoSegundoGrau() {
        return anoConclusaoSegundoGrau;
    }

    public void setAnoConclusaoSegundoGrau(int anoConclusaoSegundoGrau) {
        this.anoConclusaoSegundoGrau = anoConclusaoSegundoGrau;
    }

    @Override
    public float percentualRendimento(Estudante est) {
        return super.percentualRendimento(est) * 0.972f;
    }

    @Override
    public float percentualProgressao(Estudante est) {
        return getQtdAprovacoes() / 6.0f;
    }
}
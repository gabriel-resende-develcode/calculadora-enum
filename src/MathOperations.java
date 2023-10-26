public enum MathOperations {
    SOMAR('+') {
        @Override
        double executarOperacao(double x, double y) {
            return x + y;
        }
    }, SUBTRAIR('-') {
        @Override
        double executarOperacao(double x, double y) {
            return x - y;
        }
    }, MULTIPLICAR('*') {
        @Override
        double executarOperacao(double x, double y) {
            return x * y;
        }
    }, DIVIDIR('/') {
        @Override
        double executarOperacao(double x, double y) {
            return x / y;
        }
    };

    private char operacao;

    MathOperations(char operacao) {
        this.operacao = operacao;
    }

    @Override
    public String toString() {
        return String.valueOf(operacao);
    }
    abstract double executarOperacao(double x, double y);
}


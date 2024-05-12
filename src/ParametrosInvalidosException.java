public class ParametrosInvalidosException extends Exception {
    @Override
    public String toString(){
        return "O segundo parametro deve ser maior que o primeiro";
    }
}

import java.util.Comparator;

public class AlunoPorMatricula implements Comparator<Aluno> {

    @Override
    public int compare(Aluno al1, Aluno al2) {
        return al1.getMatricula().compareTo(al2.getMatricula());
    }
    
}

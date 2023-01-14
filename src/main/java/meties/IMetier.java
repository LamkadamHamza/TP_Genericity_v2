package meties;

import java.io.FileNotFoundException;
import java.util.List;

public interface IMetier<T> {

    void add (T O);
    List<T> getAll();
    public  T findById(Long id );
    void  delete(Long id);

    void saveAll(T O) throws FileNotFoundException, Exception;

}

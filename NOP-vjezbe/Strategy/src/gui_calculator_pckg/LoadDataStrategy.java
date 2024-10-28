package gui_calculator_pckg;

import java.util.List;

public interface LoadDataStrategy<E> {

    void loadDataFromFile(String filePath, List<E> data);
}

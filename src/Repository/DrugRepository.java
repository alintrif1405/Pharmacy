package Repository;

import Domain.Drug;

import java.util.List;

public class DrugRepository implements CRUDRepository<String,Drug>{

    private List<Drug> Drugs;

    @Override
    public void add(Drug entity) {

    }

    @Override
    public void remove(String s) {

    }

    @Override
    public void update(String s, Drug newEntity) {

    }

    @Override
    public Drug findByID(String s) {
        return null;
    }
}

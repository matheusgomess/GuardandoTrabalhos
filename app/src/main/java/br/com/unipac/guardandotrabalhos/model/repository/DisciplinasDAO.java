package br.com.unipac.guardandotrabalhos.model.repository;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import br.com.unipac.guardandotrabalhos.model.domain.Disciplinas;

@Dao
public interface DisciplinasDAO {

    @Insert
    void insert(Disciplinas disciplinas);

    @Update
    void update(Disciplinas disciplinas);

    @Delete
    void delete(Disciplinas disciplinas);

    @Query("SELECT * FROM disciplinas")
    List<Disciplinas> getAll();
}

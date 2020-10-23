package br.com.unipac.guardandotrabalhos.infra;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import br.com.unipac.guardandotrabalhos.model.repository.DisciplinasDAO;

import br.com.unipac.guardandotrabalhos.model.domain.Disciplinas;
import br.com.unipac.guardandotrabalhos.model.repository.DisciplinasDAO;
import br.com.unipac.guardandotrabalhos.util.DateRoomConvert;

@Database(entities = {Disciplinas.class}, version = 1, exportSchema = false)
@TypeConverters({DateRoomConvert.class})
public abstract class DisciplinasDatabase extends RoomDatabase {

    public abstract DisciplinasDAO getDisciplinasDAO();

    public static DisciplinasDatabase disciplinasDatabase;

    public static DisciplinasDatabase getInstance(Context context) {
        if (null == disciplinasDatabase) {
            disciplinasDatabase = buildDatabaseInstance(context);
        }
        return disciplinasDatabase;
    }

    private static DisciplinasDatabase buildDatabaseInstance(Context context) {
        return Room.databaseBuilder(context, DisciplinasDatabase.class, "android.db" ).allowMainThreadQueries().build();
    }

    public void cleanUp() { disciplinasDatabase = null; }
}

package br.com.unipac.guardandotrabalhos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.com.unipac.guardandotrabalhos.infra.DisciplinasDatabase;
import br.com.unipac.guardandotrabalhos.model.domain.Disciplinas;
import br.com.unipac.guardandotrabalhos.ui.adapter.DisciplinasAdapter;

public class MainActivity extends AppCompatActivity {

    EditText nomeTrabalho;
    EditText descTrabalho;
    EditText dataEntregaTrabalho;
    EditText pontuacaoTrabalho;
    Spinner idDisciplinas;
    Button idCadastrar;
    ListView listaDeTrabalhos;
    Button idListaDePresenca;
    private DisciplinasDatabase disciplinasDatabase;
    private DisciplinasAdapter disciplinasAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idDisciplinas = (Spinner) findViewById(R.id.idDisciplinas);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Disciplinas, android.R.layout.simple_spinner_item);
        idDisciplinas.setAdapter(adapter);

        disciplinasDatabase = DisciplinasDatabase.getInstance(MainActivity.this);
        listaDeTrabalhos = (ListView) findViewById(R.id.idListView);

        idCadastrar = (Button)findViewById(R.id.idCadastrar);
    }

    @Override
    protected void onResume() {
        super.onResume();

        List<Disciplinas> disciplinasList = disciplinasDatabase.getDisciplinasDAO().getAll();

        if (disciplinasList.isEmpty()) {
            Toast.makeText(this, "Não selecionou a Disciplina!", Toast.LENGTH_LONG).show();
        } else {
            disciplinasAdapter  = new DisciplinasAdapter(disciplinasList, this);
            listaDeTrabalhos.setAdapter(disciplinasAdapter);
        }

        idCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddDisciplinasActivity.class);
                startActivity(intent);
            }
        });
    }
}
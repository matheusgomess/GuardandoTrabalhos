package br.com.unipac.guardandotrabalhos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import br.com.unipac.guardandotrabalhos.infra.DisciplinasDatabase;
import br.com.unipac.guardandotrabalhos.model.domain.Disciplinas;

public class AddDisciplinasActivity extends AppCompatActivity {
    private DisciplinasDatabase disciplinasDatabase;
    TextView idTrabalho;
    Spinner idDisciplina;
    EditText idNomeTrabalho;
    EditText idDescricaoTrabalho;
    EditText idPontos;
    EditText idDataEntrega;
    Button idCadastrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idTrabalho = (TextView) findViewById(R.id.idTrabalho);
        idDisciplina = (Spinner) findViewById(R.id.idDisciplinas);
        idNomeTrabalho = (EditText) findViewById(R.id.idNomeTrabalho);
        idDescricaoTrabalho = (EditText) findViewById(R.id.idDescricaoTrabalho);
        idPontos = (EditText) findViewById(R.id.idPontos);
        idDataEntrega = (EditText) findViewById(R.id.idDataEntrega);
        idCadastrar = (Button) findViewById(R.id.idCadastrar);

        disciplinasDatabase = DisciplinasDatabase.getInstance(AddDisciplinasActivity.this);

        idCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomeTrabalho = idNomeTrabalho.getText().toString();
                String dataEntrega = idDataEntrega.getText().toString();

                Disciplinas disciplinas = new Disciplinas(nomeTrabalho, dataEntrega);

                Toast.makeText(AddDisciplinasActivity.this, "Aluno: " + disciplinas.toString(), Toast.LENGTH_LONG).show();

               // disciplinasDatabase.getDisciplinasDAO().insert(disciplinas);
            }
        });

    }
}
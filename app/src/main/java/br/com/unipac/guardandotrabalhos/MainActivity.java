package br.com.unipac.guardandotrabalhos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText nomeTrabalho;
    EditText descTrabalho;
    EditText dataEntregaTrabalho;
    EditText pontuacaoTrabalho;
    Spinner idDisciplinaTrabalho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    List <Disciplinas> disciplinas = new ArrayList<>();
}
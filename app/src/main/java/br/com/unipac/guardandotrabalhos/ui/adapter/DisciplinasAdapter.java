package br.com.unipac.guardandotrabalhos.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.com.unipac.guardandotrabalhos.R;
import br.com.unipac.guardandotrabalhos.model.domain.Disciplinas;

public class DisciplinasAdapter extends BaseAdapter {
    private List<Disciplinas> disciplinasList = new ArrayList<>();
    private Context context = null;

    public DisciplinasAdapter(List<Disciplinas> disciplinasList, Context context) {
        this.disciplinasList = disciplinasList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return !disciplinasList.isEmpty() ? disciplinasList.size() : 0;
    }

    @Override
    public Disciplinas getItem(int position) {
        return !disciplinasList.isEmpty() ? disciplinasList.get(position) : new Disciplinas();
    }

    @Override
    public long getItemId(int position) {
        return !disciplinasList.isEmpty() ? disciplinasList.get(position).getDisciplinaId() : 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Disciplinas disciplinas = getItem(position);
        String empreendorismo = disciplinas.getEmpreendedorismo();
        String arquiteturaDeSoftware = disciplinas.getArquiteturaDeSoftware();
        String atividadesComplementares = disciplinas.getAtividadesComplementares();
        String desenvolvimentoWeb = disciplinas.getDesenvolvimentoWeb();
        String programacaoParaDispositivosMoveis = disciplinas.getProgramacaoParaDispositivosMoveis();
        String projetoExperimental = disciplinas.getProjetoExperimental();
        String topicosAvancadosEmBancoDeDados = disciplinas.getTopicosAvancadosEmBancoDeDados();

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View novoLayout = inflater.inflate(R.layout.activity_main2, null);

        TextView idTrabalho = (TextView) novoLayout.findViewById(R.id.idTrabalho);
        Spinner idDisciplina = (Spinner) novoLayout.findViewById(R.id.idDisciplinas);
        EditText idNomeTrabalho = (EditText) novoLayout.findViewById(R.id.idNomeTrabalho);
        EditText idDescricaoTrabalho = (EditText) novoLayout.findViewById(R.id.idDescricaoTrabalho);
        EditText idPontos = (EditText) novoLayout.findViewById(R.id.idPontos);
        EditText idDataEntrega = (EditText) novoLayout.findViewById(R.id.idDataEntrega);
        Button idCadastrar = (Button) novoLayout.findViewById(R.id.idCadastrar);
        EditText idListaDeAlunos = (EditText) novoLayout.findViewById(R.id.idListaDeAlunos);
        Button idListaDePresenca = (Button) novoLayout.findViewById(R.id.idListaDePresenca);
        ListView idListView = (ListView) novoLayout.findViewById(R.id.idListView);


        idTrabalho.setText((CharSequence) idTrabalho);
        idNomeTrabalho.setText((CharSequence) idNomeTrabalho);
        idDescricaoTrabalho.setText((CharSequence) idDescricaoTrabalho);
        idPontos.setText((CharSequence) idPontos);
        idDataEntrega.setText((CharSequence) idDataEntrega);
        idCadastrar.setText((CharSequence) idCadastrar);
        idListaDeAlunos.setText((CharSequence) idListaDeAlunos);
        idListaDePresenca.setText((CharSequence) idListaDePresenca);
        idListView.setAdapter((ListAdapter) idListView);



//        idDisciplina.setAdapter(empreendorismo);
//        idDisciplina.setAdapter(arquiteturaDeSoftware);
//        idDisciplina.setAdapter(atividadesComplementares);
//        idDisciplina.setAdapter(desenvolvimentoWeb);
//        idDisciplina.setAdapter(programacaoParaDispositivosMoveis);
//        idDisciplina.setAdapter(projetoExperimental);
//        idDisciplina.setAdapter(topicosAvancadosEmBancoDeDados);

        return novoLayout;
    }
}

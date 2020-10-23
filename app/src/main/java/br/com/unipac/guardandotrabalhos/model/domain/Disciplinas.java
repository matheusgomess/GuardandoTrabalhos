package br.com.unipac.guardandotrabalhos.model.domain;

import android.widget.EditText;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Objects;

@Entity(tableName = "disciplinas")
public class Disciplinas {

    @PrimaryKey(autoGenerate = true)
    private int disciplinaId;

    @ColumnInfo(name = "disciplina_empreendedorismo")
    private String empreendedorismo;

    @ColumnInfo(name = "disciplina_arquiteturaDeSoftware")
    private String arquiteturaDeSoftware;

    @ColumnInfo(name = "disciplina_atividadesComplementares")
    private String atividadesComplementares;

    @ColumnInfo(name = "disciplina_desenvolvimentoWeb")
    private String desenvolvimentoWeb;

    @ColumnInfo(name = "disciplina_programacaoParaDispositivosMoveis")
    private String programacaoParaDispositivosMoveis;

    @ColumnInfo(name = "disciplina_projetoExperimental")
    private String projetoExperimental;

    @ColumnInfo(name = "disciplina_topicosAvancadosEmBancoDeDados")
    private String topicosAvancadosEmBancoDeDados;

    public Disciplinas() {

    }

    public Disciplinas(String empreendedorismo, String arquiteturaDeSoftware) {
        this.empreendedorismo = empreendedorismo;
        this.arquiteturaDeSoftware = arquiteturaDeSoftware;
        this.atividadesComplementares = atividadesComplementares;
        this.desenvolvimentoWeb = desenvolvimentoWeb;
        this.programacaoParaDispositivosMoveis = programacaoParaDispositivosMoveis;
        this.projetoExperimental = projetoExperimental;
        this.topicosAvancadosEmBancoDeDados = topicosAvancadosEmBancoDeDados;
    }

    public int getDisciplinaId() {
        return disciplinaId;
    }

    public void setDisciplinaId(int disciplinaId) {
        this.disciplinaId = disciplinaId;
    }

    public String getEmpreendedorismo() {
        return empreendedorismo;
    }

    public void setEmpreendedorismo(String empreendedorismo) {
        this.empreendedorismo = empreendedorismo;
    }

    public String getArquiteturaDeSoftware() {
        return arquiteturaDeSoftware;
    }

    public void setArquiteturaDeSoftware(String arquiteturaDeSoftware) {
        this.arquiteturaDeSoftware = arquiteturaDeSoftware;
    }

    public String getAtividadesComplementares() {
        return atividadesComplementares;
    }

    public void setAtividadesComplementares(String atividadesComplementares) {
        this.atividadesComplementares = atividadesComplementares;
    }

    public String getDesenvolvimentoWeb() {
        return desenvolvimentoWeb;
    }

    public void setDesenvolvimentoWeb(String desenvolvimentoWeb) {
        this.desenvolvimentoWeb = desenvolvimentoWeb;
    }

    public String getProgramacaoParaDispositivosMoveis() {
        return programacaoParaDispositivosMoveis;
    }

    public void setProgramacaoParaDispositivosMoveis(String programacaoParaDispositivosMoveis) {
        this.programacaoParaDispositivosMoveis = programacaoParaDispositivosMoveis;
    }

    public String getProjetoExperimental() {
        return projetoExperimental;
    }

    public void setProjetoExperimental(String projetoExperimental) {
        this.projetoExperimental = projetoExperimental;
    }

    public String getTopicosAvancadosEmBancoDeDados() {
        return topicosAvancadosEmBancoDeDados;
    }

    public void setTopicosAvancadosEmBancoDeDados(String topicosAvancadosEmBancoDeDados) {
        this.topicosAvancadosEmBancoDeDados = topicosAvancadosEmBancoDeDados;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplinas disciplinas = (Disciplinas) o;
        return disciplinaId == disciplinas.disciplinaId &&
                Objects.equals(empreendedorismo, disciplinas.empreendedorismo) &&
                Objects.equals(arquiteturaDeSoftware, disciplinas.arquiteturaDeSoftware) &&
                Objects.equals(atividadesComplementares, disciplinas.atividadesComplementares) &&
                Objects.equals(desenvolvimentoWeb, disciplinas.desenvolvimentoWeb) &&
                Objects.equals(programacaoParaDispositivosMoveis, disciplinas.programacaoParaDispositivosMoveis) &&
                Objects.equals(projetoExperimental, disciplinas.projetoExperimental) &&
                Objects.equals(topicosAvancadosEmBancoDeDados, disciplinas.topicosAvancadosEmBancoDeDados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disciplinaId, empreendedorismo, arquiteturaDeSoftware, atividadesComplementares, desenvolvimentoWeb, programacaoParaDispositivosMoveis, projetoExperimental, topicosAvancadosEmBancoDeDados);
    }

    @Override
    public String toString() {
        return "Disciplinas{" +
                "disciplinaId=" + disciplinaId +
                ", empreendedorismo='" + empreendedorismo + '\'' +
                ", arquiteturaDeSoftware='" + arquiteturaDeSoftware + '\'' +
                ", atividadesComplementares='" + atividadesComplementares + '\'' +
                ", desenvolvimentoWeb='" + desenvolvimentoWeb + '\'' +
                ", programacaoParaDispositivosMoveis='" + programacaoParaDispositivosMoveis + '\'' +
                ", projetoExperimental='" + projetoExperimental + '\'' +
                ", topicosAvancadosEmBancoDeDados='" + topicosAvancadosEmBancoDeDados + '\'' +
                '}';
    }
}

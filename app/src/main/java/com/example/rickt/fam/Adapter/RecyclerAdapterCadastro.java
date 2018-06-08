package com.example.rickt.fam.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rickt.fam.CadastroAluno;
import com.example.rickt.fam.R;
import com.example.rickt.fam.ViewHolder.ViewHolderCadastroAluno;

import java.util.List;

/**
 * Created by rickt on 23/05/2018.
 */

public class RecyclerAdapterCadastro extends RecyclerView.Adapter<ViewHolderCadastroAluno> {

	private List<CadastroAluno> cadastroAlunos;

	public RecyclerAdapterCadastro (List<CadastroAluno> cadastroAlunoList){
		this.cadastroAlunos = cadastroAlunoList;
	}


	@Override
	public ViewHolderCadastroAluno onCreateViewHolder (ViewGroup parent, int viewType) {

		View view = null;

		view = LayoutInflater.from (parent.getContext ()).inflate (R.layout.item_cadastro_aluno, parent, false);

		return new ViewHolderCadastroAluno (view);
	}

	@Override
	public void onBindViewHolder (ViewHolderCadastroAluno holder, int position) {

		CadastroAluno c = cadastroAlunos.get (position);

		holder.tvNome.setText (c.nomeAluno);
		holder.tvEmail.setText (c.emailAluno);
		holder.tvRa.setText (c.raAluno);

	}

	public void addAluno(CadastroAluno aluno){
		cadastroAlunos.add (aluno);
		notifyDataSetChanged ();
	}

	public void replaceData(List<CadastroAluno> list){
		cadastroAlunos = list;
		notifyDataSetChanged ();
	}

	@Override
	public int getItemCount () {
		return cadastroAlunos.size ();
	}
}

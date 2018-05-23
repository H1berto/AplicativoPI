package com.example.rickt.fam;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

		holder.tvNome.setText ("Henrique Menezes");
		holder.tvEmail.setText ("Henrique@android.com.br");
		holder.tvRa.setText ("022228");

	}

	@Override
	public int getItemCount () {
		return cadastroAlunos.size ();
	}
}

package com.example.rickt.fam.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.rickt.fam.R;

/**
 * Created by rickt on 23/05/2018.
 */

public class ViewHolderCadastroAluno extends RecyclerView.ViewHolder {

	public TextView tvNome;
	public TextView tvEmail;
	public TextView tvRa;

	public ViewHolderCadastroAluno (View itemView) {
		super (itemView);

		this.tvNome = itemView.findViewById (R.id.tvNome);
		this.tvEmail = itemView.findViewById (R.id.tvEmail);
		this.tvRa = itemView.findViewById (R.id.tvRa);

	}
}

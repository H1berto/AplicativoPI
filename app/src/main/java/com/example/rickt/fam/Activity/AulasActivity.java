package com.example.rickt.fam.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.rickt.fam.R;

public class AulasActivity extends AppCompatActivity {

	private TextView  tv1;
	private TextView  tv2;
	private TextView  tv3;
	private TextView  tv4;
	private TextView  tv5;
	private TextView  tv11;


	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate (savedInstanceState);
		setContentView (R.layout.activity_aulas);

		tv1 = (TextView) findViewById (R.id.tvValor1);
		tv2 = (TextView) findViewById (R.id.tvValor2);
		tv3 = (TextView) findViewById (R.id.tvValor3);
		tv4 = (TextView) findViewById (R.id.tvValor4);
		tv5 = (TextView) findViewById (R.id.tvValor5);
		tv11 = (TextView) findViewById (R.id.tvValor11);

		tv1.setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v) {

			}
		});

		tv2.setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v) {

			}
		});

		tv3.setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v) {
				Intent intent = new Intent (AulasActivity.this, VerAtividadesActivity.class);
				startActivity (intent);

			}
		});

		tv4.setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v) {
				Intent intent = new Intent (AulasActivity.this, VerAtividadesActivity.class);
				startActivity (intent);

			}
		});

		tv5.setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v) {
				Intent intent = new Intent (AulasActivity.this, VerAtividadesActivity.class);
				startActivity (intent);


			}
		});
		tv11.setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v) {

				Intent intent = new Intent (AulasActivity.this, VerAtividadesActivity.class);
				startActivity (intent);

			}
		});

	}
}

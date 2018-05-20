package com.example.rickt.fam;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class AulasActivity extends AppCompatActivity {

	private TextView  tv1;
	private TextView  tv2;
	private TextView  tv3;
	private TextView  tv4;
	private TextView  tv5;
	private TextView  tv6;
	private TextView  tv7;
	private TextView  tv8;
	private TextView  tv9;
	private TextView  tv10;
	private TextView  tv11;
	private TextView  tv12;
	private TextView  tv13;
	private TextView  tv14;
	private TextView  tv15;
	private TextView  tv16;
	private TextView  tv17;
	private TextView  tv18;
	private TextView  tv19;
	private TextView  tv20;
	private TextView  tv21;
	private TextView  tv22;
	private TextView  tv23;
	private TextView  tv24;
	private TextView  tv25;
	private TextView  tv26;
	private TextView  tv27;
	private TextView  tv28;
	private TextView  tv29;
	private TextView  tv30;

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate (savedInstanceState);
		setContentView (R.layout.activity_aulas);

		tv1 = (TextView) findViewById (R.id.tvValor1);
		tv2 = (TextView) findViewById (R.id.tvValor2);
		tv3 = (TextView) findViewById (R.id.tvValor3);
		tv4 = (TextView) findViewById (R.id.tvValor4);
		tv5 = (TextView) findViewById (R.id.tvValor5);
		tv6 = (TextView) findViewById (R.id.tvValor6);
		tv7 = (TextView) findViewById (R.id.tvValor7);
		tv8 = (TextView) findViewById (R.id.tvValor8);
		tv9 = (TextView) findViewById (R.id.tvValor9);
		tv10 = (TextView) findViewById (R.id.tvValor10);
		tv11 = (TextView) findViewById (R.id.tvValor11);
		tv12 = (TextView) findViewById (R.id.tvValor1);
		tv13 = (TextView) findViewById (R.id.tvValor1);
		tv14 = (TextView) findViewById (R.id.tvValor1);
		tv15 = (TextView) findViewById (R.id.tvValor1);
		tv16 = (TextView) findViewById (R.id.tvValor1);
		tv17 = (TextView) findViewById (R.id.tvValor1);
		tv18 = (TextView) findViewById (R.id.tvValor1);
		tv19 = (TextView) findViewById (R.id.tvValor1);
		tv20 = (TextView) findViewById (R.id.tvValor1);
		tv21 = (TextView) findViewById (R.id.tvValor1);
		tv22 = (TextView) findViewById (R.id.tvValor1);
		tv23 = (TextView) findViewById (R.id.tvValor1);
		tv24 = (TextView) findViewById (R.id.tvValor1);
		tv25 = (TextView) findViewById (R.id.tvValor1);
		tv26 = (TextView) findViewById (R.id.tvValor1);
		tv27 = (TextView) findViewById (R.id.tvValor1);
		tv28 = (TextView) findViewById (R.id.tvValor1);
		tv29 = (TextView) findViewById (R.id.tvValor1);
		tv30 = (TextView) findViewById (R.id.tvValor1);

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

			}
		});

		tv4.setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v) {

			}
		});

		tv5.setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v) {


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

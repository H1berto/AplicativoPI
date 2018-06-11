package com.example.rickt.fam.Activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.example.rickt.fam.R;

public class MainActivity extends AppCompatActivity
		implements NavigationView.OnNavigationItemSelectedListener {

	private WebView webView;
	private TextView setName;
	private TextView nomeCompletoNav;
	private TextView emailNav;
	private TextView raNav;

	private String nomeUser;
	private String emailUser;
	private String raUser;
	private Boolean isAlunoUser;

	private Dialog dialog;

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate (savedInstanceState);
		setContentView (R.layout.activity_main2);
		Toolbar toolbar = (Toolbar) findViewById (R.id.toolbar);
		setSupportActionBar (toolbar);

		Intent it = getIntent ();

		raUser = it.getStringExtra ("raUser");
		emailUser = it.getStringExtra ("emailUser");
		nomeUser = it.getStringExtra ("nomeUser");
		isAlunoUser = it.getBooleanExtra ("isAluno", false);

		nomeCompletoNav = (TextView) findViewById (R.id.textViewNomeUserCompletoNavHeader);
		emailNav = (TextView) findViewById (R.id.textViewEmailUserNavHeader);
		raNav = (TextView) findViewById (R.id.textViewRANavHeader);
		setName = (TextView) findViewById (R.id.textViewBemVindoUser);
		webView = (WebView) findViewById (R.id.webViewToSetVideo);
		webView.setWebViewClient (new MyBrowser());

		webView.getSettings().setLoadsImagesAutomatically(true);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
		webView.loadUrl("https://www.youtube.com/watch?v=rk3EVJ2IQzc");


		DrawerLayout drawer = (DrawerLayout) findViewById (R.id.drawer_layout);
		ActionBarDrawerToggle toggle = new ActionBarDrawerToggle (
				this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
		drawer.addDrawerListener (toggle);
		toggle.syncState ();

		NavigationView navigationView = (NavigationView) findViewById (R.id.nav_view);
		navigationView.setNavigationItemSelectedListener (this);

		if (isAlunoUser == true){
			setName.setText ("Olá "+nomeUser+" !");
		}else {
			setName.setText ("Olá Professor(a), "+nomeUser+" !");
		}

	}

	@Override
	public void onBackPressed () {

		finish ();

		DrawerLayout drawer = (DrawerLayout) findViewById (R.id.drawer_layout);
		if (drawer.isDrawerOpen (GravityCompat.START)) {
			drawer.closeDrawer (GravityCompat.START);
		} else {
			super.onBackPressed ();
		}
	}

	@Override
	public boolean onCreateOptionsMenu (Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater ().inflate (R.menu.main2, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected (MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId ();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected (item);
	}

	@SuppressWarnings("StatementWithEmptyBody")
	@Override
	public boolean onNavigationItemSelected (MenuItem item) {
		// Handle navigation view item clicks here.
		int id = item.getItemId ();

		if (id == R.id.nav_home_aluno) {

			Intent intent = new Intent (MainActivity.this, Home_AlunoActivity.class);
			startActivity (intent);

		} else if (id == R.id.nav_aulas) {

			Intent intent = new Intent (MainActivity.this, AulasActivity.class);
			startActivity (intent);

		} else if (id == R.id.nav_avisos) {

		} else if (id == R.id.nav_material_de_apoio) {

		} else if (id == R.id.nav_ferramentas) {

			if (isAlunoUser == false){

				Intent intent = new Intent (MainActivity.this, AgendamentoActivity.class);
				startActivity (intent);
			}else {
				showDialog();
			}


		} else if (id == R.id.nav_send) {

			Intent it = new Intent (getApplicationContext (), EnviarMensagemActivity.class);
			startActivity (it);

		} else if (id == R.id.nav_presenca) {

			if(isAlunoUser == true){

				Intent it = new Intent (getApplicationContext (), Notas_FaltasActivity.class);
				startActivity (it);

			} else {showDialogAluno ();}

		}
		else if (id == R.id.nav_classes) {

			if (isAlunoUser == false){

				Intent intent = new Intent (MainActivity.this, TurmasActivity.class);
				startActivity (intent);
			}else {
				showDialog();
			}

		}

		DrawerLayout drawer = (DrawerLayout) findViewById (R.id.drawer_layout);
		drawer.closeDrawer (GravityCompat.START);
		return true;
	}

	private class MyBrowser extends WebViewClient {
		@Override
		public boolean shouldOverrideUrlLoading (WebView view, String url) {
			view.loadUrl (url);
			return true;
		}
	}
	private void showDialog(){
		dialog = new Dialog (this);

			dialog.setContentView (R.layout.custom_acess_dialog);

		dialog.findViewById (R.id.buttonOKAlerta).setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v) {
				dialog.dismiss ();
			}
		});
		dialog.setCancelable (false);
		dialog.show ();

	}
	private void showDialogAluno(){
		dialog = new Dialog (this);
		if (isAlunoUser == true ){
			dialog.setContentView (R.layout.custom_acess_aluno_dialog);
		} else{
			dialog.setContentView (R.layout.custom_acess_dialog);
		}

		dialog.findViewById (R.id.buttonOKAlertaAluno).setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v) {
				dialog.dismiss ();
			}
		});
		dialog.setCancelable (false);
		dialog.show ();

	}
}

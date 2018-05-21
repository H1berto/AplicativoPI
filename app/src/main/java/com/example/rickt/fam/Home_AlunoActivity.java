package com.example.rickt.fam;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home_AlunoActivity extends AppCompatActivity {

	private ImageView img;

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate (savedInstanceState);
		setContentView (R.layout.activity_home__aluno);


		img = (ImageView) findViewById (R.id.imgViewClick);


		img.setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v) {

				String url = "https://www.saraiva.com.br/dominando-o-android-do-basico-ao-avancado-2-ed-2015-9235046.html";
				Intent i = new Intent (Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);

			}
		});


	}
}
